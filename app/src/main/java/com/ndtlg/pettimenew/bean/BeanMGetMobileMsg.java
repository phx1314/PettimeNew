package com.ndtlg.pettimenew.bean;

import android.os.Build;

import static com.ndtlg.pettimenew.F.getMd5;

/**
 * Created by DELL on 2019/3/25.
 */

public class BeanMGetMobileMsg {
    String phone;
    String type;
    String deviceid = Build.SERIAL;
    String device = "andriod";
    String md5 = "";

    public BeanMGetMobileMsg(String phone, String type) {
        this.phone = phone;
        this.type = type;
        md5 = getMd5(this);
    }
}
