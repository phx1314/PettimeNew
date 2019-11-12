package com.ndtlg.pettimenew.model;

import java.io.Serializable;

/**
 * Created by DELL on 2019/3/25.
 */

public class ModelHeader implements Serializable{


    /**
     * data : {"code":0,"msg":"2a55a48494eb4e98b46a8794a24d28aa"}
     * errorCode : 0
     * errorMsg :
     * methodno : MUploadFile
     */

    public DataBean data;
    public int errorCode;
    public String errorMsg;
    public String methodno;

    public static class DataBean {
        /**
         * code : 0
         * msg : 2a55a48494eb4e98b46a8794a24d28aa
         */

        public int code;
        public String msg;
    }
}
