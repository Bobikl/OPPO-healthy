package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class e3d {
    public static final boolean DEBUG_ENABLE = true;
    public static final int DEFAULT_LEVEL_DEVELOP_MODE = 4;

    public static int a(String str, String str2) {
        String strB = b();
        return Log.d(f0n.a("ONetSdk:", str), strB + "" + str2);
    }

    public static String b() {
        if (Thread.currentThread().getStackTrace() == null) {
            return null;
        }
        for (int i = 0; i <= 0; i++) {
            StackTraceElement stackTraceElementC = c(null, i);
            if (!stackTraceElementC.isNativeMethod() && !stackTraceElementC.getClassName().equals(Thread.class.getName()) && !stackTraceElementC.getClassName().equals(d3d.class.getName())) {
                StringBuilder sbA = zqm.a("(");
                sbA.append(stackTraceElementC.getFileName());
                sbA.append(":");
                sbA.append(stackTraceElementC.getLineNumber());
                sbA.append(")");
                return sbA.toString();
            }
        }
        return null;
    }

    public static StackTraceElement c(String str, int i) {
        return Thread.currentThread().getStackTrace()[i + 5];
    }

    public static int d(String str, String str2) {
        String strB = b();
        return Log.w(f0n.a("ONetSdk:", str), strB + "" + str2);
    }
}
