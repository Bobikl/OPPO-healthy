package com.oplus.aiunit.vision;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.core.view.animation.PathInterpolatorCompat;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(api = 21)
public class jkc extends kkc {
    public static final TimeInterpolator h = PathInterpolatorCompat.create(0.4f, 0.0f, 0.6f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ValueAnimator f12931e;
    public float f;
    public final ValueAnimator.AnimatorUpdateListener g;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            jkc.this.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            jkc.this.c();
        }
    }

    public jkc(lkc lkcVar, Rect rect) {
        super(lkcVar, rect);
        this.f = 0.0f;
        this.g = new a();
    }

    public void i(Canvas canvas, Paint paint) {
        int color = paint.getColor();
        int alpha = (int) ((paint.getAlpha() * this.f) + 0.5f);
        int i = (alpha << 24) | 16777215;
        if (alpha > 0) {
            paint.setColor(i);
            canvas.drawCircle(0.0f, 0.0f, this.d, paint);
            paint.setColor(color);
        }
    }

    public void j() {
        ValueAnimator valueAnimator = this.f12931e;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f12931e = null;
        }
    }

    public final void k(boolean z) {
        ValueAnimator valueAnimator = this.f12931e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12931e = null;
        }
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f12931e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(150L);
        } else {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f12931e = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.setDuration(75L);
        }
        this.f12931e.addUpdateListener(this.g);
        this.f12931e.setInterpolator(h);
        this.f12931e.start();
    }

    public void l(boolean z, boolean z2, boolean z3) {
        if (z3 || z) {
            k(true);
        } else {
            k(false);
        }
    }
}
