package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class yq {
    public static int a = 2;
    public static String b = "PlatformAgent.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f19104c = false;

    public static void a(String str, String str2) {
        if (a <= 3) {
            d(3, str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (a <= 6) {
            d(6, str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (a <= 6) {
            Log.e(b + str, str2, th);
        }
    }

    public static void d(int i, String str, String str2) {
        if (TextUtils.isEmpty(str2) || !f19104c) {
            return;
        }
        if (str2.length() <= 1024) {
            e(i, str, str2);
        } else {
            e(i, str, str2.substring(0, 1024));
            d(i, str, str2.substring(1024));
        }
    }

    public static void e(int i, String str, String str2) {
        if (i == 2) {
            Log.v(b + str, str2);
            return;
        }
        if (i == 3) {
            Log.d(b + str, str2);
            return;
        }
        if (i == 4) {
            Log.i(b + str, str2);
            return;
        }
        if (i == 5) {
            Log.w(b + str, str2);
            return;
        }
        if (i != 6) {
            return;
        }
        Log.e(b + str, str2);
    }
}
