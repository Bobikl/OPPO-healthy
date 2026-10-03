package com.heytap.nearx.uikit.widget.keyboard.util;

import android.content.Context;
import android.util.Log;
import com.oplus.content.OplusFeatureConfigManager;

/* JADX INFO: loaded from: classes18.dex */
public class VibrateUtils {
    private static final String TAG = "VibrateUtils";

    public static boolean isLinearMotorVersion(Context context) {
        try {
            return OplusFeatureConfigManager.getInstance().hasFeature("oplus.software.vibrator_lmvibrator");
        } catch (Throwable th) {
            Log.e(TAG, "get isLinearMotorVersion failed. error = " + th.getMessage());
            return false;
        }
    }
}
