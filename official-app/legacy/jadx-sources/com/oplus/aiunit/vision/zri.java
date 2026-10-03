package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public class zri {
    public static final int LOG_TYPE_D = 0;
    public static final int LOG_TYPE_E = 4;
    public static final int LOG_TYPE_I = 1;
    public static final int LOG_TYPE_V = 2;
    public static final int LOG_TYPE_W = 3;
    public static boolean a = qe0.w();

    public static void a(String str, String str2) {
        d(0, str, str2);
    }

    public static void b(int i, String str, String str2) {
        if (i == 0) {
            e(str, str2);
            return;
        }
        if (i == 1) {
            g(str, str2);
            return;
        }
        if (i == 2) {
            h(str, str2);
        } else if (i == 3) {
            i(str, str2);
        } else {
            if (i != 4) {
                return;
            }
            f(str, str2);
        }
    }

    public static void c(String str, String str2) {
        d(1, str, str2);
    }

    public static void d(int i, String str, String str2) {
        byte[] bytes = str2.getBytes();
        if (bytes.length < 4000) {
            b(i, str, str2);
            return;
        }
        for (int i2 = 0; i2 < bytes.length; i2 += 4000) {
            b(i, str, new String(bytes, i2, Math.min(bytes.length - i2, 4000)));
        }
    }

    public static void e(String str, String str2) {
    }

    public static void f(String str, String str2) {
        if (a) {
            a7b.b(str, str2);
        } else {
            z7b.c(str, str2);
        }
    }

    public static void g(String str, String str2) {
        if (a) {
            a7b.f(str, str2);
        } else {
            z7b.f(str, str2);
        }
    }

    public static void h(String str, String str2) {
    }

    public static void i(String str, String str2) {
        if (a) {
            a7b.m(str, str2);
        } else {
            z7b.j(str, str2);
        }
    }
}
