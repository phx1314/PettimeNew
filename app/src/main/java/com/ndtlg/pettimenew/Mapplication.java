package com.ndtlg.pettimenew;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.mdx.framework.Frame;
import com.ndtlg.pettimenew.util.RongExceptionHandler;
import com.umeng.socialize.PlatformConfig;

/**
 * Created by bob on 2015/1/30.
 */
public class Mapplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Frame.init(getApplicationContext());
        F.init();
        Thread.setDefaultUncaughtExceptionHandler(new RongExceptionHandler(
                this));
    }

//    {
//
//        com.framewidget.F.APPNAME = "";
//        com.framewidget.F.WEIXINID = "wx69d1fa92fe46fbe5";
//        com.framewidget.F.WEIXINSEC = "c9e24b2f75386c391b475aee73a1fbb3";
//        com.framewidget.F.QQID = "1108315216";
//        com.framewidget.F.QQSEC = "WXrhuuGLt8BziVfX";
//        // 微信 wx12342956d1cab4f9,a5ae111de7d9ea137e88a5e02c07c94d
//        PlatformConfig.setWeixin(com.framewidget.F.WEIXINID,
//                com.framewidget.F.WEIXINSEC);
//        PlatformConfig.setQQZone(com.framewidget.F.QQID,
//                com.framewidget.F.QQSEC);
//    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
