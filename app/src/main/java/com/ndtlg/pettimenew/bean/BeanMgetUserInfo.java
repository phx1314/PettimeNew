package com.ndtlg.pettimenew.bean;

import android.os.Build;

import com.ndtlg.pettimenew.F;

import static com.ndtlg.pettimenew.F.getMd5;
import static com.ndtlg.pettimenew.F.uid;

/**
 * Created by DELL on 2019/3/25.
 */

public class BeanMgetUserInfo {
    String userid = uid;
    String verify = F.verify;
    String deviceid = Build.SERIAL;
    String device = "andriod";
    String md5 = "";

    public BeanMgetUserInfo() {
        md5 = getMd5(this);
    }
}
