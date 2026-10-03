package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public class bj2 {
    public static final int LEVEL_ASSERT = 7;
    public static final int LEVEL_DEBUG = 3;
    public static final int LEVEL_ERROR = 6;
    public static final int LEVEL_INFO = 4;
    public static final int LEVEL_SILENT = Integer.MAX_VALUE;
    public static final int LEVEL_VERBOSE = 2;
    public static final int LEVEL_WARN = 5;
    public static final boolean LOG_ASSERT;
    public static final boolean LOG_DEBUG;
    public static final boolean LOG_ERROR;
    public static final boolean LOG_INFO;
    public static final boolean LOG_SILENT;
    public static final boolean LOG_VERBOSE;
    public static final boolean LOG_WARN;
    public static Boolean a;
    public static int b;

    static {
        boolean zE = e("COUI", 2);
        LOG_VERBOSE = zE;
        boolean zE2 = e("COUI", 3);
        LOG_DEBUG = zE2;
        boolean zE3 = e("COUI", 4);
        LOG_INFO = zE3;
        boolean zE4 = e("COUI", 5);
        LOG_WARN = zE4;
        boolean zE5 = e("COUI", 6);
        LOG_ERROR = zE5;
        boolean zE6 = e("COUI", 7);
        LOG_ASSERT = zE6;
        LOG_SILENT = (zE || zE2 || zE3 || zE4 || zE5 || zE6) ? false : true;
        a = null;
        b = 4;
    }

    public static void a(String str, String str2) {
        if (b <= 3 || Log.isLoggable(str, 3) || LOG_DEBUG) {
            Log.d(str, str2);
        }
    }

    public static void b(boolean z, String str, String str2) {
        if (z) {
            Log.d(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (b <= 6 || Log.isLoggable(str, 6) || LOG_ERROR) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2) {
        if (b <= 4 || Log.isLoggable(str, 4) || LOG_INFO) {
            Log.i(str, str2);
        }
    }

    public static boolean e(String str, int i) {
        return Log.isLoggable(str, i);
    }

    public static void f(String str, String str2) {
        if (b <= 2 || Log.isLoggable(str, 2) || LOG_VERBOSE) {
            Log.v(str, str2);
        }
    }

    public static void g(String str, String str2) {
        if (b <= 5 || Log.isLoggable(str, 5) || LOG_WARN) {
            Log.w(str, str2);
        }
    }
}
