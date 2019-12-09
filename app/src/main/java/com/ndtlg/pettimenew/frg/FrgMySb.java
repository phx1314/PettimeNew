//
//  FrgMySb
//
//  Created by DELL on 2019-03-22 16:44:22
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.pettimenew.frg;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.aliyun.alink.linkkit.api.LinkKit;
import com.aliyun.alink.linksdk.cmp.connect.channel.MqttPublishRequest;
import com.aliyun.alink.linksdk.cmp.core.base.ARequest;
import com.aliyun.alink.linksdk.cmp.core.base.AResponse;
import com.aliyun.alink.linksdk.cmp.core.listener.IConnectSendListener;
import com.aliyun.alink.linksdk.tools.AError;
import com.framewidget.frg.FrgList;
import com.google.gson.Gson;
import com.mdx.framework.Frame;
import com.mdx.framework.activity.TitleAct;
import com.mdx.framework.utility.Helper;
import com.mdx.framework.widget.ActionBar;
import com.ndtlg.pettimenew.F;
import com.ndtlg.pettimenew.R;
import com.ndtlg.pettimenew.bean.BeanGet;
import com.ndtlg.pettimenew.bean.BeanMUnBindDevice;
import com.ndtlg.pettimenew.bean.BeanUpdate;
import com.ndtlg.pettimenew.model.ModelAlData;
import com.ndtlg.pettimenew.model.ModelList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static com.ndtlg.pettimenew.F.MUnBindDevice;
import static com.ndtlg.pettimenew.frg.FrgWd.mModelMgetUserInfo;


public class FrgMySb extends BaseFrg implements SeekBar.OnSeekBarChangeListener {

    public LinearLayout mLinearLayout1;
    public TextView mTextView1;
    public TextView mTextView2;
    public TextView mTextView_hx;
    public TextView mTextView_version;
    public TextView mTextView_lnw;
    public ModelList.DataBean.DeviceListBean item;
    public ModelAlData mModelAlData;
    public TextView mTextView_update;
    public Runnable mRunnable;
    public String data;
    public Typeface font = Typeface.createFromAsset(Frame.CONTEXT.getAssets(), "Futura.ttf");
    public LinearLayout mLinearLayout_cnm;
    public ImageView mImageView_zc;
    public boolean fromUser;
    public ProgressDialog mProgressDialog;
    public ImageView mImageView_left;
    public ImageView mImageView_right;
    public TextView mTextView_xd;
    public TextView mTextView_xd_cao;
    public TextView mTextView_zm_cao;
    public TextView mTextView_hw;
    public TextView mTextView_hw_cao;
    public TextView mTextView_hq;
    public TextView mTextView_hq_cao;
    public ScheduledExecutorService mScheduledExecutorService;
    @Override
    protected void create(Bundle savedInstanceState) {
        item = (ModelList.DataBean.DeviceListBean) getActivity().getIntent().getSerializableExtra("item");

        setContentView(R.layout.frg_my_sb);
        initView();
        loaddata();
    }

    @Override
    public void disposeMsg(int type, Object obj) {
        switch (type) {
            case 0:
                data = obj.toString();
                mModelAlData = (ModelAlData) F.json2Model(obj.toString(), ModelAlData.class);
                if (!TextUtils.isEmpty(mModelAlData.deviceID) && !TextUtils.isEmpty(mModelAlData.workmode) && mModelAlData.deviceID.equals(item.devicename)) {
                    if (mProgressDialog.isShowing()) mProgressDialog.dismiss();
                    Log.i("获取到数据", obj.toString());
                    mModelAlData.action = "set";
                    mModelAlData.deviceName = item.devicename;
                    mModelAlData.deviceID = item.userid;
                    refshUI();
                } else {
                    Log.i("获取到数据,但是不匹配", obj.toString());
                }
                break;
            case 1:
//                mModelAlData.time.set = mModelAlData.time.remain = obj.toString();
                refshUI();
                break;
            case 2:
                mModelAlData.temperature.set = obj.toString();
                sendDRF(mModelAlData);
                break;
        }
    }

    private void initView() {
        findVMethod();
    }

