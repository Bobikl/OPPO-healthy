package com.heytap.accessory.pair.logging;

import com.heytap.accessory.logging.CommonLog;

/* JADX INFO: loaded from: classes14.dex */
public class PairLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    private static final String DOT = ".";
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final String TAG = "PRLog";
    private static final int TRACE_LEVEL = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    public static void d(String str, String str2) {
        CommonLog.d("PRLog." + str, str2);
    }

    public static void e(String str, String str2) {
        CommonLog.e("PRLog." + str, str2);
    }

    public static void funcIn() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        int iLastIndexOf = className.lastIndexOf(".") + 1;
        funcIn(className.length() > iLastIndexOf ? className.substring(iLastIndexOf) : TAG, stackTraceElement.getMethodName());
    }

    public static void funcOut() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        int iLastIndexOf = className.lastIndexOf(".") + 1;
        funcOut(className.length() > iLastIndexOf ? className.substring(iLastIndexOf) : TAG, stackTraceElement.getMethodName());
    }

    public static void i(String str, String str2) {
        CommonLog.i("PRLog." + str, str2);
    }

    public static boolean isDevelopMode() {
        return CommonLog.isDevelopMode();
    }

    public static void v(String str, String str2) {
        CommonLog.v("PRLog." + str, str2);
    }

    public static void w(String str, String str2) {
        CommonLog.w("PRLog." + str, str2);
    }

    public static void d(String str) {
        CommonLog.d(TAG, str);
    }

    public static void e(String str) {
        CommonLog.e(TAG, str);
    }

    public static void i(String str) {
        CommonLog.i(TAG, str);
    }

    public static void v(String str) {
        CommonLog.v(TAG, str);
    }

    public static void w(String str) {
        CommonLog.w(TAG, str);
    }

    public static void e(String str, String str2, Throwable th) {
        CommonLog.e("PRLog." + str, str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        CommonLog.w("PRLog." + str, str2, th);
    }

    public static void e(String str, Throwable th) {
        CommonLog.e(TAG, str, th);
    }

    public static void w(String str, Throwable th) {
        CommonLog.w(TAG, str, th);
    }

    private static void funcIn(String str, String str2) {
        i(str, str2 + " In");
    }

    private static void funcOut(String str, String str2) {
        i(str, str2 + " Out");
    }
}
