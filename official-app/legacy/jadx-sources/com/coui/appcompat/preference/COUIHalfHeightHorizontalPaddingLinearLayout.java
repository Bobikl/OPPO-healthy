package com.coui.appcompat.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.support.preference.R$dimen;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIHalfHeightHorizontalPaddingLinearLayout extends LinearLayout {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f1904j;
    public View k;

    public COUIHalfHeightHorizontalPaddingLinearLayout(Context context) {
        super(context);
        this.i = 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() == 2) {
            this.f1904j = getChildAt(0);
            this.k = getChildAt(1);
            if (this.f1904j.getMeasuredHeight() < this.k.getMeasuredHeight()) {
                setPadding(getPaddingStart(), 0, getPaddingEnd(), 0);
            }
            int measuredHeight = getMeasuredHeight() / 2;
            if (measuredHeight >= this.i) {
                return;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.support_preference_category_layout_title_margin_end_large);
            if (measuredHeight != getPaddingStart() || measuredHeight != getPaddingEnd() || layoutParams.getMarginEnd() == dimensionPixelSize || layoutParams.getMarginEnd() == 0) {
                setPadding(measuredHeight, getPaddingTop(), measuredHeight, getPaddingBottom());
                if (measuredHeight < this.i) {
                    layoutParams.setMarginEnd((layoutParams.getMarginEnd() + this.i) - measuredHeight);
                    setLayoutParams(layoutParams);
                }
                super.onMeasure(i, i2);
            }
        }
    }

    public COUIHalfHeightHorizontalPaddingLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIHalfHeightHorizontalPaddingLinearLayout);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIHalfHeightHorizontalPaddingLinearLayout_fixPaddingEnd, this.i);
        typedArrayObtainStyledAttributes.recycle();
    }
}
