package com.heytap.nearx.uikit.widget.panel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;

/* JADX INFO: loaded from: classes18.dex */
public class NearPanelMultiWindowUtils {
    private static final float LARGEST_SCREEN_HEIGHT_DP_THRESHOLD = 809.0f;
    private static final int NAV_STATE_SWIPE_SIDE_GESTURE = 3;
    private static final float SMALLEST_SCREEN_WIDTH_DP_THRESHOLD = 600.0f;
    private static final float TWO_THIRDS = 0.66f;

    public static Activity contextToActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static int getCurrentPanelWindowVisibleHeight(@NonNull Activity activity, Configuration configuration) {
        Rect currentWindowVisibleRect;
        int i = (!isInMultiWindowMode(activity) || (currentWindowVisibleRect = getCurrentWindowVisibleRect(activity)) == null) ? 0 : currentWindowVisibleRect.bottom - currentWindowVisibleRect.top;
        return i == 0 ? getPanelNormalVisibleHeight(activity, configuration) : i;
    }

    public static int getCurrentWindowVisibleHeight(@NonNull Activity activity, Configuration configuration) {
        Rect currentWindowVisibleRect;
        int i = (!isInMultiWindowMode(activity) || (currentWindowVisibleRect = getCurrentWindowVisibleRect(activity)) == null) ? 0 : currentWindowVisibleRect.bottom - currentWindowVisibleRect.top;
        return i == 0 ? getNormalVisibleHeight(activity, configuration) : i;
    }

    public static Rect getCurrentWindowVisibleRect(Activity activity) {
        if (activity == null) {
            return null;
        }
        View decorView = activity.getWindow().getDecorView();
        Rect rect = new Rect();
        decorView.getGlobalVisibleRect(rect);
        return rect;
    }

    public static int getNormalVisibleHeight(Context context, Configuration configuration) {
        int navigationBarHeight = 0;
        if (context == null) {
            return 0;
        }
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int screenHeight = getScreenHeight(context);
        int statusBarHeight = getStatusBarHeight(context);
        if (NearNavigationBarUtil.isNavigationBarShow(context)) {
            if ((((float) configuration.screenWidthDp) >= SMALLEST_SCREEN_WIDTH_DP_THRESHOLD) || isPortrait(configuration)) {
                navigationBarHeight = NearNavigationBarUtil.getNavigationBarHeight(context);
            }
        }
        return (screenHeight - statusBarHeight) - navigationBarHeight;
    }

    public static int getPanelMarginBottom(Context context, Configuration configuration) {
        if (context == null || configuration == null) {
            return 0;
        }
        int i = configuration.screenWidthDp;
        boolean z = (configuration.screenLayout & 15) == 1;
        boolean z2 = configuration.orientation == 2;
        if (i >= SMALLEST_SCREEN_WIDTH_DP_THRESHOLD || (!z && z2)) {
            return getStatusBarHeight(context) == 0 ? context.createConfigurationContext(configuration).getResources().getDimensionPixelOffset(R$dimen.nx_bottom_sheet_margin_vertical_without_status_bar) : context.createConfigurationContext(configuration).getResources().getDimensionPixelOffset(R$dimen.nx_bottom_sheet_margin_bottom_default);
        }
        return 0;
    }

    public static int getPanelMaxHeight(@NonNull Context context, Configuration configuration) {
        int panelNormalVisibleHeight;
        int panelMarginBottom;
        Activity activityContextToActivity = contextToActivity(context);
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        if (activityContextToActivity != null) {
            panelNormalVisibleHeight = getCurrentPanelWindowVisibleHeight(activityContextToActivity, configuration);
            panelMarginBottom = getPanelMarginBottom(context, configuration);
        } else {
            panelNormalVisibleHeight = getPanelNormalVisibleHeight(context, configuration);
            panelMarginBottom = getPanelMarginBottom(context, configuration);
        }
        return Math.min(panelNormalVisibleHeight - panelMarginBottom, context.getResources().getDimensionPixelOffset(R$dimen.nx_panel_max_height));
    }

