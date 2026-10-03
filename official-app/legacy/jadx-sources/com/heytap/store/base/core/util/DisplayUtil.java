package com.heytap.store.base.core.util;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.NonNull;
import com.heytap.store.base.core.ativitylifecycle.ActivityCollectionManager;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class DisplayUtil {
    private static final int DEFAULT_SCREEN_WIDTH = 1080;
    private static int FULL_SCREEN_HEIGHT = 0;
    private static int FULL_SCREEN_WIDTH = 0;
    public static int OVER_VIEW_LEVEL = 0;
    private static final String TAG = "DisplayUtil";
    private static float sNoncompatDensity;
    private static float sNoncompatScaledDensity;
    public static int statusAndActionbarHeight;

    static {
        ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
        statusAndActionbarHeight = dip2px(contextGetterUtils.getApp(), 48.0f) + getStatusBarHeight(contextGetterUtils.getApp());
        OVER_VIEW_LEVEL = getFullScreenHeight() * getFullScreenWidth() * 3;
        FULL_SCREEN_HEIGHT = 0;
        FULL_SCREEN_WIDTH = 0;
    }

    private DisplayUtil() {
    }

    public static int dip2px(float f) {
        return dip2px(ContextGetterUtils.INSTANCE.getApp(), f);
    }

    public static void disabledDisplayDpiChange(Context context) {
        if (context == null) {
            return;
        }
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        if (configuration.fontScale != 1.0f) {
            configuration.fontScale = 1.0f;
        }
        configuration.densityDpi = getDefaultDisplayDensity();
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public static int getDefaultDisplayDensity() {
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Method method = cls.getMethod("getWindowManagerService", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(cls, new Object[0]);
            Method method2 = objInvoke.getClass().getMethod("getInitialDisplayDensity", Integer.TYPE);
            method2.setAccessible(true);
            return ((Integer) method2.invoke(objInvoke, 0)).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static int getDefaultDisplayDensity4() {
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Method method = cls.getMethod("getWindowManagerService", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(cls, new Object[0]);
            Method method2 = objInvoke.getClass().getMethod("getInitialDisplayDensity", Integer.TYPE);
            method2.setAccessible(true);
            return ((Integer) method2.invoke(objInvoke, 0)).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static float getDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int getFullScreenHeight() {
        if (FULL_SCREEN_HEIGHT < 1) {
            Display defaultDisplay = ((WindowManager) ContextGetterUtils.INSTANCE.getApp().getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            try {
                Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
                FULL_SCREEN_HEIGHT = displayMetrics.heightPixels;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return FULL_SCREEN_HEIGHT;
    }

    public static int getFullScreenWidth() {
        if (FULL_SCREEN_WIDTH < 1) {
            Display defaultDisplay = ((WindowManager) ContextGetterUtils.INSTANCE.getApp().getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            try {
                Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
                FULL_SCREEN_WIDTH = displayMetrics.widthPixels;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return FULL_SCREEN_WIDTH;
    }

    public static int getNavigationBarHeight(Context context) {
        Resources resources;
        int identifier;
        if (!hasNavBar(context) || (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", ResourcesUtil.ResourceType.DIMEN, "android")) <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static String getNetNeedScreenSize(Context context) {
        return isFoldWindowInMultiWindowMode() ? getRealSpitScreenSize(context) : getScreenSize(context);
    }

    public static float getPad2phoneScale() {
        return 0.6751055f;
    }

    private static String getRealSpitScreenSize(Context context) {
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int navigationBarHeight = context.getResources().getDisplayMetrics().heightPixels + getNavigationBarHeight();
        StringBuilder sb = new StringBuilder();
        int i2 = i * 100;
        if (i2 / navigationBarHeight >= 60) {
            navigationBarHeight = i2 / 59;
        }
        sb.append(i);
        sb.append("x");
        sb.append(navigationBarHeight);
        return sb.toString();
    }

    public static String getResolution(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels + "x" + context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static String getScreenSize(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels + "x" + (context.getResources().getDisplayMetrics().heightPixels + getNavigationBarHeight());
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android");
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        return dimensionPixelSize == 0 ? dip2px(36.0f) : dimensionPixelSize;
    }

    public static int getTopBarHeight(Activity activity) {
        return activity.getWindow().findViewById(R.id.content).getTop();
    }

    public static boolean hasNavBar(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics2);
            return Math.abs(i - displayMetrics2.heightPixels) > (i > 3000 ? 150 : 110);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean isFoldDevice() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
        int identifier = contextGetterUtils.getApp().getResources().getIdentifier("config_lidControlsDisplayFold", "bool", "android");
        return (identifier > 0 ? contextGetterUtils.getApp().getResources().getBoolean(identifier) : false) || isFoldWindow();
    }

    public static boolean isFoldWindow() {
        return Build.VERSION.SDK_INT >= 30 && Settings.Global.getInt(ContextGetterUtils.INSTANCE.getApp().getContentResolver(), "oplus_system_folding_mode", 0) == 1;
    }

    private static boolean isFoldWindowInMultiWindowMode() {
        try {
            Activity topActivity = ActivityCollectionManager.INSTANCE.getInstance().getTopActivity();
            return topActivity != null && topActivity.isInMultiWindowMode() && isFoldWindow();
        } catch (Exception unused) {
            return false;
        }
    }

    public static Boolean isInFloatMultiWindowMode(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics();
            int iHeight = currentWindowMetrics.getBounds().height();
            int iWidth = currentWindowMetrics.getBounds().width();
            Display display = context.getDisplay();
            if (display != null) {
                int physicalHeight = display.getMode().getPhysicalHeight();
                int physicalWidth = display.getMode().getPhysicalWidth();
                boolean z = false;
                if (!isPadWindow()) {
                    if (isRealSpitWindow()) {
                        if (iWidth == physicalWidth || iHeight == physicalHeight) {
                            return Boolean.FALSE;
                        }
                        if (iHeight == physicalWidth || iWidth == physicalHeight) {
                            return Boolean.FALSE;
                        }
                    }
                    return Boolean.valueOf((iWidth == physicalWidth && iHeight == physicalHeight) ? false : true);
                }
                if (iWidth == physicalWidth && iHeight == physicalHeight) {
                    return Boolean.FALSE;
                }
                if (iHeight == physicalWidth && iWidth == physicalHeight) {
                    return Boolean.FALSE;
                }
                if (iWidth != physicalWidth && iHeight != physicalHeight && iHeight != physicalWidth && iWidth != physicalHeight) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return Boolean.FALSE;
    }

    public static boolean isInMagicWindow() {
        return ContextGetterUtils.INSTANCE.getApp().getResources().getConfiguration().toString().contains("oplus-magic-windows");
    }

    public static boolean isNavigationBarShow(Activity activity) {
        try {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            Point point2 = new Point();
            defaultDisplay.getSize(point);
            defaultDisplay.getRealSize(point2);
            return point2.y != point.y;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public static boolean isPad() {
        String str = SystemPropertyUtils.get("ro.build.characteristics", "");
        return str != null && str.contains("tablet");
    }

    public static boolean isPadWindow() {
        return (ContextGetterUtils.INSTANCE.getApp().getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static boolean isRealSpitWindow() {
        ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
        return needSplitWindow() && (isFoldWindow() || ((double) getScreenWidth(contextGetterUtils.getApp())) / (((double) getScreenHeight(contextGetterUtils.getApp())) * 1.0d) > 0.75d);
    }

    public static boolean needSplitWindow() {
        return isPad() || isFoldDevice();
    }

    public static void printDisplayMetric(Activity activity) {
        int screenWidth = getScreenWidth(activity);
        int screenHeight = getScreenHeight(activity);
        LogUtils.INSTANCE.i(TAG, "resolution = " + screenHeight + " * " + screenWidth + ", density = " + activity.getResources().getDisplayMetrics().density + ", 10dp = " + dip2px(activity, 10.0f) + "px, 10px = " + px2dip(activity, 10.0f) + "dp");
    }

    public static int px2dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2px(float f) {
        return (int) ((f * Math.min(getFullScreenWidth(), DEFAULT_SCREEN_WIDTH)) / 1080.0f);
    }

    public static int px2sp(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public static void setActivityScreenOrientation(Activity activity, int i) {
        if (i == 0) {
            activity.setRequestedOrientation(0);
        } else if (i == 1) {
            activity.setRequestedOrientation(1);
        }
    }

    public static void setCustomDensity(@NonNull Activity activity, @NonNull final Application application) {
        DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
        if (0.0f == sNoncompatDensity) {
            sNoncompatDensity = displayMetrics.density;
            sNoncompatScaledDensity = displayMetrics.scaledDensity;
            application.registerComponentCallbacks(new ComponentCallbacks() { // from class: com.heytap.store.base.core.util.DisplayUtil.1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    if (configuration == null || configuration.fontScale <= 0.0f) {
                        return;
                    }
                    float unused = DisplayUtil.sNoncompatScaledDensity = application.getResources().getDisplayMetrics().scaledDensity;
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            });
        }
        float f = displayMetrics.widthPixels / 360;
        float f2 = sNoncompatScaledDensity * (f / sNoncompatDensity);
        int i = (int) (160.0f * f);
        displayMetrics.density = f;
        displayMetrics.scaledDensity = f2;
        displayMetrics.densityDpi = i;
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        displayMetrics2.density = f;
        displayMetrics2.scaledDensity = f2;
        displayMetrics2.densityDpi = i;
    }

    public static void setDefaultDisplay(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.densityDpi = getDefaultDisplayDensity4();
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
    }

    public static int sp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static void updateFullScreenHeightByConfigChange(int i) {
        FULL_SCREEN_HEIGHT = i;
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getNavigationBarHeight() {
        Resources resources;
        int identifier;
        ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
        if (!hasNavBar(contextGetterUtils.getApp()) || (identifier = (resources = contextGetterUtils.getApp().getResources()).getIdentifier("navigation_bar_height", ResourcesUtil.ResourceType.DIMEN, "android")) <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }
}
