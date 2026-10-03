package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes13.dex */
public class hf2 {
    public static final int ACTION_IS_FROM_TOUCH_LISTVIEW = -1;
    public static final int APPEAR_DURATION = 150;
    public static final int DISAPPEAR_DURATION = 367;
    public static final int STATE_BACKGROUND_APPEAR = 1;
    public static final int STATE_BACKGROUND_DISAPPEAR = 2;
    public View f;
    public boolean h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12128j;
    public ValueAnimator k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ValueAnimator f12129l;
    public int a = DISAPPEAR_DURATION;
    public int b = 150;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12126c = 2;
    public Interpolator d = new PathInterpolator(0.17f, 0.17f, 0.67f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f12127e = new vi2();
    public boolean g = false;
    public boolean m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12130n = false;
    public boolean o = false;
    public View.OnTouchListener p = new a();

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.isEnabled() && view.isClickable()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (motionEvent.getSource() == -1) {
                        hf2.this.o = true;
                    }
                    hf2.this.k();
                } else if (action == 1) {
                    hf2.this.l();
                    hf2.this.o = false;
                } else if (action == 3) {
                    if (hf2.this.m) {
                        hf2.this.l();
                    }
                    hf2.this.o = false;
                }
            }
            return false;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            hf2 hf2Var = hf2.this;
            hf2Var.f12126c = 1;
            if (hf2Var.g) {
                hf2.this.g = false;
                if (hf2.this.h) {
                    return;
                }
                hf2.this.f12129l.start();
            }
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (hf2.this.h) {
                hf2.this.f12129l.cancel();
            }
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            hf2.this.f12126c = 2;
        }
    }

    public void g(View view, int i, int i2) {
        h(view, i, i2, false);
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    public void h(View view, int i, int i2, boolean z) {
        this.f12130n = z;
        this.f = view;
        this.i = i2;
        this.f12128j = i;
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.k.end();
            this.k = null;
        }
        ValueAnimator valueAnimator2 = this.f12129l;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f12129l.end();
            this.f12129l = null;
        }
        this.k = ObjectAnimator.ofInt(view, "backgroundColor", i, i2);
        this.f12129l = ObjectAnimator.ofInt(view, "backgroundColor", i2, i);
        this.k.setDuration(this.b);
        this.k.setInterpolator(this.f12127e);
        this.k.setEvaluator(new ArgbEvaluator());
        this.k.addListener(new b());
        this.f12129l.setDuration(this.a);
        this.f12129l.setInterpolator(this.d);
        this.f12129l.setEvaluator(new ArgbEvaluator());
        this.f12129l.addUpdateListener(new c());
        this.f12129l.addListener(new d());
    }

    public View.OnTouchListener i(boolean z) {
        View view = this.f;
        if (view == null) {
            throw new IllegalArgumentException("Must be called after the init method");
        }
        if (z) {
            return this.p;
        }
        view.setOnTouchListener(this.p);
        return null;
    }

    public final void j() {
        View view;
        if (this.f12130n && (view = this.f) != null && this.o) {
            view.performHapticFeedback(302);
        }
    }

    public void k() {
        if (this.h) {
            return;
        }
        if (this.f12129l.isRunning()) {
            this.f12129l.cancel();
        }
        if (this.k.isRunning()) {
            this.k.cancel();
        }
        this.k.start();
        j();
    }

    public void l() {
        if (this.k.isRunning()) {
            this.g = true;
        } else {
            if (this.f12129l.isRunning() || this.f12126c != 1 || this.h) {
                return;
            }
            this.f12129l.start();
        }
    }
}
