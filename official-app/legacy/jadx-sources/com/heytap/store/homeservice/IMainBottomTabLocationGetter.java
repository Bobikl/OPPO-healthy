package com.heytap.store.homeservice;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/homeservice/IMainBottomTabLocationGetter;", "", "getBottomTabLocationX", "", "index", "getBottomTabWidth", "getTabIndexByName", "tabName", "", "onJumpToNewTab", "", "com.heytap.store.business.home-service"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IMainBottomTabLocationGetter {
    int getBottomTabLocationX(int index);

    int getBottomTabWidth(int index);

    int getTabIndexByName(@NotNull String tabName);

    void onJumpToNewTab(int index);
}
