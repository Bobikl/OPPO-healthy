package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class ord implements LeadingMarginSpan {
    public final pgb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15035j;
    public final Paint k = fbd.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15036l;

    public ord(@NonNull pgb pgbVar, @NonNull String str) {
        this.i = pgbVar;
        this.f15035j = str;
    }

    public static void a(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            ord[] ordVarArr = (ord[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ord.class);
            if (ordVarArr != null) {
                TextPaint paint = textView.getPaint();
                for (ord ordVar : ordVarArr) {
                    ordVar.f15036l = (int) (paint.measureText(ordVar.f15035j) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && fva.b(i6, charSequence, this)) {
            this.k.set(paint);
            this.i.h(this.k);
            int iMeasureText = (int) (this.k.measureText(this.f15035j) + 0.5f);
            int iK = this.i.k();
            if (iMeasureText > iK) {
                this.f15036l = iMeasureText;
                iK = iMeasureText;
            } else {
                this.f15036l = 0;
            }
            canvas.drawText(this.f15035j, i2 > 0 ? (i + (iK * i2)) - iMeasureText : i + (i2 * iK) + (iK - iMeasureText), i4, this.k);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return Math.max(this.f15036l, this.i.k());
    }
}
