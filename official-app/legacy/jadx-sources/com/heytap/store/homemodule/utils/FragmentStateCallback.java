package com.heytap.store.homemodule.utils;

import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/utils/FragmentStateCallback;", "", "changeTabVisible", "", "progress", "", "getParentFragment", "Landroidx/fragment/app/Fragment;", "getTabLayoutHeight", "getTopPadding", "isDisablePullDownRefresh", "", "isTabVisible", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface FragmentStateCallback {
    void changeTabVisible(float progress);

    @Nullable
    Fragment getParentFragment();

    float getTabLayoutHeight();

    float getTopPadding();

    boolean isDisablePullDownRefresh();

    boolean isTabVisible();
}
