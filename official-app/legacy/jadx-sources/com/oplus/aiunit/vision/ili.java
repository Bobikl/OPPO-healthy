package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class ili {
    public static final int START_STACK_INDEX = 3;

    public static void a(String str) {
        b(str, "Dangerous Method invoke stack info as follow:", 3, new Throwable().getStackTrace());
    }

    public static void b(String str, String str2, int i, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return;
        }
        h9f.a(str, str2);
        while (i < stackTraceElementArr.length) {
            h9f.a(str, "at " + stackTraceElementArr[i]);
            i++;
        }
    }
}
