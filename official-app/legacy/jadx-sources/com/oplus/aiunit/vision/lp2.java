package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class lp2 {
    public static boolean a = false;
    public static boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f13779c;
    public static boolean d;

    static {
        boolean zIsLoggable = Log.isLoggable("DigitalAppSDK_1.2.3", 3);
        f13779c = zIsLoggable;
        d = a || b || zIsLoggable;
        Log.i("DigitalAppSDK_1.2.3", "WeLog, sQELogOn = " + a + ", sQELogOnMTK = " + b + ", sIsDebugTagOn = " + f13779c);
        if (a || b || f13779c) {
            d = true;
        }
    }

    public static void a(String str, String str2) {
        if (d) {
            e(3, "DigitalAppSDK_1.2.3." + str, str2);
        }
    }

    public static void b(String str, String str2) {
        e(6, "DigitalAppSDK_1.2.3." + str, str2);
    }

    public static void c(String str, String str2) {
        e(4, "DigitalAppSDK_1.2.3." + str, str2);
    }

    public static boolean d() {
        return d;
    }

    public static void e(int i, String str, String str2) {
        if (str2 == null) {
            Log.println(i, str, "");
            return;
        }
        int length = str2.length();
        for (int i2 = 0; i2 < 30; i2++) {
            int i3 = i2 * 3072;
            int i4 = i3 + 3072;
            if (i4 >= length) {
                Log.println(i, str, str2.substring(i3, length));
                return;
            }
            Log.println(i, str, str2.substring(i3, i4));
        }
    }

    public static void f(String str, String str2) {
        e(5, "DigitalAppSDK_1.2.3." + str, str2);
    }
}
