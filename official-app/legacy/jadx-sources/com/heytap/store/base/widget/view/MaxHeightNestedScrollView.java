package com.heytap.store.base.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import com.heytap.store.base.widget.R;
import com.oplus.aiunit.vision.whc;

/* JADX INFO: loaded from: classes3.dex */
public class MaxHeightNestedScrollView extends NestedScrollView {
    private int maxHeight;

    public MaxHeightNestedScrollView(@NonNull Context context) {
        super(context);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaxHeightNestedScrollView);
        if (typedArrayObtainStyledAttributes != null) {
            this.maxHeight = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.MaxHeightNestedScrollView_maxHeight, 500);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iG = this.maxHeight;
        if (iG > 0) {
            if (iG / whc.g(getContext()) >= 0.6f) {
                iG = (int) (((double) whc.g(getContext())) * 0.6d);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(iG, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public MaxHeightNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public MaxHeightNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
