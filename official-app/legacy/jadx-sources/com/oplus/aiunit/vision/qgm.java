package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public class qgm {
    public static boolean a = false;
    public static String b;

    public static String a() {
        com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.CANCELED.b());
        return b(cVarB.b(), cVarB.a(), "");
    }

    public static String b(int i, String str, String str2) {
        return "resultStatus={" + i + "};memo={" + str + "};result={" + str2 + "}";
    }

    public static void c(String str) {
        b = str;
    }

    public static void d(boolean z) {
        a = z;
    }

    public static String e() {
        com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.DOUBLE_REQUEST.b());
        return b(cVarB.b(), cVarB.a(), "");
    }

    public static boolean f() {
        return a;
    }

    public static String g() {
        return b;
    }

    public static String h() {
        com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.PARAMS_ERROR.b());
        return b(cVarB.b(), cVarB.a(), "");
    }
}
