//
//  FrgAddDevice
//
//  Created by DELL on 2019-03-27 10:12:41
//  Copyright (c) DELL All rights reserved.


/**

 */

package com.ndtlg.pettimenew.frg;

import android.Manifest;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.mdx.framework.Frame;
import com.mdx.framework.utility.Helper;
import com.mdx.framework.widget.ActionBar;
import com.ndtlg.pettimenew.F;
import com.ndtlg.pettimenew.R;
import com.ndtlg.pettimenew.bean.BeanMBindDevice;
import com.ndtlg.pettimenew.bean.BeanMGetDeviceStatus;
import com.ndtlg.pettimenew.bean.BeanSocket;
import com.ndtlg.pettimenew.model.ModelMGetDeviceStatus;
import com.ndtlg.pettimenew.model.ModelSocket;
import com.ndtlg.pettimenew.view.Callback;
import com.ndtlg.pettimenew.view.SocThread;

import static com.ndtlg.pettimenew.F.MBindDevice;
import static com.ndtlg.pettimenew.F.MGetDeviceStatus;
import static com.ndtlg.pettimenew.F.json2Model;
import static com.ndtlg.pettimenew.F.uid;


public class FrgAddDevice extends BaseFrg {

    public TextView mTextView_name;
    public EditText mEditText;
    public TextView mTextView_sure;
    public String ssid;
    public ProgressDialog mProgressDialog;
    public SocThread mSocThread;
    public boolean hasdata = false;
    public boolean getSocketData = false;
    public Callback mCallback;
    public Handler mHandler = new Handler();
    public Runnable mRunnable;
    public Handler mHandler1 = new Handler();
    public Runnable mRunnable1;
    public ModelSocket mModelSocket;
    public ScrollView mScrollView;

    @Override
    protected void create(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            ActivityCompat.requestPermissions(getActivity(),
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},
                    1);
            if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                Helper.toast("请打开定位权限", getContext());
                finish();
            }
        }
        setContentView(R.layout.frg_add_device);
        initView();
        loaddata();


    }


    @Override
    public void onSuccess(String methodName, String content) {
        if (methodName.equals(MBindDevice)) {
            Helper.toast("添加成功", getContext());
            finish();
            Frame.HANDLES.sentAll("FrgMain", 0, null);
            Frame.HANDLES.sentAll("FrgWd", 2, null);
        } else if (methodName.equals(MGetDeviceStatus)) {
            try {
                ModelMGetDeviceStatus mModelMGetDeviceStatus = (ModelMGetDeviceStatus) json2Model(content, ModelMGetDeviceStatus.class);
                if (mModelMGetDeviceStatus.data.code.equals("1") && !hasdata) {
                    hasdata = true;
                    mProgressDialog.dismiss();
                    final EditText et = new EditText(getActivity());
                    new AlertDialog.Builder(getActivity()).setTitle("请输入设备昵称")
                            .setView(et)
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    loadUrl(MBindDevice, new BeanMBindDevice(mModelSocket.IOTID, et.getText().toString()));
                                }
                            }).setCancelable(false).setNegativeButton("取消", null).show();
                } else {
                    Helper.toast("设备未上线", getContext());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private void initView() {
        findVMethod();
    }

    private void findVMethod() {
        mTextView_name = (TextView) findViewById(R.id.mTextView_name);
        mEditText = (EditText) findViewById(R.id.mEditText);
        mTextView_sure = (TextView) findViewById(R.id.mTextView_sure);
        mScrollView = (ScrollView) findViewById(R.id.mScrollView);
        mTextView_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(mEditText.getText().toString())) {
                    Helper.toast("请输入wifi密码", getContext());
                    return;
                }
                mHandler1.postDelayed(mRunnable1, 1000);
                mScrollView.setVisibility(View.VISIBLE);

            }
        });
        mCallback = new Callback() {
            @Override
            public void goBack(String json) {
                try {
                    if (getSocketData) return;
                    if (!TextUtils.isEmpty(json.trim()) && json.contains("{")) {
                        mSocThread.close();
                        Toast.makeText(getContext(), json, 0).show();
                        getSocketData = true;
                        mProgressDialog.setMessage("等待设备联网...");
                        mModelSocket = (ModelSocket) F.json2Model(json, ModelSocket.class);
                        mHandler.postDelayed(mRunnable, 200);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public void loaddata() {
        WifiManager wifimanager = (WifiManager) getActivity().getSystemService(Context.WIFI_SERVICE);
        ssid = wifimanager.getConnectionInfo().getSSID().replace("\"", "");
        mTextView_name.setText(ssid);

        mProgressDialog = new ProgressDialog(getContext());
        mProgressDialog.setMessage("设备连接中...");
        mProgressDialog.setCancelable(false);

        mRunnable = new Runnable() {
            @Override
            public void run() {
                if (!hasdata) {
                    loadUrlNs(MGetDeviceStatus, new BeanMGetDeviceStatus(mModelSocket.IOTID));
                    mHandler.postDelayed(mRunnable, 6000);
                }
            }
        };
        mRunnable1 = new Runnable() {
            @Override
            public void run() {
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        WifiManager wifimanager = (WifiManager) getActivity().getSystemService(Context.WIFI_SERVICE);
                        ssid = wifimanager.getConnectionInfo().getSSID().replace("\"", "");
                        if (ssid.startsWith("pettime_") && F.isWifiConnect(getContext()) && F.isAppOnForeground(getContext())) {
                            if (mSocThread != null) {
                                mSocThread.close();
                                mSocThread = null;
                            }
                            if (!mProgressDialog.isShowing())
                                mProgressDialog.show();
                            mSocThread = new SocThread(getContext(), mCallback, new BeanSocket(mTextView_name.getText().toString(), mEditText.getText().toString(), uid));
                            mSocThread.start();
                        } else {
                            mHandler1.postDelayed(mRunnable1, 1000);
                            Log.i("数据wifi", ssid);
                        }
                    }
                });
            }
        };

    }


    @Override
    public void setActionBar(ActionBar actionBar, Context context) {
        super.setActionBar(actionBar, context);
        mHeadlayout.setTitle("设备连接");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mSocThread != null) {
            mSocThread.close();
            mSocThread = null;
        }
        try {
            mHandler.removeCallbacks(mRunnable);
            mHandler1.removeCallbacks(mRunnable1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}