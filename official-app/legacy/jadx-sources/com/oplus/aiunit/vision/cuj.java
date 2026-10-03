package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class cuj implements LeadingMarginSpan {
    public final pgb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f10251j = fbd.b();
    public final Paint k = fbd.a();

    public cuj(@NonNull pgb pgbVar) {
        this.i = pgbVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = i3 + ((i5 - i3) / 2);
        this.k.set(paint);
        this.i.i(this.k);
        int strokeWidth = (int) ((((int) (this.k.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        this.f10251j.set(i, i8 - strokeWidth, width, i8 + strokeWidth);
        canvas.drawRect(this.f10251j, this.k);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
