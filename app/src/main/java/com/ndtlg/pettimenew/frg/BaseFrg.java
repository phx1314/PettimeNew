//
//  BaseFrg
//
//  Created by DELL on 2019-03-22 16:44:22
//  Copyright (c) DELL All rights reserved.


/**
   
*/

package com.ndtlg.pettimenew.frg;

import android.content.Context;
import android.view.View;

import com.ab.http.HttpUtil;
import com.ab.util.HttpResponseListener;
import com.ab.util.HttpResponseListenerSon;
import com.framewidget.view.Headlayout;
import com.mdx.framework.activity.MFragment;
import com.mdx.framework.widget.ActionBar;
import com.ndtlg.pettimenew.R;

public abstract class BaseFrg  extends MFragment implements View.OnClickListener, HttpResponseListenerSon {
	public Headlayout mHeadlayout;
	@Override
	public void onClick(View v) {
		
	}
	@Override
	public void onFinish() {

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
	public void load(String methodName,String bs, Object mparams) {
		HttpUtil.loadUrl(getContext(), "GET", methodName, new HttpResponseListener(getContext(), this, bs, true), mparams);
	}
	@Override
	public void onSuccess(String methodName, String content) {
	}
	@Override
	public void setActionBar(ActionBar actionBar, Context context) {
		mHeadlayout = new Headlayout(context);
		mHeadlayout.setLeftBackground(R.drawable.bt_fanhui_n);
		mHeadlayout.setGoBack(getActivity());
		actionBar.addView(mHeadlayout);
	}

}
