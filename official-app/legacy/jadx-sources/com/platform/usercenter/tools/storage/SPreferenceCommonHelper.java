package com.platform.usercenter.tools.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class SPreferenceCommonHelper {
    public static boolean getBoolean(Context context, String str) {
        return getBoolean(context, str, false);
    }

    public static int getInt(Context context, String str) {
        return getInt(context, str, 0);
    }

    public static long getLong(Context context, String str) {
        return getLong(context, str, 0L);
    }

    public static SharedPreferences getSharedPreference(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static String getString(Context context, String str) {
        return getString(context, str, "");
    }

    public static HashSet<String> getStringSet(Context context, String str, Set<String> set) {
        return (HashSet) getSharedPreference(context).getStringSet(str, set);
    }

    public static void setBoolean(Context context, String str, boolean z) {
        getSharedPreference(context).edit().putBoolean(str, z).apply();
    }

    public static void setInt(Context context, String str, int i) {
        getSharedPreference(context).edit().putInt(str, i).apply();
    }

    public static void setLong(Context context, String str, long j2) {
        getSharedPreference(context).edit().putLong(str, j2).apply();
    }

    public static void setString(Context context, String str, String str2) {
        getSharedPreference(context).edit().putString(str, str2).apply();
    }

    public static void setStringSet(Context context, String str, Set<String> set) {
        getSharedPreference(context).edit().putStringSet(str, set).apply();
    }

    public static boolean getBoolean(Context context, String str, boolean z) {
        return getSharedPreference(context).getBoolean(str, z);
    }

    public static int getInt(Context context, String str, int i) {
        return getSharedPreference(context).getInt(str, i);
    }

    public static long getLong(Context context, String str, long j2) {
        return getSharedPreference(context).getLong(str, j2);
    }

    public static String getString(Context context, String str, String str2) {
        return getSharedPreference(context).getString(str, str2);
    }
}
