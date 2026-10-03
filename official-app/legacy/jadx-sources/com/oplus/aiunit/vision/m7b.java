package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes3.dex */
public class m7b {
    public static final cs9 a = new w45();
    public static boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static cs9 f13970c;

    public static void a(String str, String str2) {
        b(str, str2, null);
    }

    public static void b(String str, String str2, Throwable th) {
        cs9 cs9VarH = h();
        if (cs9VarH != null) {
            cs9VarH.c(str, str2, th);
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
        cs9 cs9VarH = h();
        if (cs9VarH != null) {
            cs9VarH.b(str, str2, thArr);
        }
    }

    public static void g(String str, Throwable... thArr) {
        f(str, null, thArr);
    }

    public static cs9 h() {
        cs9 cs9Var = f13970c;
        return cs9Var == null ? a : cs9Var;
    }

    public static void i(String str, String str2) {
        j(str, str2, null);
    }

    public static void j(String str, String str2, Throwable... thArr) {
        cs9 cs9VarH = h();
        if (cs9VarH != null) {
            cs9VarH.d(str, str2, thArr);
        }
    }

    public static void k(boolean z) {
        b = z;
        h().e(z);
    }

    public static void l(String str, String str2) {
        m(str, str2, null);
    }

    public static void m(String str, String str2, Throwable... thArr) {
        cs9 cs9VarH = h();
        if (cs9VarH != null) {
            cs9VarH.a(str, str2, thArr);
        }
    }
}
