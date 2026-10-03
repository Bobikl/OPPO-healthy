package com.coui.appcompat.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.support.appcompat.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUILinearLayout extends LinearLayout {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2154j;

    public COUILinearLayout(Context context) {
        this(context, null);
    }

    public int getMaxHeight() {
        return this.f2154j;
    }

    public int getMaxWidth() {
        return this.i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (getOrientation() == 0 && this.i >= 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.i), Integer.MIN_VALUE);
        } else if (getOrientation() == 1 && this.f2154j >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.f2154j), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.f2154j = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        this.i = i;
        requestLayout();
    }

    public COUILinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUILinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUILinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUILinearLayout);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUILinearLayout_couiMaxWidth, -1);
        this.f2154j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUILinearLayout_couiMaxHeight, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
