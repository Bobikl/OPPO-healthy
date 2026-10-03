package com.coui.appcompat.preference;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.oplus.aiunit.vision.sk2;

/* JADX INFO: loaded from: classes13.dex */
public class COUIRecommendedDrawable extends MaterialShapeDrawable {
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1933j;
    public Paint k = new Paint(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f1934l = new Path();

    public COUIRecommendedDrawable(float f, int i) {
        this.i = f;
        this.f1933j = i;
        this.k.setColor(this.f1933j);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f1934l.reset();
        Path pathC = sk2.a().c(getBounds(), this.i);
        this.f1934l = pathC;
        canvas.drawPath(pathC, this.k);
    }
}
