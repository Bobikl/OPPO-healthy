package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes15.dex */
public class d95 {
    public static final int DIVIDER_HEIGHT = 3000;
    public static int a = -1;
    public static final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f10438c;

    static {
        String str = Build.BRAND;
        b = str.toLowerCase().contains("huawei") || str.toLowerCase().contains("honor") || str.toLowerCase().contains("zte") || str.toLowerCase().contains("Unihertz");
        f10438c = str.toLowerCase();
    }

    public static Resources a(Activity activity) {
        Resources resources = activity.getResources();
        Configuration configuration = resources.getConfiguration();
        int iF = ejg.f(activity);
        int iB = b();
        boolean zE = e(iF, configuration, activity, iB);
        a7b.f("DensityUtils", "[disabledDisplayDpiChange] curDensity: " + configuration.densityDpi + ", defaultDensity: " + iB + ", displayWidth: " + iF);
        if (zE) {
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    public static int b() {
        try {
            if (a == -1) {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Method method = cls.getMethod("getWindowManagerService", new Class[0]);
                method.setAccessible(true);
                Object objInvoke = method.invoke(cls, new Object[0]);
                Method method2 = objInvoke.getClass().getMethod("getInitialDisplayDensity", Integer.TYPE);
                method2.setAccessible(true);
                a = ((Integer) method2.invoke(objInvoke, 0)).intValue();
            }
            return a;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static boolean c(Activity activity) {
        if (activity == null || activity.getWindow() == null) {
            return false;
        }
        try {
            WindowManager windowManager = activity.getWindowManager();
            if (windowManager == null) {
                return false;
            }
            Point point = new Point();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                point.x = bounds.width();
                point.y = bounds.height();
            } else {
                windowManager.getDefaultDisplay().getSize(point);
            }
            int i2 = point.x;
            int i3 = point.y;
            Point point2 = new Point();
            if (i >= 30) {
                Rect bounds2 = windowManager.getMaximumWindowMetrics().getBounds();
                point2.x = bounds2.width();
                point2.y = bounds2.height();
            } else {
                windowManager.getDefaultDisplay().getRealSize(point2);
            }
            int i4 = point2.x;
            int i5 = point2.y;
            return i4 > 0 && i5 > 0 && Math.min(((float) i2) / ((float) i4), ((float) i3) / ((float) i5)) < 0.9f;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(Activity activity) {
        if (activity == null) {
            return false;
        }
        try {
            return (!Build.BRAND.toLowerCase().contains("honor") || Build.VERSION.SDK_INT < 36) ? activity.isInMultiWindowMode() : c(activity);
        } catch (Exception e2) {
            a7b.m("DensityAdaptUtils", "isInMultiWindowMode() failed, use fallback method: " + e2.getMessage());
            return c(activity);
        }
    }

    public static boolean e(int i, Configuration configuration, Activity activity, int i2) {
        boolean z;
        boolean z2;
        if (configuration.fontScale != 1.0f) {
            configuration.fontScale = 1.0f;
            z = true;
        } else {
            z = false;
        }
        int i3 = configuration.densityDpi;
        if (i <= 720 || ((z2 = b) && i <= 896)) {
            if (i3 != 320) {
                configuration.densityDpi = 320;
                z = true;
            }
        } else if (i <= 1140 || (z2 && i <= 1223)) {
            if (i3 != 480) {
                configuration.densityDpi = 480;
                z = true;
            }
        } else if (i <= 1280) {
            if (i3 != 560) {
                configuration.densityDpi = 560;
                z = true;
            }
        } else if (i <= 1440 || (z2 && i <= 1344)) {
            if (i3 != 640) {
                configuration.densityDpi = GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH;
                z = true;
            }
        } else if (i <= 1644 && f10438c.contains("sony") && i3 != 480) {
            configuration.densityDpi = 480;
            z = true;
        }
        if (!d(activity)) {
            return z;
        }
        configuration.densityDpi = i2;
        return true;
    }
}
