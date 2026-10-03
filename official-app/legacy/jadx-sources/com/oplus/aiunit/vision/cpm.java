package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes19.dex */
public class cpm {
    public static final String a = "mcssdk---";
    public static String b = "MCS";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f10190c = false;
    public static boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f10191e = true;
    public static boolean f = true;
    public static boolean g = true;
    public static String h = "-->";
    public static boolean i = true;

    public static void a(String str) {
        if (f10191e && i) {
            Log.d(a, b + h + str);
        }
    }

    public static void b(String str, String str2) {
        if (f10191e && i) {
            Log.d(str, b + h + str2);
        }
    }

    public static void c(String str) {
        if (g && i) {
            Log.e(a, b + h + str);
        }
    }

    public static void d(String str, String str2) {
        if (g && i) {
            Log.e(str, b + h + str2);
        }
    }

    public static void e(boolean z) {
        i = z;
        boolean z2 = z;
        f10190c = z2;
        f10191e = z2;
        d = z2;
        f = z2;
        g = z2;
    }
}
