package com.ndtlg.pettimenew.view;

import android.content.Context;
import android.widget.Toast;

import com.google.gson.Gson;
import com.mdx.framework.activity.MActivityActionbar;
import com.ndtlg.pettimenew.bean.BeanSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocThread extends Thread {
    public Socket mSocket = null;
    public boolean isRun = true;
    private Context context;
    private PrintWriter printWriter;
    private BufferedReader in;
    private String HOST = "192.168.4.1";
    private int PORT = 19999;
    private BeanSocket mBeanSocket;
    public Callback mCallback;

    public SocThread(Context context, Callback mCallback, BeanSocket mBeanSocket) {
        this.context = context;
        this.mCallback = mCallback;
        this.mBeanSocket = mBeanSocket;
    }


    /**
     * 实时接受数据
     */
    @Override
    public void run() {
        try {
            mSocket = new Socket();
            Thread.sleep(1500);
            mSocket.connect(new InetSocketAddress(HOST, PORT));
            printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(   //步骤二
                    mSocket.getOutputStream(), "UTF-8")), true);
            printWriter.println(new Gson().toJson(mBeanSocket));
            in = new BufferedReader(new InputStreamReader(mSocket.getInputStream(), "UTF-8"));
            while (isRun) {
                String receiveMsg;
                if ((receiveMsg = in.readLine()) != null) {
                    ((MActivityActionbar) context).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mCallback.goBack(receiveMsg);
                            isRun=false;
                        }
                    });

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            run();
            ((MActivityActionbar) context).runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(context, e.getMessage(), 0).show();
                }
            });


        }
    }

    /**
     * 发送数据
     *
     * @param mess
     */
    public void Send(final String mess) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (mSocket != null && mSocket.isConnected()) {
                        printWriter.println(mess);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    /**
     * 关闭连接
     */
    public void close() {
        try {
            if (mSocket != null) {
                isRun = false;
                printWriter.close();
                in.close();
                mSocket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}