package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes5.dex */
public class nre {
    public static final String KEY_NEED_CONVERT_DB = "key_convert_db";

    public static Object a(Context context, String str, Object obj) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("wearable_service", 0);
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return null;
    }

    public static void b(Context context, String str, Object obj) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("wearable_service", 0).edit();
        if (obj instanceof String) {
            editorEdit.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            editorEdit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        }
        editorEdit.apply();
    }

    public static void c(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("wearable_service", 0).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }
}