    public static int getPanelNormalVisibleHeight(Context context, Configuration configuration) {
        int navigationBarHeight = 0;
        if (context == null) {
            return 0;
        }
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int screenHeight = getScreenHeight(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.nx_panel_min_padding_top);
        if (getStatusBarHeight(context) == 0) {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.nx_bottom_sheet_margin_vertical_without_status_bar);
        }
        boolean zIsNavigationBarShow = NearNavigationBarUtil.isNavigationBarShow(context);
        int i = Settings.Secure.getInt(context.getContentResolver(), "hide_navigationbar_enable", 0);
        boolean z = ((configuration.screenLayout & 15) == 2) && (configuration.orientation == 2);
        if (zIsNavigationBarShow) {
            if (((((float) configuration.screenWidthDp) >= SMALLEST_SCREEN_WIDTH_DP_THRESHOLD) || isPortrait(configuration)) && i != 3 && !z) {
                navigationBarHeight = NearNavigationBarUtil.getNavigationBarHeight(context);
            }
        }
        return (screenHeight - dimensionPixelOffset) - navigationBarHeight;
    }

    public static int getScreenHeight(Context context) {
        return getScreenSize(context).y;
    }

    public static Point getScreenSize(Context context) {
        WindowManager windowManager;
        Display defaultDisplay;
        Point point = new Point();
        if (context != null && (windowManager = (WindowManager) context.getSystemService("window")) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealSize(point);
        }
        return point;
    }

    public static int getScreenWidth(Context context) {
        return getScreenSize(context).x;
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @RequiresApi(api = 30)
    public static int getStatusBarHeightAfterR(WindowInsets windowInsets) {
        return Math.abs(windowInsets.getInsets(WindowInsets.Type.statusBars()).bottom - windowInsets.getInsets(WindowInsets.Type.statusBars()).top);
    }

    public static boolean isDisplayInHorizontal(Activity activity) {
        if (activity == null || activity.getResources().getConfiguration().orientation != 2 || !isInMultiWindowMode(activity)) {
            return false;
        }
        View decorView = activity.getWindow().getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        return ((float) (rect.right - rect.left)) < ((float) getScreenWidth(activity)) * TWO_THIRDS;
    }

    public static boolean isDisplayInPrimaryScreen(Activity activity) {
        if (activity == null) {
            return true;
        }
        int statusBarHeight = getStatusBarHeight(activity);
        int[] iArr = new int[2];
        activity.getWindow().getDecorView().getLocationOnScreen(iArr);
        return iArr[0] <= statusBarHeight && iArr[1] <= statusBarHeight;
    }

    public static boolean isDisplayInUpperWindow(Activity activity) {
        if (activity == null) {
            return true;
        }
        int[] iArr = new int[2];
        activity.getWindow().getDecorView().getLocationOnScreen(iArr);
        return iArr[1] <= getStatusBarHeight(activity);
    }

    public static boolean isInMultiWindowMode(Activity activity) {
        return activity != null && activity.isInMultiWindowMode();
    }

    public static boolean isLargeHeightScreen(Context context, Configuration configuration) {
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        return ((float) configuration.screenHeightDp) > LARGEST_SCREEN_HEIGHT_DP_THRESHOLD;
    }

    public static boolean isPortrait(@NonNull Context context) {
        return isPortrait(context.getResources().getConfiguration());
    }

    public static boolean isSmallScreen(Context context, Configuration configuration) {
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        return ((float) configuration.screenWidthDp) < SMALLEST_SCREEN_WIDTH_DP_THRESHOLD;
    }

    public static boolean isPortrait(@NonNull Configuration configuration) {
        return configuration.orientation == 1;
    }

    public static int getStatusBarHeight(WindowInsets windowInsets, Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return getStatusBarHeightAfterR(windowInsets);
        }
        return getStatusBarHeight(context);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    public static int getCurrentPanelWindowVisibleHeight(@NonNull Activity activity, Configuration configuration, WindowInsets windowInsets) {
        int i;
        if (!isInMultiWindowMode(activity)) {
            i = 0;
        } else if (Build.VERSION.SDK_INT >= 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(R$dimen.nx_panel_min_padding_top);
            if (getStatusBarHeight(windowInsets, activity) == 0) {
                dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(R$dimen.nx_bottom_sheet_margin_vertical_without_status_bar);
            }
            i = (displayMetrics.heightPixels - windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom) - dimensionPixelOffset;
        } else {
            Rect currentWindowVisibleRect = getCurrentWindowVisibleRect(activity);
            if (currentWindowVisibleRect != null) {
                i = currentWindowVisibleRect.bottom - currentWindowVisibleRect.top;
            } else {
                i = 0;
            }
        }
        return i == 0 ? getPanelNormalVisibleHeight(activity, configuration, windowInsets) : i;
    }

    public static int getPanelMaxHeight(@NonNull Context context, Configuration configuration, WindowInsets windowInsets) {
        int panelNormalVisibleHeight;
        int panelMarginBottom;
        Activity activityContextToActivity = contextToActivity(context);
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        if (activityContextToActivity != null) {
            panelNormalVisibleHeight = getCurrentPanelWindowVisibleHeight(activityContextToActivity, configuration, windowInsets);
            panelMarginBottom = getPanelMarginBottom(context, configuration, windowInsets);
        } else {
            panelNormalVisibleHeight = getPanelNormalVisibleHeight(context, configuration, windowInsets);
            panelMarginBottom = getPanelMarginBottom(context, configuration, windowInsets);
        }
        return Math.min(panelNormalVisibleHeight - panelMarginBottom, context.getResources().getDimensionPixelOffset(R$dimen.nx_panel_max_height));
    }

    public static int getPanelMarginBottom(Context context, Configuration configuration, WindowInsets windowInsets) {
        int dimensionPixelOffset;
        if (context == null || configuration == null) {
            return 0;
        }
        int i = configuration.screenWidthDp;
        boolean z = (configuration.screenLayout & 15) == 1;
        boolean z2 = configuration.orientation == 2;
        if (i < SMALLEST_SCREEN_WIDTH_DP_THRESHOLD && (z || !z2)) {
            return 0;
        }
        if (getStatusBarHeight(windowInsets, context) == 0) {
            dimensionPixelOffset = context.createConfigurationContext(configuration).getResources().getDimensionPixelOffset(R$dimen.nx_bottom_sheet_margin_vertical_without_status_bar);
        } else {
            dimensionPixelOffset = context.createConfigurationContext(configuration).getResources().getDimensionPixelOffset(R$dimen.nx_bottom_sheet_margin_bottom_default);
        }
        return Math.max(0, dimensionPixelOffset - (Build.VERSION.SDK_INT >= 30 ? windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom : 0));
    }

    public static int getPanelNormalVisibleHeight(Context context, Configuration configuration, WindowInsets windowInsets) {
        int navigationBarHeight = 0;
        if (context == null) {
            return 0;
        }
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int screenHeight = getScreenHeight(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.nx_panel_min_padding_top);
        if (getStatusBarHeight(windowInsets, context) == 0) {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.nx_bottom_sheet_margin_vertical_without_status_bar);
        }
        boolean zIsNavigationBarShow = NearNavigationBarUtil.isNavigationBarShow(context);
        int i = Settings.Secure.getInt(context.getContentResolver(), "hide_navigationbar_enable", 0);
        boolean z = ((configuration.screenLayout & 15) == 2) && (configuration.orientation == 2);
        if (zIsNavigationBarShow) {
            if (((((float) configuration.screenWidthDp) >= SMALLEST_SCREEN_WIDTH_DP_THRESHOLD) || isPortrait(configuration)) && i != 3 && !z) {
                navigationBarHeight = NearNavigationBarUtil.getNavigationBarHeight(context);
            }
        }
        return (screenHeight - dimensionPixelOffset) - navigationBarHeight;
    }
}
