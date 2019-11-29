//
//  BaseAct
//
//  Created by 86139 on 2019-11-29 21:05:38
//  Copyright (c) 86139 All rights reserved.


/**

 */


package com.ndtlg.pettimenew.act;

import android.view.View;

import com.ab.http.HttpUtil;
import com.ab.util.HttpResponseListener;
import com.ab.util.HttpResponseListenerSon;
import com.framewidget.view.Headlayout;
import com.mdx.framework.activity.MActivity;

public abstract class BaseAct extends MActivity implements View.OnClickListener, HttpResponseListenerSon {

    public Headlayout mHeadlayout;

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onFinish() {

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onFailure(int statusCode, String content, Throwable error) {

    }

    public void loadUrl(String methodName, Object mparams) {
        HttpUtil.loadUrl(getContext(), "GET", methodName, new HttpResponseListener(getContext(), this, methodName, true), mparams);
    }

    public void loadUrlPost(String methodName, Object mparams) {
        HttpUtil.loadUrlPOST(getContext(), "POST", methodName, new HttpResponseListener(getContext(), this, methodName, true), mparams);
    }

    public void loadUrlNs(String methodName, Object mparams) {
        HttpUtil.loadUrl(getContext(), "GET", methodName, new HttpResponseListener(getContext(), this, methodName, false), mparams);
    }

    public void load(String methodName, String bs, Object mparams) {
        HttpUtil.loadUrl(getContext(), "GET", methodName, new HttpResponseListener(getContext(), this, bs, true), mparams);
    }

    @Override
    public void onSuccess(String methodName, String content) {
    }

}