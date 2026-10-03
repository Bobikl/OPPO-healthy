package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class ppa implements ur9 {
    public final SharedPreferences a;

    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    public ppa(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (str != null) {
            try {
                str = str.length() == 0 ? "drs_default_sp" : str;
                sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0);
            } catch (Throwable unused) {
                sharedPreferences = null;
            }
        } else {
            sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0);
        }
        this.a = sharedPreferences;
    }

    @Override // com.oplus.aiunit.vision.ur9
    public boolean contains(String str) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return false;
        }
        try {
            return sharedPreferences.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.ur9
    public boolean getBoolean(String str, boolean z) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return z;
        }
        try {
            return sharedPreferences.getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    @Override // com.oplus.aiunit.vision.ur9
    public int getInt(String str, int i) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return i;
        }
        try {
            return sharedPreferences.getInt(str, i);
        } catch (Throwable unused) {
            return i;
        }
    }

    @Override // com.oplus.aiunit.vision.ur9
    public long getLong(String str, long j2) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return j2;
        }
        try {
            return sharedPreferences.getLong(str, j2);
        } catch (Throwable unused) {
            return j2;
        }
    }

    @Override // com.oplus.aiunit.vision.ur9
    public String getString(String str, String str2) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return str2;
        }
        try {
            return sharedPreferences.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    @Override // com.oplus.aiunit.vision.ur9
    public String[] keys() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return new String[0];
        }
        try {
            return (String[]) sharedPreferences.getAll().keySet().toArray(new String[0]);
        } catch (Throwable unused) {
            return new String[0];
        }
    }

    @Override // com.oplus.aiunit.vision.ur9
    public void putBoolean(String str, boolean z) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        try {
            sharedPreferences.edit().putBoolean(str, z).apply();
        } catch (Throwable unused) {
        }
    }

    @Override // com.oplus.aiunit.vision.ur9
    public void putInt(String str, int i) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        try {
            sharedPreferences.edit().putInt(str, i).apply();
        } catch (Throwable unused) {
        }
    }

    @Override // com.oplus.aiunit.vision.ur9
    public void putLong(String str, long j2) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        try {
            sharedPreferences.edit().putLong(str, j2).apply();
        } catch (Throwable unused) {
        }
    }

    @Override // com.oplus.aiunit.vision.ur9
    public void putString(String str, String str2) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        try {
            sharedPreferences.edit().putString(str, str2).apply();
        } catch (Throwable unused) {
        }
    }

    @Override // com.oplus.aiunit.vision.ur9
    public void remove(String str) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        try {
            sharedPreferences.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
