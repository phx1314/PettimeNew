package com.ndtlg.pettimenew.bean;

import android.os.Build;

import com.ndtlg.pettimenew.F;

import static com.ndtlg.pettimenew.F.getMd5;
import static com.ndtlg.pettimenew.F.uid;

/**
 * Created by DELL on 2019/3/25.
 */

public class BeanMBindPhone2 {
    String phone;
    String code;
    String password;
    String verify = F.verify;
    String userid = uid;
    String deviceid = Build.SERIAL;
    String device = "andriod";
    String md5 = "";


    public BeanMBindPhone2(String phone, String code, String password ) {
        this.phone = phone;
        this.code = code;
        this.password = password;
        md5 = getMd5(this);
    }
}
