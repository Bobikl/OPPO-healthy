package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class jg {
    public static final String TAG = "AcOpenScreenUtil";

    public static boolean a(float f) {
        AcLogUtil.e(TAG, "widthDp :" + f);
        return f < 600.0f;
    }

    public static int[] b(@NotNull Context context) {
        int iIntValue;
        int i;
        int i2;
        int[] iArr = new int[2];
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
            try {
                iIntValue = displayMetrics.heightPixels;
                try {
                    ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    iIntValue = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                    i = point.x;
                    i2 = point.y;
                } catch (Exception e2) {
                    e = e2;
                    AcLogUtil.e(TAG, e.getMessage());
                    i2 = iIntValue;
                }
            } catch (Exception e3) {
                e = e3;
                iIntValue = 0;
            }
        } catch (Exception e4) {
            e = e4;
            iIntValue = 0;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public static boolean c(@NotNull Context context, int i) {
        if (context == null) {
            return true;
        }
        if (i >= 0) {
            return a(i / context.getResources().getDisplayMetrics().density);
        }
        AcLogUtil.e(TAG, "width :" + i + " and Build.VERSION.SDK_INT:" + Build.VERSION.SDK_INT);
        return true;
    }

    public static void d(Activity activity) {
        AcLogUtil.i(TAG, "getRealScreenSize,0=" + b(activity)[0] + ",1=" + b(activity)[1]);
        int[] iArrB = b(activity);
        if (c(activity, Math.min(iArrB[0], iArrB[1]))) {
            activity.setRequestedOrientation(1);
        } else {
            activity.setRequestedOrientation(2);
        }
    }
}
