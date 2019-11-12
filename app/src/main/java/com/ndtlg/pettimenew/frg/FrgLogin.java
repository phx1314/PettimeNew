//
//  FrgLogin
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
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.ab.util.AbMd5;
import com.mdx.framework.activity.IndexAct;
import com.mdx.framework.activity.TitleAct;
import com.mdx.framework.utility.Helper;
import com.ndtlg.pettimenew.R;
import com.ndtlg.pettimenew.bean.BeanLogin;
import com.ndtlg.pettimenew.bean.BeanLogin3;
import com.ndtlg.pettimenew.bean.BeanMGetMobileMsg;
import com.ndtlg.pettimenew.bean.BeanMRegist;
import com.ndtlg.pettimenew.model.ModelLogin;
import com.ndtlg.pettimenew.model.ModelLogin3;
import com.ndtlg.pettimenew.model.ModelQQ;
import com.ndtlg.pettimenew.model.ModelWx;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;

import static com.ndtlg.pettimenew.F.MGetMobileMsg;
import static com.ndtlg.pettimenew.F.MLogin;
import static com.ndtlg.pettimenew.F.MLoginWeixinQQ;
import static com.ndtlg.pettimenew.F.MRegist;
import static com.ndtlg.pettimenew.F.json2Model;
import static com.ndtlg.pettimenew.F.uid;
import static com.ndtlg.pettimenew.F.verify;
import static com.ndtlg.pettimenew.F.wxqqid;


public class FrgLogin extends BaseFrg {

    public RadioGroup mRadioGroup_bg;
    public RadioButton mRadioButton_dl;
    public RadioButton mRadioButton_zc;
    public LinearLayout mLinearLayout_lodin;
    public EditText mEditText_phone;
    public EditText mEditText_pass;
    public TextView mTextView_login;
    public TextView mTextView_wj;
    public ImageButton ImageButton_qq;
    public ImageButton ImageButton_wx;
    public LinearLayout mLinearLayout_zc;
    public EditText mEditText_phone2;
    public TextView mTextView_get;
    public EditText mEditText_code;
    public EditText mEditText_pass2;
    public TextView mTextView_zc;
    public String openId;
    public String type_wxqq;
    private int times = 60;
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void create(Bundle savedInstanceState) {
        setContentView(R.layout.frg_login);
        initView();
        loaddata();
    }

    private void initView() {
        findVMethod();
    }

