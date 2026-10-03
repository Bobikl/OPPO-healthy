package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class hpm {
    public static final String a = "OMS.";

    public static String a(String str, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str = String.format(str, objArr);
        }
        return str == null ? "" : str;
    }

    public static void b(String str, String str2, Object... objArr) {
        Log.d(a + str, a(str2, objArr));
    }

    public static void c(String str, String str2, Object... objArr) {
        Log.e(a + str, a(str2, objArr));
    }

    public static void d(String str, String str2, Object... objArr) {
        Log.i(a + str, a(str2, objArr));
    }

    public static void e(String str, String str2, Object... objArr) {
        Log.w(a + str, a(str2, objArr));
    }
}
