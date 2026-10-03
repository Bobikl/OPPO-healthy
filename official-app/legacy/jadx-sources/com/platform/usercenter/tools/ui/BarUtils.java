package com.platform.usercenter.tools.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.oplus.aiunit.vision.k18;
import com.oplus.wrapper.app.StatusBarManager;
import com.platform.usercenter.tools.UCBasicUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.osdk.CompatUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class BarUtils {
    private static final String ANDROID = "android";
    private static final String DIMEN = "dimen";
    private static final int K_OFFSET = 17;
    private static final String NAVIGATION_BAR_BACKGROUND = "navigationBarBackground";
    private static final String NAVIGATION_BAR_HEIGHT = "navigation_bar_height";
    private static final String STATUS_BAR_HEIGHT = "status_bar_height";
    private static final String TAG = "BarUtils";
    private static final String TAG_OFFSET = "OPPO_TAG_OFFSET";
    private static final String TAG_STATUS_BAR = "TAG_STATUS_BAR";

    private BarUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void addMarginTopEqualStatusBarHeight(@NonNull View view) {
        view.setTag(TAG_OFFSET);
        Object tag = view.getTag(17);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setTag(17, Boolean.TRUE);
        }
    }

    private static View applyStatusBarColor(Activity activity, int i, boolean z) {
        return applyStatusBarColor(activity.getWindow(), i, z);
    }

    private static View createStatusBarView(Context context, int i) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        view.setBackgroundColor(i);
        view.setTag(TAG_STATUS_BAR);
        return view;
    }

    public static int getActionBarHeight(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, Resources.getSystem().getDisplayMetrics());
        }
        return 0;
    }

    private static Activity getActivityByContext(Context context) {
        Activity activityByContextInner = getActivityByContextInner(context);
        if (isActivityAlive(activityByContextInner)) {
            return activityByContextInner;
        }
        return null;
    }

    private static Activity getActivityByContextInner(Context context) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (context instanceof ContextWrapper) {
            if (!(context instanceof Activity)) {
                Activity activityFromDecorContext = getActivityFromDecorContext(context);
                if (activityFromDecorContext == null) {
                    arrayList.add(context);
                    context = ((ContextWrapper) context).getBaseContext();
                    if (context == null || arrayList.contains(context)) {
                        break;
                    }
                } else {
                    return activityFromDecorContext;
                }
            } else {
                return (Activity) context;
            }
        }
        return null;
    }

    private static Activity getActivityFromDecorContext(Context context) {
        if (context != null && context.getClass().getName().equals("com.android.internal.policy.DecorContext")) {
            try {
                Field declaredField = context.getClass().getDeclaredField("mActivityContext");
                declaredField.setAccessible(true);
                return (Activity) ((WeakReference) declaredField.get(context)).get();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @RequiresApi(21)
    public static int getNavBarColor(@NonNull Activity activity) {
        return getNavBarColor(activity.getWindow());
    }

    public static int getNavBarHeight() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier(NAVIGATION_BAR_HEIGHT, "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static String getResNameById(Context context, int i) {
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getStatusBarHeight() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier(STATUS_BAR_HEIGHT, "dimen", "android"));
    }

    private static void hideStatusBarView(Activity activity) {
        hideStatusBarView(activity.getWindow());
    }

    private static void invokePanels(Context context, String str) {
        Object systemService = UCBasicUtils.sContext.getApplicationContext().getSystemService("statusbar");
        if (CompatUtils.check(30, 1)) {
            try {
                StatusBarManager statusBarManager = new StatusBarManager((android.app.StatusBarManager) systemService);
                if (TextUtils.equals(str, "expandNotificationsPanel")) {
                    statusBarManager.expandNotificationsPanel();
                    return;
                } else if (TextUtils.equals(str, "collapsePanels")) {
                    statusBarManager.collapsePanels();
                    return;
                }
            } catch (Throwable th) {
                UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + "addon：" + th);
            }
        }
        try {
            Class.forName("android.app.StatusBarManager").getMethod(str, new Class[0]).invoke(systemService, new Object[0]);
        } catch (Exception e2) {
            UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + e2);
        }
    }

    private static boolean isActivityAlive(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static boolean isNavBarLightMode(@NonNull Activity activity) {
        return isNavBarLightMode(activity.getWindow());
    }

    public static boolean isNavBarVisible(@NonNull Activity activity) {
        return isNavBarVisible(activity.getApplicationContext(), activity.getWindow());
    }

    @Deprecated
    public static boolean isStatusBarLightMode(@NonNull Activity activity) {
        return isStatusBarLightMode(activity.getWindow());
    }

    public static boolean isStatusBarLightModeCompat(@NonNull Window window) {
        return ViewCompat.getWindowInsetsController(window.getDecorView()).isAppearanceLightStatusBars();
    }

    public static boolean isStatusBarVisible(@NonNull Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 0;
    }

    public static boolean isSupportNavBar(Context context) {
        if (((WindowManager) context.getApplicationContext().getSystemService("window")) == null) {
            return false;
        }
        return (DisplayUtil.getRealScreenHeight(context) == DisplayUtil.getScreenDisplayHeight(context) && DisplayUtil.getRealScreenWidth(context) == DisplayUtil.getScreenDisplayWidth(context)) ? false : true;
    }

    @RequiresApi(21)
    public static void setNavBarColor(@NonNull Activity activity, @ColorInt int i) {
        setNavBarColor(activity.getWindow(), i);
    }

    public static void setNavBarLightMode(@NonNull Activity activity, boolean z) {
        setNavBarLightMode(activity.getWindow(), z);
    }

    public static void setNavBarVisibility(@NonNull Activity activity, boolean z) {
        setNavBarVisibility(activity.getApplicationContext(), activity.getWindow(), z);
    }

    @RequiresPermission("android.permission.EXPAND_STATUS_BAR")
    public static void setNotificationBarVisibility(Context context, boolean z) {
        invokePanels(context, z ? "expandNotificationsPanel" : "collapsePanels");
    }

    public static View setStatusBarColor(@NonNull Activity activity, @ColorInt int i) {
        return setStatusBarColor(activity, i, false);
    }

    public static void setStatusBarColor4Drawer(@NonNull DrawerLayout drawerLayout, @NonNull View view, @ColorInt int i) {
        setStatusBarColor4Drawer(drawerLayout, view, i, false);
    }

    public static void setStatusBarCustom(@NonNull View view) {
        Activity activityByContext = getActivityByContext(view.getContext());
        if (activityByContext == null) {
            return;
        }
        transparentStatusBar(activityByContext);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        } else {
            layoutParams.width = -1;
            layoutParams.height = getStatusBarHeight();
        }
    }

    @Deprecated
    public static void setStatusBarLightMode(@NonNull Activity activity, boolean z) {
        setStatusBarLightMode(activity.getWindow(), z);
    }

    public static void setStatusBarLightModeCompat(@NonNull Window window, boolean z) {
        ViewCompat.getWindowInsetsController(window.getDecorView()).setAppearanceLightStatusBars(z);
    }

    public static void setStatusBarVisibility(@NonNull Activity activity, boolean z) {
        setStatusBarVisibility(activity.getWindow(), z);
    }

    @RequiresApi(api = 30)
    public static void setStatusBarVisibilityHasR(@NonNull Window window, boolean z) {
        WindowInsetsController insetsController = window.getInsetsController();
        if (z) {
            insetsController.show(WindowInsets.Type.statusBars());
        } else {
            insetsController.hide(WindowInsets.Type.statusBars());
        }
    }

    private static void showStatusBarView(Window window) {
        View viewFindViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag(TAG_STATUS_BAR);
        if (viewFindViewWithTag == null) {
            return;
        }
        viewFindViewWithTag.setVisibility(0);
    }

    public static void subtractMarginTopEqualStatusBarHeight(@NonNull View view) {
        Object tag = view.getTag(17);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin - getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setTag(17, Boolean.FALSE);
    }

    public static void transparentStatusBar(Activity activity) {
        transparentStatusBar(activity.getWindow());
    }

    private static View applyStatusBarColor(Window window, int i, boolean z) {
        ViewGroup viewGroup = z ? (ViewGroup) window.getDecorView() : (ViewGroup) window.findViewById(R.id.content);
        View viewFindViewWithTag = viewGroup.findViewWithTag(TAG_STATUS_BAR);
        if (viewFindViewWithTag == null) {
            View viewCreateStatusBarView = createStatusBarView(window.getContext(), i);
            viewGroup.addView(viewCreateStatusBarView);
            return viewCreateStatusBarView;
        }
        if (viewFindViewWithTag.getVisibility() == 8) {
            viewFindViewWithTag.setVisibility(0);
        }
        viewFindViewWithTag.setBackgroundColor(i);
        return viewFindViewWithTag;
    }

    @RequiresApi(21)
    public static int getNavBarColor(@NonNull Window window) {
        return window.getNavigationBarColor();
    }

    private static void hideStatusBarView(Window window) {
        View viewFindViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag(TAG_STATUS_BAR);
        if (viewFindViewWithTag == null) {
            return;
        }
        viewFindViewWithTag.setVisibility(8);
    }

    public static boolean isNavBarLightMode(@NonNull Window window) {
        return (window.getDecorView().getSystemUiVisibility() & 16) != 0;
    }

    public static boolean isNavBarVisible(Context context, @NonNull Window window) {
        boolean z;
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            int id = childAt.getId();
            if (id != -1 && NAVIGATION_BAR_BACKGROUND.equals(getResNameById(context, id)) && childAt.getVisibility() == 0) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return (viewGroup.getSystemUiVisibility() & 2) == 0;
        }
        return z;
    }

    @Deprecated
    public static boolean isStatusBarLightMode(@NonNull Window window) {
        return (window.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @RequiresApi(21)
    public static void setNavBarColor(@NonNull Window window, @ColorInt int i) {
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(i);
    }

    public static void setNavBarLightMode(@NonNull Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility | 16 : systemUiVisibility & (-17));
    }

    public static void setNavBarVisibility(Context context, @NonNull Window window, boolean z) {
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            int id = childAt.getId();
            if (id != -1 && NAVIGATION_BAR_BACKGROUND.equals(getResNameById(context, id))) {
                childAt.setVisibility(z ? 0 : 4);
            }
        }
        if (z) {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4611));
        } else {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 4610);
        }
    }

    public static View setStatusBarColor(@NonNull Activity activity, @ColorInt int i, boolean z) {
        transparentStatusBar(activity);
        return applyStatusBarColor(activity, i, z);
    }

    public static void setStatusBarColor4Drawer(@NonNull DrawerLayout drawerLayout, @NonNull View view, @ColorInt int i, boolean z) {
        Activity activityByContext = getActivityByContext(view.getContext());
        if (activityByContext == null) {
            return;
        }
        transparentStatusBar(activityByContext);
        drawerLayout.setFitsSystemWindows(false);
        setStatusBarColor(view, i);
        int childCount = drawerLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            drawerLayout.getChildAt(i2).setFitsSystemWindows(false);
        }
        if (z) {
            hideStatusBarView(activityByContext);
        } else {
            setStatusBarColor(activityByContext, i, false);
        }
    }

    public static void setStatusBarLightMode(@NonNull Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public static void setStatusBarVisibility(@NonNull Window window, boolean z) {
        if (z) {
            window.clearFlags(1024);
            showStatusBarView(window);
            addMarginTopEqualStatusBarHeight(window);
        } else {
            window.addFlags(1024);
            hideStatusBarView(window);
            subtractMarginTopEqualStatusBarHeight(window);
        }
    }

    public static void transparentStatusBar(Window window) {
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | k18.GL_INVALID_ENUM);
        window.setStatusBarColor(0);
    }

    public static View setStatusBarColor(@NonNull Window window, @ColorInt int i) {
        return setStatusBarColor(window, i, false);
    }

    public static View setStatusBarColor(@NonNull Window window, @ColorInt int i, boolean z) {
        transparentStatusBar(window);
        return applyStatusBarColor(window, i, z);
    }

    public static void setStatusBarColor(@NonNull View view, @ColorInt int i) {
        Activity activityByContext = getActivityByContext(view.getContext());
        if (activityByContext == null) {
            return;
        }
        transparentStatusBar(activityByContext);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = getStatusBarHeight();
        view.setBackgroundColor(i);
    }

    private static void subtractMarginTopEqualStatusBarHeight(Window window) {
        View viewFindViewWithTag = window.getDecorView().findViewWithTag(TAG_OFFSET);
        if (viewFindViewWithTag == null) {
            return;
        }
        subtractMarginTopEqualStatusBarHeight(viewFindViewWithTag);
    }

    private static void addMarginTopEqualStatusBarHeight(Window window) {
        View viewFindViewWithTag = window.getDecorView().findViewWithTag(TAG_OFFSET);
        if (viewFindViewWithTag == null) {
            return;
        }
        addMarginTopEqualStatusBarHeight(viewFindViewWithTag);
    }
}
