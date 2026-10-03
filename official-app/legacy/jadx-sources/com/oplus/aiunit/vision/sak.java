package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsetsController;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;

/* JADX INFO: loaded from: classes9.dex */
public class sak {
    public static final int SYSTEM_UI_FLAG_OP_STATUS_BAR_TINT = 16;

    public static void a(Activity activity) {
        if (bvk.d()) {
            if (!bvk.e()) {
                activity.getWindow().setFlags(67108864, 67108864);
                return;
            }
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().getDecorView().setSystemUiVisibility(k18.GL_INVALID_ENUM);
            activity.getWindow().setStatusBarColor(0);
        }
    }

    public static int b(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean c(Window window) {
        if (bvk.d()) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (bvk.e()) {
                return (systemUiVisibility & 8192) != 0;
            }
            if (bvk.b() && (systemUiVisibility & 16) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void d(Window window, boolean z) {
        if (bvk.d()) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (bvk.c()) {
                window.addFlags(Integer.MIN_VALUE);
            }
            if (bvk.e()) {
                systemUiVisibility = z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193);
            } else if (bvk.b()) {
                systemUiVisibility = z ? systemUiVisibility | 16 : systemUiVisibility & (-17);
            }
            window.getDecorView().setSystemUiVisibility(systemUiVisibility);
        }
    }

    public static void e(Activity activity, boolean z) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT < 30) {
            d(window, z);
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            if (z) {
                insetsController.setSystemBarsAppearance(8, 8);
            } else {
                insetsController.setSystemBarsAppearance(0, 8);
            }
        }
    }

    public static void f(Window window) {
        if (bvk.e()) {
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        }
    }

    public static void g(Window window) {
        if (bvk.e()) {
            window.addFlags(Integer.MIN_VALUE);
            if (bvk.e()) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
            } else {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-17));
            }
        }
    }
}
