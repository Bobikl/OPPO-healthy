package com.heytap.health.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes15.dex */
public class SquareImageView extends AppCompatImageView {
    public SquareImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(View.MeasureSpec.getSize(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824)), View.MeasureSpec.getSize(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824)));
    }

    public SquareImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
