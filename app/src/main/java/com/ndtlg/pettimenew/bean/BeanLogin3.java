package com.ndtlg.pettimenew.bean;

import android.os.Build;

import static com.ndtlg.pettimenew.F.getMd5;

/**
 * Created by DELL on 2019/3/25.
 */

public class BeanLogin3 {
    String nickName;
    String header;
    int sex;
    String wxqqid;
    String type;
    String device = "andriod";
    String deviceid = Build.SERIAL;
    String md5;


    public BeanLogin3(String wxqqid, String type, String nickName, String header, int sex) {
        this.nickName = nickName;
        this.header = header;
        this.sex = sex;
        this.wxqqid = wxqqid;
        this.type = type;
        md5 = getMd5(this);
    }
}
