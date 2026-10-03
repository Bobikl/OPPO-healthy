package com.heytap.store.homemodule;

import androidx.fragment.app.Fragment;
import com.heytap.store.homemodule.data.HomeTabItemBean;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\bH&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0011H&¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/TopbarThemeState;", "", "applyTabNewData", "", "bean", "Lcom/heytap/store/homemodule/data/HomeTabItemBean;", "changeTabVisible", "dy", "", "getPageId", "", "onChildScrollVertically", "fragment", "Landroidx/fragment/app/Fragment;", "scrollY", "", "forceRefresh", "", "onGetParenTopBarHeight", "onRefreshPullDown", ParserTag.TAG_PERCENT, "updateTopBarIconStyle", "useLightIcon", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface TopbarThemeState {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void changeTabVisible(@NotNull TopbarThemeState topbarThemeState, float f) {
            Intrinsics.checkNotNullParameter(topbarThemeState, "this");
            TopbarThemeState.super.changeTabVisible(f);
        }

        @Deprecated
        public static void onChildScrollVertically(@NotNull TopbarThemeState topbarThemeState, @NotNull Fragment fragment, int i, boolean z) {
            Intrinsics.checkNotNullParameter(topbarThemeState, "this");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            TopbarThemeState.super.onChildScrollVertically(fragment, i, z);
        }
    }

    void applyTabNewData(@Nullable HomeTabItemBean bean);

    default void changeTabVisible(float dy) {
    }

    @NotNull
    String getPageId();

    default void onChildScrollVertically(@NotNull Fragment fragment, int scrollY, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    int onGetParenTopBarHeight();

    void onRefreshPullDown(@NotNull Fragment fragment, float percent);

    void updateTopBarIconStyle(boolean useLightIcon);
}
