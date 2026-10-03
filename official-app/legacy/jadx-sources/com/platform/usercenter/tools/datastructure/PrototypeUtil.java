package com.platform.usercenter.tools.datastructure;

/* JADX INFO: loaded from: classes9.dex */
public final class PrototypeUtil {
    private PrototypeUtil() {
    }

    public static boolean getBoolean(String str) {
        return getInt(str) != 0;
    }

    public static double getDouble(String str) {
        if (str == null) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str.trim());
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    public static float getFloat(String str) {
        if (str == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str.trim());
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public static int getInt(int i, String str, int i2) {
        if (str == null) {
            return i2;
        }
        try {
            return (int) Long.parseLong(str.trim(), i);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static long getLong(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str.trim());
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static float value(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        return f;
    }

    public static int getInt(int i, String str) {
        return getInt(i, str, 0);
    }

    public static int value(boolean z) {
        return z ? 1 : 0;
    }

    public static int getInt(String str, int i) {
        return getInt(10, str, i);
    }

    public static long value(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return j2;
    }

    public static int getInt(String str) {
        return getInt(10, str);
    }
}
