package com.ndtlg.pettimenew.model;

import java.io.Serializable;

/**
 * Created by DELL on 2018/1/9.
 */

public class ModelC implements Serializable {
    public  String  ssid;
    public  String  password;

    public ModelC(String ssid, String password) {
        this.ssid = ssid;
        this.password = password;
    }
}
