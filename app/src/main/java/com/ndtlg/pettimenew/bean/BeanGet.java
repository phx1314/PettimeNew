package com.ndtlg.pettimenew.bean;

/**
 * Created by DELL on 2019/3/25.
 */

public class BeanGet {

    /**
     * deviceName : MH00016C06A629
     * deviceID : c927bc2ea37e4a26a2034db71cff693e
     * action : get
     */

    public String deviceName;
    public String deviceID;
    public String action;

    public BeanGet(String deviceName, String deviceID, String action) {
        this.deviceName = deviceName;
        this.deviceID = deviceID;
        this.action = action;
    }
}
