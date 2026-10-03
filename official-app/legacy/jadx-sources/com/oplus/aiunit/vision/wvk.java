package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.DynamicEffect;
import android.os.Handler;
import android.os.HapticPlayer;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import com.oplus.content.OplusFeatureConfigManager;
import com.oplus.os.LinearmotorVibrator;
import com.oplus.os.WaveformEffect;

/* JADX INFO: loaded from: classes13.dex */
public class wvk {
    public static final int MIN_VIBRATOR_TIME = 25;
    public static final int STRENGTH_MAX_EDGE = 1200;
    public static final int STRENGTH_MAX_GRANULAR = 1600;
    public static final int STRENGTH_MAX_STEP = 2000;
    public static final int STRENGTH_MIN_EDGE = 800;
    public static final int STRENGTH_MIN_GRANULAR = 1200;
    public static final int STRENGTH_MIN_STEP = 200;
    public static final int STRENGTH_OFFSET = 400;
    public static final int TYPE_GRANULAR_SHORT_MODERATE = 1;
    public static final int TYPE_GRANULAR_SHORT_WEAK = 1;
    public static final int TYPE_GRANULAR_SHORT_WEAKEST = 0;
    public static final int TYPE_STEPABLE_EDGE = 154;
    public static final int TYPE_STEPABLE_REGULATE = 152;
    public static final int VIBRATE_CRISP_LEVEL_CRISP = 0;
    public static final int VIBRATE_CRISP_MAX_FREQUENCY = 90;
    public static final int VIBRATE_CRISP_MAX_INTENSITY = 100;
    public static final int VIBRATE_CRISP_MIN_FREQUENCY = 75;
    public static final int VIBRATE_CRISP_MIN_INTENSITY = 50;
    public static final int VIBRATE_SOFT_LEVEL_CRISP = 1;
    public static final int VIBRATE_SOFT_MAX_FREQUENCY = 55;
    public static final int VIBRATE_SOFT_MAX_INTENSITY = 68;
    public static final int VIBRATE_SOFT_MIN_FREQUENCY = 48;
    public static final int VIBRATE_SOFT_MIN_INTENSITY = 52;
    public static boolean a = false;
    public static Context b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f18416c = -1;
    public static final ContentObserver d = new a(null);

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            boolean unused = wvk.a = Settings.System.getInt(wvk.b.getContentResolver(), "haptic_feedback_enabled", 0) == 1;
        }
    }

    public static boolean c() {
        if (f18416c == -1) {
            f18416c = SystemClock.elapsedRealtime();
            return false;
        }
        if (SystemClock.elapsedRealtime() - f18416c < 25) {
            return true;
        }
        f18416c = SystemClock.elapsedRealtime();
        return false;
    }

    public static DynamicEffect d(int i, int i2) {
        return DynamicEffect.create("{\n    \"Metadata\": {\n        \"Version\": 2,\n        \"Created\": \"2023-05-12\",\n        \"Description\": \"Exported from RichTap Creator Pro\"\n    },\n    \"PatternList\": [\n        {\n            \"AbsoluteTime\": 0,\n            \"Pattern\": [\n                {\n                    \"Event\": {\n                        \"Type\": \"transient\",\n                        \"RelativeTime\": 0,\n                        \"Parameters\": {\n                            \"Intensity\": " + i2 + ",\n                            \"Frequency\": " + i + "\n                        },\n                        \"Index\": 0\n                    }\n                }\n            ]\n        }\n    ]\n}");
    }

    @SuppressLint({"WrongConstant"})
    public static LinearmotorVibrator e(Context context) {
        try {
            if (OplusFeatureConfigManager.getInstance().hasFeature("oplus.software.vibrator_luxunvibrator")) {
                return (LinearmotorVibrator) context.getSystemService("linearmotor");
            }
            return null;
        } catch (Exception e2) {
            Log.e("VibrateUtils", "get linear motor vibrator failed. error = " + e2.getMessage());
            return null;
        }
    }

    public static int f(int i, int i2, int i3, int i4) {
        int i5 = (int) ((((((double) i) * 1.0d) / ((double) i2)) * ((double) (i4 - i3))) + ((double) i3));
        return i3 < i4 ? Math.max(i3, Math.min(i5, i4)) : Math.max(i4, Math.min(i5, i3));
    }

    public static int g(int i, int i2, int i3, int i4) {
        int i5 = (int) ((((((double) i) * 1.0d) / ((double) i2)) * ((double) (i4 - i3))) + ((double) i3));
        return i3 < i4 ? Math.max(i3, Math.min(i5, i4)) : Math.max(i4, Math.min(i5, i3));
    }

    public static boolean h(Context context) {
        try {
            return OplusFeatureConfigManager.getInstance().hasFeature("oplus.software.vibrator_lmvibrator");
        } catch (Throwable th) {
            Log.e("VibrateUtils", "get isLinearMotorVersion failed. error = " + th.getMessage());
            return false;
        }
    }

    public static void i(Context context) {
        if (b != null || context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        b = applicationContext;
        ContentResolver contentResolver = applicationContext.getContentResolver();
        a = Settings.System.getInt(contentResolver, "haptic_feedback_enabled", 0) == 1;
        contentResolver.registerContentObserver(Settings.System.getUriFor("haptic_feedback_enabled"), false, d);
    }

    public static void j(LinearmotorVibrator linearmotorVibrator, int i, int i2, int i3, int i4, int i5) {
        if (linearmotorVibrator == null || !a) {
            return;
        }
        int iF = f(i2, i3, i4, i5);
        if (i == 0) {
            iF += 400;
        }
        linearmotorVibrator.vibrate(new WaveformEffect.Builder().setStrengthSettingEnabled(false).setEffectStrength(iF).setEffectType(i).setAsynchronous(true).build());
    }

    public static void k(LinearmotorVibrator linearmotorVibrator, int i, int i2, int i3, int i4, int i5, int i6, float f) {
        if (linearmotorVibrator == null || !a || c()) {
            return;
        }
        try {
            DynamicEffect dynamicEffectD = d(g(i2, i3, i6 == 0 ? 75 : 48, i6 == 0 ? 90 : 55), Math.round(g(i2, i3, i6 == 0 ? 50 : 52, i6 == 0 ? 100 : 68) * f));
            if (dynamicEffectD != null) {
                HapticPlayer hapticPlayer = new HapticPlayer(dynamicEffectD);
                if (HapticPlayer.isAvailable()) {
                    hapticPlayer.start(1);
                    return;
                }
            }
        } catch (Exception e2) {
            Log.e("VibrateUtils", "get haptic player failed. error = " + e2.getMessage());
        }
        j(linearmotorVibrator, i, i2, i3, i4, i5);
    }

    public static void l() {
        Context context = b;
        if (context != null) {
            context.getContentResolver().unregisterContentObserver(d);
            b = null;
        }
    }
}
