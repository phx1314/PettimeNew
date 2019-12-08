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

import static com.ndtlg.pettimenew.F.MUnBindDevice;
import static com.ndtlg.pettimenew.frg.FrgWd.mModelMgetUserInfo;


public class FrgMySb extends BaseFrg implements SeekBar.OnSeekBarChangeListener {

    public LinearLayout mLinearLayout1;
    public TextView mTextView1;
    public TextView mTextView2;
    public TextView mTextView3;
    public SeekBar mProgressBar;
    public TextView mTextView_hx;
    public TextView mTextView_jr;
    public TextView mTextView_sj;
    public TextView mTextView_version;
    public LinearLayout mRelativeLayout;
    public LinearLayout mLinearLayout_gg;
    public TextView mTextView_1;
    public TextView mTextView_lnw;
    public ModelList.DataBean.DeviceListBean item;
    public ImageView mImageView_change;
    public ImageView mImageView_del;
    public ImageView mImageView_add;
    public ImageView mImageView_change2;
    public ModelAlData mModelAlData;
    public TextView mTextView_update;
    public Handler mHandler = new Handler();
    public Runnable mRunnable;
    public String data;
    public TextView mTextView_2;
    public SeekBar mProgressBar2;
    public Typeface font = Typeface.createFromAsset(Frame.CONTEXT.getAssets(), "Futura.ttf");
    public LinearLayout mLinearLayout_cnm;
    public SeekBar mProgressBar_nv;
    public SeekBar mProgressBar2_nv;
    public ImageView mImageView_zc;
    public boolean fromUser;
    public ProgressDialog mProgressDialog;
    public ImageView mImageView_left;
    public ImageView mImageView_right;
    public TextView mTextView_hgcao;
    public TextView mTextView_xdcao;
    public ImageView mImageView_left2;
    public ImageView mImageView_right2;
    public TextView mTextView_zmcao;
    public TextView mTextView_lnw2;

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
                }
                break;
            case 1:
                mModelAlData.time.set = mModelAlData.time.remain = obj.toString();
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
        mTextView3 = (TextView) findViewById(R.id.mTextView3);
        mProgressBar = (SeekBar) findViewById(R.id.mProgressBar);
        mTextView_hx = (TextView) findViewById(R.id.mTextView_hx);
        mTextView_jr = (TextView) findViewById(R.id.mTextView_jr);
        mTextView_sj = (TextView) findViewById(R.id.mTextView_sj);
        mTextView_version = (TextView) findViewById(R.id.mTextView_version);
        mRelativeLayout = (LinearLayout) findViewById(R.id.mRelativeLayout);
        mLinearLayout_gg = (LinearLayout) findViewById(R.id.mLinearLayout_gg);
        mTextView_1 = (TextView) findViewById(R.id.mTextView_1);
        mTextView_lnw = (TextView) findViewById(R.id.mTextView_lnw);
        mImageView_change = (ImageView) findViewById(R.id.mImageView_change);
        mImageView_del = (ImageView) findViewById(R.id.mImageView_del);
        mImageView_add = (ImageView) findViewById(R.id.mImageView_add);
        mImageView_change2 = (ImageView) findViewById(R.id.mImageView_change2);
        mTextView_update = (TextView) findViewById(R.id.mTextView_update);
        mTextView_2 = (TextView) findViewById(R.id.mTextView_2);
        mProgressBar2 = (SeekBar) findViewById(R.id.mProgressBar2);
        mLinearLayout_cnm = (LinearLayout) findViewById(R.id.mLinearLayout_cnm);
        mProgressBar_nv = (SeekBar) findViewById(R.id.mProgressBar_nv);
        mProgressBar2_nv = (SeekBar) findViewById(R.id.mProgressBar2_nv);
        mImageView_zc = (ImageView) findViewById(R.id.mImageView_zc);
        mImageView_left = (ImageView) findViewById(R.id.mImageView_left);
        mImageView_right = (ImageView) findViewById(R.id.mImageView_right);
        mTextView_hgcao = (TextView) findViewById(R.id.mTextView_hgcao);
        mTextView_xdcao = (TextView) findViewById(R.id.mTextView_xdcao);
        mImageView_left2 = (ImageView) findViewById(R.id.mImageView_left2);
        mImageView_right2 = (ImageView) findViewById(R.id.mImageView_right2);
        mTextView_zmcao = (TextView) findViewById(R.id.mTextView_zmcao);
        mTextView_lnw2 = (TextView) findViewById(R.id.mTextView_lnw2);
        mTextView3.setTypeface(font);
        mTextView2.setTypeface(font);
        mTextView_2.setTypeface(font);
        mTextView_1.setTypeface(font);
        mProgressBar.setEnabled(false);
        mProgressBar2.setEnabled(false);
        mProgressBar_nv.setEnabled(false);
        mProgressBar2_nv.setEnabled(false);
        mImageView_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0") && Integer.valueOf(mModelAlData.time.remain) < 99) {
                    if (mModelAlData.workmode.equals("2")) {
                        Helper.toast("正在加热，无法设置时间", getContext());
                        return;
                    }
                    mModelAlData.time.set = mModelAlData.time.remain = (Integer.valueOf(mModelAlData.time.remain) + 1) + "";
                    refshUI();
