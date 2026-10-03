package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* JADX INFO: loaded from: classes9.dex */
public class vu5 {
    public static boolean a(Context context) {
        return context != null && (context.getResources().getConfiguration().uiMode & 48) == 16;
    }

    public static String b(Context context) {
        String string;
        try {
            string = Settings.Global.getString(context.getContentResolver(), "oplus_system_folding_mode");
        } catch (Exception e2) {
            bn.c("DisplayUtil", "getFoldMode failed, " + e2);
            string = null;
        }
        return string == null ? "" : string;
    }

    public static int c(Context context) {
        int iHeight;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            iHeight = windowManager.getMaximumWindowMetrics().getBounds().height();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            iHeight = point.y;
        }
        bn.b("DisplayUtil", "realScreenHeight = " + iHeight);
        return iHeight;
    }

    public static int d(Context context) {
        int iWidth;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            iWidth = windowManager.getMaximumWindowMetrics().getBounds().width();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            iWidth = point.x;
        }
        bn.b("DisplayUtil", "realScreenWidth = " + iWidth);
        return iWidth;
    }

    public static int e(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (Build.VERSION.SDK_INT < 30) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        return (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
    }

    public static int f(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (Build.VERSION.SDK_INT < 30) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        return (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
    }

    public static boolean g(Context context) {
        return Build.VERSION.SDK_INT >= 30 && context.getPackageManager().hasSystemFeature("oplus.feature.largescreen");
    }
}
