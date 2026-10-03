package com.oplus.weatherservicesdk;

import android.util.Log;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class DebugLog {
    private static final String LOG_TAG = "WeatherS_";
    private static boolean sAllowPrintSensitiveLog = false;
    private static int sLevel = 4;

    public static void d(String str, String str2) {
        if (sLevel <= 3) {
            Log.d(LOG_TAG + str, str2);
        }
    }

    public static void ds(String str, String str2) {
        if (sAllowPrintSensitiveLog) {
            d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (sLevel <= 6) {
            Log.e(LOG_TAG + str, str2);
        }
    }

    public static void enableDebugMode(boolean z) {
        sLevel = z ? 2 : 4;
    }

    public static void i(String str, String str2) {
        if (sLevel <= 4) {
            Log.i(LOG_TAG + str, str2);
        }
    }

    public static boolean isAllowPrintSensitiveLog() {
        return sAllowPrintSensitiveLog;
    }

    public static boolean isLoggable(String str) {
        return Log.isLoggable(LOG_TAG + str, 4);
    }

    public static void setAllowPrintSensitiveLog(boolean z) {
        sAllowPrintSensitiveLog = z;
    }

    public static void v(String str, String str2) {
        if (sLevel <= 2) {
            Log.v(LOG_TAG + str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (sLevel <= 5) {
            Log.w(LOG_TAG + str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (sLevel <= 6) {
            Log.e(LOG_TAG + str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (sLevel <= 5) {
            Log.w(LOG_TAG + str, str2, th);
        }
    }
}
