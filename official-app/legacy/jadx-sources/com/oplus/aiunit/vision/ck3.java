package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class ck3 extends MetricAffectingSpan implements LeadingMarginSpan {
    public final pgb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f10130j = fbd.b();
    public final Paint k = fbd.a();

    public ck3(@NonNull pgb pgbVar) {
        this.i = pgbVar;
    }

    public final void a(TextPaint textPaint) {
        this.i.b(textPaint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        this.k.setStyle(Paint.Style.FILL);
        this.k.setColor(this.i.o(paint));
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            width = i;
        }
        this.f10130j.set(i, i3, width, i5);
        canvas.drawRect(this.f10130j, this.k);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.i.p();
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
