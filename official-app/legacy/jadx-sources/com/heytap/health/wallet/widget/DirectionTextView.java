package com.heytap.health.wallet.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.oplus.aiunit.vision.kt5;

/* JADX INFO: loaded from: classes18.dex */
public class DirectionTextView extends TextView {
    public DirectionTextView(Context context) {
        this(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet == null) {
            return;
        }
        kt5.a(this, context, attributeSet, i);
    }

    public DirectionTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DirectionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }
}
