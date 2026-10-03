package com.heytap.health.watchface.business.legacy.creation.album.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes19.dex */
public class SquareItemView extends FrameLayout {
    public SquareItemView(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public SquareItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
