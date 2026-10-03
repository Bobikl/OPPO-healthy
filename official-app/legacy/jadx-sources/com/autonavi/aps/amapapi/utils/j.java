package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.oplus.aiunit.vision.ykm;

/* JADX INFO: loaded from: classes13.dex */
public final class j {
    public static SharedPreferences.Editor a(Context context, String str) {
        return context.getSharedPreferences(str, 0).edit();
    }

    public static void a(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        editor.apply();
    }

    public static void a(SharedPreferences.Editor editor, String str) {
        try {
            editor.remove(str);
        } catch (Throwable th) {
            c.a(th, "SpUtil", "setPrefsLong");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, long j2) {
        try {
            editor.putLong(str, j2);
        } catch (Throwable th) {
            c.a(th, "SpUtil", "setPrefsLong");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, boolean z) {
        try {
            editor.putBoolean(str, z);
        } catch (Throwable th) {
            c.a(th, "SpUtil", "updatePrefsBoolean");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, String str2) {
        try {
            editor.putString(str, str2);
        } catch (Throwable th) {
            c.a(th, "SpUtil", "setPrefsStr");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, int i) {
        try {
            editor.putInt(str, i);
        } catch (Throwable th) {
            c.a(th, "SpUtil", "setPrefsInt");
        }
    }

    public static long a(Context context, String str, String str2, long j2) {
        try {
            return context.getSharedPreferences(str, 0).getLong(str2, j2);
        } catch (Throwable th) {
            c.a(th, "SpUtil", "getPrefsLong");
            return j2;
        }
    }

    public static int a(Context context, String str, String str2, int i) {
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (Throwable th) {
            c.a(th, "SpUtil", "getPrefsInt");
            return i;
        }
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, z);
        } catch (Throwable th) {
            c.a(th, "SpUtil", "getPrefsBoolean");
            return z;
        }
    }

    public static String a(Context context, String str, String str2, String str3) {
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable th) {
            c.a(th, "SpUtil", "getPrefsInt");
            return str3;
        }
    }

    public static String a(Context context) {
        return context == null ? ykm.a : a(context, "pref", "smac", ykm.a);
    }
}
