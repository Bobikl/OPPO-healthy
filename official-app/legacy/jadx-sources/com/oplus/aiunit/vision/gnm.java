package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes12.dex */
public class gnm {
    public static void a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("EnvCheck_");
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        if (stackTraceElement == null) {
            str2 = "EnvCheck";
        } else {
            String className = stackTraceElement.getClassName();
            str2 = String.format("%s.%s(Line:%d)", className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
        }
        sb.append(str2);
        Log.e(sb.toString(), str);
    }
}
