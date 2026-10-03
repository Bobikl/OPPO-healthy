package com.heytap.health.watchface.business.creation.category.paint.widget;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes19.dex */
public class GridLayoutManagerNoScroll extends GridLayoutManager {
    public boolean i;

    public GridLayoutManagerNoScroll(Context context, int i) {
        super(context, i);
        this.i = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.i && super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.i && super.canScrollVertically();
    }
}
