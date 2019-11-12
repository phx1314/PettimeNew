package com.ndtlg.pettimenew;


import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ab.util.AbMd5;
import com.google.gson.Gson;
import com.mdx.framework.Frame;
import com.mdx.framework.activity.IndexAct;
import com.mdx.framework.utility.Helper;
import com.ndtlg.pettimenew.frg.FrgLogin;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class F {
    public static String uid;
    public static String verify;
    public static String wxqqid;
    public static String MGetMobileMsg = "/mobile?methodno=MGetMobileMsg";
    public static String MCheckMobileMsg = "/mobile?methodno=MCheckMobileMsg";
    public static String MRegist = "/mobile?methodno=MRegist";
    public static String MLogin = "/mobile?methodno=MLogin";
    public static String MgetUserInfo = "/mobile?methodno=MgetUserInfo";
    public static String MLoginWeixinQQ = "/mobile?methodno=MLoginWeixinQQ";
    public static String MBindWeixinQQ = "/mobile?methodno=MBindWeixinQQ";
    public static String MUnBindWeixinQQ = "/mobile?methodno=MUnBindWeixinQQ";
    public static String MBindPhone = "/mobile?methodno=MBindPhone";
    public static String MBindMobile = "/mobile?methodno=MBindMobile";
    public static String MUpdateUser = "/mobile?methodno=MUpdateUser";
    public static String MChangePassword = "/mobile?methodno=MChangePassword";
    public static String MForgetPassword = "/mobile?methodno=MForgetPassword";
    public static String MUploadFile = "/mobile?methodno=MUploadFile";
    public static String MSchDevice = "/mobile?methodno=MSchDevice";
    public static String MBindDevice = "/mobile?methodno=MBindDevice";
    public static String MUnBindDevice = "/mobile?methodno=MUnBindDevice";
    public static String MGetDeviceStatus = "/mobile?methodno=MGetDeviceStatus";

    public static void init() {
        uid = getJson("uid");
        verify = getJson("verify");
        wxqqid = getJson("wxqqid");
    }

    public static void saveJson(String key, String json) {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(Frame.CONTEXT);
        sp.edit().putString(key, json).commit();

    }

    public static String getJson(String key) {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(Frame.CONTEXT);
        return sp.getString(key, "");
    }

    public static Object json2Model(String json, Class<?> mclass) {
        return new Gson().fromJson(json, mclass);

    }
    /**
     * 程序是否在前台运行
     *
     * @return
     */
    public static boolean isAppOnForeground(Context context) {
        ActivityManager activityManager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> appProcesses = activityManager
                .getRunningAppProcesses();
        if (appProcesses == null)
            return false;
        for (ActivityManager.RunningAppProcessInfo appProcess : appProcesses) {
            // The name of the process that this object is associated with.
            if (appProcess.processName.equals(packageName)
                    && appProcess.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND) {
                return true;
            }
        }
        return false;
    }
    /**
     * 用来遍历对象属性和属性值
     */
    public static String getMd5(Object tb) {
        HashMap map = new HashMap();
        List<String> list = new ArrayList<>();
        int a = 0;
        String c = "";
        int total = 0;
        try {
            Field[] fields = tb.getClass().getDeclaredFields();
            System.out.println(fields.length);
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.get(tb) instanceof File || field.getName().equals("md5")) {
                    continue;
                }
                a++;
                if (field.get(tb) != null && !TextUtils.isEmpty(field.get(tb).toString())) {
                    c += field.get(tb).toString();
                }
            }
            for (int i = 0; i < c.length(); i++) {
                total += c.charAt(i);
            }
            Log.i("MD5", a + "" + c.length() + total + "mango");
            return AbMd5.md5(a + "" + c.length() + total + "mango");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String changePhone(String code) {
        if (!TextUtils.isEmpty(code) && code.length() == 11) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < code.length(); i++) {
                char c = code.charAt(i);
                if (i >= 3 && i < code.length() - 4) {
                    sb.append('*');
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
        return code;
    }

    public static String secToTime(int time) {
        String timeStr = null;
        int minute = 0;
        int second = 0;
        minute = time / 60;
        second = time % 60;
        if (minute > 0) {
            timeStr = minute + "分" + second + "秒";
        } else {
            timeStr = second + "秒";
        }

        return timeStr;
    }

    public static void changeFonts(ViewGroup root, Activity act) {

        Typeface tf = Typeface.createFromAsset(act.getAssets(),
                "fonts/xxx.ttf");

        for (int i = 0; i < root.getChildCount(); i++) {
            View v = root.getChildAt(i);
            if (v instanceof TextView) {
                ((TextView) v).setTypeface(tf);
            } else if (v instanceof Button) {
                ((Button) v).setTypeface(tf);
            } else if (v instanceof EditText) {
                ((EditText) v).setTypeface(tf);
            } else if (v instanceof ViewGroup) {
                changeFonts((ViewGroup) v, act);
            }
        }

    }

    /**
     * 用来遍历对象属性和属性值
     */
    public static String readClassAttr(Object tb) {
        HashMap map = new HashMap();
        List<String> list = new ArrayList<>();
        String str = "";
        try {
            Field[] fields = tb.getClass().getDeclaredFields();
            System.out.println(fields.length);
            for (Field field : fields) {
                field.setAccessible(true);
                if (!field.getName().equals("sign")) {
                    map.put(field.getName(), TextUtils.isEmpty(field.get(tb).toString()) ? "" : field.get(tb).toString());
                    if (!field.getName().equals("timestamp"))
                        list.add(field.getName());
                }
            }
            if (tb.getClass().getSuperclass() != null && (tb.getClass().getSuperclass().getSimpleName().equals("BeanBase") || tb.getClass().getSuperclass().getSimpleName().equals("BeanListBase"))) {
                Field[] fields_father = tb.getClass().getSuperclass().getDeclaredFields();
                for (Field field : fields_father) {
                    field.setAccessible(true);
                    if (!field.getName().equals("sign")) {
                        map.put(field.getName(), TextUtils.isEmpty(field.get(tb).toString()) ? "" : field.get(tb).toString());
                        if (!field.getName().equals("timestamp"))
                            list.add(field.getName());
                    }
                }
            }
            Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
            for (String key : list) {
                str += key + "=" + map.get(key) + "&";
            }
            str += "timestamp=" + map.get("timestamp");
            Log.i("sign=", str);
            return AbMd5.MD5(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 验证身份证号是否符合规则
     *
     * @return
     */
    public static boolean isIDCard(String IDCard) {
        if (IDCard != null) {
            String IDCardRegex = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x|Y|y)$)";
            return IDCard.matches(IDCardRegex);
        }
        return false;
    }

    public static String changeSFZ(String code) {
        if (!TextUtils.isEmpty(code) && code.length() > 10) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < code.length(); i++) {
                char c = code.charAt(i);
                if (i >= 6 && i < code.length() - 4) {
                    sb.append('*');
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
        return code;
    }


    /**
     * 分享文字内容
     *
     * @param dlgTitle 分享对话框标题
     * @param content  分享内容（文字）
     */
    public static void shareText(String dlgTitle, String content, Context context) {
        if (content == null || "".equals(content)) {
            return;
        }
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, content);
        // 设置弹出框标题
        if (dlgTitle != null && !"".equals(dlgTitle)) { // 自定义标题
            context.startActivity(Intent.createChooser(intent, dlgTitle));
        } else { // 系统默认标题
            context.startActivity(intent);
        }
    }

    /**
     * 检查wifi是否处开连接状态
     *
     * @return
     */
    public static boolean isWifiConnect(Context context) {
        ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mWifiInfo = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        return mWifiInfo.isConnected();
    }

    public static void logout(Context context) {
        uid = "";
        verify = "";
        wxqqid = "";
        com.ndtlg.pettimenew.F.saveJson("uid", uid);
        com.ndtlg.pettimenew.F.saveJson("verify", verify);
        com.ndtlg.pettimenew.F.saveJson("wxqqid", wxqqid);
        Frame.HANDLES.sentAll("FrgWd", 1, null);
        Helper.startActivity(context, Intent.FLAG_ACTIVITY_CLEAR_TOP, FrgLogin.class, IndexAct.class);
    }
}
