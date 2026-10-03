package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.util.Log;

/* JADX INFO: loaded from: classes15.dex */
@SuppressLint({"HealthLint_AndroidLogDetector"})
public class me8 {
    public static boolean a = false;
    public static nq9 b;

    public static void a(String str, String str2) {
        if (a) {
            Log.d(str, str2);
            nq9 nq9Var = b;
            if (nq9Var != null) {
                nq9Var.d(str, str2);
            }
        }
    }

    public static void b(String str, String str2) {
        if (a) {
            Log.e(str, str2);
            nq9 nq9Var = b;
            if (nq9Var != null) {
                nq9Var.e(str, str2);
            }
        }
    }

    public static String c() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (i > 1 && i <= 5) {
                sb.append("(");
                sb.append(stackTraceElement.getClassName());
                sb.append(",");
                sb.append(stackTraceElement.getMethodName());
                sb.append("),");
            }
            if (i > 4) {
                break;
            }
            i++;
        }
        return sb.toString();
    }

    public static String d(Throwable th) {
        nq9 nq9Var = b;
        return nq9Var != null ? nq9Var.a(th) : "";
    }

    public static void e(String str, String str2) {
        if (a) {
            Log.i(str, str2);
            nq9 nq9Var = b;
            if (nq9Var != null) {
                nq9Var.i(str, str2);
            }
        }
    }

    public static void f(String str, String str2) {
        nq9 nq9Var;
        if (!a || (nq9Var = b) == null) {
            return;
        }
        nq9Var.i(str, str2);
    }

    public static void g(boolean z) {
        a = z;
    }

    public static void h(nq9 nq9Var) {
        b = nq9Var;
    }

    public static void i(String str, String str2) {
        if (a) {
            Log.w(str, str2);
            nq9 nq9Var = b;
            if (nq9Var != null) {
                nq9Var.w(str, str2);
            }
        }
    }
}
