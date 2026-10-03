package com.oplus.aiunit.vision;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class ek3 extends MetricAffectingSpan {
    public final pgb i;

    public ek3(@NonNull pgb pgbVar) {
        this.i = pgbVar;
    }

    public final void a(TextPaint textPaint) {
        this.i.c(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
        textPaint.bgColor = this.i.n(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
