package com.oplus.drs.base.util;

import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes6.dex */
public class SystemPropertiesCompat {
    public static String get(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ParserTag.TAG_GET, String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean getBoolean(String str, boolean z) {
        try {
            return ((Boolean) Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, str, Boolean.valueOf(z))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int getInt(String str, int i) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, str, Integer.valueOf(i))).intValue();
        } catch (Exception unused) {
            return i;
        }
    }

    public static String get(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }
}
