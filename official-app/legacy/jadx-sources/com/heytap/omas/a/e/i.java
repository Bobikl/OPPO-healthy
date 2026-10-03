package com.heytap.omas.a.e;

import android.util.Log;

/* JADX INFO: loaded from: classes19.dex */
public class i {
    private static final String a = "LogUtil";
    private static boolean b = false;

    private static String a() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        if (stackTraceElement == null) {
            return a;
        }
        String className = stackTraceElement.getClassName();
        return String.format("LogUtil-%s.%s(%d)", className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
    }

    private static String b(Exception exc) {
        return "ex msg:" + exc.getMessage() + ", localeMsg:" + exc.getLocalizedMessage() + ", cause:" + exc.getCause();
    }

    public static void c(String str, String str2) {
        Log.w(str, str2);
    }

    public static void a(Exception exc) {
        Log.e(a(), b(exc));
    }

    public static void b(String str, String str2) {
        Log.e(str, str2);
    }

    public static void a(String str) {
        Log.e(a(), str);
    }

    public static void b(String str, String str2, String str3) {
    }

    public static void a(String str, String str2) {
    }

    public static void a(String str, String str2, Exception exc) {
        a(exc);
    }

    public static void a(String str, String str2, String str3) {
    }
}
