package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* JADX INFO: loaded from: classes14.dex */
public class av5 {
    public static int a(Context context) {
        int iHeight;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (cvk.d()) {
            iHeight = windowManager.getMaximumWindowMetrics().getBounds().height();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            iHeight = point.y;
        }
        q7b.a(av5.class.getSimpleName(), "realScreenHeight = " + iHeight);
        return iHeight;
    }

    public static int b(Context context) {
        int iWidth;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (cvk.d()) {
            iWidth = windowManager.getMaximumWindowMetrics().getBounds().width();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            iWidth = point.x;
        }
        q7b.a(av5.class.getSimpleName(), "realScreenWidth = " + iWidth);
        return iWidth;
    }

    public static int c(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (!cvk.d()) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        return (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
    }

    public static int d(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (!cvk.d()) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        return (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
    }
}
