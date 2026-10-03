package com.oplus.mydevices.sdk.compat;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class OLog {
    private static final boolean DBG_E = true;
    private static final boolean DBG_W = true;
    private static boolean DEBUGGABLE = false;

    public static void d(String str, String str2) {
        if (DEBUGGABLE) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        Log.e(str, str2);
    }

    public static void i(String str, String str2) {
        if (DEBUGGABLE) {
            Log.i(str, str2);
        }
    }

    public static void init(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null || (applicationInfo = context.getApplicationInfo()) == null) {
            return;
        }
        DEBUGGABLE = (applicationInfo.flags & 2) != 0;
    }

    public static void v(String str, String str2) {
        if (DEBUGGABLE) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        Log.w(str, str2);
    }
}
