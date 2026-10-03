package com.heytap.health.wallet.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import io.protostuff.runtime.RuntimeSchema;

/* JADX INFO: loaded from: classes18.dex */
public class NotScrollListview extends ListView {
    public NotScrollListview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(RuntimeSchema.MAX_TAG_VALUE, Integer.MIN_VALUE));
    }
}
