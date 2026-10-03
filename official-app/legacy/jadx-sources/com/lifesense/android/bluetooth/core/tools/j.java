package com.lifesense.android.bluetooth.core.tools;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class j {
    public static String a = "miolog";
    public static File b = null;
    public static boolean isDebug = true;

    static {
        Executors.newSingleThreadExecutor();
    }

    public static String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(j.class.getName())) {
                return "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") ]";
            }
        }
        return null;
    }

    public static String b(String str) {
        return str + " ;" + a();
    }

    public static void c(String str) {
        if (b != null) {
            return;
        }
        b = new File(str);
        new i(new File(b, a).getAbsolutePath());
    }

    public static void a(String str) {
        if (isDebug) {
            Log.e("eagle", b(str));
        }
    }

    public static void a(String str, String str2) {
        if (isDebug) {
            Log.e(str, b(str2));
        }
    }
}
