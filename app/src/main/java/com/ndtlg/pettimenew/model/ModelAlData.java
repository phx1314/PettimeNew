package com.ndtlg.pettimenew.model;

import java.io.Serializable;

/**
 * Created by DELL on 2018/1/9.
 */

public class ModelAlData implements Serializable {

    /**
     * fan : {"speed":"20"}
     * light : 1
     * temperature : {"current":"19","set":"40"}
     * action : get
     * workmode : 1
     * time : {"set":"99","remain":"99"}
     * version : 1.1
     * deviceName : c927bc2ea37e4a26a2034db71cff693e
     * deviceID : MH00016C06A629
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
         * speed : 20
         */

        public String speed;
    }

    public static class TemperatureBean {
        /**
         * current : 19
         * set : 40
         */

        public String current;
        public String set;
    }

    public static class TimeBean {
        /**
         * set : 99
         * remain : 99
         */

        public String set;
        public String remain;
    }
}
