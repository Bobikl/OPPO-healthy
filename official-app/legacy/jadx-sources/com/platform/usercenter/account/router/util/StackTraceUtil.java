package com.platform.usercenter.account.router.util;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class StackTraceUtil {
    private static final int STACK_MAX_INT = 10;

    public static String getStackTraceString() {
        return getStackTraceString(10);
    }

    public static String getStackTraceString(int i) {
        StackTraceElement[] stackTraceElementArr;
        StringBuilder sb = new StringBuilder();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces != null && (stackTraceElementArr = allStackTraces.get(Thread.currentThread())) != null) {
            if (stackTraceElementArr.length > i) {
                i = stackTraceElementArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i2];
                if (stackTraceElement != null && stackTraceElement.toString() != null) {
                    sb.append(stackTraceElement);
                }
            }
        }
        return sb.toString();
    }
}
