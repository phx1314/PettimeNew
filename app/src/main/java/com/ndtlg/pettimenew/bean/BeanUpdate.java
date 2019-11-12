package com.ndtlg.pettimenew.bean;

/**
 * Created by DELL on 2019/3/25.
 */

public class BeanUpdate {

    /**
     * action : set
     * workmode : 6
     * url : http://192.168.1.105/bin/hello.bin
     */

    public String action = "set";
    public String workmode = "6";
    public String url;
    public String deviceName;
    public String deviceID;

    public BeanUpdate(String url,String deviceName, String deviceID) {
        this.url = url;
        this.deviceName = deviceName;
        this.deviceID = deviceID;
    }
}
