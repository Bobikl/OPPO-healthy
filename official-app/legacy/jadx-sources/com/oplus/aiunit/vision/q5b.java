package com.oplus.aiunit.vision;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes15.dex */
public class q5b {
    public static final String TAG = "LocationServiceHelper";

    public static boolean a(Context context) {
        boolean z = false;
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                z = true;
            }
        } catch (Settings.SettingNotFoundException e2) {
            a7b.b(TAG, "[isLocationEnabled] --> " + e2.getMessage());
        }
        a7b.f(TAG, "[isLocationEnabled] --> locationEnable=" + z);
        return z;
    }
}
