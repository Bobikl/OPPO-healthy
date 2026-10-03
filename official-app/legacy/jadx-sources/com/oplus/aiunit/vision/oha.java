package com.oplus.aiunit.vision;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class oha extends mha {
    public final ti0 p;

    public oha(@NonNull pgb pgbVar, @NonNull xha xhaVar, @ColorInt int i) {
        super(pgbVar, xhaVar, i);
        this.p = xhaVar;
    }

    @Override // com.oplus.aiunit.vision.xi0, android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        if (!this.p.f()) {
            return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
        }
        Rect bounds = this.p.getBounds();
        if (fontMetricsInt != null) {
            int i3 = bounds.bottom / 2;
            int i4 = -i3;
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = i3;
            fontMetricsInt.top = i4;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}
