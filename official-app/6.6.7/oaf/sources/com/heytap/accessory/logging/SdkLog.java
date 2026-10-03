package com.heytap.accessory.logging;

import android.util.Log;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SdkLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    private static final String DOT = ".";
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final String TAG = "AF.SDK";
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    private static String cutTagIfNeed(String str) {
        return str;
    }

    public static void d(String str, String str2) {
        Log.d(cutTagIfNeed("AF.SDK." + str), str2);
    }

    public static void e(String str, String str2) {
        Log.e(cutTagIfNeed("AF.SDK." + str), str2);
    }

    public static void funcIn() {
    }

    public static void funcOut() {
    }

    public static void i(String str, String str2) {
        Log.i(cutTagIfNeed("AF.SDK." + str), str2);
    }

    public static boolean isDevelopMode() {
        return false;
    }

    public static void v(String str, String str2) {
        Log.v(cutTagIfNeed("AF.SDK." + str), str2);
    }

    public static void w(String str, String str2) {
        Log.w(cutTagIfNeed("AF.SDK." + str), str2);
    }

    public static void d(String str) {
        Log.d(TAG, str);
    }

    public static void e(String str) {
        Log.e(TAG, str);
    }

    public static void i(String str) {
        Log.i(TAG, str);
    }

    public static void v(String str) {
        Log.v(TAG, str);
    }

    public static void w(String str) {
        Log.w(TAG, str);
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(cutTagIfNeed("AF.SDK." + str), str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        Log.w(cutTagIfNeed("AF.SDK." + str), str2, th);
    }

    public static void e(String str, Throwable th) {
        Log.e(TAG, str, th);
    }

    public static void w(String str, Throwable th) {
        Log.w(TAG, str, th);
    }
}
