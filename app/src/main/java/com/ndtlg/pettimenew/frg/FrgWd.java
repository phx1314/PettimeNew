//
//  FrgWd
//
//  Created by DELL on 2019-03-22 16:44:22
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.pettimenew.frg;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aliyun.alink.dm.api.DeviceInfo;
import com.aliyun.alink.dm.api.InitResult;
import com.aliyun.alink.linkkit.api.ILinkKitConnectListener;
import com.aliyun.alink.linkkit.api.IoTMqttClientConfig;
import com.aliyun.alink.linkkit.api.LinkKit;
import com.aliyun.alink.linkkit.api.LinkKitInitParams;
import com.aliyun.alink.linksdk.cmp.connect.channel.MqttSubscribeRequest;
import com.aliyun.alink.linksdk.cmp.core.base.AMessage;
import com.aliyun.alink.linksdk.cmp.core.base.ConnectState;
import com.aliyun.alink.linksdk.cmp.core.listener.IConnectNotifyListener;
import com.aliyun.alink.linksdk.cmp.core.listener.IConnectSubscribeListener;
import com.aliyun.alink.linksdk.tmp.device.payload.ValueWrapper;
import com.aliyun.alink.linksdk.tools.AError;
import com.mdx.framework.Frame;
import com.mdx.framework.activity.TitleAct;
import com.mdx.framework.config.BaseConfig;
import com.mdx.framework.utility.Helper;
import com.mdx.framework.widget.MImageView;
import com.ndtlg.pettimenew.F;
import com.ndtlg.pettimenew.R;
import com.ndtlg.pettimenew.bean.BeanBind;
import com.ndtlg.pettimenew.bean.BeanMUnBindWeixinQQ;
import com.ndtlg.pettimenew.bean.BeanMgetUserInfo;
import com.ndtlg.pettimenew.model.ModelMgetUserInfo;
import com.ndtlg.pettimenew.model.ModelQQ;
import com.ndtlg.pettimenew.model.ModelWx;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.HashMap;
import java.util.Map;

import static com.ndtlg.pettimenew.F.MBindWeixinQQ;
import static com.ndtlg.pettimenew.F.MUnBindWeixinQQ;
import static com.ndtlg.pettimenew.F.MgetUserInfo;
import static com.ndtlg.pettimenew.F.json2Model;


public class FrgWd extends BaseFrg implements IConnectNotifyListener {

    public MImageView mImageView;
    public TextView mTextView_name;
    public TextView mTextView_content;
    public TextView mTextView_bj;
    public LinearLayout mLinearLayout_wx;
    public LinearLayout mLinearLayout_qq;
    public TextView mTextView_logout;
    public static ModelMgetUserInfo mModelMgetUserInfo;
    public TextView mTextView_wx;
    public TextView mTextView_qq;
    public String openId;
    public String type_wxqq;
    public boolean isFirst = true;
    public LinearLayout mLinearLayout_phone;
    public ImageView mImageView_phone;

    @Override
    protected void create(Bundle savedInstanceState) {
        setContentView(R.layout.frg_wd);
        initView();
        loaddata();
    }

    @Override
    public void disposeMsg(int type, Object obj) {
        switch (type) {
            case 0:
                loadUrl(MgetUserInfo, new BeanMgetUserInfo());
                break;
            case 1:
                isFirst = true;
                LinkKit.getInstance().unRegisterOnPushListener(FrgWd.this);
                LinkKit.getInstance().deinit();
                break;
            case 2 :
                initSB(mModelMgetUserInfo.data.productKey, mModelMgetUserInfo.data.id, mModelMgetUserInfo.data.deviceSecret);
                break;
        }
    }

    private void initView() {
        findVMethod();
    }

