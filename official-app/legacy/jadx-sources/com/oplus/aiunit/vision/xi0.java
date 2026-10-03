package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class xi0 extends ReplacementSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    public final pgb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ti0 f18633j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18634l;

    public xi0(@NonNull pgb pgbVar, @NonNull ti0 ti0Var, int i, boolean z) {
        this.i = pgbVar;
        this.f18633j = ti0Var;
        this.k = i;
        this.f18634l = z;
    }

    public static float b(int i, int i2, @NonNull Paint paint) {
        return (int) ((i + ((i2 - i) / 2)) - (((paint.descent() + paint.ascent()) / 2.0f) + 0.5f));
    }

    @NonNull
    public ti0 a() {
        return this.f18633j;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        int iHeight;
        this.f18633j.h(h5i.a(canvas, charSequence), paint.getTextSize());
        ti0 ti0Var = this.f18633j;
        if (!ti0Var.f()) {
            float fB = b(i3, i5, paint);
            if (this.f18634l) {
                this.i.f(paint);
            }
            canvas.drawText(charSequence, i, i2, f, fB, paint);
            return;
        }
        int i6 = i5 - ti0Var.getBounds().bottom;
        int iSave = canvas.save();
        try {
            int i7 = this.k;
            if (2 != i7) {
                if (1 == i7) {
                    iHeight = paint.getFontMetricsInt().descent;
                }
                canvas.translate(f, i6);
                ti0Var.draw(canvas);
            }
            iHeight = ((i5 - i3) - ti0Var.getBounds().height()) / 2;
            i6 -= iHeight;
            canvas.translate(f, i6);
            ti0Var.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        if (!this.f18633j.f()) {
            if (this.f18634l) {
                this.i.f(paint);
            }
            return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
        }
        Rect bounds = this.f18633j.getBounds();
        if (fontMetricsInt != null) {
            int i3 = -bounds.bottom;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}
