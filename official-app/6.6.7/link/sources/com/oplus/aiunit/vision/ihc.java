package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ihc {
    public static int a(Context context) {
        int iB = b(context);
        if (d(iB)) {
            return e(context, iB) ? 1 : 2;
        }
        return 0;
    }

    public static int b(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            return yyk.b() ? Settings.Secure.getInt(contentResolver, "navigation_mode", 0) : Settings.Secure.getInt(contentResolver, "hide_navigationbar_enable", 0);
        } catch (Throwable th) {
            y8b.f(ihc.class.getSimpleName(), "getNavMode error!", th);
            return 0;
        }
    }

    public static int c(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics2);
        float f = displayMetrics2.density;
        float f2 = displayMetrics.density;
        if (f == f2) {
            return dimensionPixelSize;
        }
        return (int) ((dimensionPixelSize * (f / f2)) + 0.5f);
    }

    public static boolean d(int i) {
        if (yyk.b()) {
            return i == 2;
        }
        return i == 2 || i == 3;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    public static boolean e(Context context, int i) {
        boolean z;
        if (i == 2) {
            try {
                if (yyk.b()) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                y8b.f(ihc.class.getSimpleName(), "isGuideBarHidden error!", th);
                return true;
            }
        } else {
            z = false;
        }
        return Settings.Secure.getInt(context.getContentResolver(), z ? "hide_gesture_bar_enable" : "gesture_side_hide_bar_prevention_enable", 1) == 1;
    }
}
