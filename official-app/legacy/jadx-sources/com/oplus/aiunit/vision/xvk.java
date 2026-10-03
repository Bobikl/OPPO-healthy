package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.oplus.content.OplusFeatureConfigManager;
import com.oplus.os.LinearmotorVibrator;
import com.oplus.os.WaveformEffect;

/* JADX INFO: loaded from: classes18.dex */
public class xvk {
    public static final int STRENGTH_MAX_EDGE = 1200;
    public static final int STRENGTH_MAX_GRANULAR = 1600;
    public static final int STRENGTH_MAX_STEP = 2400;
    public static final int STRENGTH_MIN_EDGE = 800;
    public static final int STRENGTH_MIN_GRANULAR = 1200;
    public static final int STRENGTH_MIN_STEP = 200;
    public static final int TYPE_GRANULAR_SHORT_MODERATE = 1;
    public static final int TYPE_GRANULAR_SHORT_WEAK = 0;
    public static final int TYPE_GRANULAR_SHORT_WEAKEST = 0;
    public static final int TYPE_STEPABLE_EDGE = 154;
    public static final int TYPE_STEPABLE_REGULATE = 152;

    @SuppressLint({"WrongConstant"})
    public static LinearmotorVibrator a(Context context) {
        try {
            return (LinearmotorVibrator) context.getSystemService("linearmotor");
        } catch (Exception e2) {
            Log.e("VibrateUtils", "get linear motor vibrator failed. error = " + e2.getMessage());
            return null;
        }
    }

    public static int b(int i, int i2, int i3, int i4) {
        return Math.max(i3, Math.min((int) ((((((double) i) * 1.0d) / ((double) i2)) * ((double) (i4 - i3))) + ((double) i3)), i4));
    }

    public static boolean c(Context context) {
        try {
            return OplusFeatureConfigManager.getInstance().hasFeature("oplus.software.vibrator_lmvibrator");
        } catch (Throwable th) {
            Log.e("VibrateUtils", "get isLinearMotorVersion failed. error = " + th.getMessage());
            return false;
        }
    }

    public static void d(LinearmotorVibrator linearmotorVibrator, int i, int i2, int i3, int i4, int i5) {
        if (linearmotorVibrator == null) {
            return;
        }
        linearmotorVibrator.vibrate(new WaveformEffect.Builder().setStrengthSettingEnabled(false).setEffectStrength(b(i2, i3, i4, i5)).setEffectType(i).setAsynchronous(true).build());
    }
}
