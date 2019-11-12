package com.ndtlg.pettimenew.model;

import java.io.Serializable;

/**
 * Created by DELL on 2018/1/9.
 */

public class ModelMGetDeviceStatus implements Serializable {


    /**
     * errorCode : 0
     * errorMsg :
     * methodno : MGetDeviceStatus
     * data : {"code":"1"}
     */

    public String errorCode;
    public String errorMsg;
    public String methodno;
    public DataBean data;

    public static class DataBean {
        /**
         * code : 1
         */

        public String code;
    }
}
