package com.ndtlg.pettimenew.bean;

/**
 * Created by DELL on 2019/3/25.
 */

public class BeanSocket {
    String action="POSTPASSWORD";
    String SSID;
    String PASSWORD;
    String deviceID;

    public BeanSocket(String ssid, String password, String deviceID) {
        this.SSID = ssid;
        this.PASSWORD = password;
        this.deviceID = deviceID;
    }
}
