package com.heytap.health.bodyfat.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes15.dex */
@SuppressLint({"AppCompatCustomView"})
public class RollTextView extends TextView {
    public RollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }
}