//                    sendDRF(mModelAlData);
                }
            }
        });
        mTextView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    if (mModelAlData.workmode.equals("2")) {
                        Helper.toast("正在加热，无法设置时间", getContext());
                        return;
                    }
                    List<String> src = new ArrayList<>();
                    for (int i = 99; i > 0; i--) {
                        src.add(i + "");
                    }
                    Helper.startActivity(getContext(), FrgList.class, TitleAct.class, "from", "FrgMySb", "type", 1, "title", "请选择时间", "data", src);
                }
            }
        });
        mTextView_2.setOnClickListener(new View.OnClickListener() {
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
        mImageView_left2.setOnClickListener(new View.OnClickListener() {
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
        mImageView_right2.setOnClickListener(new View.OnClickListener() {
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
        mImageView_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0") && Integer.valueOf(mModelAlData.time.remain) > 1) {
                    if (mModelAlData.workmode.equals("2")) {
                        Helper.toast("正在加热，无法设置时间", getContext());
                        return;
                    }
                    mModelAlData.time.set = mModelAlData.time.remain = (Integer.valueOf(mModelAlData.time.remain) - 1) + "";
                    refshUI();
//                    sendDRF(mModelAlData);
                }
            }
        });
        mTextView_jr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    if (mTextView3.getText().toString().equals("0")) {
                        Helper.toast("请设置加热时间", getContext());
                        return;
                    }
                    mModelAlData.workmode = mModelAlData.workmode.equals("2") ? "1" : "2";
                    mModelAlData.time.set = mTextView3.getText().toString();
                    sendDRF(mModelAlData);
                }
            }
        });
        mTextView_sj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    if (mModelAlData.workmode.equals("4")) {
                        mModelAlData.workmode = mModelAlData.workmode.equals("4") ? "1" : "4";
                        sendDRF(mModelAlData);
                    } else {
                        com.framewidget.F.yShoure(getContext(), "", "即将进入消毒模式,请将宠物移出猫舍！以免发生意外！", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                mModelAlData.workmode = mModelAlData.workmode.equals("4") ? "1" : "4";
                                sendDRF(mModelAlData);
                            }
                        });
                    }


                }
            }
        });
        mImageView_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    mModelAlData.workmode = "3";
                    sendDRF(mModelAlData);
                }
            }
        });
        mImageView_change2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    mModelAlData.workmode = "1";
                    sendDRF(mModelAlData);
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
        mTextView_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mModelAlData != null && !mModelAlData.workmode.equals("0")) {
                    mProgressDialog.show();
                    sendDRF(new BeanUpdate(item.url, mModelAlData.deviceName, mModelAlData.deviceID));
                }
            }
        });
        mProgressBar.setOnSeekBarChangeListener(this);
        mProgressBar2.setOnSeekBarChangeListener(this);
        mProgressBar_nv.setOnSeekBarChangeListener(this);
        mProgressBar2_nv.setOnSeekBarChangeListener(this);

        mTextView_lnw.setCompoundDrawablesWithIntrinsicBounds(0, mModelMgetUserInfo.data.sex == 2 ? R.drawable.open_red : R.drawable.open_blue, 0, 0);
        mLinearLayout_cnm.setBackgroundResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.red : R.drawable.blue);

        mImageView_change.setImageResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.change_red : R.drawable.change_blue);
        mImageView_left.setImageResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.left_red : R.drawable.left );
        mImageView_left2.setImageResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.left_red : R.drawable.left);
        mImageView_right.setImageResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.right_red : R.drawable.right);
        mImageView_right2.setImageResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.right_red : R.drawable.right);
        mImageView_change2.setImageResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.change_red : R.drawable.change_blue);
        if (mModelMgetUserInfo.data.sex == 2) {
            mProgressBar_nv.setVisibility(View.VISIBLE);
            mProgressBar2_nv.setVisibility(View.VISIBLE);
            mProgressBar.setVisibility(View.GONE);
            mProgressBar2.setVisibility(View.GONE);
        } else {
            mProgressBar_nv.setVisibility(View.GONE);
            mProgressBar2_nv.setVisibility(View.GONE);
            mProgressBar.setVisibility(View.VISIBLE);
            mProgressBar2.setVisibility(View.VISIBLE);
        }
    }

    public void refshUI() {
        mProgressBar.setEnabled(true);
        mProgressBar2.setEnabled(true);
        mProgressBar_nv.setEnabled(true);
        mProgressBar2_nv.setEnabled(true);
        mImageView_zc.setVisibility(View.GONE);
        mTextView1.setText("当前温度:" + mModelAlData.temperature.current + "℃");
        mTextView_1.setText("当前温度:" + mModelAlData.temperature.current + "℃");
        mTextView2.setText(mModelAlData.temperature.set + "℃");
        mTextView_2.setText(mModelAlData.temperature.set + "℃");
        mTextView3.setText(mModelAlData.time.remain);
        mProgressBar.setProgress(Integer.valueOf(mModelAlData.fan.speed));
        mProgressBar2.setProgress(Integer.valueOf(mModelAlData.fan.speed));
        mProgressBar_nv.setProgress(Integer.valueOf(mModelAlData.fan.speed));
        mProgressBar2_nv.setProgress(Integer.valueOf(mModelAlData.fan.speed));
        if (item.version.equals(mModelAlData.version)) {
            mTextView_update.setVisibility(View.GONE);
        } else {
            mTextView_update.setVisibility(View.VISIBLE);
        }
        mTextView_version.setText(mModelAlData.version);
        if (mModelAlData.workmode.equals("0")) {//关机
            Helper.toast("该设备已关机", getContext());
            mImageView_zc.setVisibility(View.VISIBLE);
        } else if (mModelAlData.workmode.equals("1")) {
            mTextView_jr.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.heat, 0, 0);
            mTextView_hgcao.setText("OFF");
            mTextView_hgcao.setBackgroundResource(R.drawable.shape_off);
            mTextView_sj.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.sterilize, 0, 0);
            mTextView_xdcao.setText("OFF");
            mTextView_xdcao.setBackgroundResource(R.drawable.shape_off);
            mLinearLayout1.setVisibility(View.VISIBLE);
            mRelativeLayout.setVisibility(View.GONE);
        } else if (mModelAlData.workmode.equals("2")) {
            mTextView_jr.setCompoundDrawablesWithIntrinsicBounds(0, mModelMgetUserInfo.data.sex == 2 ? R.drawable.heat_select_red : R.drawable.heat_select_blue, 0, 0);
            mTextView_hgcao.setText("ON");
            mTextView_hgcao.setBackgroundResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.shape_red : R.drawable.shape_blue);
            mTextView_sj.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.sterilize, 0, 0);
            mTextView_xdcao.setText("OFF");
            mTextView_xdcao.setBackgroundResource(R.drawable.shape_off);
            mLinearLayout1.setVisibility(View.VISIBLE);
            mRelativeLayout.setVisibility(View.GONE);
        } else if (mModelAlData.workmode.equals("3")) {//冷暖窝
            mTextView_jr.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.heat, 0, 0);
            mTextView_hgcao.setText("OFF");
            mTextView_hgcao.setBackgroundResource(R.drawable.shape_off);
            mTextView_sj.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.sterilize, 0, 0);
            mTextView_xdcao.setText("OFF");
            mTextView_xdcao.setBackgroundResource(R.drawable.shape_off);
            mLinearLayout1.setVisibility(View.GONE);
            mRelativeLayout.setVisibility(View.VISIBLE);
            if (mModelAlData.light.equals("0")) {
                mRelativeLayout.setBackgroundColor(Color.parseColor("#333333"));
                mTextView_1.setTextColor(Color.parseColor("#ffffff"));
                mTextView_2.setTextColor(Color.parseColor("#ffffff"));
                mTextView_lnw.setTextColor(Color.parseColor("#ffffff"));
                mTextView_zmcao.setText("OFF");
                mTextView_zmcao.setBackgroundResource(R.drawable.shape_white);
                mTextView_zmcao.setTextColor(mModelMgetUserInfo.data.sex == 2 ? Color.parseColor("#FC7683"):Color.parseColor("#5995DF"));
                mLinearLayout_gg.setBackgroundResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.close_red : R.drawable.close_blue);
