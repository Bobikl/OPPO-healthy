package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes13.dex */
public class bg2 extends Scroller {
    public static final Interpolator b = new hj2();
    public int a;

    public bg2(Context context) {
        this(context, b);
    }

    public void a(int i) {
        this.a = i;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.a);
    }

    public bg2(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.a = 300;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.a);
    }
}
