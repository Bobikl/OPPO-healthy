package com.oplus.aiunit.vision;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class x3i {
    public static final String FILE_NAME = "jshare_data";

    public static Object a(String str, Object obj) {
        SharedPreferences sharedPreferences = rg7.h().getSharedPreferences(FILE_NAME, 0);
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
        return obj instanceof Long ? Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue())) : obj;
    }

    public static void b(String str, Object obj) {
        SharedPreferences.Editor editorEdit = rg7.h().getSharedPreferences(FILE_NAME, 0).edit();
        if (obj instanceof String) {
            editorEdit.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            editorEdit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        } else {
            editorEdit.putString(str, obj.toString());
        }
        editorEdit.apply();
    }
}
