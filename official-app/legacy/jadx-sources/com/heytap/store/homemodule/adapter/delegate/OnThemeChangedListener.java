package com.heytap.store.homemodule.adapter.delegate;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/adapter/delegate/OnThemeChangedListener;", "", "defaultTextColor", "", "getDefaultTextColor", "()Ljava/lang/String;", "onIconStyleChanged", "", "styleIdx", "onTextColorChanged", "color", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface OnThemeChangedListener {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static String getDefaultTextColor(@NotNull OnThemeChangedListener onThemeChangedListener) {
            Intrinsics.checkNotNullParameter(onThemeChangedListener, "this");
            return OnThemeChangedListener.super.getDefaultTextColor();
        }

        @Deprecated
        public static void onIconStyleChanged(@NotNull OnThemeChangedListener onThemeChangedListener, @Nullable String str) {
            Intrinsics.checkNotNullParameter(onThemeChangedListener, "this");
            OnThemeChangedListener.super.onIconStyleChanged(str);
        }

        @Deprecated
        public static void onTextColorChanged(@NotNull OnThemeChangedListener onThemeChangedListener, @Nullable String str) {
            Intrinsics.checkNotNullParameter(onThemeChangedListener, "this");
            OnThemeChangedListener.super.onTextColorChanged(str);
        }
    }

    @Nullable
    default String getDefaultTextColor() {
        return "#000000";
    }

    default void onIconStyleChanged(@Nullable String styleIdx) {
    }

    default void onTextColorChanged(@Nullable String color) {
    }
}