    private void findVMethod() {
        mImageView = (MImageView) findViewById(R.id.mImageView);
        mTextView_name = (TextView) findViewById(R.id.mTextView_name);
        mTextView_content = (TextView) findViewById(R.id.mTextView_content);
        mTextView_bj = (TextView) findViewById(R.id.mTextView_bj);
        mLinearLayout_wx = (LinearLayout) findViewById(R.id.mLinearLayout_wx);
        mLinearLayout_qq = (LinearLayout) findViewById(R.id.mLinearLayout_qq);
        mTextView_logout = (TextView) findViewById(R.id.mTextView_logout);
        mTextView_wx = (TextView) findViewById(R.id.mTextView_wx);
        mTextView_qq = (TextView) findViewById(R.id.mTextView_qq);
        mLinearLayout_phone = (LinearLayout) findViewById(R.id.mLinearLayout_phone);
        mImageView_phone = (ImageView) findViewById(R.id.mImageView_phone);
        mTextView_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F.logout(getContext());
            }
        });
        mTextView_bj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Helper.startActivity(getContext(), FrgGrzl.class, TitleAct.class);
            }
        });

        mLinearLayout_qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type_wxqq = "2";
                if (mModelMgetUserInfo.data.qqid.equals("1")) {
                    if (TextUtils.isEmpty(mModelMgetUserInfo.data.mobile) && mModelMgetUserInfo.data.wxid.equals("0")) {
                        Helper.toast("无法解绑", getContext());
                    } else {
                        loadUrl(MUnBindWeixinQQ, new BeanMUnBindWeixinQQ(mModelMgetUserInfo.data.qqid, type_wxqq));
                    }
                } else {
                    loginWithQQ();
                }

            }
        });
        mLinearLayout_wx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type_wxqq = "1";
                if (mModelMgetUserInfo.data.wxid.equals("1")) {
                    if (TextUtils.isEmpty(mModelMgetUserInfo.data.mobile) && mModelMgetUserInfo.data.qqid.equals("0")) {
                        Helper.toast("无法解绑", getContext());
                    } else {
                        loadUrl(MUnBindWeixinQQ, new BeanMUnBindWeixinQQ(mModelMgetUserInfo.data.wxid, type_wxqq));
                    }
                } else {
                    loginWithWX();
                }
            }
        });
        mLinearLayout_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Helper.startActivity(getContext(), FrgForget.class, TitleAct.class, "title", "绑定手机号", "type", "3" );
            }
        });
    }

    public void loginWithWX() {
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

    public void loaddata() {
        loadUrl(MgetUserInfo, new BeanMgetUserInfo());
        LinkKit.getInstance().registerOnPushListener(this);
    }

    public void refReash() {
        mImageView.setObj(mModelMgetUserInfo.data.header.startsWith("http") ? mModelMgetUserInfo.data.header : BaseConfig.getUri() + "/download.do?id=" + mModelMgetUserInfo.data.header);
        mImageView.setCircle(true);
        mTextView_name.setText(mModelMgetUserInfo.data.nickname);
        mTextView_content.setText(TextUtils.isEmpty(mModelMgetUserInfo.data.remark) ? "用户很懒，什么也没留下" : mModelMgetUserInfo.data.remark);
        if (mModelMgetUserInfo.data.sex == 1) {
            mTextView_name.setCompoundDrawablesWithIntrinsicBounds(R.drawable.man, 0, 0, 0);
        } else if (mModelMgetUserInfo.data.sex == 2) {
            mTextView_name.setCompoundDrawablesWithIntrinsicBounds(R.drawable.woman, 0, 0, 0);
        } else {
            mTextView_name.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        if (mModelMgetUserInfo.data.qqid.equals("1")) {
            mTextView_qq.setText("解绑");
        } else {
            mTextView_qq.setText("绑定");
        }
        if (mModelMgetUserInfo.data.wxid.equals("1")) {
            mTextView_wx.setText("解绑");
        } else {
            mTextView_wx.setText("绑定");
        }
        if (TextUtils.isEmpty(mModelMgetUserInfo.data.mobile )) {
            mLinearLayout_phone.setVisibility(View.VISIBLE);
            mImageView_phone.setVisibility(View.VISIBLE);
        } else {
            mLinearLayout_phone.setVisibility(View.GONE);
            mImageView_phone.setVisibility(View.GONE);
        }
    }

    public void subTopic() {// 订阅
        MqttSubscribeRequest subscribeRequest = new MqttSubscribeRequest();
        subscribeRequest.topic = "/" + mModelMgetUserInfo.data.productKey + "/" + mModelMgetUserInfo.data.id + "/get";
        subscribeRequest.isSubscribe = true;
        LinkKit.getInstance().subscribe(subscribeRequest, new IConnectSubscribeListener() {
            @Override
            public void onSuccess() {
                Log.i("阿里订阅成功", "ss");
            }

            @Override
            public void onFailure(AError aError) {
                Log.i("阿里订阅失败", "ss");
            }
        });
    }

    public void initSB(String productKey, String deviceName, String deviceSecret) {
        if (isFirst) {
            /**
             * 设置设备三元组信息
             */
            DeviceInfo deviceInfo = new DeviceInfo();
            deviceInfo.productKey = productKey;// 产品类型
            deviceInfo.deviceName = deviceName;// 设备名称
            deviceInfo.deviceSecret = deviceSecret;// 设备密钥
/**
 * 设置设备当前的初始状态值，属性需要和云端创建的物模型属性一致
 * 如果这里什么属性都不填，物模型就没有当前设备相关属性的初始值。
 * 用户调用物模型上报接口之后，物模型会有相关数据缓存。
 */
            Map<String, ValueWrapper> propertyValues = new HashMap<>();
// 示例
// propertyValues.put("LightSwitch", new ValueWrapper.BooleanValueWrapper(0));
            IoTMqttClientConfig clientConfig = new IoTMqttClientConfig(productKey, deviceName, deviceSecret);
            LinkKitInitParams params = new LinkKitInitParams();
            params.deviceInfo = deviceInfo;
            params.propertyValues = propertyValues;
            params.mqttClientConfig = clientConfig;
            LinkKit.getInstance().init(getContext(), params, new ILinkKitConnectListener() {
                @Override
                public void onError(AError error) {
                    // 初始化失败 error包含初始化错误信息
                    Log.i("阿里失败", error.toString());
                }

                @Override
                public void onInitDone(Object data) {
                    // 初始化成功 data 作为预留参数
                    Log.i("阿里成功", ((InitResult) data).tsl);
                    subTopic();
                }
            });
            isFirst = false;
        }
    }

    @Override
    public void onSuccess(String methodName, String content) {
        if (methodName.equals(MgetUserInfo)) {
            mModelMgetUserInfo = (ModelMgetUserInfo) json2Model(content, ModelMgetUserInfo.class);
            refReash();
            initSB(mModelMgetUserInfo.data.productKey, mModelMgetUserInfo.data.id, mModelMgetUserInfo.data.deviceSecret);
        } else if (methodName.equals("WX")) {
            ModelWx moldelWx = (ModelWx) json2Model(content, ModelWx.class);
            loadUrl(MBindWeixinQQ, new BeanBind(openId, type_wxqq, moldelWx.nickname, moldelWx.headimgurl, moldelWx.sex));
        } else if (methodName.equals("QQ")) {
            ModelQQ moldelWx = (ModelQQ) json2Model(content, ModelQQ.class);
            loadUrl(MBindWeixinQQ, new BeanBind(openId, type_wxqq, moldelWx.nickname, moldelWx.figureurl_qq, moldelWx.gender.equals("男") ? 1 : 2));
        } else if (methodName.equals(MBindWeixinQQ) || methodName.equals(MUnBindWeixinQQ)) {
            loadUrl(MgetUserInfo, new BeanMgetUserInfo());
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(getActivity()).onActivityResult(requestCode, resultCode,
                data);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LinkKit.getInstance().unRegisterOnPushListener(this);
        LinkKit.getInstance().deinit();
    }

    @Override
    public void onNotify(String s, String s1, AMessage aMessage) {
        // 下行数据通知
        String content = new String((byte[]) aMessage.getData());
        Log.i("阿里数据", content);
        Frame.HANDLES.sentAll("FrgMySb", 0, content);
        Frame.HANDLES.sentAll("FrgAddDevice", 0, content);
    }

    @Override
    public boolean shouldHandle(String s, String s1) {
        return true;
    }

    @Override
    public void onConnectStateChange(String s, ConnectState connectState) {
        if (connectState.equals(ConnectState.DISCONNECTED)) {
//            Helper.toast("mqtt连接已断开", getContext());
            initSB(mModelMgetUserInfo.data.productKey, mModelMgetUserInfo.data.id, mModelMgetUserInfo.data.deviceSecret);
        }
    }
}