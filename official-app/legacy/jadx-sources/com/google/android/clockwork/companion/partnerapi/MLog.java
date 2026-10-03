package com.google.android.clockwork.companion.partnerapi;

import com.oplus.aiunit.vision.a7b;

/* JADX INFO: loaded from: classes13.dex */
class MLog {
    private static boolean loggable = false;

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
        if (loggable) {
            a7b.b(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (loggable) {
            a7b.f(str, str2);
        }
    }

    public static void setLoggable(boolean z) {
        loggable = z;
    }

    public static void w(String str, String str2) {
        if (loggable) {
            a7b.m(str, str2);
        }
    }
}
