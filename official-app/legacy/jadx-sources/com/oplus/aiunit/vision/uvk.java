package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: classes18.dex */
public class uvk extends ImageSpan {
    public uvk(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = i4;
        int i6 = (int) (((((fontMetrics.ascent + f2) + f2) + fontMetrics.descent) / 2.0f) - ((drawable.getBounds().bottom + drawable.getBounds().top) / 2));
        StringBuilder sb = new StringBuilder();
        sb.append("transY-> ");
        sb.append(i6);
        canvas.save();
        canvas.translate(f, i6);
        drawable.draw(canvas);
        canvas.restore();
    }
}
