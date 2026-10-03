package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class s5l {
    public static final boolean a = qe0.E();

    public static void a(String str, String str2) {
        c(str);
    }

    public static void b(String str, String str2) {
        a7b.b(c(str), str2);
    }

    public static String c(String str) {
        return "WAL." + str;
    }

    public static void d(String str, String str2) {
        a7b.f(c(str), str2);
    }

    public static void e(String str, String str2) {
        if (!a || str2 == null) {
            return;
        }
        z7b.f("WAL." + str, str2);
    }

    public static void f(String str, Throwable th) {
        StackTraceElement[] stackTrace;
        if (!a || th == null || (stackTrace = th.getStackTrace()) == null) {
            return;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            z7b.j("WAL." + str, "at " + stackTraceElement);
        }
    }

    public static void g(String str, String str2) {
        a7b.m(c(str), str2);
    }

    public static void h(String str, String str2, Throwable th) {
        if (th != null) {
            String strC = c(str);
            a7b.m(strC, str2 + th.getMessage());
            f(strC, th);
        }
    }
}
