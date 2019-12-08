//
//  Main
//
//  Created by DELL on 2019-03-22 16:44:22
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.pettimenew.item;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mdx.framework.activity.TitleAct;
import com.mdx.framework.utility.Helper;
import com.ndtlg.pettimenew.F;
import com.ndtlg.pettimenew.R;
import com.ndtlg.pettimenew.act.ActAddDeviceDialog;
import com.ndtlg.pettimenew.frg.FrgMySb;
import com.ndtlg.pettimenew.model.ModelData;
import com.ndtlg.pettimenew.model.ModelList;


public class Main extends BaseItem {
    public LinearLayout mLinearLayout1;
    public ImageView mImageView;
    public TextView mTextView_name;
    public LinearLayout mLinearLayout2;
    public ImageView mImageView2;
    public TextView mTextView_name2;
    public ModelData item;

    @SuppressLint("InflateParams")
    public static View getView(Context context, ViewGroup parent) {
        LayoutInflater flater = LayoutInflater.from(context);
        View convertView = flater.inflate(R.layout.item_main, null);
        convertView.setTag(new Main(convertView));
        return convertView;
    }

    public Main(View view) {
        this.contentview = view;
        this.context = contentview.getContext();
        initView();
    }

    private void initView() {
        this.contentview.setTag(this);
        findVMethod();
    }

    private void findVMethod() {
        mLinearLayout1 = (LinearLayout) contentview.findViewById(R.id.mLinearLayout1);
        mImageView = (ImageView) contentview.findViewById(R.id.mImageView);
        mTextView_name = (TextView) contentview.findViewById(R.id.mTextView_name);
        mLinearLayout2 = (LinearLayout) contentview.findViewById(R.id.mLinearLayout2);
        mImageView2 = (ImageView) contentview.findViewById(R.id.mImageView2);
        mTextView_name2 = (TextView) contentview.findViewById(R.id.mTextView_name2);
        mLinearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(((ModelList.DataBean.DeviceListBean) item.mList.get(0)).id)) {
                    if (!F.isWifiConnect(context)) {
                        Helper.toast("此功能需连接wifi", context);
                    } else {
//                        Helper.startActivity(context, FrgAddDeviceNewDialog.class, DTitleAct.class);
                        context.startActivity(new Intent(context, ActAddDeviceDialog.class));
                    }
                } else {
                    Helper.startActivity(context, FrgMySb.class, TitleAct.class, "item", ((ModelList.DataBean.DeviceListBean) item.mList.get(0)));
                }
            }
        });
        mLinearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(((ModelList.DataBean.DeviceListBean) item.mList.get(1)).id)) {
                    if (!F.isWifiConnect(context)) {
                        Helper.toast("此功能需连接wifi", context);
                    } else {
//                        Helper.startActivity(context, FrgAddDeviceNewDialog.class, DTitleAct.class);
                        context.startActivity(new Intent(context, ActAddDeviceDialog.class));
                    }
                } else {
                    Helper.startActivity(context, FrgMySb.class, TitleAct.class, "item", ((ModelList.DataBean.DeviceListBean) item.mList.get(1)));
                }
            }
        });

    }

    public void set(ModelData item) {
        this.item = item;
        setShow(item.mList.size());
        for (int i = 0; i < item.mList.size(); i++) {
            ModelList.DataBean.DeviceListBean mMPhoto = (ModelList.DataBean.DeviceListBean) item.mList.get(i);
            if (i == 0) {
                goChange(mTextView_name, mImageView, mMPhoto);
            } else if (i == 1) {
                goChange(mTextView_name2, mImageView2, mMPhoto);
            }
        }
    }

    void goChange(TextView mTextView, ImageView mImageView, ModelList.DataBean.DeviceListBean mMPhoto) {
        if (TextUtils.isEmpty(mMPhoto.id)) {
            mTextView.setText("添加");
            mImageView.setImageResource(R.drawable.ic_tinajiashebei);
        } else {
            mTextView.setText(mMPhoto.devicenick);
            mImageView.setImageResource(R.drawable.ic_maolongyihao);
        }

    }

    void setShow(int count) {
        mLinearLayout1.setVisibility(count > 0 ? View.VISIBLE : View.INVISIBLE);
        mLinearLayout2.setVisibility(count > 1 ? View.VISIBLE : View.INVISIBLE);
    }


}