package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class e7b {
    public static final boolean a = false;
    public static boolean b = false;

    public static void a(String str, String str2) {
        if (b) {
            Log.d("SauAar", str + ": " + str2);
        }
    }

    public static void b(boolean z) {
        b = z;
    }

    public static void c(String str, String str2) {
        Log.e("SauAar", str + ": " + str2);
    }

    public static void d(String str, String str2) {
        if (b) {
            Log.i("SauAar", str + ": " + str2);
        }
    }

    public static void e(String str, String str2) {
        if (b) {
            Log.v("SauAar", str + ": " + str2);
        }
    }

    public static void f(String str, String str2) {
        Log.w("SauAar", str + ": " + str2);
    }
}
