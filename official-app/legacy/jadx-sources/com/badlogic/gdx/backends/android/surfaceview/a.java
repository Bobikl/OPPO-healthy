package com.badlogic.gdx.backends.android.surfaceview;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class a implements b {
    @Override // com.badlogic.gdx.backends.android.surfaceview.b
    public b.a a(int i, int i2) {
        return new b.a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }
}
