package com.ndtlg.pettimenew.model;

import java.io.Serializable;

/**
 * Created by DELL on 2019/3/25.
 */

public class ModelMgetUserInfo implements Serializable{


    /**
     * data : {"deviceSecret":"3rib3rZaJjHmjTZwI6fFSzJJx17vSQzQ","header":"","id":"5ebe76ffd28d440cb669dc43286aa0a9","lastlogin":"2019-03-25 15:44:57","mobile":"13915079457","nickname":"匿名","password":"e10adc3949ba59abbe56e057f20f883e","productKey":"a1rKG9FRoKY","qqid":"0","regtime":"2019-03-22 09:38:18","remark":"","sex":0,"state":1,"wxid":"0"}
     * errorCode : 0
     * errorMsg :
     * methodno : MgetUserInfo
     */

    public DataBean data;
    public int errorCode;
    public String errorMsg;
    public String methodno;

    public static class DataBean {
        /**
         * deviceSecret : 3rib3rZaJjHmjTZwI6fFSzJJx17vSQzQ
         * header :
         * id : 5ebe76ffd28d440cb669dc43286aa0a9
         * lastlogin : 2019-03-25 15:44:57
         * mobile : 13915079457
         * nickname : 匿名
         * password : e10adc3949ba59abbe56e057f20f883e
         * productKey : a1rKG9FRoKY
         * qqid : 0
         * regtime : 2019-03-22 09:38:18
         * remark :
         * sex : 0
         * state : 1
         * wxid : 0
         */

        public String deviceSecret;
        public String header;
        public String id;
        public String lastlogin;
        public String mobile;
        public String nickname;
        public String password;
        public String productKey;
        public String qqid;
        public String regtime;
        public String remark;
        public int sex;
        public int state;
        public String wxid;
    }
}
