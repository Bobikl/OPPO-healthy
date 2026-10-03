package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class ltl {
    public static final boolean a = qe0.E();

    public static void a(String str, String str2) {
        c(str);
    }

    public static void b(String str, String str2) {
        a7b.b(c(str), str2);
    }

    public static String c(String str) {
        return "WFL." + str;
    }

    public static void d(String str, String str2) {
        a7b.f(c(str), str2);
    }

    public static void e(String str, String str2) {
        if (!a || str2 == null) {
            return;
        }
        z7b.c("WFL." + str, str2);
    }

    public static void f(String str, String str2) {
        if (!a || str2 == null) {
            return;
        }
        z7b.f("WFL." + str, str2);
    }

    public static void g(String str, Throwable th) {
        StackTraceElement[] stackTrace;
        if (!a || th == null || (stackTrace = th.getStackTrace()) == null) {
            return;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            z7b.j("WFL." + str, "at " + stackTraceElement);
        }
    }

    public static void h(String str, String str2) {
        c(str);
    }

    public static void i(String str, String str2) {
        a7b.m(c(str), str2);
    }

    public static void j(String str, String str2, Throwable th) {
        if (th != null) {
            String strC = c(str);
            a7b.m(strC, str2 + th.getMessage());
            g(strC, th);
        }
    }
}
