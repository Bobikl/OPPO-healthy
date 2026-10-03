package com.platform.usercenter.uws.util;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.tools.os.Version;
import com.platform.usercenter.uws.util.UwsNavigationUtils;

/* JADX INFO: loaded from: classes9.dex */
public class UwsNavigationUtils {
    private static final int BUTTON = 0;
    private static final int FULLY_GESTURAL = 2;
    private static final String KEY_NAV_STATE = "hide_navigationbar_enable";
    private static final String NAVIGATION_MODE = "navigation_mode";
    private static final int NAV_STATE_SWIPE_SIDE_GESTURE = 3;
    private static final int NAV_STATE_SWIPE_UP_GESTURE = 2;
    private static final int NAV_STATE_VIRTUAL_KEY = 0;
    private static final int SYSTEM_UI_FLAG_OP_STATUS_BAR_TINT = 16;

    private UwsNavigationUtils() {
    }

    public static void activityContainMultiFragmentPage(View view, View... viewArr) {
        if (isNeedAdapterNavigation(BaseApp.mContext)) {
            if (view != null) {
                view.setPadding(0, UwsTranslucentBarUtil.getStatusBarHeight(view.getContext()), 0, 0);
            }
            setFitsSystemWindowsFalse(viewArr);
        }
    }

    @RequiresApi(api = 30)
    public static void addStatusBarHeightToPage(final Context context, final View view) {
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.oplus.aiunit.vision.csk
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return UwsNavigationUtils.lambda$addStatusBarHeightToPage$0(context, view, view2, windowInsets);
            }
        });
    }

    public static boolean getDarkLightStatus(Context context) {
        return context != null && (context.getResources().getConfiguration().uiMode & 48) == 16;
    }

    private static void immerseNavigation(Activity activity) {
        Window window = activity.getWindow();
        if (isGestureNavMode(activity)) {
            window.getDecorView().setSystemUiVisibility(1792);
        }
        if (Version.hasQ()) {
            window.setNavigationBarContrastEnforced(false);
        }
        window.setNavigationBarColor(0);
    }

    public static boolean isGestureNavMode(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (Version.hasS()) {
            return Settings.Secure.getInt(contentResolver, NAVIGATION_MODE, 0) == 2;
        }
        return Settings.Secure.getInt(contentResolver, KEY_NAV_STATE, 0) == 2 || Settings.Secure.getInt(contentResolver, KEY_NAV_STATE, 0) == 3;
    }

    public static boolean isNeedAdapterNavigation(Context context) {
        return Build.VERSION.SDK_INT >= 31 && isGestureNavMode(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets lambda$addStatusBarHeightToPage$0(Context context, View view, View view2, WindowInsets windowInsets) {
        if (!isGestureNavMode(context)) {
            return windowInsets;
        }
        view2.setPadding(0, view2.getPaddingTop() + windowInsets.getInsets(WindowInsets.Type.statusBars()).top, 0, 0);
        view.setOnApplyWindowInsetsListener(null);
        return windowInsets;
    }

    public static void scrollPageNeedStatusBarPadding(Activity activity, View view, View... viewArr) {
        if (isNeedAdapterNavigation(activity)) {
            immerseNavigation(activity);
            if (view != null) {
                addStatusBarHeightToPage(activity, view);
            }
            setFitsSystemWindowsFalse(viewArr);
            setStatusTextColor(activity);
        }
    }

    public static void scrollPageNoNeedPadding(Activity activity, View... viewArr) {
        if (isNeedAdapterNavigation(activity)) {
            immerseNavigation(activity);
            setFitsSystemWindowsFalse(viewArr);
            setStatusTextColor(activity);
        }
    }

    private static void setFitsSystemWindowsFalse(View... viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setFitsSystemWindows(false);
            }
        }
    }

    private static void setStatusBarTextColor(Window window, boolean z) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    private static void setStatusTextColor(Activity activity) {
        setStatusBarTextColor(activity.getWindow(), getDarkLightStatus(activity));
    }

    public static void tintNavigationColor(Activity activity, int i) {
        Window window = activity.getWindow();
        if (Version.hasL_MR1()) {
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(i);
        }
    }

    public static void unScrollPage(Activity activity, int i) {
        if (isNeedAdapterNavigation(activity)) {
            tintNavigationColor(activity, i);
        }
    }

    public static void unScrollPage(Activity activity) {
        unScrollPage(activity, -1);
    }
}
