package com.ndtlg.pettimenew.model;

import java.io.Serializable;

/**
 * Created by DELL on 2019/3/25.
 */

public class ModelLogin implements Serializable{


    /**
     * data : {"id":"c927bc2ea37e4a26a2034db71cff693e","verify":"8b20c9138b8d49a7b29873f3bf4b28e4"}
     * errorCode : 0
     * errorMsg :
     * methodno : MLogin
     */

    public DataBean data;
    public int errorCode;
    public String errorMsg;
    public String methodno;

    public static class DataBean {
        /**
         * id : c927bc2ea37e4a26a2034db71cff693e
         * verify : 8b20c9138b8d49a7b29873f3bf4b28e4
         */

        public String id;
        public String verify;
    }



}
