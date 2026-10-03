package com.heytap.health.wallet.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"AppCompatCustomView"})
public class TextViewFixTouchConsume extends TextView {
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6401j;

    public TextViewFixTouchConsume(Context context) {
        super(context);
        this.i = true;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f6401j = false;
        return this.i ? this.f6401j : super.onTouchEvent(motionEvent);
    }

    public TextViewFixTouchConsume(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = true;
    }

    public TextViewFixTouchConsume(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
    }
}
