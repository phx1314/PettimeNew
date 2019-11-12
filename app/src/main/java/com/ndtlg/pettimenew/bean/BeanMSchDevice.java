package com.ndtlg.pettimenew.bean;

import android.os.Build;

import com.ndtlg.pettimenew.F;

import static com.ndtlg.pettimenew.F.getMd5;
import static com.ndtlg.pettimenew.F.uid;

/**
 * Created by DELL on 2019/3/25.
 */

public class BeanMSchDevice {
    public  int pageSize = 20;
    public  int pageNumber = 1;
    public  String userid = uid;
    public String verify = F.verify;
    public  String device = "andriod";
    public  String deviceid = Build.SERIAL;
    public String md5;


    public BeanMSchDevice() {
        md5 = getMd5(this);
    }
}
