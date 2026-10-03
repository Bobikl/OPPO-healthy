package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class q8b {
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
