package com.heytap.nearx.uikit.widget.dialogview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.scrollview.NearNestedScrollView;

/* JADX INFO: loaded from: classes18.dex */
public class NearMaxHeightNestedScrollView extends NearNestedScrollView {
    private int maxHeight;

    public NearMaxHeightNestedScrollView(Context context) {
        this(context, null);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.maxHeight;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, size), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
        requestLayout();
    }

    public NearMaxHeightNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearMaxHeightNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearMaxHeightScrollView);
        this.maxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearMaxHeightScrollView_nxScrollViewMaxHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
