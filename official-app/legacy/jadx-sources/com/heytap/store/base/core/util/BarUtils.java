package com.heytap.store.base.core.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\u0010\u001a\u00020\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"TAG_STATUS_BAR", "", "applyStatusBarColor", "", "activity", "Landroid/app/Activity;", "color", "", "isDecor", "", "window", "Landroid/view/Window;", "createStatusBarView", "Landroid/view/View;", "context", "Landroid/content/Context;", "getStatusBarHeight", "setStatusBarColor", "Core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@JvmName(name = "BarUtils")
public final class BarUtils {

    @Nullable
    private static final String TAG_STATUS_BAR = "TAG_STATUS_BAR";

    public static final void applyStatusBarColor(@NotNull Activity activity, int i, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        applyStatusBarColor(window, i, z);
    }

    @Nullable
    public static final View createStatusBarView(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        view.setBackgroundColor(i);
        view.setTag(TAG_STATUS_BAR);
        return view;
    }

    public static final int getStatusBarHeight() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android"));
    }

    public static final void setStatusBarColor(@NotNull Window window, int i) {
        Intrinsics.checkNotNullParameter(window, "window");
        applyStatusBarColor(window, i, false);
    }

    public static final void applyStatusBarColor(@NotNull Window window, int i, boolean z) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.setStatusBarColor(i);
    }

    public static final void setStatusBarColor(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        applyStatusBarColor(window, i, false);
    }
}
