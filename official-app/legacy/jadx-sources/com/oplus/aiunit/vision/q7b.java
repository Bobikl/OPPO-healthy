package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes14.dex */
public final class q7b {
    public static final ds9 a = new x45();
    public static ds9 b;

    public static void a(String str, String str2) {
        b(str, str2, null);
    }

    public static void b(String str, String str2, Throwable th) {
        ds9 ds9VarH = h();
        if (ds9VarH != null) {
            ds9VarH.c(str, str2, th);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        a(str, String.format(str2, objArr));
    }

    public static void d(String str, String str2) {
        f(str, str2, null);
    }

    public static void e(String str, String str2, Object... objArr) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        d(str, String.format(str2, objArr));
    }

    public static void f(String str, String str2, Throwable... thArr) {
        ds9 ds9VarH = h();
        if (ds9VarH != null) {
            ds9VarH.b(str, str2, thArr);
        }
    }

    public static void g(String str, Throwable... thArr) {
        f(str, null, thArr);
    }

    public static ds9 h() {
        ds9 ds9Var = b;
        return ds9Var == null ? a : ds9Var;
    }

    public static void i(String str, String str2) {
        k(str, str2, null);
    }

    public static void j(String str, String str2, Object... objArr) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        i(str, String.format(str2, objArr));
    }

    public static void k(String str, String str2, Throwable... thArr) {
        ds9 ds9VarH = h();
        if (ds9VarH != null) {
            ds9VarH.d(str, str2, thArr);
        }
    }

    public static boolean l() {
        return x45.h();
    }

    public static void m(boolean z) {
        x45.i(z);
    }

    public static void n(String str, String str2) {
        p(str, str2, null);
    }

    public static void o(String str, String str2, Object... objArr) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        n(str, String.format(str2, objArr));
    }

    public static void p(String str, String str2, Throwable... thArr) {
        ds9 ds9VarH = h();
        if (ds9VarH != null) {
            ds9VarH.a(str, str2, thArr);
        }
    }
}
