package com.oplus.drs.base.util;

import android.util.Log;
import com.oplus.aiunit.vision.z6b;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes6.dex */
public class SystemProperty {
    private static final String TAG = "SystemProperty";
    private static Class<?> sClassSystemProperties = findClass("android.os.SystemProperties");

    private SystemProperty() {
    }

    private static Class<?> findClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            z6b.o(TAG, e2.getMessage() != null ? e2.getMessage() : "findClassError");
            return null;
        }
    }

    public static String get(String str) {
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return null;
        }
        try {
            return (String) cls.getMethod(ParserTag.TAG_GET, String.class).invoke(null, str);
        } catch (Throwable th) {
            Log.e(TAG, th.getMessage() != null ? th.getMessage() : "getError");
            return null;
        }
    }

    public static boolean getBoolean(String str, boolean z) {
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return false;
        }
        try {
            return ((Boolean) cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, str, Boolean.valueOf(z))).booleanValue();
        } catch (Throwable th) {
            z6b.o(TAG, th.getMessage() != null ? th.getMessage() : "getBooleanError");
            return false;
        }
    }

    public static int getInt(String str, int i) {
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return i;
        }
        try {
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(null, str, Integer.valueOf(i))).intValue();
        } catch (Throwable th) {
            z6b.o(TAG, th.getMessage() != null ? th.getMessage() : "getIntError");
            return i;
        }
    }

    public static long getLong(String str, long j2) {
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return j2;
        }
        try {
            return ((Long) cls.getMethod("getLong", String.class, Long.TYPE).invoke(null, str, Long.valueOf(j2))).longValue();
        } catch (Throwable th) {
            z6b.o(TAG, th.getMessage() != null ? th.getMessage() : "getLongError");
            return j2;
        }
    }

    public static void set(String str, String str2) {
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return;
        }
        try {
            cls.getMethod("set", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            z6b.o(TAG, th.getMessage() != null ? th.getMessage() : "setError");
        }
    }

    public static String get(String str, String str2) {
        Class<?> cls = sClassSystemProperties;
        if (cls == null) {
            return str2;
        }
        try {
            return (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            Log.e(TAG, th.getMessage() != null ? th.getMessage() : "getError");
            return str2;
        }
    }
}
