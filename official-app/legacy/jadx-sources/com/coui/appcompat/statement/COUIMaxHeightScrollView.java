package com.coui.appcompat.statement;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.coui.appcompat.scrollview.COUIScrollView;
import com.support.scrollview.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIMaxHeightScrollView extends COUIScrollView {
    public int f0;
    public int g0;

    public COUIMaxHeightScrollView(Context context) {
        this(context, null);
    }

    public int getMaxHeight() {
        return this.f0;
    }

    public int getMinHeight() {
        return this.g0;
    }

    @Override // com.coui.appcompat.scrollview.COUIScrollView, android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f0;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, size), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i4 = this.g0;
        if (measuredHeight < i4) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
    }

    public void setMaxHeight(int i) {
        this.f0 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        this.g0 = i;
        requestLayout();
    }

    public COUIMaxHeightScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIMaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIMaxHeightScrollView);
        this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIMaxHeightScrollView_scrollViewMaxHeight, 0);
        this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIMaxHeightScrollView_scrollViewMinHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
