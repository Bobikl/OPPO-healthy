package com.platform.usercenter.uws.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.ColorRes;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.heytap.webpro.theme.H5ThemeHelper;
import com.oplus.aiunit.vision.k18;
import com.platform.usercenter.bizuws.R;
import com.platform.usercenter.tools.os.Version;
import com.support.appcompat.R$color;

/* JADX INFO: loaded from: classes9.dex */
public class UwsTranslucentBarUtil {
    public static final int SYSTEM_UI_FLAG_OP_STATUS_BAR_TINT = 16;

    public static void cancelTranslucentBar(Activity activity) {
        activity.getWindow().getAttributes().flags |= 67108864;
    }

    @SuppressLint({"ResourceType"})
    public static void generateTintBar(Activity activity, @ColorRes int i) {
        try {
            if (Version.hasL_MR1()) {
                Window window = activity.getWindow();
                generateTintStatusBar(activity, window);
                if (Version.hasL()) {
                    if (i > 0) {
                        window.setStatusBarColor(activity.getResources().getColor(i));
                    } else {
                        window.setStatusBarColor(0);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void generateTintStatusBar(Activity activity, Window window) {
        setStatusBarTextColor(window, activity.getResources().getInteger(R.integer.uc_theme_statusbar_icon_tint_boolean) == 1);
    }

    public static void generateTranslucentBar(Activity activity) {
        if (Version.hasL_MR1()) {
            if (!Version.hasM()) {
                activity.getWindow().setFlags(67108864, 67108864);
                return;
            }
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().getDecorView().setSystemUiVisibility(k18.GL_INVALID_ENUM);
            activity.getWindow().setStatusBarColor(0);
        }
    }

    public static Point getAppUsableScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static Point getNavigationBarSize(Context context) {
        Point appUsableScreenSize = getAppUsableScreenSize(context);
        Point realScreenSize = getRealScreenSize(context);
        if (appUsableScreenSize.x < realScreenSize.x) {
            return new Point(realScreenSize.x - appUsableScreenSize.x, appUsableScreenSize.y);
        }
        return appUsableScreenSize.y < realScreenSize.y ? new Point(appUsableScreenSize.x, realScreenSize.y - appUsableScreenSize.y) : new Point();
    }

    public static Point getRealScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static int getStatusBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean isStatusBarTextColorLight(Window window) {
        if (!Version.hasL_MR1()) {
            return true;
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        if (Version.hasM()) {
            return (systemUiVisibility & 8192) != 0;
        }
        return (Version.hasKitKat() && (systemUiVisibility & 16) == 0) ? false : true;
    }

    public static void setStatusBarTextColor(Window window, boolean z) {
        if (Version.hasL_MR1()) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (Version.hasL()) {
                window.addFlags(Integer.MIN_VALUE);
            }
            if (Version.hasM()) {
                systemUiVisibility = z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193);
            } else if (Version.hasKitKat()) {
                systemUiVisibility = z ? systemUiVisibility | 16 : systemUiVisibility & (-17);
            }
            window.getDecorView().setSystemUiVisibility(systemUiVisibility);
        }
    }

    public static void setStatusBarTint(Activity activity, int i) {
        if (Version.hasL_MR1() && i == 1) {
            View decorView = activity.getWindow().getDecorView();
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
        }
    }

    public static void toStatusbarDark(Window window, Context context) {
        if (context == null || !Version.hasL_MR1()) {
            return;
        }
        if (H5ThemeHelper.c(context)) {
            setStatusBarTextColor(window, true);
        } else {
            setStatusBarTextColor(window, false);
        }
    }

    public static void toStatusbarLight(Window window, Context context) {
        if (Version.hasL_MR1()) {
            setStatusBarTextColor(window, H5ThemeHelper.c(context));
        }
    }

    @TargetApi(21)
    public static void generateTintStatusBar(Activity activity, String str) {
        try {
            if (Version.hasL_MR1()) {
                generateTintStatusBar(activity, activity.getWindow());
                if (!TextUtils.isEmpty(str)) {
                    activity.getWindow().setStatusBarColor(Color.parseColor(str));
                } else {
                    activity.getWindow().setStatusBarColor(activity.getResources().getColor(R$color.coui_color_white));
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void toStatusbarLight(Window window) {
        if (Version.hasM()) {
            window.addFlags(Integer.MIN_VALUE);
            if (Version.hasM()) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
            } else {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-17));
            }
        }
    }

    public static void toStatusbarDark(Window window) {
        if (Version.hasM()) {
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        }
    }
}
