package com.ndtlg.pettimenew.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DELL on 2019/3/25.
 */

public class ModelList implements Serializable{


    /**
     * data : {"curPage":"1","deviceList":[{"id":"6384f029b0b34e77ab118f112d680514","userid":"c927bc2ea37e4a26a2034db71cff693e","requestid":"5CF7D0F0-14A8-4112-A2E6-8333BF60EAFA","iotid":"VDfuPgVHYwp9rcxWHCrP000000","productkey":"a1EXxuCxH1w","devicesecret":"iLR3IB76YKg0gSVmYHspalyQJZSO7QHP","productname":"Petcare_room","devicenick":"123","devicename":"MH5CCF7FFE8F63","ip":"","utccreate":"2019-03-25T06:38:41.000Z","gmtcreate":"2019-03-25 14:38:41","utcactive":"","gmtactive":"","utconline":"","gmtonline":"","bindtime":"2019-03-25 16:23:17","devicetype":"Petcare_room","version":"1.0.0","state":"UNACTIVE","type":1},{"id":"4568f970fa6f46d4b5cf31d1f5253a8a","userid":"c927bc2ea37e4a26a2034db71cff693e","requestid":"1FD09B1E-136E-4D56-A493-0A9712A8F530","iotid":"70S9x0bdeR9FkD0nNyNO000000","productkey":"a1EXxuCxH1w","devicesecret":"40u9UcEnZ8goIutGXwzv0tPL0OcscKFq","productname":"Petcare_room","devicenick":"qwwe","devicename":"MH00016C06A629","ip":"58.216.203.90","utccreate":"2019-03-09T02:27:20.000Z","gmtcreate":"2019-03-09 10:27:20","utcactive":"2019-03-09T02:32:22.403Z","gmtactive":"2019-03-09 10:32:22","utconline":"2019-03-09T07:18:01.216Z","gmtonline":"2019-03-09 15:18:01","bindtime":"2019-03-25 09:31:37","devicetype":"Petcare_room","version":"1.0.0","state":"ONLINE","type":1}],"totalCount":2}
     * errorCode : 0
     * errorMsg :
     * methodno : MSchDevice
     */

    public DataBean data;
    public int errorCode;
    public String errorMsg;
    public String methodno;

    public static class DataBean implements  Serializable{
        /**
         * curPage : 1
         * deviceList : [{"id":"6384f029b0b34e77ab118f112d680514","userid":"c927bc2ea37e4a26a2034db71cff693e","requestid":"5CF7D0F0-14A8-4112-A2E6-8333BF60EAFA","iotid":"VDfuPgVHYwp9rcxWHCrP000000","productkey":"a1EXxuCxH1w","devicesecret":"iLR3IB76YKg0gSVmYHspalyQJZSO7QHP","productname":"Petcare_room","devicenick":"123","devicename":"MH5CCF7FFE8F63","ip":"","utccreate":"2019-03-25T06:38:41.000Z","gmtcreate":"2019-03-25 14:38:41","utcactive":"","gmtactive":"","utconline":"","gmtonline":"","bindtime":"2019-03-25 16:23:17","devicetype":"Petcare_room","version":"1.0.0","state":"UNACTIVE","type":1},{"id":"4568f970fa6f46d4b5cf31d1f5253a8a","userid":"c927bc2ea37e4a26a2034db71cff693e","requestid":"1FD09B1E-136E-4D56-A493-0A9712A8F530","iotid":"70S9x0bdeR9FkD0nNyNO000000","productkey":"a1EXxuCxH1w","devicesecret":"40u9UcEnZ8goIutGXwzv0tPL0OcscKFq","productname":"Petcare_room","devicenick":"qwwe","devicename":"MH00016C06A629","ip":"58.216.203.90","utccreate":"2019-03-09T02:27:20.000Z","gmtcreate":"2019-03-09 10:27:20","utcactive":"2019-03-09T02:32:22.403Z","gmtactive":"2019-03-09 10:32:22","utconline":"2019-03-09T07:18:01.216Z","gmtonline":"2019-03-09 15:18:01","bindtime":"2019-03-25 09:31:37","devicetype":"Petcare_room","version":"1.0.0","state":"ONLINE","type":1}]
         * totalCount : 2
         */

        public String curPage;
        public int totalCount;
        public List<DeviceListBean> deviceList;

        public static class DeviceListBean implements  Serializable{
            /**
             * id : 6384f029b0b34e77ab118f112d680514
             * userid : c927bc2ea37e4a26a2034db71cff693e
             * requestid : 5CF7D0F0-14A8-4112-A2E6-8333BF60EAFA
             * iotid : VDfuPgVHYwp9rcxWHCrP000000
             * productkey : a1EXxuCxH1w
             * devicesecret : iLR3IB76YKg0gSVmYHspalyQJZSO7QHP
             * productname : Petcare_room
             * devicenick : 123
             * devicename : MH5CCF7FFE8F63
             * ip :
             * utccreate : 2019-03-25T06:38:41.000Z
             * gmtcreate : 2019-03-25 14:38:41
             * utcactive :
             * gmtactive :
             * utconline :
             * gmtonline :
             * bindtime : 2019-03-25 16:23:17
             * devicetype : Petcare_room
             * version : 1.0.0
             * state : UNACTIVE
             * type : 1
             */

            public String id;
            public String userid;
            public String requestid;
            public String iotid;
            public String productkey;
            public String devicesecret;
            public String productname;
            public String devicenick;
            public String devicename;
            public String ip;
            public String utccreate;
            public String gmtcreate;
            public String utcactive;
            public String gmtactive;
            public String utconline;
            public String gmtonline;
            public String bindtime;
            public String devicetype;
            public String version;
            public String url;
            public String state;
            public int type;
        }
    }
}
