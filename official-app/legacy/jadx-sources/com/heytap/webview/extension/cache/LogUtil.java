package com.heytap.webview.extension.cache;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class LogUtil {
    private static final String TAG = "WebExt-";
    private static boolean isDebug = true;

    private LogUtil() {
    }

    public static void d(String str, String str2) {
        if (isDebug) {
            Log.d(TAG + str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (isDebug) {
            Log.e(TAG + str, str2);
        }
    }

    public static boolean getDebug() {
        return isDebug;
    }

    public static void i(String str, String str2) {
        if (isDebug) {
            Log.i(TAG + str, str2);
        }
    }

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    public static void v(String str, String str2) {
        if (isDebug) {
            Log.v(TAG + str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (isDebug) {
            Log.w(TAG + str, str2);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (isDebug) {
            Log.d(TAG + str, String.format(str2, objArr));
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (isDebug) {
            Log.e(TAG + str, String.format(str2, objArr));
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        if (isDebug) {
            Log.i(TAG + str, String.format(str2, objArr));
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        if (isDebug) {
            Log.v(TAG + str, String.format(str2, objArr));
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        if (isDebug) {
            Log.w(TAG + str, String.format(str2, objArr));
        }
    }

    public static void e(String str, Exception exc) {
        if (isDebug) {
            Log.e(TAG + str, Log.getStackTraceString(exc));
        }
    }

    public static void e(Exception exc) {
        if (isDebug) {
            Log.e(TAG, Log.getStackTraceString(exc));
        }
    }
}
