package com.ndtlg.pettimenew.bean;

import android.os.Build;

import com.ndtlg.pettimenew.F;

import static com.ndtlg.pettimenew.F.getMd5;
import static com.ndtlg.pettimenew.F.uid;

/**
 * Created by DELL on 2019/3/25.
 */

public class BeanMUnBindWeixinQQ {
    String wxqqid;
    String type;
    String userid = uid;
    String verify = F.verify;
    String deviceid = Build.SERIAL; String device = "andriod";
    String md5;


    public BeanMUnBindWeixinQQ(String wxqqid, String type) {
        this.wxqqid = wxqqid;
        this.type = type;
        md5 = getMd5(this);
    }
}