    private void findVMethod() {
        mRadioGroup_bg = (RadioGroup) findViewById(R.id.mRadioGroup_bg);
        mRadioButton_dl = (RadioButton) findViewById(R.id.mRadioButton_dl);
        mRadioButton_zc = (RadioButton) findViewById(R.id.mRadioButton_zc);
        mLinearLayout_lodin = (LinearLayout) findViewById(R.id.mLinearLayout_lodin);
        mEditText_phone = (EditText) findViewById(R.id.mEditText_phone);
        mEditText_pass = (EditText) findViewById(R.id.mEditText_pass);
        mTextView_login = (TextView) findViewById(R.id.mTextView_login);
        mTextView_wj = (TextView) findViewById(R.id.mTextView_wj);
        ImageButton_qq = (ImageButton) findViewById(R.id.ImageButton_qq);
        ImageButton_wx = (ImageButton) findViewById(R.id.ImageButton_wx);
        mLinearLayout_zc = (LinearLayout) findViewById(R.id.mLinearLayout_zc);
        mEditText_phone2 = (EditText) findViewById(R.id.mEditText_phone2);
        mTextView_get = (TextView) findViewById(R.id.mTextView_get);
        mEditText_code = (EditText) findViewById(R.id.mEditText_code);
        mEditText_pass2 = (EditText) findViewById(R.id.mEditText_pass2);
        mTextView_zc = (TextView) findViewById(R.id.mTextView_zc);

        mRadioGroup_bg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.mRadioButton_dl) {
                    mLinearLayout_lodin.setVisibility(View.VISIBLE);
                    mLinearLayout_zc.setVisibility(View.GONE);
                    mRadioButton_dl.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, R.drawable.select);
                    mRadioButton_zc.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                } else {
                    mLinearLayout_zc.setVisibility(View.VISIBLE);
                    mLinearLayout_lodin.setVisibility(View.GONE);
                    mRadioButton_dl.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    mRadioButton_zc.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, R.drawable.select);
                }
            }
        });
        mTextView_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(mEditText_phone.getText().toString())) {
                    Helper.toast("请输入手机号", getContext());
                    return;
                }
                if (mEditText_phone.getText().toString().length() != 11) {
                    Helper.toast("请输入正确的手机号", getContext());
                    return;
                }
                if (TextUtils.isEmpty(mEditText_pass.getText().toString())) {
                    Helper.toast("请输入密码", getContext());
                    return;
                }

                BeanLogin mBeanLogin = new BeanLogin(mEditText_phone.getText().toString(), AbMd5.md5(mEditText_pass.getText().toString()));
                loadUrl(MLogin, mBeanLogin);
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
                loadUrl(MRegist, new BeanMRegist(mEditText_phone2.getText().toString(), mEditText_code.getText().toString(), AbMd5.md5(mEditText_pass2.getText().toString())));
            }
        });
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

                loadUrl(MGetMobileMsg, new BeanMGetMobileMsg(mEditText_phone2.getText().toString(), "1"));

            }
        });
        mTextView_wj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Helper.startActivity(getContext(), FrgForget.class, TitleAct.class, "title", "忘记密码", "type", "2");
            }
        });
        ImageButton_qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginWithQQ();
            }
        });
        ImageButton_wx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UMShareAPI.get(getActivity()).doOauthVerify(getActivity(),
                        SHARE_MEDIA.WEIXIN, new UMAuthListener() {
                            @Override
                            public void onError(SHARE_MEDIA arg0, int arg1,
                                                Throwable arg2) {

                            }

                            @Override
                            public void onComplete(SHARE_MEDIA arg0, int arg1,
                                                   Map<String, String> data) {
                                openId = data.get("openid");
                                type_wxqq = "1";
                                String token = data.get("access_token");
                                load("https://api.weixin.qq.com/sns/userinfo?access_token=" + token + "&openid=" + openId, "WX", null);
                            }

                            @Override
                            public void onCancel(SHARE_MEDIA arg0, int arg1) {

                            }
                        });
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

    public void loaddata() {

    }

    /**
     * 第三方登�?--qq
     */
    public void loginWithQQ() {
        UMShareAPI.get(getActivity()).doOauthVerify(getActivity(),
                SHARE_MEDIA.QQ, new UMAuthListener() {
                    @Override
                    public void onError(SHARE_MEDIA arg0, int arg1,
                                        Throwable arg2) {
                        Log.i("qq=", "error");
                    }

                    @Override
                    public void onComplete(SHARE_MEDIA arg0, int arg1,
                                           Map<String, String> data) {
                        openId = data.get("openid");
                        type_wxqq = "2";
                        String token = data.get("access_token");// outInfoe
                        load("https://graph.qq.com/user/get_user_info?openid=" + openId + "&access_token=" + token + "&appid=1108315216", "QQ", null);

                    }

                    @Override
                    public void onCancel(SHARE_MEDIA arg0, int arg1) {
                        Log.i("qq=", "onCancel");
                    }
                });

    }

    @Override
    public void onSuccess(String methodName, String content) {
        if (methodName.equals(MGetMobileMsg)) {
            times = 60;
            doTimer();
        } else if (methodName.equals(MLogin) || methodName.equals(MRegist)) {
            ModelLogin mModelLogin = (ModelLogin) json2Model(content, ModelLogin.class);
            uid = mModelLogin.data.id;
            verify = mModelLogin.data.verify;
            com.ndtlg.pettimenew.F.saveJson("uid", uid);
            com.ndtlg.pettimenew.F.saveJson("verify", verify);
            Helper.startActivity(getContext(), FrgHome.class, IndexAct.class);
        } else if (methodName.equals(MLoginWeixinQQ)) {
            ModelLogin3 mModelLogin = (ModelLogin3) json2Model(content, ModelLogin3.class);
            uid = mModelLogin.data.id;
            verify = mModelLogin.data.verify;
            wxqqid = openId;
            com.ndtlg.pettimenew.F.saveJson("uid", uid);
            com.ndtlg.pettimenew.F.saveJson("verify", verify);
            com.ndtlg.pettimenew.F.saveJson("wxqqid", wxqqid);
            if (mModelLogin.data.bindMobile) {
                Helper.startActivity(getContext(), FrgHome.class, IndexAct.class);
            } else {
                Helper.startActivity(getContext(), FrgHome.class, IndexAct.class, "type_wxqq", type_wxqq);
            }
        } else if (methodName.equals("WX")) {
            ModelWx moldelWx = (ModelWx) json2Model(content, ModelWx.class);
            loadUrl(MLoginWeixinQQ, new BeanLogin3(openId, type_wxqq, moldelWx.nickname, moldelWx.headimgurl, moldelWx.sex));
        } else if (methodName.equals("QQ")) {
            ModelQQ moldelWx = (ModelQQ) json2Model(content, ModelQQ.class);
            loadUrl(MLoginWeixinQQ, new BeanLogin3(openId, type_wxqq, moldelWx.nickname, moldelWx.figureurl_qq, moldelWx.gender.equals("男") ? 1 : 2));
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(getActivity()).onActivityResult(requestCode, resultCode,
                data);
    }
}