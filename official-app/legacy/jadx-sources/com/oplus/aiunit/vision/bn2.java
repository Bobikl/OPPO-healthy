package com.oplus.aiunit.vision;

import android.os.Build;
import android.util.Log;
import com.oplus.os.OplusBuild;

/* JADX INFO: loaded from: classes13.dex */
public class bn2 {
    public static final int COUI_1_0 = 1;
    public static final int COUI_1_2 = 2;
    public static final int COUI_1_4 = 3;
    public static final int COUI_2_0 = 4;
    public static final int COUI_2_1 = 5;
    public static final int COUI_3_0 = 6;
    public static final int COUI_3_1 = 7;
    public static final int COUI_3_2 = 8;
    public static final int COUI_5_0 = 9;
    public static final int COUI_5_1 = 10;
    public static final int COUI_5_2 = 11;
    public static final int COUI_6_0 = 12;
    public static final int COUI_6_1 = 13;
    public static final int COUI_6_2 = 14;
    public static final int COUI_6_7 = 15;
    public static final int COUI_7_0 = 16;
    public static final int COUI_7_1 = 17;
    public static final int COUI_7_2 = 18;
    public static final int COUI_8_0 = 19;
    public static final int COUI_8_1 = 20;
    public static final int COUI_8_2 = 21;
    public static final int UNKNOWN = 0;
    public static String a;
    public static String b;

    public static boolean a() {
        try {
            Class.forName("com.oplus.os.OplusBuild");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(int i, int i2) {
        if (Build.VERSION.SDK_INT <= 31) {
            return false;
        }
        if (c() > i) {
            return true;
        }
        return c() == i && d() >= i2;
    }

    public static int c() {
        a = a() ? "com.oplus.os.OplusBuild" : kh2.c().d();
        b = a() ? "getOplusOSVERSION" : kh2.c().e();
        try {
            Class<?> cls = Class.forName(a);
            return Build.VERSION.SDK_INT > 31 ? OplusBuild.VERSION.SDK_VERSION : ((Integer) cls.getDeclaredMethod(b, new Class[0]).invoke(cls, new Object[0])).intValue();
        } catch (Throwable th) {
            Log.e("COUIVersionUtil", "getOSVersionCode failed. error = " + th.getMessage());
            return 0;
        }
    }

    public static int d() {
        if (Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        try {
            return OplusBuild.VERSION.SDK_SUB_VERSION;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean e() {
        return c() != 0;
    }
}
