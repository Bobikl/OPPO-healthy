package com.heytap.wearable.support.watchface.common.utils;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.linearmotorvibrator.LinearmotorVibrator;
import android.os.linearmotorvibrator.WaveformEffect;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;

/* JADX INFO: loaded from: classes2.dex */
public class FrameWorkUtils {
    public static final int EFFECT_SYSTEM_FEEDBACK = 8;
    private static final String TAG = "FrameWorkUtils";

    public static void vibrate(Context context) {
        if (context == null) {
            SdkDebugLog.e(TAG, "vibrate context null, return");
            return;
        }
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 100, 50, 250}, -1));
    }

    public static void vibrateByLinearMotor(Context context, int i) {
        if (context == null) {
            SdkDebugLog.e(TAG, "vibrateByLinearMotor context null, return");
            return;
        }
        LinearmotorVibrator linearmotorVibrator = (LinearmotorVibrator) context.getSystemService("linearmotor");
        if (linearmotorVibrator == null || !linearmotorVibrator.hasLinearMotorVibrator()) {
            vibrate(context);
        } else {
            linearmotorVibrator.vibrate(new WaveformEffect.Builder().setEffectType(i).setEffectLoop(false).build());
        }
    }
}
