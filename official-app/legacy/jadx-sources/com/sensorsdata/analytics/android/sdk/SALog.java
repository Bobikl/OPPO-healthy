package com.sensorsdata.analytics.android.sdk;

import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public class SALog {
    private static final int CHUNK_SIZE = 4000;
    private static boolean debug;
    private static boolean disableSDK;
    private static boolean enableLog;

    public static void d(String str, String str2) {
        if (!debug || disableSDK) {
            return;
        }
        info(str, str2, null);
    }

    public static void i(String str, String str2) {
        if (!enableLog || disableSDK) {
            return;
        }
        info(str, str2, null);
    }

    public static void info(String str, String str2, Throwable th) {
        try {
            if (str2 == null) {
                Log.i(str, null, th);
                return;
            }
            byte[] bytes = str2.getBytes();
            int length = bytes.length;
            if (length <= 4000) {
                Log.i(str, str2, th);
                return;
            }
            int i = 0;
            while (i < length - 4000) {
                int iLastIndexOfLF = lastIndexOfLF(bytes, i);
                int i2 = iLastIndexOfLF - i;
                Log.i(str, new String(bytes, i, i2), null);
                if (i2 < 4000) {
                    iLastIndexOfLF++;
                }
                i = iLastIndexOfLF;
            }
            if (length > i) {
                Log.i(str, new String(bytes, i, length - i), th);
            }
        } catch (Exception e2) {
            printStackTrace(e2);
        }
    }

    public static boolean isDebug() {
        return debug;
    }

    public static boolean isLogEnabled() {
        return enableLog;
    }

    private static int lastIndexOfLF(byte[] bArr, int i) {
        int iMin = Math.min(i + 4000, bArr.length - 1);
        for (int i2 = iMin; i2 > iMin - 4000; i2--) {
            if (bArr[i2] == 10) {
                return i2;
            }
        }
        return iMin;
    }

    public static void printStackTrace(Exception exc) {
        if (!enableLog || disableSDK || exc == null) {
            return;
        }
        Log.e("SA.Exception", "", exc);
    }

    public static void setDebug(boolean z) {
        debug = z;
    }

    public static void setDisableSDK(boolean z) {
        disableSDK = z;
    }

    public static void setEnableLog(boolean z) {
        enableLog = z;
    }

    public static void d(String str, String str2, Throwable th) {
        if (!debug || disableSDK) {
            return;
        }
        info(str, str2, th);
    }

    public static void i(String str, Throwable th) {
        if (!enableLog || disableSDK) {
            return;
        }
        info(str, "", th);
    }

    public static void i(String str, String str2, Throwable th) {
        if (!enableLog || disableSDK) {
            return;
        }
        info(str, str2, th);
    }

    public static void i(String str, String str2, Object... objArr) {
        if (!enableLog || disableSDK) {
            return;
        }
        info(str, String.format(str2, objArr), null);
    }
}
