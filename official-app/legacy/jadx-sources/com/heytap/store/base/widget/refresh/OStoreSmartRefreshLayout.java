package com.heytap.store.base.widget.refresh;

import android.content.Context;
import android.util.AttributeSet;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public class OStoreSmartRefreshLayout extends SmartRefreshLayout {
    public OStoreSmartRefreshLayout(Context context) {
        super(context);
    }

    public boolean isEnableLoadMore() {
        return this.mEnableLoadMore;
    }

    @Override // com.scwang.smartrefresh.layout.SmartRefreshLayout
    public boolean startFlingIfNeed(float f) {
        return super.startFlingIfNeed(f);
    }

    public OStoreSmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
