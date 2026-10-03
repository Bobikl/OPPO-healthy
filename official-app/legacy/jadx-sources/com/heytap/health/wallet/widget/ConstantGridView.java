package com.heytap.health.wallet.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import io.protostuff.runtime.RuntimeSchema;

/* JADX INFO: loaded from: classes18.dex */
public class ConstantGridView extends GridView {
    public ConstantGridView(Context context) {
        this(context, null);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(RuntimeSchema.MAX_TAG_VALUE, Integer.MIN_VALUE));
    }

    public ConstantGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConstantGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
