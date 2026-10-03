package com.heytap.health.wallet.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.oplus.aiunit.vision.j3j;

/* JADX INFO: loaded from: classes18.dex */
public class SuitableFontTextView extends DirectionTextView {
    public j3j i;

    public SuitableFontTextView(Context context) {
        this(context, null);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet == null) {
            return;
        }
        this.i.a(this, context, attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        this.i.c(this, f);
    }

    public SuitableFontTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        this.i.d(this, i, f);
    }

    public SuitableFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new j3j();
        a(context, attributeSet, i);
    }
}
