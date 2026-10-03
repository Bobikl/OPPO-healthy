package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class lj8 extends MetricAffectingSpan implements LeadingMarginSpan {
    public final pgb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f13722j = fbd.b();
    public final Paint k = fbd.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13723l;

    public lj8(@NonNull pgb pgbVar, @IntRange(from = 1, to = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) int i) {
        this.i = pgbVar;
        this.f13723l = i;
    }

    public final void a(TextPaint textPaint) {
        this.i.e(textPaint, this.f13723l);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = this.f13723l;
        if ((i8 == 1 || i8 == 2) && fva.a(i7, charSequence, this)) {
            this.k.set(paint);
            this.i.d(this.k);
            float strokeWidth = this.k.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i9 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                this.f13722j.set(i, i9, width, i5);
                canvas.drawRect(this.f13722j, this.k);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
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
