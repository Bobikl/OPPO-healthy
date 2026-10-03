package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public class ng {
    public static volatile SharedPreferences a;

    public static SharedPreferences a(Context context) {
        if (a == null) {
            synchronized (ng.class) {
                if (a == null && context != null) {
                    a = context.getApplicationContext().getSharedPreferences("ac_open_system_config_sp", 0);
                }
            }
        }
        return a;
    }

    public static int b(Context context) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            return sharedPreferencesA.getInt("key_system_config_version", 0);
        }
        return 0;
    }

    public static void c(Context context, int i) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putInt("key_system_config_version", i).apply();
        }
    }
}
