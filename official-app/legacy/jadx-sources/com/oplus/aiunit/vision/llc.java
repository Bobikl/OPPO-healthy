package com.oplus.aiunit.vision;

import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* JADX INFO: loaded from: classes18.dex */
public class llc extends ShapeDrawable {
    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fMin = Math.min(rect.right - rect.left, rect.bottom - rect.top) / 2.0f;
        setShape(new RoundRectShape(new float[]{fMin, fMin, fMin, fMin, fMin, fMin, fMin, fMin}, null, null));
    }
}
