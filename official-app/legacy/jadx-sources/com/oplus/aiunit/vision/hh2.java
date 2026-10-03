package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes13.dex */
public class hh2 {
    public static final long INBOX_APPEAR_ANIMATOR_DURATION = 100;
    public static final long INBOX_DELAY_ANIMATOR_DURATION = 33;
    public static final long NUMBER_APPEAR_ANIMATOR_DURATION = 100;
    public static final long NUMBER_DELAY_ANIMATOR_DURATION = 33;
    public static final float NUMBER_SCALE_START = 0.6f;
    public static final PathInterpolator p = new hj2();
    public ValueAnimator a;
    public ValueAnimator b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f12157e;
    public float f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12158j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12159l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f12160n;
    public View o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12156c = 0.6f;
    public float d = 1.0f;
    public float g = 1.0f;
    public float h = 1.0f;
    public float i = 1.0f;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            hh2.this.g = ((Float) valueAnimator.getAnimatedValue("alphaHolder")).floatValue();
            hh2.this.h = ((Float) valueAnimator.getAnimatedValue("scaleHolder")).floatValue();
            hh2.this.o.invalidate();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            hh2.this.f12158j = false;
            hh2.this.o.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            hh2.this.f12158j = false;
            hh2.this.o.invalidate();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            hh2.this.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            hh2.this.o.invalidate();
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            hh2.this.k = false;
            hh2.this.o.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            hh2.this.k = false;
            hh2.this.o.invalidate();
        }
    }

    public hh2(View view) {
        this.o = view;
    }

    public final void g() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator == null || !this.k) {
            return;
        }
        valueAnimator.cancel();
    }

    public final void h() {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null || !this.f12158j) {
            return;
        }
        valueAnimator.cancel();
    }

    public final void i(boolean z) {
        if (z) {
            float f = this.i;
            if (f <= 0.0f || f >= 1.0f) {
                this.f12157e = 0.0f;
            } else {
                this.f12157e = f;
            }
            this.f = 1.0f;
        } else {
            float f2 = this.i;
            if (f2 <= 0.0f || f2 >= 1.0f) {
                this.f12157e = 1.0f;
            } else {
                this.f12157e = f2;
            }
            this.f = 0.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f12157e, this.f);
        this.b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        this.b.setStartDelay(z ? 33L : 0L);
        this.b.setInterpolator(p);
        this.b.addUpdateListener(new c());
        this.b.addListener(new d());
        this.b.start();
        this.k = true;
        this.i = this.f12157e;
    }

    public final void j(boolean z) {
        if (z) {
            float f = this.g;
            if (f <= 0.0f || f >= 1.0f) {
                this.f12157e = 0.0f;
            } else {
                this.f12157e = f;
            }
            this.f = 1.0f;
            this.f12156c = 0.6f;
        } else {
            float f2 = this.g;
            if (f2 <= 0.0f || f2 >= 1.0f) {
                this.f12157e = 1.0f;
            } else {
                this.f12157e = f2;
            }
            this.f = 0.0f;
            this.f12156c = 1.0f;
        }
        this.d = 1.0f;
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("scaleHolder", this.f12156c, 1.0f), PropertyValuesHolder.ofFloat("alphaHolder", this.f12157e, this.f));
        this.a = valueAnimatorOfPropertyValuesHolder;
        valueAnimatorOfPropertyValuesHolder.setDuration(100L);
        this.a.setStartDelay(z ? 0L : 33L);
        this.a.setInterpolator(p);
        this.a.addUpdateListener(new a());
        this.a.addListener(new b());
        this.a.start();
        this.f12158j = true;
        this.g = this.f12157e;
        this.h = this.f12156c;
    }

    public String k() {
        return this.f12160n;
    }

    public float l() {
        return this.i;
    }

    public float m() {
        return this.g;
    }

    public float n() {
        return this.h;
    }

    public boolean o() {
        return this.f12159l;
    }

    public boolean p() {
        return this.k;
    }

    public boolean q() {
        return this.f12158j;
    }

    public final void r(boolean z) {
        this.m = z;
    }

    public final void s(boolean z) {
        this.f12159l = z;
    }

    public void t(boolean z) {
        r(z);
        if (this.k) {
            g();
        }
        i(z);
    }

    public void u(boolean z, String str) {
        this.f12160n = str;
        s(z);
        if (this.f12158j) {
            h();
        }
        j(z);
    }
}
