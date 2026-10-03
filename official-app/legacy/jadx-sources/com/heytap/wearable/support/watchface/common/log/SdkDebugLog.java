package com.heytap.wearable.support.watchface.common.log;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class SdkDebugLog {
    private static final boolean DEBUG;
    private static boolean DEBUG_IMPORTANT = false;
    private static final String TAG = "WF.Sdk";

    static {
        boolean zIsDebugEnabled = isDebugEnabled();
        DEBUG = zIsDebugEnabled;
        DEBUG_IMPORTANT = zIsDebugEnabled;
    }

    private static String appendTag(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return "[" + str + "]" + str2;
    }

    public static void d(String str, String str2) {
        if (DEBUG_IMPORTANT) {
            Log.d(TAG, appendTag(str, str2));
        }
    }

    public static void e(String str, String str2) {
        Log.e(TAG, appendTag(str, str2));
    }

    public static void i(String str, String str2) {
        Log.i(TAG, appendTag(str, str2));
    }

    private static boolean isDebugEnabled() {
        try {
            return ((Boolean) Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, "persist.sys.assert.panic", Boolean.FALSE)).booleanValue();
        } catch (Exception e2) {
            Log.e(TAG, "isDebugEnabled e: " + e2.getMessage());
            return false;
        }
    }

    public static void setImportantLogSwitch(boolean z) {
        DEBUG_IMPORTANT = z;
    }

    public static void w(String str, String str2) {
        Log.w(TAG, appendTag(str, str2));
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(TAG, appendTag(str, str2), th);
    }
}
