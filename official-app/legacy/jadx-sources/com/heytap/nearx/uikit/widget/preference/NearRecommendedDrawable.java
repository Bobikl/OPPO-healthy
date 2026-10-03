package com.heytap.nearx.uikit.widget.preference;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.oplus.aiunit.vision.rkc;

/* JADX INFO: loaded from: classes18.dex */
public class NearRecommendedDrawable extends MaterialShapeDrawable {
    private int mColor;
    private Paint mPaint = new Paint(1);
    private Path mPath = new Path();
    private float mRadius;

    public NearRecommendedDrawable(float f, int i) {
        this.mRadius = f;
        this.mColor = i;
        this.mPaint.setColor(this.mColor);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.mPath.reset();
        Path pathC = rkc.a().c(getBounds(), this.mRadius);
        this.mPath = pathC;
        canvas.drawPath(pathC, this.mPaint);
    }
}
