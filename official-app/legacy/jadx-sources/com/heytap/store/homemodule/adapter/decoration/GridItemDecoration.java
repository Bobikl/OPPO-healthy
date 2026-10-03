package com.heytap.store.homemodule.adapter.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.platform.tools.ContextGetterUtils;

/* JADX INFO: loaded from: classes5.dex */
public class GridItemDecoration extends RecyclerView.ItemDecoration {
    private final boolean includeEdge;
    private boolean isHasHeader;
    private boolean isUgLanguage;
    private final int spacing;
    private final int spanCount;
    private int specialTopEdge;
    private int topSpacing;

    public GridItemDecoration(int i, float f, boolean z) {
        this.topSpacing = 0;
        this.spanCount = i;
        this.spacing = DisplayUtil.dip2px(ContextGetterUtils.INSTANCE.getApp(), f);
        this.includeEdge = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.spanCount;
        int i2 = childAdapterPosition % i;
        if (this.includeEdge) {
            int i3 = this.spacing;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (childAdapterPosition < i) {
                int i4 = this.specialTopEdge;
                if (i4 <= 0) {
                    i4 = i3;
                }
                rect.top = i4;
            }
            rect.bottom = i3;
            return;
        }
        if (this.isUgLanguage) {
            int i5 = this.spacing;
            rect.right = (i2 * i5) / i;
            rect.left = i5 - (((i2 + 1) * i5) / i);
            if (childAdapterPosition >= i) {
                rect.top = i5;
                return;
            }
            return;
        }
        if (!this.isHasHeader) {
            int i6 = this.spacing;
            rect.left = (i2 * i6) / i;
            rect.right = i6 - (((i2 + 1) * i6) / i);
            if (childAdapterPosition >= i) {
                int i7 = this.topSpacing;
                if (i7 == 0) {
                    int i8 = this.specialTopEdge;
                    if (i8 > 0) {
                        i6 = i8;
                    }
                    rect.top = i6;
                    return;
                }
                int i9 = this.specialTopEdge;
                if (i9 > 0) {
                    i7 = i9;
                }
                rect.top = i7;
                return;
            }
            return;
        }
        if (childAdapterPosition != 0) {
            int i10 = this.spacing;
            rect.right = (i2 * i10) / i;
            rect.left = i10 - (((i2 + 1) * i10) / i);
            if (childAdapterPosition > i) {
                int i11 = this.topSpacing;
                if (i11 == 0) {
                    int i12 = this.specialTopEdge;
                    if (i12 > 0) {
                        i10 = i12;
                    }
                    rect.top = i10;
                    return;
                }
                int i13 = this.specialTopEdge;
                if (i13 > 0) {
                    i11 = i13;
                }
                rect.top = i11;
            }
        }
    }

    public void setSpecialTopEdge(int i) {
        this.specialTopEdge = DisplayUtil.dip2px(ContextGetterUtils.INSTANCE.getApp(), i);
    }

    public GridItemDecoration(int i, float f, boolean z, float f2) {
        this.topSpacing = 0;
        this.spanCount = i;
        ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
        this.topSpacing = DisplayUtil.dip2px(contextGetterUtils.getApp(), f2);
        this.spacing = DisplayUtil.dip2px(contextGetterUtils.getApp(), f);
        this.includeEdge = z;
    }

    public GridItemDecoration(int i, float f, boolean z, boolean z2) {
        this.topSpacing = 0;
        this.isUgLanguage = z;
        this.spanCount = i;
        this.spacing = DisplayUtil.dip2px(ContextGetterUtils.INSTANCE.getApp(), f);
        this.includeEdge = z2;
    }

    public GridItemDecoration(int i, float f, boolean z, boolean z2, boolean z3) {
        this.topSpacing = 0;
        this.isUgLanguage = z;
        this.spanCount = i;
        this.spacing = DisplayUtil.dip2px(ContextGetterUtils.INSTANCE.getApp(), f);
        this.includeEdge = z2;
        this.isHasHeader = z3;
    }
}
