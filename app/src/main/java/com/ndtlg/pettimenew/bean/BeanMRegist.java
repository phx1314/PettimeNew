package com.ndtlg.pettimenew.bean;

import android.os.Build;

import static com.ndtlg.pettimenew.F.getMd5;

/**
 * Created by DELL on 2019/3/25.
 */

public class BeanMRegist {
    String phone;
    String code;
    String password;
    String deviceid = Build.SERIAL; String device = "andriod";
    String md5 = "";

    public BeanMRegist(String phone, String code,String password) {
        this.phone = phone;
        this.code = code;
        this.password = password;
        md5 = getMd5(this);
    }
}