    private void findVMethod() {
        mProgressDialog = new ProgressDialog(getContext());
        mProgressDialog.setMessage("更新中...");
        mLinearLayout1 = (LinearLayout) findViewById(R.id.mLinearLayout1);
        mTextView1 = (TextView) findViewById(R.id.mTextView1);
        mTextView2 = (TextView) findViewById(R.id.mTextView2);
        mTextView_hx = (TextView) findViewById(R.id.mTextView_hx);
        mTextView_version = (TextView) findViewById(R.id.mTextView_version);
        mTextView_lnw = (TextView) findViewById(R.id.mTextView_lnw);
        mTextView_update = (TextView) findViewById(R.id.mTextView_update);
        mLinearLayout_cnm = (LinearLayout) findViewById(R.id.mLinearLayout_cnm);
        mImageView_zc = (ImageView) findViewById(R.id.mImageView_zc);
        mImageView_left = (ImageView) findViewById(R.id.mImageView_left);
        mImageView_right = (ImageView) findViewById(R.id.mImageView_right);
        mTextView_xd = (TextView) findViewById(R.id.mTextView_xd);
        mTextView_xd_cao = (TextView) findViewById(R.id.mTextView_xd_cao);
        mTextView_zm_cao = (TextView) findViewById(R.id.mTextView_zm_cao);
        mTextView_hw = (TextView) findViewById(R.id.mTextView_hw);
        mTextView_hw_cao = (TextView) findViewById(R.id.mTextView_hw_cao);
        mTextView_hq = (TextView) findViewById(R.id.mTextView_hq);
        mTextView_hq_cao = (TextView) findViewById(R.id.mTextView_hq_cao);
        mTextView2.setTypeface(font);
        mImageView_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    if (Integer.valueOf(mModelAlData.temperature.set) > 20) {
                        mModelAlData.temperature.set = (Integer.valueOf(mModelAlData.temperature.set) - 1) + "";
                    }
                    sendDRF(mModelAlData);
                }
            }
        });
        mImageView_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    if (Integer.valueOf(mModelAlData.temperature.set) < 40) {
                        mModelAlData.temperature.set = (Integer.valueOf(mModelAlData.temperature.set) + 1) + "";
                    }
                    sendDRF(mModelAlData);
                }
            }
        });
        mTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    List<String> src = new ArrayList<>();
                    for (int i = 40; i > 19; i--) {
                        src.add(i + "");
                    }
                    Helper.startActivity(getContext(), FrgList.class, TitleAct.class, "from", "FrgMySb", "type", 2, "title", "请选择温度", "data", src);
                }
            }
        });
        mTextView_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    mProgressDialog.show();
                    sendDRF(new BeanUpdate(item.url, mModelAlData.deviceName, mModelAlData.deviceID));
                }
            }
        });
        mTextView_lnw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    mModelAlData.light = mModelAlData.light.equals("0") ? "1" : "0";
                    sendDRF(mModelAlData);
                }
            }
        });

        mTextView_hq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    mModelAlData.fan.speed = mModelAlData.fan.speed.equals("0") ? "1" : "0";
                    sendDRF(mModelAlData);
                }
            }
        });
        mTextView_hw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0") && !TextUtils.isEmpty(mModelAlData.temperature.set)) {
                    if (Integer.valueOf(mModelAlData.temperature.set) > 0) {
                        mModelAlData.temperature.set = "-20";
                    } else {
                        mModelAlData.temperature.set = "20";
                    }
                    sendDRF(mModelAlData);
                }
            }
        });
        mTextView_xd.setOnClickListener(new View.OnClickListener() {//消毒
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    if (mModelAlData.time.set.equals("0")) {
                        com.framewidget.F.yShoure(getContext(), "", "即将进入消毒模式,请将宠物移出猫舍！以免发生意外！", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                mModelAlData.time.set = mModelAlData.time.set.equals("0") ? "1" : "0";
                                sendDRF(mModelAlData);
                            }
                        });
                    } else {
                        mModelAlData.time.set = mModelAlData.time.set.equals("0") ? "1" : "0";
                        sendDRF(mModelAlData);
                    }

                }
            }
        });

