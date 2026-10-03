package com.heytap.store.platform.barcode.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.heytap.store.platform.barcode.Preferences;

/* JADX INFO: loaded from: classes6.dex */
public enum FrontLightMode {
    ON,
    AUTO,
    OFF;

    private static FrontLightMode parse(String str) {
        return str == null ? AUTO : valueOf(str);
    }

    public static void put(Context context, FrontLightMode frontLightMode) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(Preferences.KEY_FRONT_LIGHT_MODE, frontLightMode.toString()).commit();
    }

    public static FrontLightMode readPref(SharedPreferences sharedPreferences) {
        return parse(sharedPreferences.getString(Preferences.KEY_FRONT_LIGHT_MODE, AUTO.toString()));
    }
}
