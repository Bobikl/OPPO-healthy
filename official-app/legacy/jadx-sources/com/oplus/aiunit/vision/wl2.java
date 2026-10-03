package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes13.dex */
public class wl2 extends MaterialShapeDrawable {
    public int i;

    public wl2(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        super(shapeAppearanceModel);
        this.i = 0;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @SuppressLint({"RestrictedApi"})
    public void draw(@NonNull Canvas canvas) {
        setShadowVerticalOffset(this.i);
        super.draw(canvas);
    }

    public void setOffset(int i) {
        this.i = i;
    }
}
