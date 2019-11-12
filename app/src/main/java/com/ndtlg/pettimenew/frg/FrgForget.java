//
//  FrgForget
//
//  Created by DELL on 2019-03-22 16:44:22
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.pettimenew.frg;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ab.util.AbMd5;
import com.framewidget.F;
import com.mdx.framework.Frame;
import com.mdx.framework.activity.IndexAct;
import com.mdx.framework.utility.Helper;
import com.mdx.framework.widget.ActionBar;
import com.ndtlg.pettimenew.R;
import com.ndtlg.pettimenew.bean.BeanMBindPhone;
import com.ndtlg.pettimenew.bean.BeanMBindPhone2;
import com.ndtlg.pettimenew.bean.BeanMForgetPassword;
import com.ndtlg.pettimenew.bean.BeanMGetMobileMsg;
import com.ndtlg.pettimenew.model.ModelLogin;

import static com.ndtlg.pettimenew.F.MBindMobile;
import static com.ndtlg.pettimenew.F.MBindPhone;
import static com.ndtlg.pettimenew.F.MForgetPassword;
import static com.ndtlg.pettimenew.F.MGetMobileMsg;
import static com.ndtlg.pettimenew.F.json2Model;
import static com.ndtlg.pettimenew.F.uid;
import static com.ndtlg.pettimenew.F.verify;


public class FrgForget extends BaseFrg {

    public EditText mEditText_phone2;
    public TextView mTextView_get;
    public EditText mEditText_code;
    public EditText mEditText_pass2;
    public TextView mTextView_zc;

    public String title;
    private int times = 60;
    private Handler handler;
    private Runnable runnable;
    private String type;
    private String type_wxqq;

    @Override
    protected void create(Bundle savedInstanceState) {
        title = getActivity().getIntent().getStringExtra("title");
        type = getActivity().getIntent().getStringExtra("type");
        type_wxqq = getActivity().getIntent().getStringExtra("type_wxqq");
        setContentView(R.layout.frg_forget);
        initView();
        loaddata();
    }

    private void initView() {
        findVMethod();
    }

    private void findVMethod() {
        mEditText_phone2 = (EditText) findViewById(R.id.mEditText_phone2);
        mTextView_get = (TextView) findViewById(R.id.mTextView_get);
        mEditText_code = (EditText) findViewById(R.id.mEditText_code);
        mEditText_pass2 = (EditText) findViewById(R.id.mEditText_pass2);
        mTextView_zc = (TextView) findViewById(R.id.mTextView_zc);

        mTextView_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(mEditText_phone2.getText().toString())) {
                    Helper.toast("请输入手机号", getContext());
                    return;
                }
                if (mEditText_phone2.getText().toString().length() != 11) {
                    Helper.toast("请输入正确手机号", getContext());
                    return;
                }

                loadUrl(MGetMobileMsg, new BeanMGetMobileMsg(mEditText_phone2.getText().toString(), type));

            }
        });
        mTextView_zc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(mEditText_phone2.getText().toString())) {
                    Helper.toast("请输入手机号", getContext());
                    return;
                }
                if (TextUtils.isEmpty(mEditText_code.getText().toString())) {
                    Helper.toast("请输入验证码", getContext());
                    return;
                }
                if (TextUtils.isEmpty(mEditText_pass2.getText().toString())) {
                    Helper.toast("请输入密码", getContext());
                    return;
                }
                if (type.equals("3")) {
                    if (TextUtils.isEmpty(type_wxqq)) {
                        loadUrl(MBindMobile, new BeanMBindPhone2(mEditText_phone2.getText().toString(), mEditText_code.getText().toString(), AbMd5.md5(mEditText_pass2.getText().toString())));
                    } else {
                        loadUrl(MBindPhone, new BeanMBindPhone(mEditText_phone2.getText().toString(), mEditText_code.getText().toString(), AbMd5.md5(mEditText_pass2.getText().toString()), type_wxqq));
                    }
                } else if (type.equals("2")) {
                    loadUrl(MForgetPassword, new BeanMForgetPassword(mEditText_phone2.getText().toString(), mEditText_code.getText().toString(), AbMd5.md5(mEditText_pass2.getText().toString())));
                }
            }
        });
    }

    private void doTimer() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                if (times > 0) {
                    times--;
                    mTextView_get.setText(times + "s");
                    mTextView_get.setClickable(false);
                    handler.postDelayed(runnable, 1000);
                } else if (times == 0) {
                    mTextView_get.setClickable(true);
                    mTextView_get.setText("获取验证码");
                }
            }
        };
        handler.post(runnable);
    }

    @Override
    public void onSuccess(String methodName, String content) {
        if (methodName.equals(MGetMobileMsg)) {
            times = 60;
            doTimer();
        } else if (methodName.equals(MBindPhone)) {
            Helper.toast("绑定成功", getContext());
            Helper.startActivity(getContext(), FrgHome.class, IndexAct.class);
        } else if (methodName.equals(MBindMobile)) {
            ModelLogin mModelLogin = (ModelLogin) json2Model(content, ModelLogin.class);
            uid = mModelLogin.data.id;
            verify = mModelLogin.data.verify;
            com.ndtlg.pettimenew.F.saveJson("uid", uid);
            com.ndtlg.pettimenew.F.saveJson("verify", verify);
            Helper.toast("绑定手机号成功", getContext());
            Frame.HANDLES.sentAll("FrgWd", 0, null);
            finish();
//            Helper.startActivity(getContext(), FrgHome.class, IndexAct.class);
        } else if (methodName.equals(MForgetPassword)) {
            Helper.toast("成功", getContext());
            finish();
            F.closeSoftKey(getActivity());
        }
    }

    public void loaddata() {

    }

    @Override
    public void setActionBar(ActionBar actionBar, Context context) {
        super.setActionBar(actionBar, context);
        mHeadlayout.setTitle(title);
    }
}