package com.oplus.omes.srp.sysintegrity.util;

import android.text.TextUtils;
import android.util.Log;
import com.oplus.omes.srp.sysintegrity.SrpConstant;
import com.oplus.omes.srp.sysintegrity.SrpException;

/* JADX INFO: loaded from: classes8.dex */
public class LogUtil {
    private static boolean DEBUG = false;
    private static final String TAG = "srpsdk";

    public static void d(String str, String str2) {
        if (DEBUG) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        Log.e(str, str2);
    }

    public static void i(String str, String str2) {
        Log.i(str, str2);
    }

    public static void setDebug(boolean z) {
        DEBUG = z;
    }

    public static void splitContent(int i, String str) {
        if (!DEBUG || str == null) {
            return;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 2000) {
            int i3 = i2 + 2000;
            d(i + " part" + i2 + ":" + str.substring(i2, i3));
            length += -2000;
            i2 = i3;
        }
        if (length > 0) {
            d(i + " part" + i2 + ":" + str.substring(i2));
        }
        d(i + "total size: " + str.length());
    }

    public static void w(String str, String str2) {
        Log.w(str, str2);
    }

    public static void e(String str) {
        Log.e(TAG, str);
    }

    public static void i(String str) {
        Log.i(TAG, str);
    }

    public static void w(String str) {
        Log.w(TAG, str);
    }

    public static void d(String str) {
        if (DEBUG) {
            Log.d(TAG, str);
        }
    }

    public static void e(int i) {
        e(i, "");
    }

    public static void i(int i) {
        i(i, (String) null);
    }

    public static void w(int i) {
        w(i, (String) null);
    }

    public static void e(int i, Exception exc) {
        e(i, "");
        if (DEBUG) {
            exc.printStackTrace();
        }
    }

    public static void i(int i, String str) {
        String dbgMsg;
        if (!DEBUG) {
            Log.i(TAG, String.valueOf(i));
            return;
        }
        if (i < 90000) {
            dbgMsg = SrpException.getMessage(i);
        } else {
            dbgMsg = SrpConstant.getDbgMsg(i);
        }
        if (str != null) {
            Log.i(TAG, i + ":" + dbgMsg + ":" + str);
            return;
        }
        Log.i(TAG, i + ":" + dbgMsg);
    }

    public static void w(int i, String str) {
        String dbgMsg;
        if (!DEBUG) {
            Log.w(TAG, String.valueOf(i));
            return;
        }
        if (i < 90000) {
            dbgMsg = SrpException.getMessage(i);
        } else {
            dbgMsg = SrpConstant.getDbgMsg(i);
        }
        if (str != null) {
            Log.w(TAG, i + ":" + dbgMsg + ":" + str);
            return;
        }
        Log.w(TAG, i + ":" + dbgMsg);
    }

    public static void d(int i) {
        d(i, (String) null);
    }

    public static void d(int i, String str) {
        String dbgMsg;
        if (DEBUG) {
            if (i < 90000) {
                dbgMsg = SrpException.getMessage(i);
            } else {
                dbgMsg = SrpConstant.getDbgMsg(i);
            }
            if (str != null) {
                Log.d(TAG, i + ":" + dbgMsg + ":" + str);
                return;
            }
            Log.d(TAG, i + ":" + dbgMsg);
        }
    }

    public static void e(int i, String str) {
        String dbgMsg;
        if (DEBUG) {
            if (i < 90000) {
                dbgMsg = SrpException.getMessage(i);
            } else {
                dbgMsg = SrpConstant.getDbgMsg(i);
            }
            if (TextUtils.isEmpty(str)) {
                Log.e(TAG, i + ":" + dbgMsg);
                return;
            }
            Log.e(TAG, i + ":" + dbgMsg + ":" + str);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, String.valueOf(i));
            return;
        }
        Log.e(TAG, String.valueOf(i) + ":" + str);
    }
}
