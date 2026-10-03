package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes13.dex */
public class mj2 {
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;

    public static Point a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static boolean b(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).isInMultiWindowMode();
        }
        return false;
    }
}
