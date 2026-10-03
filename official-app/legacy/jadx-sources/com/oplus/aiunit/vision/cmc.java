package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes18.dex */
public class cmc {
    public static final int Near_1_0 = 1;
    public static final int Near_1_2 = 2;
    public static final int Near_1_4 = 3;
    public static final int Near_2_0 = 4;
    public static final int Near_2_1 = 5;
    public static final int Near_3_0 = 6;
    public static final int Near_3_1 = 7;
    public static final int Near_3_2 = 8;
    public static final int Near_5_0 = 9;
    public static final int Near_5_1 = 10;
    public static final int Near_5_2 = 11;
    public static final int Near_6_0 = 12;
    public static final int Near_6_1 = 13;
    public static final int Near_6_2 = 14;
    public static final int Near_6_7 = 15;
    public static final int Near_7_0 = 16;
    public static final int Near_7_1 = 17;
    public static final int Near_7_2 = 18;
    public static final int Near_8_0 = 19;
    public static final int Near_8_1 = 20;
    public static final int Near_8_2 = 21;
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

    public static int b() {
        a = a() ? "com.oplus.os.OplusBuild" : khc.c().d();
        b = a() ? "getOplusOSVERSION" : khc.c().e();
        try {
            Class<?> cls = Class.forName(a);
            return ((Integer) cls.getDeclaredMethod(b, new Class[0]).invoke(cls, new Object[0])).intValue();
        } catch (Exception e2) {
            Log.e("NearVersionUtil", "getOSVersionCode failed. error = " + e2.getMessage());
            return 0;
        }
    }
}
