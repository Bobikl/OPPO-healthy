package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class y8b {
    public static final it9 a = new p55();
    public static boolean b = false;
    public static it9 c;

    public static void a(String str, String str2) {
        b(str, str2, null);
    }

    public static void b(String str, String str2, Throwable th) {
        it9 it9VarH = h();
        if (it9VarH != null) {
            it9VarH.c(str, str2, th);
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
        it9 it9VarH = h();
        if (it9VarH != null) {
            it9VarH.b(str, str2, thArr);
        }
    }

    public static void g(String str, Throwable... thArr) {
        f(str, null, thArr);
    }

    public static it9 h() {
        it9 it9Var = c;
        return it9Var == null ? a : it9Var;
    }

    public static void i(String str, String str2) {
        j(str, str2, null);
    }

    public static void j(String str, String str2, Throwable... thArr) {
        it9 it9VarH = h();
        if (it9VarH != null) {
            it9VarH.d(str, str2, thArr);
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
        it9 it9VarH = h();
        if (it9VarH != null) {
            it9VarH.a(str, str2, thArr);
        }
    }
}
