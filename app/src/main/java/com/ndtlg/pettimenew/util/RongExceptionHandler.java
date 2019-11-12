package com.ndtlg.pettimenew.util;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.Thread.UncaughtExceptionHandler;

public class RongExceptionHandler implements UncaughtExceptionHandler {
    Context mContext;

    public RongExceptionHandler(Context context) {
        this.mContext = context;
    }

    public void uncaughtException(Thread thread, Throwable ex) {
        File file = this.mContext.getExternalFilesDir("Crash");
        if(!file.exists()) {
            file.mkdirs();
        }

        File crashFile = new File(file, System.currentTimeMillis() + ".log");

        try {
            crashFile.createNewFile();
            FileOutputStream e = new FileOutputStream(crashFile);
            PrintStream printStream = new PrintStream(e);
            ex.printStackTrace(printStream);
            printStream.close();
        } catch (FileNotFoundException var7) {
            var7.printStackTrace();
        } catch (IOException var8) {
            var8.printStackTrace();
        } catch (SecurityException var9) {
            var9.printStackTrace();
        }

        System.exit(2);
    }
}
