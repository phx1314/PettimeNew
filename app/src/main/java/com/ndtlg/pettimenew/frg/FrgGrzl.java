//
//  FrgGrzl
//
//  Created by DELL on 2019-03-22 16:44:22
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.pettimenew.frg;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.framewidget.error.PopUpdataPhoto;
import com.framewidget.frg.FrgList;
import com.framewidget.frg.FrgPubBianJi;
import com.mdx.framework.Frame;
import com.mdx.framework.activity.TitleAct;
import com.mdx.framework.config.BaseConfig;
import com.mdx.framework.utility.Helper;
import com.mdx.framework.widget.ActionBar;
import com.mdx.framework.widget.MImageView;
import com.ndtlg.pettimenew.R;
import com.ndtlg.pettimenew.bean.BeanMUpdateUser;
import com.ndtlg.pettimenew.bean.BeanMUploadFile;
import com.ndtlg.pettimenew.model.ModelHeader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.ndtlg.pettimenew.F.MUpdateUser;
import static com.ndtlg.pettimenew.F.MUploadFile;
import static com.ndtlg.pettimenew.F.json2Model;
import static com.ndtlg.pettimenew.frg.FrgWd.mModelMgetUserInfo;


public class FrgGrzl extends BaseFrg {

    public MImageView mImageView;
    public TextView mTextView_name;
    public TextView mTextView_sex;
    public TextView mTextView_info;
    public List<String> sexs = new ArrayList<>();
    public int sex;
    public String Header;

    @Override
    protected void create(Bundle savedInstanceState) {
        sexs.add("男");
        sexs.add("女");
        sexs.add("保密");
        setContentView(R.layout.frg_grzl);
        initView();
        loaddata();
    }

    @Override
    public void disposeMsg(int type, Object obj) {
        switch (type) {
            case 1:
                mTextView_sex.setText(obj.toString());
                if (obj.toString().equals("保密")) {
                    sex = 0;
                } else if (obj.toString().equals("男")) {
                    sex = 1;
                } else {
                    sex = 2;
                }
                break;
            case 102:
                mTextView_name.setText(obj.toString());
                break;
            case 103:
                mTextView_info.setText(obj.toString());
                break;
        }
    }

    private void initView() {
        findVMethod();
    }

    private void findVMethod() {
        mImageView = (MImageView) findViewById(R.id.mImageView);
        mTextView_name = (TextView) findViewById(R.id.mTextView_name);
        mTextView_sex = (TextView) findViewById(R.id.mTextView_sex);
        mTextView_info = (TextView) findViewById(R.id.mTextView_info);

        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.framewidget.F.getPhoto(getActivity(), new PopUpdataPhoto.OnReceiverPhoto() {
                    @Override
                    public void onReceiverPhoto(String photoPath, int width,
                                                int height) {
                        if (photoPath != null) {
                            mImageView.setObj("file:" + photoPath);
                            mImageView.setCircle(true);
                            loadUrl(MUploadFile, new BeanMUploadFile(new File(photoPath)));
                        }
                    }
                }, 10, 10, 640, 640);
            }
        });

        mTextView_sex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Helper.startActivity(getContext(), FrgList.class, TitleAct.class, "from", "FrgGrzl", "type", 1, "title", "选择性别", "data", sexs);
            }
        });
        mTextView_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Helper.startActivity(getContext(), FrgPubBianJi.class,
                        TitleAct.class, "from", "FrgGrzl", "EDT", 102,
                        "data", mTextView_name.getText().toString(), "max", 150, "hint", "昵称");
            }
        });
        mTextView_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Helper.startActivity(getContext(), FrgPubBianJi.class,
                        TitleAct.class, "from", "FrgGrzl", "EDT", 103,
                        "data", mTextView_info.getText().toString(), "max", 500, "hint", "个性签名");
            }
        });
    }

    public void loaddata() {
        Header = mModelMgetUserInfo.data.header;
        mImageView.setObj(mModelMgetUserInfo.data.header.startsWith("http") ? mModelMgetUserInfo.data.header : BaseConfig.getUri() + "/download.do?id=" + mModelMgetUserInfo.data.header);
        mImageView.setCircle(true);
        mTextView_name.setText(mModelMgetUserInfo.data.nickname);
        mTextView_info.setText(mModelMgetUserInfo.data.remark);
        sex = mModelMgetUserInfo.data.sex;
        if (mModelMgetUserInfo.data.sex == 0) {
            mTextView_sex.setText("保密");
        } else if (mModelMgetUserInfo.data.sex == 1) {
            mTextView_sex.setText("男");
        } else {
            mTextView_sex.setText("女");
        }
    }

    @Override
    public void onSuccess(String methodName, String content) {
        if (methodName.equals(MUpdateUser)) {
            finish();
            Frame.HANDLES.sentAll("FrgWd", 0, null);
        } else if (methodName.equals(MUploadFile)) {
            ModelHeader mModelHeader = (ModelHeader) json2Model(content, ModelHeader.class);
            Header = mModelHeader.data.msg;
        }
    }

    @Override
    public void setActionBar(ActionBar actionBar, Context context) {
        super.setActionBar(actionBar, context);
        mHeadlayout.setTitle("个人资料");
        mHeadlayout.setRText("完成");
        mHeadlayout.setRightOnclicker(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mModelMgetUserInfo.data.sex = sex;
                mModelMgetUserInfo.data.nickname = mTextView_name.getText().toString();
                mModelMgetUserInfo.data.remark = mTextView_info.getText().toString();
                loadUrl(MUpdateUser, new BeanMUpdateUser(mModelMgetUserInfo.data.nickname, Header, mModelMgetUserInfo.data.sex, mModelMgetUserInfo.data.remark));
            }
        });
    }
}