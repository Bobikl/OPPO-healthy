package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class g5g {
    public static boolean a = false;
    public static Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f11644c;

    static {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            a = ((Boolean) cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, "persist.sys.assert.panic", Boolean.FALSE)).booleanValue();
        } catch (Throwable th) {
            d("DeepThinkerSDK", "static init", th);
        }
    }

    public static void a(String str, String str2) {
        if (a || b()) {
            Log.d("DeepThinkerSDK", "[APP] " + str + ": " + str2);
        }
    }

    public static boolean b() {
        if (b == null) {
            b = Boolean.valueOf(Log.isLoggable("DeepThinkerSDK", 3));
        }
        return b.booleanValue();
    }

    public static void c(String str, String str2) {
        Log.e("DeepThinkerSDK", "[APP] " + str + ": " + str2);
    }

    public static void d(String str, String str2, Throwable th) {
        Log.e("DeepThinkerSDK", "[APP] " + str + ":" + str2 + " , " + th);
    }

    public static void e(String str, String str2) {
        if (a || f()) {
            Log.i("DeepThinkerSDK", "[APP] " + str + ": " + str2);
        }
    }

    public static boolean f() {
        if (f11644c == null) {
            f11644c = Boolean.valueOf(Log.isLoggable("DeepThinkerSDK", 4));
        }
        return f11644c.booleanValue();
    }

    public static void g(String str) {
        Log.w("DeepThinkerSDK", "[APP] " + str);
    }

    public static void h(String str, String str2) {
        Log.w("DeepThinkerSDK", "[APP] " + str + ": " + str2);
    }
}
