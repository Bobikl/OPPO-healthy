package com.coui.appcompat.panel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.mj2;
import com.oplus.aiunit.vision.zv7;
import com.support.panel.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPanelMultiWindowUtils {
    private static final int DEFAULT_MARGIN_TOP = 40;
    private static final float LARGEST_SCREEN_HEIGHT_DP_THRESHOLD = 809.0f;
    private static final int NAV_STATE_SWIPE_SIDE_GESTURE = 3;
    private static final int SETTING_CLOSE_FLAG = 0;
    private static final int SETTING_OPEN_FLAG = 1;
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

    public static int dp2px(Context context, int i) {
        return Double.valueOf(((double) (context.getResources().getDisplayMetrics().density * i)) + 0.5d).intValue();
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
        int iK = ifk.k(context);
        int statusBarHeight = getStatusBarHeight(context);
        if (COUINavigationBarUtil.isNavigationBarShow(context)) {
            if ((((float) configuration.screenWidthDp) >= SMALLEST_SCREEN_WIDTH_DP_THRESHOLD) || isPortrait(configuration)) {
                navigationBarHeight = COUINavigationBarUtil.getNavigationBarHeight(context);
            }
        }
        return (iK - statusBarHeight) - navigationBarHeight;
    }

    public static int getPanelMarginBottom(Context context, Configuration configuration) {
        if (context == null || configuration == null) {
            return 0;
        }
        int i = configuration.screenWidthDp;
        boolean z = (configuration.screenLayout & 15) == 1;
        boolean z2 = configuration.orientation == 2;
        if (i >= SMALLEST_SCREEN_WIDTH_DP_THRESHOLD || (!z && z2)) {
            return getStatusBarHeight(context) == 0 ? context.createConfigurationContext(configuration).getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_margin_vertical_without_status_bar) : context.createConfigurationContext(configuration).getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_margin_bottom_default);
        }
        return 0;
    }

    public static int getPanelMaxHeight(@NonNull Context context, Configuration configuration) {
        int panelNormalVisibleHeight;
        int panelMarginBottom;
        if (context == null) {
            return 0;
        }
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
        return Math.min(panelNormalVisibleHeight - panelMarginBottom, getPanelPercentFrameLayoutMaxHeight(context, context.getResources().getDimensionPixelOffset(R$dimen.coui_panel_max_height)));
    }

    public static int getPanelNormalVisibleHeight(Context context, Configuration configuration) {
        int navigationBarHeight = 0;
        if (context == null) {
            return 0;
        }
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int iK = ifk.k(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.coui_panel_min_padding_top);
        if (getStatusBarHeight(context) == 0) {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_margin_vertical_without_status_bar);
        }
        boolean zIsNavigationBarShow = COUINavigationBarUtil.isNavigationBarShow(context);
        boolean z = ((configuration.screenLayout & 15) == 2) && (configuration.orientation == 2);
        if (zIsNavigationBarShow) {
            if (((((float) configuration.screenWidthDp) >= SMALLEST_SCREEN_WIDTH_DP_THRESHOLD) || isPortrait(configuration)) && isVirtualNavigation(context) && !z) {
                navigationBarHeight = COUINavigationBarUtil.getNavigationBarHeight(context);
            }
        }
        return (iK - dimensionPixelOffset) - navigationBarHeight;
    }

    public static int getPanelPercentFrameLayoutMaxHeight(Context context, int i) {
        return i;
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
        return ((float) (rect.right - rect.left)) < ((float) ifk.n(activity)) * TWO_THIRDS;
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

    public static boolean isLand(@NonNull Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean isLargeHeightScreen(Context context, Configuration configuration) {
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        return ((float) configuration.screenHeightDp) > LARGEST_SCREEN_HEIGHT_DP_THRESHOLD;
    }

    public static boolean isNormalLandScreen(Context context, Configuration configuration) {
        if (context == null || configuration == null) {
            return false;
        }
        return ((configuration.screenLayout & 15) == 2) && (configuration.orientation == 2);
    }

    public static boolean isNormalScreen(Context context, Configuration configuration) {
        return (context == null || configuration == null || (configuration.screenLayout & 15) != 2) ? false : true;
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

    public static boolean isTaskBarShowInApp(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "enable_launcher_taskbar", 0) == 1;
    }

    public static boolean isVirtualNavigation(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "hide_navigationbar_enable", 0) != 3;
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
            int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(R$dimen.coui_panel_min_padding_top);
            if (getStatusBarHeight(windowInsets, activity) == 0) {
                dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_margin_vertical_without_status_bar);
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

    @Deprecated
    public static int getPanelMarginBottom(Context context, Configuration configuration, WindowInsets windowInsets, boolean z) {
        return getPanelMarginBottom(context, configuration, windowInsets, z, false);
    }

    @Deprecated
    public static int getPanelMaxHeight(@NonNull Context context, Configuration configuration, WindowInsets windowInsets, boolean z) {
        return getPanelMaxHeight(context, configuration, windowInsets, z, false);
    }

    public static int getPanelMarginBottom(Context context, Configuration configuration, WindowInsets windowInsets, boolean z, boolean z2) {
        int navigationBarHeight;
        if (context == null || configuration == null || z) {
            return 0;
        }
        int i = configuration.screenWidthDp;
        boolean z3 = (configuration.screenLayout & 15) == 1;
        boolean z4 = configuration.orientation == 2;
        if (i < SMALLEST_SCREEN_WIDTH_DP_THRESHOLD && (z3 || !z4)) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            navigationBarHeight = windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
        } else {
            navigationBarHeight = COUINavigationBarUtil.getNavigationBarHeight(context);
        }
        if ((context.getResources().getConfiguration().screenLayout & 48) == 32) {
            return Math.max(0, context.createConfigurationContext(configuration).getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_margin_bottom_smallland_default) - navigationBarHeight);
        }
        int dimensionPixelOffset = context.createConfigurationContext(configuration).getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_margin_bottom_default);
        if (z2) {
            return dimensionPixelOffset;
        }
        return Math.max(0, (zv7.k(context) && mj2.b(contextToActivity(context)) && !isVirtualNavigation(context) && isTaskBarShowInApp(context)) ? Math.max(dimensionPixelOffset, navigationBarHeight) : dimensionPixelOffset - navigationBarHeight);
    }

    public static int getPanelMaxHeight(@NonNull Context context, Configuration configuration, WindowInsets windowInsets, boolean z, boolean z2) {
        int panelNormalVisibleHeight;
        int panelMarginBottom;
        if (context == null) {
            return 0;
        }
        Activity activityContextToActivity = contextToActivity(context);
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        if (activityContextToActivity != null) {
            panelNormalVisibleHeight = getCurrentPanelWindowVisibleHeight(activityContextToActivity, configuration, windowInsets);
            panelMarginBottom = getPanelMarginBottom(context, configuration, windowInsets, z, z2);
        } else {
            panelNormalVisibleHeight = getPanelNormalVisibleHeight(context, configuration, windowInsets);
            panelMarginBottom = getPanelMarginBottom(context, configuration, windowInsets, z, z2);
        }
        return Math.min(panelNormalVisibleHeight - panelMarginBottom, getPanelPercentFrameLayoutMaxHeight(context, context.getResources().getDimensionPixelOffset(R$dimen.coui_panel_max_height)));
    }

    public static int getPanelNormalVisibleHeight(Context context, Configuration configuration, WindowInsets windowInsets) {
        int navigationBarHeight = 0;
        if (context == null) {
            return 0;
        }
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int iK = ifk.k(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.coui_panel_min_padding_top);
        if (getStatusBarHeight(windowInsets, context) == 0) {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_margin_vertical_without_status_bar);
        }
        boolean zIsNavigationBarShow = COUINavigationBarUtil.isNavigationBarShow(context);
        boolean z = ((configuration.screenLayout & 15) == 2) && (configuration.orientation == 2);
        if (zIsNavigationBarShow) {
            if (((((float) configuration.screenWidthDp) >= SMALLEST_SCREEN_WIDTH_DP_THRESHOLD) || isPortrait(configuration)) && isVirtualNavigation(context) && !z) {
                navigationBarHeight = COUINavigationBarUtil.getNavigationBarHeight(context);
            }
        }
        return (iK - dimensionPixelOffset) - navigationBarHeight;
    }
}
