package com.omron;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ep {
    private static boolean a = false;
    private static final String b = "y.a";

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.Debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.Info.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.Warn.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.Error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        Verbose,
        Debug,
        Info,
        Warn,
        Error
    }

    public static String a(int i) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[i];
        String className = stackTraceElement.getClassName();
        return className.substring(className.lastIndexOf(46) + 1) + "#" + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
    }

    public static void a(String str, b bVar, boolean z, String str2) {
        String str3;
        if (a) {
            if (z) {
                str3 = "[" + Thread.currentThread().getName() + "-Thread]";
            } else {
                str3 = "";
            }
            if (str == null) {
                str = b;
            }
            if (bVar == null) {
                bVar = b.Error;
            }
            String str4 = str3 + str2;
            int i = a.a[bVar.ordinal()];
            if (i == 1) {
                Log.d(str, str4);
                return;
            }
            if (i == 2) {
                Log.i(str, str4);
                return;
            }
            if (i == 3) {
                Log.w(str, str4);
            } else if (i != 4) {
                Log.v(str, str4);
            } else {
                Log.e(str, str4);
            }
        }
    }
}
