package com.heytap.health.wallet.entrance.autoswitch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes18.dex */
public class MaxHeightRecyclerView extends RecyclerView {
    public int i;

    public interface a {
    }

    public MaxHeightRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.i;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, size), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public void setMaxHeight(int i) {
        this.i = i;
        invalidate();
    }

    public void setScrollViewListener(a aVar) {
    }

    public MaxHeightRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxHeightRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
    }
}
