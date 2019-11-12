package com.ndtlg.pettimenew.model;

import java.io.Serializable;

/**
 * Created by DELL on 2019/3/25.
 */

public class ModelLogin3 implements Serializable{


    /**
     * data : {"bindMobile":false,"id":"4b73050afce14afe8d47b8011e436bb9","verify":"2adb6ac3b5514518a620d9773c22e673"}
     * errorCode : 0
     * errorMsg :
     * methodno : MLoginWeixinQQ
     */

    public DataBean data;
    public int errorCode;
    public String errorMsg;
    public String methodno;

    public static class DataBean {
        /**
         * bindMobile : false
         * id : 4b73050afce14afe8d47b8011e436bb9
         * verify : 2adb6ac3b5514518a620d9773c22e673
         */

        public boolean bindMobile;
        public String id;
        public String verify;
    }
}
