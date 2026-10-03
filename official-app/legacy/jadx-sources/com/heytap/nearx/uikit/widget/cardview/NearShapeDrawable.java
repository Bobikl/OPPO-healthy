package com.heytap.nearx.uikit.widget.cardview;

import android.graphics.Canvas;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes18.dex */
class NearShapeDrawable extends MaterialShapeDrawable {
    int mOffset;

    public NearShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        super(shapeAppearanceModel);
        this.mOffset = 0;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
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
