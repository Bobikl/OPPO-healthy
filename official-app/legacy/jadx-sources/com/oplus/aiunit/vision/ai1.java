package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class ai1 implements LeadingMarginSpan {
    public final pgb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f9372j = fbd.b();
    public final Paint k = fbd.a();

    public ai1(@NonNull pgb pgbVar) {
        this.i = pgbVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iL = this.i.l();
        this.k.set(paint);
        this.i.a(this.k);
        int i8 = i2 * iL;
        int i9 = i + i8;
        int i10 = i8 + i9;
        this.f9372j.set(Math.min(i9, i10), i3, Math.max(i9, i10), i5);
        canvas.drawRect(this.f9372j, this.k);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.i.k();
    }
}
