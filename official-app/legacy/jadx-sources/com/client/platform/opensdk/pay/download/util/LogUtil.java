package com.client.platform.opensdk.pay.download.util;

import android.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public class LogUtil {
    private static int DEBUG_LEVEL = 3;
    private static final boolean DECISION = true;
    public static final String TAG = "PayApkDownLoad";

    private LogUtil() {
    }

    public static void d(String str) {
        log(3, str);
    }

    public static void e(String str) {
        log(6, str);
    }

    private static String getStackTraceString() {
        String simpleName;
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length >= 3) {
            StackTraceElement stackTraceElement = stackTrace[3];
            try {
                simpleName = Class.forName(stackTraceElement.getClassName()).getSimpleName();
            } catch (ClassNotFoundException unused) {
                simpleName = "";
            }
            stringBuffer.append(simpleName);
            stringBuffer.append("-> ");
            stringBuffer.append(stackTraceElement.getMethodName());
            stringBuffer.append(" : ");
            stringBuffer.append(stackTraceElement.getLineNumber());
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public static void i(String str) {
        log(4, str);
    }

    private static void log(int i, String str) {
        if (i == 2) {
            if (DEBUG_LEVEL <= 2) {
                Log.v(TAG, getStackTraceString() + str);
                return;
            }
            return;
        }
        if (i == 3) {
            if (DEBUG_LEVEL <= 3) {
                Log.d(TAG, getStackTraceString() + str);
                return;
            }
            return;
        }
        if (i == 4) {
            if (DEBUG_LEVEL <= 4) {
                Log.i(TAG, getStackTraceString() + str);
                return;
            }
            return;
        }
        if (i == 5) {
            if (DEBUG_LEVEL <= 5) {
                Log.w(TAG, getStackTraceString() + str);
                return;
            }
            return;
        }
        if (i == 6 && DEBUG_LEVEL <= 6) {
            Log.e(TAG, getStackTraceString() + str);
        }
    }

    public static void v(String str) {
        log(2, str);
    }

    public static void w(String str) {
        log(5, str);
    }
}
