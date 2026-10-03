package com.heytap.mspsdk.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class f {
    public SharedPreferences a;
    public SharedPreferences.Editor b = null;

    public f(Context context, String str, int i) {
        this.a = context.getApplicationContext().getSharedPreferences(str, i);
    }

    public void a() {
        SharedPreferences.Editor editor = this.b;
        if (editor != null) {
            editor.apply();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T b(String str, T t) {
        Object stringSet;
        if (t instanceof Boolean) {
            stringSet = Boolean.valueOf(this.a.getBoolean(str, ((Boolean) t).booleanValue()));
        } else if (t instanceof Float) {
            stringSet = Float.valueOf(this.a.getFloat(str, ((Float) t).floatValue()));
        } else if (t instanceof Integer) {
            stringSet = Integer.valueOf(this.a.getInt(str, ((Integer) t).intValue()));
        } else if (t instanceof Long) {
            stringSet = Long.valueOf(this.a.getLong(str, ((Long) t).longValue()));
        } else {
            stringSet = t instanceof Set ? this.a.getStringSet(str, (Set) t) : this.a.getString(str, (String) t);
        }
        return stringSet == null ? t : (T) stringSet;
    }

    @SuppressLint({"CommitPrefEdits"})
    public f c(String str, Object obj) {
        if (this.b == null) {
            this.b = this.a.edit();
        }
        if (obj instanceof Boolean) {
            this.b.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.b.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            this.b.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            this.b.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Set) {
            this.b.putStringSet(str, (Set) obj);
        } else {
            this.b.putString(str, (String) obj);
        }
        return this;
    }

    @SuppressLint({"CommitPrefEdits"})
    public f d(String str) {
        if (this.b == null) {
            this.b = this.a.edit();
        }
        this.b.remove(str);
        return this;
    }
}