//        mLinearLayout_cnm.setBackgroundResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.red : R.drawable.blue);
//
//        mImageView_left.setImageResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.left_red : R.drawable.left);
//        mImageView_right.setImageResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.right_red : R.drawable.right);
    }

    public void refshUI() {
        mImageView_zc.setVisibility(View.GONE);
        mTextView1.setText("当前温度:" + mModelAlData.temperature.current + "℃");
        mTextView2.setText(mModelAlData.temperature.set + "℃");
        mTextView_version.setText(mModelAlData.version);
        if (Integer.valueOf(mModelAlData.temperature.set) > 0) {
            mTextView_hw.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_hengwen_h, 0, 0);
        } else {
            mTextView_hw.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_hengwen, 0, 0);
        }
        if (mModelAlData.time.set.equals("0")) {
            mTextView_xd.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_xiaodu, 0, 0);
        } else {
            mTextView_xd.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_xiaodu_h, 0, 0);
        }
        if (mModelAlData.fan.speed.equals("0")) {
            mTextView_hq.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_huanqi, 0, 0);
        } else {
            mTextView_hq.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_huanqi_h, 0, 0);
        }
        if (mModelAlData.light.equals("0")) {
            mTextView_lnw.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.heat, 0, 0);
        } else {
            mTextView_lnw.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.heat_select_blue, 0, 0);
        }

        if (mModelAlData.workmode.equals("0")) {//关机
            Helper.toast("该设备已关机", getContext());
            mImageView_zc.setVisibility(View.VISIBLE);
        } else if (mModelAlData.workmode.equals("1")) {
            mLinearLayout1.setVisibility(View.VISIBLE);
        }

    }

    public void sendDRF(Object obj) {
        sendD(obj, "/" + mModelMgetUserInfo.data.productKey + "/" + mModelMgetUserInfo.data.id + "/user/update");
        mModelAlData = null;
        mImageView_zc.setVisibility(View.VISIBLE);

    }

    public void sendD(Object obj, String topic) {
        MqttPublishRequest request = new MqttPublishRequest();
        request.isRPC = false;
        request.topic = topic;
        request.qos = 1;
        request.payloadObj = new Gson().toJson(obj);
//        request.payloadObj ="{\"action\":\"set\",\"deviceID\":\"c927bc2ea37e4a26a2034db71cff693e\",\"deviceName\":\"MH00016C06A629\",\"workmode\":\"2\"}" ;
        LinkKit.getInstance().publish(request, new IConnectSendListener() {
            @Override
            public void onResponse(ARequest aRequest, AResponse aResponse) {
                // 发布成功
                Log.i("数据发布成功", aResponse.toString());
            }

            @Override
            public void onFailure(ARequest aRequest, AError aError) {
                // 发布失败
                Log.i("数据发布失败", aRequest.toString());
            }
        });
    }


    public void loaddata() {
        mScheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        mScheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                sendD(new BeanGet(item.devicename, item.userid, "get"), "/" + mModelMgetUserInfo.data.productKey + "/" + mModelMgetUserInfo.data.id + "/user/update");
            }
        }, 0, 4, TimeUnit.SECONDS);

//        loadUrl(MGetDeviceStatus, new BeanMGetDeviceStatus(item.iotid));

        mRunnable = new Runnable() {
            @Override
            public void run() {
                mModelAlData = (ModelAlData) F.json2Model(data, ModelAlData.class);
            }
        };
    }

    @Override
    public void onSuccess(String methodName, String content) {
        finish();
        Frame.HANDLES.sentAll("FrgMain", 0, null);
    }

    @Override
    public void setActionBar(ActionBar actionBar, Context context) {
        super.setActionBar(actionBar, context);
        mHeadlayout.setTitle("设备详情");
        mHeadlayout.setRText("删除");
        mHeadlayout.setRightOnclicker(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.framewidget.F.yShoure(getContext(), "确认删除", "", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        loadUrl(MUnBindDevice, new BeanMUnBindDevice(item.iotid));
                    }
                });
            }
        });
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        this.fromUser = fromUser;
//        if (mModelAlData != null && !mModelAlData.workmode.equals("0") && fromUser) {
//            mModelAlData.fan.speed = progress + "";
//            sendDRF(mModelAlData);
//        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (mModelAlData != null && !mModelAlData.workmode.equals("0") && fromUser) {
            mModelAlData.fan.speed = seekBar.getProgress() + "";
            sendDRF(mModelAlData);
        }

    }

    @Override
    public void onDestroy() {
        mScheduledExecutorService.shutdown();
        super.onDestroy();
    }
}