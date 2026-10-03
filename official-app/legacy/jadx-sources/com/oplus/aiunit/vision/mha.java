package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class mha extends xi0 {
    public final xha m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f14069n;
    public boolean o;

    public mha(@NonNull pgb pgbVar, @NonNull xha xhaVar, @ColorInt int i) {
        super(pgbVar, xhaVar, 2, false);
        this.m = xhaVar;
        this.f14069n = i;
        this.o = i != 0;
    }

    @Override // com.oplus.aiunit.vision.xi0, android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        if (!this.o && this.m.f()) {
            Drawable drawableE = this.m.e();
            if (drawableE instanceof ru.noties.jlatexmath.a) {
                ((ru.noties.jlatexmath.a) drawableE).b().d(new lk3(paint.getColor()));
                this.o = true;
            }
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }
}
