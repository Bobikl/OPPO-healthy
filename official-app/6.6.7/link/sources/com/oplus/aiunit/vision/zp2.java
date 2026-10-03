package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class zp2 {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c;
    public static boolean d;

    static {
        boolean zIsLoggable = Log.isLoggable("DigitalAppSDK_1.2.3", 3);
        c = zIsLoggable;
        d = a || b || zIsLoggable;
        Log.i("DigitalAppSDK_1.2.3", "WeLog, sQELogOn = " + a + ", sQELogOnMTK = " + b + ", sIsDebugTagOn = " + c);
        if (a || b || c) {
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
