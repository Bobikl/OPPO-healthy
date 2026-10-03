package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes10.dex */
public final class exm {
    @JvmStatic
    public static final void a(@Nullable Context context, @Nullable String str) {
        SharedPreferences sharedPreferencesC;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        if (str == null || (sharedPreferencesC = c(context)) == null || (editorEdit = sharedPreferencesC.edit()) == null || (editorRemove = editorEdit.remove(str)) == null) {
            return;
        }
        editorRemove.apply();
    }

    @JvmStatic
    public static final boolean b(@Nullable Context context, @Nullable String str, boolean z) {
        SharedPreferences sharedPreferencesC;
        return (context == null || str == null || (sharedPreferencesC = c(context)) == null) ? z : sharedPreferencesC.getBoolean(str, z);
    }

    @JvmStatic
    public static final SharedPreferences c(Context context) {
        if (context != null) {
            return context.getSharedPreferences("feedback_sp", 0);
        }
        return null;
    }

    @JvmStatic
    public static final void d(@Nullable Context context, @Nullable String str, boolean z) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences sharedPreferencesC = c(context);
        if (sharedPreferencesC == null || (editorEdit = sharedPreferencesC.edit()) == null || (editorPutBoolean = editorEdit.putBoolean(str, z)) == null) {
            return;
        }
        editorPutBoolean.apply();
    }
}
