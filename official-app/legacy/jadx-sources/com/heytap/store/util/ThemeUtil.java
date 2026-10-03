package com.heytap.store.util;

import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.util.Consumer;
import com.heytap.store.base.core.util.GsonUtils;
import com.heytap.store.base.core.util.SpUtil;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0012H\u0007J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001c¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/util/ThemeUtil;", "", "()V", "THEME_SP_KEY", "", "currentThemeInfo", "Lcom/heytap/store/util/ThemeInfo;", "getCurrentThemeInfo", "()Lcom/heytap/store/util/ThemeInfo;", "setCurrentThemeInfo", "(Lcom/heytap/store/util/ThemeInfo;)V", "getCachedHomeTheme", "", "consumer", "Landroidx/core/util/Consumer;", "observer", "Lcom/heytap/store/base/core/util/SpUtil$SpResultSubscriber;", "parseColorSafely", "", "color", "defaultColor", "saveHomeTheme", "themeInfo", "setForceDarkAllowed", "isAllowDark", "", "views", "", "Landroid/view/View;", "(Z[Landroid/view/View;)V", "businessbase_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ThemeUtil {

    @NotNull
    private static final String THEME_SP_KEY = "homeTheme";

    @NotNull
    public static final ThemeUtil INSTANCE = new ThemeUtil();

    @NotNull
    private static ThemeInfo currentThemeInfo = new ThemeInfo();

    private ThemeUtil() {
    }

    public final void getCachedHomeTheme(@NotNull Consumer<ThemeInfo> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
    }

    @NotNull
    public final ThemeInfo getCurrentThemeInfo() {
        return currentThemeInfo;
    }

    @ColorInt
    public final int parseColorSafely(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        return parseColorSafely(color, -16777216);
    }

    public final void saveHomeTheme(@NotNull ThemeInfo themeInfo) {
        Intrinsics.checkNotNullParameter(themeInfo, "themeInfo");
        currentThemeInfo = themeInfo;
        SpUtil.putStringOnBackground(THEME_SP_KEY, GsonUtils.toJsonString(themeInfo.getInfoMap()));
    }

    public final void setCurrentThemeInfo(@NotNull ThemeInfo themeInfo) {
        Intrinsics.checkNotNullParameter(themeInfo, "<set-?>");
        currentThemeInfo = themeInfo;
    }

    public final void setForceDarkAllowed(boolean isAllowDark, @NotNull View... views) {
        Intrinsics.checkNotNullParameter(views, "views");
        if (views.length == 0) {
            return;
        }
        for (View view : views) {
            view.setForceDarkAllowed(isAllowDark);
        }
    }

    private final void getCachedHomeTheme(SpUtil.SpResultSubscriber<String> observer) {
        SpUtil.getStringAsync(THEME_SP_KEY, GsonUtils.toJsonString(new ThemeInfo()), observer);
    }

    @ColorInt
    public final int parseColorSafely(@NotNull String color, @ColorInt int defaultColor) {
        Intrinsics.checkNotNullParameter(color, "color");
        try {
            return Color.parseColor(color);
        } catch (IllegalArgumentException unused) {
            return defaultColor;
        }
    }
}
