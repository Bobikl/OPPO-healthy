package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes18.dex */
public class ayf extends ReplacementSpan {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9521j;

    public ayf(int i, int i2) {
        this.i = i;
        this.f9521j = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iMeasureText = (int) paint.measureText(charSequence, i, i2);
        int color = paint.getColor();
        paint.setColor(this.i);
        canvas.save();
        canvas.scale(0.5f, 0.5f);
        int i6 = (i5 + i3) / 2;
        canvas.translate(f, i6);
        canvas.drawRoundRect(new RectF(f, i3 - 6, iMeasureText + f + 25.0f, i5 + 6), 14.0f, 14.0f, paint);
        paint.setColor(this.f9521j);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.drawText(charSequence.toString(), i, i2, 12.5f + f, i4 - (((((i4 + fontMetricsInt.descent) + i4) + fontMetricsInt.ascent) / 2) - i6), paint);
        paint.setColor(color);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil((paint.measureText(charSequence, i, i2) * 0.5f) + 12.5f);
    }
}
