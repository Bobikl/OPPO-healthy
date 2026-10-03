package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class xv5 {
    public static int a(Context context) {
        int iHeight;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (yyk.a()) {
            iHeight = p2m.a(i94.a(windowManager)).height();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            iHeight = point.y;
        }
        y8b.a(xv5.class.getSimpleName(), "realScreenHeight = " + iHeight);
        return iHeight;
    }

    public static int b(Context context) {
        int iWidth;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (yyk.a()) {
            iWidth = p2m.a(i94.a(windowManager)).width();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            iWidth = point.x;
        }
        y8b.a(xv5.class.getSimpleName(), "realScreenWidth = " + iWidth);
        return iWidth;
    }

    public static int c(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (!yyk.a()) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        WindowMetrics windowMetricsA = h94.a(windowManager);
        Insets insetsA = o1m.a(q2m.a(windowMetricsA), uv5.a());
        return (p2m.a(windowMetricsA).height() - insetsA.top) - insetsA.bottom;
    }

    public static int d(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (!yyk.a()) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        WindowMetrics windowMetricsA = h94.a(windowManager);
        Insets insetsA = o1m.a(q2m.a(windowMetricsA), uv5.a());
        return (p2m.a(windowMetricsA).width() - insetsA.left) - insetsA.right;
    }
}
