package com.ndtlg.pettimenew.model;

import java.io.Serializable;

/**
 * Created by DELL on 2018/1/9.
 */

public class ModelAlData implements Serializable {


    /**
     * fan : {"speed":"0"}
     * light : 0
     * temperature : {"current":"0","set":"-28"}
     * action : get
     * workmode : 1
     * time : {"set":"0"}
     * version : 1.0.3
     * deviceName : 8e89216214d6444d92b307a81cdd8d0c
     * deviceID : 0d046bd90686fc75b8535d269abce03c
     */

    public FanBean fan;
    public String light;
    public TemperatureBean temperature;
    public String action;
    public String workmode;
    public TimeBean time;
    public String version;
    public String deviceName;
    public String deviceID;

    public static class FanBean {
        /**
         * speed : 0
         */

        public String speed;
    }

    public static class TemperatureBean {
        /**
         * current : 0
         * set : -28
         */

        public String current;
        public String set;
    }

    public static class TimeBean {
        /**
         * set : 0
         */

        public String set;
    }
}
