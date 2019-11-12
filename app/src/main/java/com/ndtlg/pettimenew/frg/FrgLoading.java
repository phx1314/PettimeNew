//
//  FrgLoading
//
//  Created by DELL on 2019-03-22 16:44:22
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.pettimenew.frg;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.LinearLayout;

import com.mdx.framework.activity.IndexAct;
import com.mdx.framework.utility.Helper;
import com.mdx.framework.widget.MImageView;
import com.ndtlg.pettimenew.R;

import static com.ndtlg.pettimenew.F.uid;


public class FrgLoading extends BaseFrg {

    public LinearLayout activity_main;
    public MImageView mImageView;


    @Override
    protected void create(Bundle savedInstanceState) {
        setContentView(R.layout.frg_loading);
        initView();
        loaddata();
    }

    private void initView() {
        findVMethod();
    }

    private void findVMethod() {
        activity_main = (LinearLayout) findViewById(R.id.activity_main);
        mImageView = (MImageView) findViewById(R.id.mImageView);


    }

    public void loaddata() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(uid)) {
                    Helper.startActivity(getContext(), Intent.FLAG_ACTIVITY_CLEAR_TOP,FrgLogin.class, IndexAct.class);
                } else {
                    Helper.startActivity(getContext(), FrgHome.class, IndexAct.class);
                }
            }
        }, 0);
    }


}