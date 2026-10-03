package com.oppo.store.web.widget.card;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes9.dex */
class WebShapeDrawable extends MaterialShapeDrawable {
    int mOffset;

    public WebShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        super(shapeAppearanceModel);
        this.mOffset = 0;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @SuppressLint({"RestrictedApi"})
    public void draw(@NonNull Canvas canvas) {
        setShadowVerticalOffset(this.mOffset);
        super.draw(canvas);
    }

    public int getOffset() {
        return this.mOffset;
    }

    public void setOffset(int i) {
        this.mOffset = i;
    }
}
