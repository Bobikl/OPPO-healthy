package com.heytap.health.wallet.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.oplus.aiunit.vision.j3j;

/* JADX INFO: loaded from: classes18.dex */
public class SuitableFontButton extends Button {
    public j3j i;

    public SuitableFontButton(Context context) {
        this(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet == null) {
            return;
        }
        this.i.a(this, context, attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        this.i.c(this, f);
    }

    public SuitableFontButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        this.i.d(this, i, f);
    }

    public SuitableFontButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new j3j();
        a(context, attributeSet, i);
    }
}
