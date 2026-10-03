package com.coloros.sceneservice.m;

import android.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public class f {
    public static final String HEAD = "SceneSDK.6.1.17.";
    public static boolean Uc = false;
    public static boolean Vc = false;
    public static int Wc;

    public static void a(boolean z) {
        Uc = z;
        init();
    }

    public static void d(String str, String str2) {
        if (Wc <= 3) {
            if (!Vc) {
                Log.d(HEAD + str, str2);
                return;
            }
            Log.d(HEAD + str, "(" + Thread.currentThread().getName() + ")" + str2);
        }
    }

    public static void e(String str, String str2) {
        if (Wc <= 6) {
            if (!Vc) {
                Log.e(HEAD + str, str2);
                return;
            }
            Log.e(HEAD + str, "(" + Thread.currentThread().getName() + ")" + str2);
        }
    }

    public static void i(String str, String str2) {
        if (Wc <= 4) {
            if (!Vc) {
                Log.i(HEAD + str, str2);
                return;
            }
            Log.i(HEAD + str, "(" + Thread.currentThread().getName() + ")" + str2);
        }
    }

    public static void init() {
        if (Uc) {
            Wc = 2;
            Vc = true;
        } else {
            Wc = 4;
            Vc = false;
        }
    }

    public static void v(String str, String str2) {
        if (Wc <= 2) {
            if (!Vc) {
                Log.v(HEAD + str, str2);
                return;
            }
            Log.v(HEAD + str, "(" + Thread.currentThread().getName() + ")" + str2);
        }
    }

    public static void w(String str, String str2) {
        if (Wc <= 5) {
            if (!Vc) {
                Log.w(HEAD + str, str2);
                return;
            }
            Log.w(HEAD + str, "(" + Thread.currentThread().getName() + ")" + str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (Wc <= 3) {
            if (Vc) {
                Log.d(HEAD + str, "(" + Thread.currentThread().getName() + ")" + str2, th);
                return;
            }
            Log.d(HEAD + str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (Wc <= 6) {
            if (Vc) {
                Log.e(HEAD + str, "(" + Thread.currentThread().getName() + ")" + str2, th);
                return;
            }
            Log.e(HEAD + str, str2, th);
        }
    }
}
