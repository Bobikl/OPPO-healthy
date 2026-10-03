package com.heytap.store.platform.tools;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.k18;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0006\u0010\u0018\u001a\u00020\u0004J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u0006\u0010\u001b\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010 \u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010!\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0004H\u0007J\u001a\u0010!\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0004H\u0007J\u0016\u0010\"\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0013J\u0016\u0010\"\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0013J\u0016\u0010$\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0013J\u0016\u0010$\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0013J\u001a\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0004J\"\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013J\"\u0010&\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010'\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0004J\u001a\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0004J\"\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010(\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0013J\u0016\u0010(\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0013J\u0016\u0010)\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0013J\u0016\u0010)\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0013J\u0010\u0010*\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010+\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010+\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010,\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010,\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/heytap/store/platform/tools/SystemUIUtils;", "", "()V", "KEY_OFFSET", "", SystemUIUtils.TAG_OFFSET, "", SystemUIUtils.TAG_STATUS_BAR, "addMarginTopEqualStatusBarHeight", "", "view", "Landroid/view/View;", "window", "Landroid/view/Window;", "applyStatusBarColor", "activity", "Landroid/app/Activity;", "color", "isDecor", "", "createStatusBarView", "context", "Landroid/content/Context;", "getNavBarColor", "getNavBarHeight", "getResNameById", "id", "getStatusBarHeight", "hideStatusBarView", "isNavBarLightMode", "isNavBarVisible", "isStatusBarLightMode", "isStatusBarVisible", "setNavBarColor", "setNavBarLightMode", "isLightMode", "setNavBarVisibility", "isVisible", "setStatusBarColor", "fakeStatusBar", "setStatusBarLightMode", "setStatusBarVisibility", "showStatusBarView", "subtractMarginTopEqualStatusBarHeight", "transparentStatusBar", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class SystemUIUtils {
    public static final SystemUIUtils INSTANCE = new SystemUIUtils();
    private static final int KEY_OFFSET = -123;
    private static final String TAG_OFFSET = "TAG_OFFSET";
    private static final String TAG_STATUS_BAR = "TAG_STATUS_BAR";

    private SystemUIUtils() {
    }

    private final View applyStatusBarColor(Activity activity, int color, boolean isDecor) {
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        return applyStatusBarColor(window, color, isDecor);
    }

    private final View createStatusBarView(Context context, int color) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        view.setBackgroundColor(color);
        view.setTag(TAG_STATUS_BAR);
        return view;
    }

    private final String getResNameById(Context context, int id) {
        try {
            String resourceEntryName = context.getResources().getResourceEntryName(id);
            Intrinsics.checkNotNullExpressionValue(resourceEntryName, "context.resources.getResourceEntryName(id)");
            return resourceEntryName;
        } catch (Exception unused) {
            return "";
        }
    }

    private final void hideStatusBarView(Activity activity) {
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        hideStatusBarView(window);
    }

    private final void showStatusBarView(Window window) {
        View decorView = window.getDecorView();
        if (decorView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        View viewFindViewWithTag = ((ViewGroup) decorView).findViewWithTag(TAG_STATUS_BAR);
        if (viewFindViewWithTag != null) {
            viewFindViewWithTag.setVisibility(0);
        }
    }

    public final void addMarginTopEqualStatusBarHeight(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(TAG_OFFSET);
        Object tag = view.getTag(KEY_OFFSET);
        Intrinsics.checkNotNullExpressionValue(tag, "view.getTag(KEY_OFFSET)");
        if (tag == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        if (((Boolean) tag).booleanValue()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setTag(KEY_OFFSET, Boolean.TRUE);
    }

    @RequiresApi(21)
    public final int getNavBarColor(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        return getNavBarColor(window);
    }

    public final int getNavBarHeight() {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        int identifier = system.getIdentifier("navigation_bar_height", ResourcesUtil.ResourceType.DIMEN, "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final int getStatusBarHeight() {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android"));
    }

    public final boolean isNavBarLightMode(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        return isNavBarLightMode(window);
    }

    public final boolean isNavBarVisible(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        return isNavBarVisible(window);
    }

    public final boolean isStatusBarLightMode(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        return isStatusBarLightMode(window);
    }

    public final boolean isStatusBarVisible(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        return (window.getAttributes().flags & 1024) == 0;
    }

    @RequiresApi(21)
    public final void setNavBarColor(@NotNull Activity activity, @ColorInt int color) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        setNavBarColor(window, color);
    }

    public final void setNavBarLightMode(@NotNull Activity activity, boolean isLightMode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        setNavBarLightMode(window, isLightMode);
    }

    public final void setNavBarVisibility(@NotNull Activity activity, boolean isVisible) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        setNavBarVisibility(window, isVisible);
    }

    @Nullable
    public final View setStatusBarColor(@NotNull Activity activity, @ColorInt int color) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return setStatusBarColor(activity, color, false);
    }

    public final void setStatusBarLightMode(@NotNull Activity activity, boolean isLightMode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        setStatusBarLightMode(window, isLightMode);
    }

    public final void setStatusBarVisibility(@NotNull Activity activity, boolean isVisible) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        setStatusBarVisibility(window, isVisible);
    }

    public final void subtractMarginTopEqualStatusBarHeight(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag = view.getTag(KEY_OFFSET);
        Intrinsics.checkNotNullExpressionValue(tag, "view.getTag(KEY_OFFSET)");
        if (tag == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        if (((Boolean) tag).booleanValue()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin - getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setTag(KEY_OFFSET, Boolean.FALSE);
        }
    }

    public final void transparentStatusBar(@Nullable Activity activity) {
        transparentStatusBar(activity != null ? activity.getWindow() : null);
    }

    private final View applyStatusBarColor(Window window, int color, boolean isDecor) {
        ViewGroup viewGroup;
        if (isDecor) {
            View decorView = window.getDecorView();
            if (decorView == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            viewGroup = (ViewGroup) decorView;
        } else {
            View viewFindViewById = window.findViewById(android.R.id.content);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            viewGroup = (ViewGroup) viewFindViewById;
        }
        View viewFindViewWithTag = viewGroup.findViewWithTag(TAG_STATUS_BAR);
        if (viewFindViewWithTag != null) {
            if (viewFindViewWithTag.getVisibility() == 8) {
                viewFindViewWithTag.setVisibility(0);
            }
            viewFindViewWithTag.setBackgroundColor(color);
            return viewFindViewWithTag;
        }
        Context context = window.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "window.context");
        View viewCreateStatusBarView = createStatusBarView(context, color);
        viewGroup.addView(viewCreateStatusBarView);
        return viewCreateStatusBarView;
    }

    private final void hideStatusBarView(Window window) {
        View decorView = window.getDecorView();
        if (decorView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        View viewFindViewWithTag = ((ViewGroup) decorView).findViewWithTag(TAG_STATUS_BAR);
        if (viewFindViewWithTag != null) {
            viewFindViewWithTag.setVisibility(8);
        }
    }

    @RequiresApi(21)
    public final int getNavBarColor(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        return window.getNavigationBarColor();
    }

    public final boolean isNavBarLightMode(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        return (decorView.getSystemUiVisibility() & 16) != 0;
    }

    public final boolean isNavBarVisible(@NotNull Window window) {
        boolean z;
        Intrinsics.checkNotNullParameter(window, "window");
        View decorView = window.getDecorView();
        if (decorView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) decorView;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "decorView.getChildAt(i)");
            int id = childAt.getId();
            if (id != -1) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "decorView.context");
                if (Intrinsics.areEqual("navigationBarBackground", getResNameById(context, id)) && childAt.getVisibility() == 0) {
                    z = true;
                    break;
                }
            }
            i++;
        }
        if (z) {
            return (viewGroup.getSystemUiVisibility() & 2) == 0;
        }
        return z;
    }

    public final boolean isStatusBarLightMode(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        return (decorView.getSystemUiVisibility() & 8192) != 0;
    }

    @RequiresApi(21)
    public final void setNavBarColor(@NotNull Window window, @ColorInt int color) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(color);
    }

    public final void setNavBarLightMode(@NotNull Window window, boolean isLightMode) {
        Intrinsics.checkNotNullParameter(window, "window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(isLightMode ? systemUiVisibility | 16 : systemUiVisibility & (-17));
    }

    public final void setNavBarVisibility(@NotNull Window window, boolean isVisible) {
        Intrinsics.checkNotNullParameter(window, "window");
        View decorView = window.getDecorView();
        if (decorView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) decorView;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "decorView.getChildAt(i)");
            int id = childAt.getId();
            if (id != -1) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "decorView.context");
                if (Intrinsics.areEqual("navigationBarBackground", getResNameById(context, id))) {
                    childAt.setVisibility(isVisible ? 0 : 4);
                }
            }
        }
        if (isVisible) {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4611));
        } else {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 4610);
        }
    }

    @Nullable
    public final View setStatusBarColor(@NotNull Activity activity, @ColorInt int color, boolean isDecor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        transparentStatusBar(activity);
        return applyStatusBarColor(activity, color, isDecor);
    }

    public final void setStatusBarLightMode(@NotNull Window window, boolean isLightMode) {
        Intrinsics.checkNotNullParameter(window, "window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(isLightMode ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public final void setStatusBarVisibility(@NotNull Window window, boolean isVisible) {
        Intrinsics.checkNotNullParameter(window, "window");
        if (isVisible) {
            window.clearFlags(1024);
            showStatusBarView(window);
            addMarginTopEqualStatusBarHeight(window);
        } else {
            window.addFlags(1024);
            hideStatusBarView(window);
            subtractMarginTopEqualStatusBarHeight(window);
        }
    }

    public final void transparentStatusBar(@Nullable Window window) {
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "it.decorView");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            View decorView2 = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView2, "it.decorView");
            decorView2.setSystemUiVisibility(systemUiVisibility | k18.GL_INVALID_ENUM);
            window.setStatusBarColor(0);
        }
    }

    @Nullable
    public final View setStatusBarColor(@NotNull Window window, @ColorInt int color) {
        Intrinsics.checkNotNullParameter(window, "window");
        return setStatusBarColor(window, color, false);
    }

    @Nullable
    public final View setStatusBarColor(@NotNull Window window, @ColorInt int color, boolean isDecor) {
        Intrinsics.checkNotNullParameter(window, "window");
        transparentStatusBar(window);
        return applyStatusBarColor(window, color, isDecor);
    }

    public final void setStatusBarColor(@Nullable Activity activity, @NotNull View fakeStatusBar, @ColorInt int color) {
        Intrinsics.checkNotNullParameter(fakeStatusBar, "fakeStatusBar");
        if (activity == null) {
            return;
        }
        transparentStatusBar(activity);
        fakeStatusBar.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = fakeStatusBar.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = getStatusBarHeight();
        fakeStatusBar.setBackgroundColor(color);
    }

    private final void subtractMarginTopEqualStatusBarHeight(Window window) {
        View viewFindViewWithTag = window.getDecorView().findViewWithTag(TAG_OFFSET);
        if (viewFindViewWithTag != null) {
            subtractMarginTopEqualStatusBarHeight(viewFindViewWithTag);
        }
    }

    private final void addMarginTopEqualStatusBarHeight(Window window) {
        View viewFindViewWithTag = window.getDecorView().findViewWithTag(TAG_OFFSET);
        if (viewFindViewWithTag != null) {
            addMarginTopEqualStatusBarHeight(viewFindViewWithTag);
        }
    }
}
