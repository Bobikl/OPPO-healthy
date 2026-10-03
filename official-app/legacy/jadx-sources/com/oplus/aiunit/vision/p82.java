package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class p82 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f15251n = false;
    public pgb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f15252j = fbd.a();
    public final RectF k = fbd.c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f15253l = fbd.b();
    public final int m;

    public p82(@NonNull pgb pgbVar, @IntRange(from = 0) int i) {
        this.i = pgbVar;
        this.m = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        if (z && fva.b(i6, charSequence, this)) {
            this.f15252j.set(paint);
            this.i.h(this.f15252j);
            int iSave = canvas.save();
            try {
                int iK = this.i.k();
                int iM = this.i.m((int) ((this.f15252j.descent() - this.f15252j.ascent()) + 0.5f));
                int i8 = (iK - iM) / 2;
                if (f15251n) {
                    int width = i2 < 0 ? i - (layout.getWidth() - (iK * this.m)) : (iK * this.m) - i;
                    int i9 = i + (i8 * i2);
                    int i10 = (i2 * iM) + i9;
                    int i11 = i2 * width;
                    iMin = Math.min(i9, i10) + i11;
                    iMax = Math.max(i9, i10) + i11;
                } else {
                    if (i2 <= 0) {
                        i -= iK;
                    }
                    iMin = i + i8;
                    iMax = iMin + iM;
                }
                int iDescent = (i4 + ((int) (((this.f15252j.descent() + this.f15252j.ascent()) / 2.0f) + 0.5f))) - (iM / 2);
                int i12 = iM + iDescent;
                int i13 = this.m;
                if (i13 == 0 || i13 == 1) {
                    this.k.set(iMin, iDescent, iMax, i12);
                    this.f15252j.setStyle(this.m == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(this.k, this.f15252j);
                } else {
                    this.f15253l.set(iMin, iDescent, iMax, i12);
                    this.f15252j.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.f15253l, this.f15252j);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.i.k();
    }
}
