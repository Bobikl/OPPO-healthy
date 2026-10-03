package com.platform.usercenter.tools.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.platform.usercenter.tools.UCBasicUtils;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public final class ScreenUtils {
    private static final String TAG = "ScreenUtils";

    private ScreenUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static float getScreenDensity() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static int getScreenDensityDpi() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public static int getScreenRotation(@NonNull Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public static int getSleepDuration() {
        try {
            return Settings.System.getInt(UCBasicUtils.sContext.getApplicationContext().getContentResolver(), "screen_off_timeout");
        } catch (Settings.SettingNotFoundException e2) {
            UCLogUtil.e(TAG, e2);
            return -123;
        }
    }

    public static boolean isFullScreen(@NonNull Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 1024;
    }

    public static boolean isLandscape() {
        return UCBasicUtils.sContext.getApplicationContext().getResources().getConfiguration().orientation == 2;
    }

    public static boolean isPortrait() {
        return UCBasicUtils.sContext.getApplicationContext().getResources().getConfiguration().orientation == 1;
    }

    public static boolean isScreenLock() {
        KeyguardManager keyguardManager = (KeyguardManager) UCBasicUtils.sContext.getApplicationContext().getSystemService("keyguard");
        if (keyguardManager == null) {
            return false;
        }
        return keyguardManager.inKeyguardRestrictedInputMode();
    }

    public static Bitmap screenShot(@NonNull Activity activity) {
        return screenShot(activity, false);
    }

    public static void setAllowScreenShot(@NonNull Activity activity) {
        activity.getWindow().clearFlags(8192);
    }

    public static void setDisableScreenShot(@NonNull Activity activity) {
        activity.getWindow().addFlags(8192);
    }

    public static void setFullScreen(@NonNull Activity activity) {
        activity.getWindow().addFlags(1024);
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public static void setLandscape(@NonNull Activity activity) {
        activity.setRequestedOrientation(0);
    }

    public static void setNonFullScreen(@NonNull Activity activity) {
        activity.getWindow().clearFlags(1024);
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public static void setPortrait(@NonNull Activity activity) {
        activity.setRequestedOrientation(1);
    }

    @RequiresPermission("android.permission.WRITE_SETTINGS")
    public static void setSleepDuration(int i) {
        Settings.System.putInt(UCBasicUtils.sContext.getApplicationContext().getContentResolver(), "screen_off_timeout", i);
    }

    public static void toggleFullScreen(@NonNull Activity activity) {
        boolean zIsFullScreen = isFullScreen(activity);
        Window window = activity.getWindow();
        if (zIsFullScreen) {
            window.clearFlags(1024);
        } else {
            window.addFlags(1024);
        }
    }

    public static Bitmap screenShot(@NonNull Activity activity, boolean z) {
        Bitmap bitmapCreateBitmap;
        View decorView = activity.getWindow().getDecorView();
        boolean zIsDrawingCacheEnabled = decorView.isDrawingCacheEnabled();
        boolean zWillNotCacheDrawing = decorView.willNotCacheDrawing();
        decorView.setDrawingCacheEnabled(true);
        decorView.setWillNotCacheDrawing(false);
        Bitmap drawingCache = decorView.getDrawingCache();
        if (drawingCache == null) {
            decorView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            decorView.layout(0, 0, decorView.getMeasuredWidth(), decorView.getMeasuredHeight());
            decorView.buildDrawingCache();
            drawingCache = Bitmap.createBitmap(decorView.getDrawingCache());
        }
        if (drawingCache == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (z) {
            Resources resources = activity.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android"));
            bitmapCreateBitmap = Bitmap.createBitmap(drawingCache, 0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels - dimensionPixelSize);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawingCache, 0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        decorView.destroyDrawingCache();
        decorView.setWillNotCacheDrawing(zWillNotCacheDrawing);
        decorView.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
        return bitmapCreateBitmap;
    }
}
