//
//  FrgHome
//
//  Created by DELL on 2019-03-22 16:44:22
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.pettimenew.frg;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;

import com.framewidget.newMenu.SlidingFragment;
import com.mdx.framework.activity.TitleAct;
import com.mdx.framework.utility.Helper;
import com.mdx.framework.utility.permissions.PermissionRequest;
import com.ndtlg.pettimenew.F;
import com.ndtlg.pettimenew.R;
import com.pgyersdk.javabean.AppBean;
import com.pgyersdk.update.PgyUpdateManager;
import com.pgyersdk.update.UpdateManagerListener;


public class FrgHome extends BaseFrg {
    //    17501469845    666666
    public LinearLayout mLinearLayout_content;
    public SlidingFragment mSlidingFragment;
    public android.support.v4.app.FragmentManager fragmentManager;
    public String type_wxqq;

    @Override
    protected void create(Bundle savedInstanceState) {
        type_wxqq = getActivity().getIntent().getStringExtra("type_wxqq");
        setContentView(R.layout.frg_home);
        initView();
        loaddata();
        Helper.requestPermissions(new String[]{android.Manifest.permission.READ_EXTERNAL_STORAGE,
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, new PermissionRequest() {
            @Override
            public void onGrant(String[] strings, int[] ints) {
                PgyUpdateManager.register(getActivity(),
                        new UpdateManagerListener() {
                            @Override
                            public void onUpdateAvailable(final String result) {
                                try { // 将新版本信息封装到AppBean中
                                    final AppBean appBean = getAppBeanFromString(result);
                                    new AlertDialog.Builder(getContext())
                                            .setTitle("版本更新").setCancelable(false)
                                            .setMessage("检查到新版本，是否更新")
                                            .setNegativeButton(
                                                    "确定",
                                                    new DialogInterface.OnClickListener() {

                                                        @Override
                                                        public void onClick(
                                                                DialogInterface dialog,
                                                                int which) {
                                                            startDownloadTask(
                                                                    getActivity(),
                                                                    appBean.getDownloadURL());
                                                        }
                                                    }).show();

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                            @Override
                            public void onNoUpdateAvailable() {
                            }
                        });
            }
        });
    }

    @Override
    public void disposeMsg(int type, Object obj) {
        switch (type) {
            case 0:
                F.logout(getContext());
                break;
        }
    }

    private void initView() {
        findVMethod();
    }

    private void findVMethod() {
        mLinearLayout_content = (LinearLayout) findViewById(R.id.mLinearLayout_content);

    }

    public void loaddata() {
        mSlidingFragment = new SlidingFragment(this);
        fragmentManager = getActivity().getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        fragmentTransaction.add(R.id.mLinearLayout_content, mSlidingFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

//        mSlidingFragment.addContentView(new FrgMain(), getResources().getString(com.framewidget.R.string.fa_home), 0);
//        mSlidingFragment.addContentView(new FrgWd(), getResources().getString(com.framewidget.R.string.fa_user), 0);
        mSlidingFragment.addContentView(new FrgMain(), "首页", R.drawable.btn_checked_1);
        mSlidingFragment.addContentView(new FrgWd(), "我的", R.drawable.btn_checked_2);
        mSlidingFragment.setOffscreenPageLimit(2);

//        if (!TextUtils.isEmpty(type_wxqq)) {
//            Helper.startActivity(getContext(), FrgForget.class, TitleAct.class, "title", "绑定手机号", "type", "3", "type_wxqq", type_wxqq);
//        }
    }


}