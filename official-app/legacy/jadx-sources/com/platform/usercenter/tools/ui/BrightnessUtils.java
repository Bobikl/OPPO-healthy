package com.platform.usercenter.tools.ui;

import android.content.ContentResolver;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.platform.usercenter.tools.UCBasicUtils;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public final class BrightnessUtils {
    private static final String TAG = "BrightnessUtils";

    private BrightnessUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int getBrightness() {
        try {
            return Settings.System.getInt(UCBasicUtils.sContext.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e2) {
            UCLogUtil.e(TAG, e2);
            return 0;
        }
    }

    public static int getWindowBrightness(Window window) {
        float f = window.getAttributes().screenBrightness;
        return f < 0.0f ? getBrightness() : (int) (f * 255.0f);
    }

    public static boolean isAutoBrightnessEnabled() {
        try {
            return Settings.System.getInt(UCBasicUtils.sContext.getContentResolver(), "screen_brightness_mode") == 1;
        } catch (Settings.SettingNotFoundException e2) {
            UCLogUtil.e(TAG, e2);
            return false;
        }
    }

    public static boolean setAutoBrightnessEnabled(boolean z) {
        return Settings.System.putInt(UCBasicUtils.sContext.getContentResolver(), "screen_brightness_mode", z ? 1 : 0);
    }

    public static boolean setBrightness(@IntRange(from = 0, to = 255) int i) {
        ContentResolver contentResolver = UCBasicUtils.sContext.getContentResolver();
        boolean zPutInt = Settings.System.putInt(contentResolver, "screen_brightness", i);
        contentResolver.notifyChange(Settings.System.getUriFor("screen_brightness"), null);
        return zPutInt;
    }

    public static void setWindowBrightness(@NonNull Window window, @IntRange(from = 0, to = 255) int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = i / 255.0f;
        window.setAttributes(attributes);
    }
}
