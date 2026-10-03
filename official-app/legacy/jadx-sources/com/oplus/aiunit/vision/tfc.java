package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;

/* JADX INFO: loaded from: classes9.dex */
public class tfc {
    public static boolean a(Context context) {
        return context != null && (context.getResources().getConfiguration().uiMode & 48) == 16;
    }

    public static int b(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", ResourcesUtil.ResourceType.DIMEN, "android"));
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

    public static void c(Activity activity) {
        Window window = activity.getWindow();
        if (d(activity)) {
            window.getDecorView().setSystemUiVisibility(1792);
        }
        if (bvk.f()) {
            window.setNavigationBarContrastEnforced(false);
        }
        window.setNavigationBarColor(0);
    }

    public static boolean d(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (bvk.h()) {
            return Settings.Secure.getInt(contentResolver, "navigation_mode", 0) == 2;
        }
        return Settings.Secure.getInt(contentResolver, "hide_navigationbar_enable", 0) == 2 || Settings.Secure.getInt(contentResolver, "hide_navigationbar_enable", 0) == 3;
    }

    public static boolean e(Context context) {
        return Build.VERSION.SDK_INT >= 31 && d(context);
    }

    public static void f(Activity activity, View... viewArr) {
        if (e(activity)) {
            c(activity);
            g(viewArr);
            i(activity);
        }
    }

    public static void g(View... viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setFitsSystemWindows(false);
            }
        }
    }

    public static void h(Window window, boolean z) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public static void i(Activity activity) {
        h(activity.getWindow(), a(activity));
    }
}
