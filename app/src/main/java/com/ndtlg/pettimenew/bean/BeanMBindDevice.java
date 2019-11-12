package com.ndtlg.pettimenew.bean;

import android.os.Build;

import com.ndtlg.pettimenew.F;

import static com.ndtlg.pettimenew.F.getMd5;
import static com.ndtlg.pettimenew.F.uid;

/**
 * Created by DELL on 2019/3/25.
 */

public class BeanMBindDevice {
    String iotid;
    String deviceNick;
    String verify = F.verify;
    String device = "andriod";
    String deviceid = Build.SERIAL;
    String userid = uid;
    String md5;


    public BeanMBindDevice(String iotid,String deviceNick ) {
        this.iotid = iotid;
        this.deviceNick = deviceNick;
        md5 = getMd5(this);
    }
}
