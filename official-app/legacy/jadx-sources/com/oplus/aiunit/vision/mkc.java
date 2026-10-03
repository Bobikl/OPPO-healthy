package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.animation.AnimationUtils;
import androidx.annotation.RequiresApi;
import androidx.core.view.animation.PathInterpolatorCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(api = 21)
public class mkc extends kkc {
    public static final TimeInterpolator x = PathInterpolatorCompat.create(0.4f, 0.0f, 0.6f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14110e;
    public float f;
    public float g;
    public float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f14111j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14112l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14113n;
    public boolean o;
    public long p;
    public ArrayList<Animator> q;
    public float r;
    public final AnimatorListenerAdapter s;
    public final ValueAnimator.AnimatorUpdateListener t;
    public final ValueAnimator.AnimatorUpdateListener u;
    public final ValueAnimator.AnimatorUpdateListener v;
    public final ValueAnimator.AnimatorUpdateListener w;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            mkc.this.o = true;
            mkc.this.B();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            mkc.this.f14112l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            mkc.this.A();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            mkc.this.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            mkc.this.A();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            mkc.this.f14113n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            mkc.this.A();
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            mkc.this.k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            mkc.this.A();
        }
    }

    public mkc(lkc lkcVar, Rect rect, float f, float f2) {
        super(lkcVar, rect);
        this.i = 0.0f;
        this.f14111j = 0.0f;
        this.k = 0.0f;
        this.f14112l = 0.0f;
        this.m = 0.0f;
        this.f14113n = 0.0f;
        this.q = new ArrayList<>();
        this.s = new a();
        this.t = new b();
        this.u = new c();
        this.v = new d();
        this.w = new e();
        this.f14110e = f;
        this.f = f2;
        this.r = Math.max(rect.width(), rect.height()) * 0.1f;
        o();
    }

    public final void A() {
        c();
    }

    public final void B() {
        if (this.q.isEmpty()) {
            return;
        }
        for (int size = this.q.size() - 1; size >= 0; size--) {
            if (!this.q.get(size).isRunning()) {
                this.q.remove(size);
            }
        }
    }

    public final void C() {
        for (int i = 0; i < this.q.size(); i++) {
            this.q.get(i).cancel();
        }
        this.q.clear();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.r, this.d);
        valueAnimatorOfFloat.addUpdateListener(this.t);
        valueAnimatorOfFloat.setDuration(300L);
        TimeInterpolator timeInterpolator = x;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.start();
        this.q.add(valueAnimatorOfFloat);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.g - this.b.exactCenterX(), this.i);
        valueAnimatorOfFloat2.addUpdateListener(this.u);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.start();
        this.q.add(valueAnimatorOfFloat2);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.h - this.b.exactCenterY(), this.f14111j);
        valueAnimatorOfFloat3.addUpdateListener(this.v);
        valueAnimatorOfFloat3.setDuration(300L);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.start();
        this.q.add(valueAnimatorOfFloat3);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat4.addUpdateListener(this.w);
        valueAnimatorOfFloat4.setDuration(300L);
        valueAnimatorOfFloat4.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat4.start();
        this.q.add(valueAnimatorOfFloat4);
    }

    public final void D() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(this.w);
        valueAnimatorOfFloat.setDuration(75L);
        valueAnimatorOfFloat.setInterpolator(x);
        valueAnimatorOfFloat.addListener(this.s);
        valueAnimatorOfFloat.setStartDelay(p());
        valueAnimatorOfFloat.start();
        this.q.add(valueAnimatorOfFloat);
    }

    @Override // com.oplus.aiunit.vision.kkc
    public void a(Rect rect) {
        int i = (int) this.i;
        int i2 = (int) this.f14111j;
        int i3 = ((int) this.d) + 1;
        rect.set(i - i3, i2 - i3, i + i3, i2 + i3);
    }

    @Override // com.oplus.aiunit.vision.kkc
    public void f(float f) {
        o();
        c();
    }

    public final void o() {
        float fExactCenterX = this.b.exactCenterX();
        float fExactCenterY = this.b.exactCenterY();
        float f = this.f14110e;
        float f2 = f - fExactCenterX;
        float f3 = this.f;
        float f4 = f3 - fExactCenterY;
        float f5 = this.d - this.r;
        if ((f2 * f2) + (f4 * f4) <= f5 * f5) {
            this.g = f;
            this.h = f3;
        } else {
            double dAtan2 = Math.atan2(f4, f2);
            double d2 = f5;
            this.g = fExactCenterX + ((float) (Math.cos(dAtan2) * d2));
            this.h = fExactCenterY + ((float) (Math.sin(dAtan2) * d2));
        }
    }

    public final long p() {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.p;
        if (jCurrentAnimationTimeMillis <= 0 || jCurrentAnimationTimeMillis >= 300) {
            return 0L;
        }
        return 300 - jCurrentAnimationTimeMillis;
    }

    public void q(Canvas canvas, Paint paint) {
        B();
        r(canvas, paint);
    }

    public final void r(Canvas canvas, Paint paint) {
        int alpha = paint.getAlpha();
        int i = (int) ((alpha * this.k) + 0.5f);
        float fV = v();
        if (i <= 0 || fV <= 0.0f) {
            return;
        }
        float fW = w();
        float fX = x();
        paint.setAlpha(i);
        canvas.drawCircle(fW, fX, fV, paint);
        paint.setAlpha(alpha);
    }

    public void s() {
        for (int i = 0; i < this.q.size(); i++) {
            this.q.get(i).end();
        }
        this.q.clear();
    }

    public final void t() {
        this.p = AnimationUtils.currentAnimationTimeMillis();
        C();
    }

    public final void u() {
        D();
    }

    public final float v() {
        return this.f14112l;
    }

    public final float w() {
        return this.m;
    }

    public final float x() {
        return this.f14113n;
    }

    public boolean y() {
        return this.o;
    }

    public void z(float f, float f2) {
        this.f14110e = f;
        this.f = f2;
        o();
    }
}
