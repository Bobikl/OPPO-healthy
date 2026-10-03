package com.heytap.store.product_support.widget.refresh;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/product_support/widget/refresh/IRefreshStatus;", "", "isNetAvailable", "", "pullProgress", "", "pullDistance", "", "pullToRefresh", "refreshComplete", "refreshing", "releaseToRefresh", "reset", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IRefreshStatus {
    boolean isNetAvailable();

    void pullProgress(float pullDistance, float pullProgress);

    void pullToRefresh();

    void refreshComplete();

    void refreshing();

    void releaseToRefresh();

    void reset();
}
