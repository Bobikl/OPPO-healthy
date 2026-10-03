package com.platform.usercenter.tools.ui;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import com.platform.usercenter.tools.os.Version;
import com.platform.usercenter.tools.ui.NavigationUtils;

/* JADX INFO: loaded from: classes9.dex */
public class NavigationUtils {
    private static final int BUTTON = 0;
    private static final int FULLY_GESTURAL = 2;
    private static final String KEY_NAV_STATE = "hide_navigationbar_enable";
    private static final String NAVIGATION_MODE = "navigation_mode";
    private static final int NAV_STATE_SWIPE_SIDE_GESTURE = 3;
    private static final int NAV_STATE_SWIPE_UP_GESTURE = 2;
    private static final int NAV_STATE_VIRTUAL_KEY = 0;

    private NavigationUtils() {
    }

    @RequiresApi(api = 30)
    public static void addStatusBarHeightToPage(final Context context, final View view) {
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.oplus.aiunit.vision.sfc
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return NavigationUtils.lambda$addStatusBarHeightToPage$0(context, view, view2, windowInsets);
            }
        });
    }

    public static void immerseNavigation(Activity activity) {
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

    private static boolean isKeyNavMode(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (Version.hasS()) {
            return Settings.Secure.getInt(contentResolver, NAVIGATION_MODE, 0) == 0;
        }
        return Settings.Secure.getInt(contentResolver, KEY_NAV_STATE, 0) == 0;
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

    public static void tintNavigationColor(Activity activity, int i) {
        Window window = activity.getWindow();
        if (Version.hasL_MR1()) {
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(i);
        }
    }
}
