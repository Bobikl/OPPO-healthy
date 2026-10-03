package com.heytap.store.product_support.widget.refresh;

import android.content.Context;
import android.util.AttributeSet;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/heytap/store/product_support/widget/refresh/OStoreSmartRefreshLayout;", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isEnableLoadMore", "", "startFlingIfNeed", "flingVelocity", "", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreSmartRefreshLayout extends SmartRefreshLayout {
    public OStoreSmartRefreshLayout(@Nullable Context context) {
        super(context);
    }

    public final boolean isEnableLoadMore() {
        return this.mEnableLoadMore;
    }

    @Override // com.scwang.smartrefresh.layout.SmartRefreshLayout
    public boolean startFlingIfNeed(float flingVelocity) {
        return super.startFlingIfNeed(flingVelocity);
    }

    public OStoreSmartRefreshLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
