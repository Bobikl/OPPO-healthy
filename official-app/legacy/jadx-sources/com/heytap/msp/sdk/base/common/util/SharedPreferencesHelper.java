package com.heytap.msp.sdk.base.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.heytap.msp.sdk.base.common.log.MspLog;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class SharedPreferencesHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "SharedPreferencesHelper";
    private SharedPreferences.Editor mEditor = null;
    private SharedPreferences mSharedPreferences;

    public SharedPreferencesHelper(Context context, String str, int i) {
        this.mSharedPreferences = context.getApplicationContext().getSharedPreferences(str, i);
    }

    public void apply() {
        SharedPreferences.Editor editor = this.mEditor;
        if (editor != null) {
            editor.apply();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public void commit() {
        SharedPreferences.Editor editor = this.mEditor;
        if (editor != null) {
            editor.commit();
        }
    }

    public Map<String, Object> getAll() {
        try {
            return this.mSharedPreferences.getAll();
        } catch (Exception e2) {
            MspLog.e(TAG, e2.getMessage());
            return null;
        }
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return this.mSharedPreferences.getStringSet(str, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getValue(String str, T t) {
        Object stringSet;
        if (t instanceof Boolean) {
            stringSet = Boolean.valueOf(this.mSharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()));
        } else if (t instanceof Float) {
            stringSet = Float.valueOf(this.mSharedPreferences.getFloat(str, ((Float) t).floatValue()));
        } else if (t instanceof Integer) {
            stringSet = Integer.valueOf(this.mSharedPreferences.getInt(str, ((Integer) t).intValue()));
        } else if (t instanceof Long) {
            stringSet = Long.valueOf(this.mSharedPreferences.getLong(str, ((Long) t).longValue()));
        } else {
            stringSet = t instanceof Set ? this.mSharedPreferences.getStringSet(str, (Set) t) : this.mSharedPreferences.getString(str, (String) t);
        }
        return stringSet == null ? t : (T) stringSet;
    }

    @SuppressLint({"CommitPrefEdits"})
    public SharedPreferencesHelper putValue(String str, Object obj) {
        if (this.mEditor == null) {
            this.mEditor = this.mSharedPreferences.edit();
        }
        if (obj instanceof Boolean) {
            this.mEditor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.mEditor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            this.mEditor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            this.mEditor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Set) {
            this.mEditor.putStringSet(str, (Set) obj);
        } else {
            this.mEditor.putString(str, (String) obj);
        }
        return this;
    }

    @SuppressLint({"CommitPrefEdits"})
    public SharedPreferencesHelper putValues(String str, Set<String> set) {
        if (this.mEditor == null) {
            this.mEditor = this.mSharedPreferences.edit();
        }
        this.mEditor.putStringSet(str, set);
        return this;
    }

    @SuppressLint({"CommitPrefEdits"})
    public SharedPreferencesHelper removeValue(String str) {
        if (this.mEditor == null) {
            this.mEditor = this.mSharedPreferences.edit();
        }
        this.mEditor.remove(str);
        return this;
    }
}
