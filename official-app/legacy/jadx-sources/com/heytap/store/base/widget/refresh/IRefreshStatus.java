package com.heytap.store.base.widget.refresh;

/* JADX INFO: loaded from: classes3.dex */
public interface IRefreshStatus {
    boolean isNetAvailable();

    void pullProgress(float f, float f2);

    void pullToRefresh();

    void refreshComplete();

    void refreshing();

    void releaseToRefresh();

    void reset();
}
