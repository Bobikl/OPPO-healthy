package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class sre {
    public static final String APP_SHARD = "step_share_prefs";
    public static final String CLEAN_STEP = "clean_step";
    public static final String CURR_STEP = "curr_step";
    public static final String LAST_SENSOR_STEP = "last_sensor_time";
    public static final String STEP_OFFSET = "step_offset";
    public static final String STEP_TODAY = "step_today";

    public static boolean a(Context context) {
        a7b.f("PreferencesHelper", "getCleanStep");
        return d(context).getBoolean(CLEAN_STEP, true);
    }

    public static float b(Context context) {
        return d(context).getFloat(CURR_STEP, 0.0f);
    }

    public static float c(Context context) {
        return d(context).getFloat(LAST_SENSOR_STEP, 0.0f);
    }

    public static SharedPreferences d(Context context) {
        return context.getSharedPreferences(APP_SHARD, 0);
    }

    public static float e(Context context) {
        a7b.f("PreferencesHelper", "getStepOffset");
        return d(context).getFloat(STEP_OFFSET, 0.0f);
    }

    public static String f(Context context) {
        a7b.f("PreferencesHelper", "getStepToday");
        return d(context).getString(STEP_TODAY, "");
    }

    public static void g(Context context, boolean z) {
        a7b.f("PreferencesHelper", "setCleanStep");
        d(context).edit().putBoolean(CLEAN_STEP, z).apply();
    }

    public static void h(Context context, float f) {
        d(context).edit().putFloat(CURR_STEP, f).apply();
    }

    public static void i(Context context, float f) {
        d(context).edit().putFloat(LAST_SENSOR_STEP, f).apply();
    }

    public static void j(Context context, float f) {
        a7b.f("PreferencesHelper", "setStepOffset");
        d(context).edit().putFloat(STEP_OFFSET, f).apply();
    }

    public static void k(Context context, String str) {
        a7b.f("PreferencesHelper", "setStepToday");
        d(context).edit().putString(STEP_TODAY, str).apply();
    }
}
