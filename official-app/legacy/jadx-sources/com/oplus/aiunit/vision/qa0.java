package com.oplus.aiunit.vision;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.oplus.content.OplusFeatureConfigManager;

/* JADX INFO: loaded from: classes13.dex */
public class qa0 {
    public static final float DENSITY_160F = 160.0f;
    public static final float DENSITY_360F = 360.0f;

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return OplusFeatureConfigManager.getInstance().hasFeature("oplus.hardware.type.fold");
        } catch (Error | Exception e2) {
            Log.d("AppFeatureUtil", "Load feature_fold failed : " + e2.getMessage());
            return false;
        }
    }

    public static boolean b(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "oplus_system_folding_mode", 0) == 0;
    }

    public static boolean c(Context context) {
        return a(context) && b(context);
    }
}
