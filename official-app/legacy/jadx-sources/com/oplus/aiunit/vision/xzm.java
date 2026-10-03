package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class xzm {
    public static boolean a = false;

    public static void a(String str, String str2) {
        if (a) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        Log.e(str, str2);
    }

    public static void c(String str, String str2) {
        if (a) {
            Log.i(str, str2);
        }
    }
}
