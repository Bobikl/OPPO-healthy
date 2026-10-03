package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class v6b {
    public static boolean a = false;

    public static void a(String str) {
        if (a) {
            if (str.length() < 1024) {
                Log.d("EnvCheck", str);
                return;
            }
            while (str.length() > 1024) {
                String strSubstring = str.substring(0, 1024);
                str = str.replace(strSubstring, "");
                Log.d("EnvCheck", strSubstring);
            }
            Log.d("EnvCheck", str);
        }
    }

    public static void b(String str) {
        Log.e("EnvCheck_" + c(), str);
    }

    public static String c() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        if (stackTraceElement == null) {
            return "EnvCheck";
        }
        String className = stackTraceElement.getClassName();
        return String.format("%s.%s(Line:%d)", className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
    }
}
