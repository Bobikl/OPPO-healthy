package com.oplus.aiunit.vision;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.oplus.wrapper.os.Trace;

/* JADX INFO: loaded from: classes19.dex */
public class li6 extends lz0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13708l;

    @Nullable
    public wg6 u;
    public float m = 1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13709n = false;
    public long o = 0;
    public float p = 0.0f;
    public float q = 0.0f;
    public int r = 0;
    public float s = -2.14748365E9f;
    public float t = 2.14748365E9f;

    @VisibleForTesting
    public boolean v = false;
    public boolean w = false;

    public li6() {
        this.f13708l = "";
        this.f13708l = prk.g();
    }

    public void A() {
        if (isRunning()) {
            C(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    public void B() {
        C(true);
    }

    @MainThread
    public void C(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.v = false;
        }
    }

    @MainThread
    public void D() {
        this.v = true;
        A();
        this.o = 0L;
        if (v() && q() == t()) {
            G(s());
        } else if (!v() && q() == s()) {
            G(t());
        }
        x();
        e();
    }

    public void E() {
        K(-u());
    }

    public void F(wg6 wg6Var) {
        boolean z = this.u == null;
        this.u = wg6Var;
        if (z) {
            I(Math.max(this.s, wg6Var.p()), Math.min(this.t, wg6Var.f()));
        } else {
            I((int) wg6Var.p(), (int) wg6Var.f());
        }
        float f = this.q;
        this.q = 0.0f;
        this.p = 0.0f;
        G((int) f);
        i();
    }

    public void G(float f) {
        if (this.p == f) {
            return;
        }
        float fB = l0c.b(f, t(), s());
        this.p = fB;
        if (this.w) {
            fB = (float) Math.floor(fB);
        }
        this.q = fB;
        this.o = 0L;
        i();
    }

    public void H(float f) {
        I(this.s, f);
    }

    public void I(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        wg6 wg6Var = this.u;
        float fP = wg6Var == null ? -3.4028235E38f : wg6Var.p();
        wg6 wg6Var2 = this.u;
        float f3 = wg6Var2 == null ? Float.MAX_VALUE : wg6Var2.f();
        float fB = l0c.b(f, fP, f3);
        float fB2 = l0c.b(f2, fP, f3);
        if (fB == this.s && fB2 == this.t) {
            return;
        }
        this.s = fB;
        this.t = fB2;
        G((int) l0c.b(this.q, fB, fB2));
    }

    public void J(int i) {
        I(i, (int) this.t);
    }

    public void K(float f) {
        this.m = f;
    }

    public void L(boolean z) {
        this.w = z;
    }

    public final void M() {
        if (this.u == null) {
            return;
        }
        float f = this.q;
        if (f < this.s || f > this.t) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.s), Float.valueOf(this.t), Float.valueOf(this.q)));
        }
    }

    @Override // com.oplus.aiunit.vision.lz0
    public void a() {
        super.a();
        b(v());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        w();
        a();
        B();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        A();
        if (this.u == null || !isRunning()) {
            return;
        }
        rpa.a("LottieValueAnimator#doFrame");
        long j3 = this.o;
        float fR = (j3 != 0 ? j2 - j3 : 0L) / r();
        float f = this.p;
        if (v()) {
            fR = -fR;
        }
        float f2 = f + fR;
        boolean z = !l0c.d(f2, t(), s());
        float f3 = this.p;
        float fB = l0c.b(f2, t(), s());
        this.p = fB;
        if (this.w) {
            fB = (float) Math.floor(fB);
        }
        this.q = fB;
        this.o = j2;
        if (!this.w || this.p != f3) {
            i();
        }
        if (z) {
            if (getRepeatCount() == -1 || this.r < getRepeatCount()) {
                x();
                d();
                this.r++;
                if (getRepeatMode() == 2) {
                    this.f13709n = !this.f13709n;
                    E();
                } else {
                    float fS = v() ? s() : t();
                    this.p = fS;
                    this.q = fS;
                }
                this.o = j2;
            } else {
                float fT = this.m < 0.0f ? t() : s();
                this.p = fT;
                this.q = fT;
                B();
                w();
                b(v());
            }
        }
        M();
        rpa.b("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float fT;
        float fS;
        float fT2;
        if (this.u == null) {
            return 0.0f;
        }
        if (v()) {
            fT = s() - this.q;
            fS = s();
            fT2 = t();
        } else {
            fT = this.q - t();
            fS = s();
            fT2 = t();
        }
        return fT / (fS - fT2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        wg6 wg6Var = this.u;
        if (wg6Var == null) {
            return 0L;
        }
        return (long) wg6Var.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.v;
    }

    public void j() {
        this.u = null;
        this.s = -2.14748365E9f;
        this.t = 2.14748365E9f;
    }

    @MainThread
    public void k() {
        B();
        w();
        b(v());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float m() {
        wg6 wg6Var = this.u;
        if (wg6Var == null) {
            return 0.0f;
        }
        return (this.q - wg6Var.p()) / (this.u.f() - this.u.p());
    }

    public float q() {
        return this.q;
    }

    public final float r() {
        wg6 wg6Var = this.u;
        if (wg6Var == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / wg6Var.i()) / Math.abs(this.m);
    }

    public float s() {
        wg6 wg6Var = this.u;
        if (wg6Var == null) {
            return 0.0f;
        }
        float f = this.t;
        return f == 2.14748365E9f ? wg6Var.f() : f;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f13709n) {
            return;
        }
        this.f13709n = false;
        E();
    }

    public float t() {
        wg6 wg6Var = this.u;
        if (wg6Var == null) {
            return 0.0f;
        }
        float f = this.s;
        return f == -2.14748365E9f ? wg6Var.p() : f;
    }

    public float u() {
        return this.m;
    }

    public final boolean v() {
        return u() < 0.0f;
    }

    public final void w() {
        if (this.f13708l.isEmpty()) {
            return;
        }
        try {
            Trace.asyncTraceEnd(Trace.TRACE_TAG_VIEW, "lottie_animator", System.identityHashCode(this));
        } catch (Error | Exception unused) {
        }
    }

    public final void x() {
        if (this.f13708l.isEmpty()) {
            return;
        }
        try {
            Trace.traceBegin(Trace.TRACE_TAG_VIEW, "AnimatorStart " + this.f13708l);
            Trace.traceEnd(Trace.TRACE_TAG_VIEW);
            Trace.asyncTraceBegin(Trace.TRACE_TAG_VIEW, "lottie_animator", System.identityHashCode(this));
        } catch (Error | Exception unused) {
        }
    }

    @MainThread
    public void y() {
        B();
        w();
        c();
    }

    @MainThread
    public void z() {
        this.v = true;
        x();
        f(v());
        G((int) (v() ? s() : t()));
        this.o = 0L;
        this.r = 0;
        A();
    }
}
