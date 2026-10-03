package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes14.dex */
public class y3i {

    @NonNull
    public final SharedPreferences a;

    public y3i(@NonNull Context context, @NonNull String str) {
        this.a = context.getApplicationContext().getSharedPreferences(str, 0);
    }

    public void a(String str, int i) {
        h(str, i).apply();
    }

    public void b(String str, String str2) {
        i(str, str2).apply();
    }

    public boolean c(String str) {
        return this.a.contains(str);
    }

    public SharedPreferences.Editor d() {
        return this.a.edit();
    }

    public int e(String str, int i) {
        return this.a.getInt(str, i);
    }

    public String f(String str) {
        return g(str, "");
    }

    public String g(String str, String str2) {
        return this.a.getString(str, str2);
    }

    public SharedPreferences.Editor h(String str, int i) {
        return d().putInt(str, i);
    }

    public SharedPreferences.Editor i(String str, String str2) {
        return d().putString(str, str2);
    }

    public y3i(@NonNull Context context) {
        this.a = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
    }
}
