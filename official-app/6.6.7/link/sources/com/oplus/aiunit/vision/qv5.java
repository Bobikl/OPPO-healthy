package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class qv5 {
    public static int a(Context context) {
        Object systemService = context.getSystemService("window");
        if (!(systemService instanceof WindowManager)) {
            return 0;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        try {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            return point.y;
        } catch (Exception unused) {
            return defaultDisplay.getHeight();
        }
    }

    public static int b(Context context) {
        Object systemService = context.getSystemService("window");
        if (!(systemService instanceof WindowManager)) {
            return 0;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        try {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            return point.x;
        } catch (Exception unused) {
            return defaultDisplay.getWidth();
        }
    }
}