//                mTextView_lnw.setCompoundDrawablesWithIntrinsicBounds(0, mModelMgetUserInfo.data.sex == 2 ? R.drawable.open_red : R.drawable.open_blue, 0, 0);
            } else {
                mRelativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                mTextView_1.setTextColor(Color.parseColor("#777777"));
                mTextView_2.setTextColor(Color.parseColor("#777777"));
                mTextView_lnw.setTextColor(Color.parseColor("#777777"));
                mTextView_zmcao.setText("ON");
                mTextView_zmcao.setBackgroundResource(R.drawable.shape_off);
                mTextView_zmcao.setTextColor(Color.parseColor("#ffffff"));
                mLinearLayout_gg.setBackgroundResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.red : R.drawable.blue);
//                mTextView_lnw.setCompoundDrawablesWithIntrinsicBounds(0, mModelMgetUserInfo.data.sex == 2 ? R.drawable.open_red : R.drawable.open_blue, 0, 0);
            }
        } else if (mModelAlData.workmode.equals("4")) {
            mTextView_jr.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.heat, 0, 0);
            mTextView_hgcao.setText("OFF");
            mTextView_hgcao.setBackgroundResource(R.drawable.shape_off);
            mTextView_sj.setCompoundDrawablesWithIntrinsicBounds(0, mModelMgetUserInfo.data.sex == 2 ? R.drawable.sterilize_select_red : R.drawable.sterilize_select_blue, 0, 0);
            mTextView_xdcao.setText("ON");
            mTextView_xdcao.setBackgroundResource(mModelMgetUserInfo.data.sex == 2 ? R.drawable.shape_red : R.drawable.shape_blue);
            mLinearLayout1.setVisibility(View.VISIBLE);
            mRelativeLayout.setVisibility(View.GONE);
        }

    }

    public void sendDRF(Object obj) {
        sendD(obj, "/" + mModelMgetUserInfo.data.productKey + "/" + mModelMgetUserInfo.data.id + "/user/update");
        mModelAlData = null;
        mImageView_zc.setVisibility(View.VISIBLE);
        mProgressBar.setEnabled(false);
        mProgressBar2.setEnabled(false);
        mProgressBar_nv.setEnabled(false);
        mProgressBar2_nv.setEnabled(false);
//        mHandler.removeCallbacks(mRunnable);
//        mHandler.postDelayed(mRunnable, 5000);

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
        sendD(new BeanGet(item.devicename, item.userid, "get"), "/" + mModelMgetUserInfo.data.productKey + "/" + mModelMgetUserInfo.data.id + "/user/update");
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
}