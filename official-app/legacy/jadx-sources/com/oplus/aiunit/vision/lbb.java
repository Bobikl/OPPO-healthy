package com.oplus.aiunit.vision;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes12.dex */
public class lbb extends k61 implements Choreographer.FrameCallback {

    @Nullable
    public k9b t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f13620l = 1.0f;
    public boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f13621n = 0;
    public float o = 0.0f;
    public float p = 0.0f;
    public int q = 0;
    public float r = -2.14748365E9f;
    public float s = 2.14748365E9f;

    @VisibleForTesting
    public boolean u = false;
    public boolean v = false;

    @MainThread
    public void A(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.u = false;
        }
    }

    @MainThread
    public void B() {
        this.u = true;
        y();
        this.f13621n = 0L;
        if (v() && q() == t()) {
            E(s());
        } else if (!v() && q() == s()) {
            E(t());
        }
        e();
    }

    public void C() {
        I(-u());
    }

    public void D(k9b k9bVar) {
        boolean z = this.t == null;
        this.t = k9bVar;
        if (z) {
            G(Math.max(this.r, k9bVar.p()), Math.min(this.s, k9bVar.f()));
        } else {
            G((int) k9bVar.p(), (int) k9bVar.f());
        }
        float f = this.p;
        this.p = 0.0f;
        this.o = 0.0f;
        E((int) f);
        i();
    }

    public void E(float f) {
        if (this.o == f) {
            return;
        }
        float fB = m0c.b(f, t(), s());
        this.o = fB;
        if (this.v) {
            fB = (float) Math.floor(fB);
        }
        this.p = fB;
        this.f13621n = 0L;
        i();
    }

    public void F(float f) {
        G(this.r, f);
    }

    public void G(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        k9b k9bVar = this.t;
        float fP = k9bVar == null ? -3.4028235E38f : k9bVar.p();
        k9b k9bVar2 = this.t;
        float f3 = k9bVar2 == null ? Float.MAX_VALUE : k9bVar2.f();
        float fB = m0c.b(f, fP, f3);
        float fB2 = m0c.b(f2, fP, f3);
        if (fB == this.r && fB2 == this.s) {
            return;
        }
        this.r = fB;
        this.s = fB2;
        E((int) m0c.b(this.p, fB, fB2));
    }

    public void H(int i) {
        G(i, (int) this.s);
    }

    public void I(float f) {
        this.f13620l = f;
    }

    public void J(boolean z) {
        this.v = z;
    }

    public final void K() {
        if (this.t == null) {
            return;
        }
        float f = this.p;
        if (f < this.r || f > this.s) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.r), Float.valueOf(this.s), Float.valueOf(this.p)));
        }
    }

    @Override // com.oplus.aiunit.vision.k61
    public void a() {
        super.a();
        b(v());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        a();
        z();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        y();
        if (this.t == null || !isRunning()) {
            return;
        }
        if (gqa.g()) {
            gqa.b("LottieValueAnimator#doFrame");
        }
        long j3 = this.f13621n;
        float fR = (j3 != 0 ? j2 - j3 : 0L) / r();
        float f = this.o;
        if (v()) {
            fR = -fR;
        }
        float f2 = f + fR;
        boolean z = !m0c.d(f2, t(), s());
        float f3 = this.o;
        float fB = m0c.b(f2, t(), s());
        this.o = fB;
        if (this.v) {
            fB = (float) Math.floor(fB);
        }
        this.p = fB;
        this.f13621n = j2;
        if (!this.v || this.o != f3) {
            i();
        }
        if (z) {
            if (getRepeatCount() == -1 || this.q < getRepeatCount()) {
                d();
                this.q++;
                if (getRepeatMode() == 2) {
                    this.m = !this.m;
                    C();
                } else {
                    float fS = v() ? s() : t();
                    this.o = fS;
                    this.p = fS;
                }
                this.f13621n = j2;
            } else {
                float fT = this.f13620l < 0.0f ? t() : s();
                this.o = fT;
                this.p = fT;
                z();
                b(v());
            }
        }
        K();
        if (gqa.g()) {
            gqa.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float fT;
        float fS;
        float fT2;
        if (this.t == null) {
            return 0.0f;
        }
        if (v()) {
            fT = s() - this.p;
            fS = s();
            fT2 = t();
        } else {
            fT = this.p - t();
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
        k9b k9bVar = this.t;
        if (k9bVar == null) {
            return 0L;
        }
        return (long) k9bVar.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.u;
    }

    public void j() {
        this.t = null;
        this.r = -2.14748365E9f;
        this.s = 2.14748365E9f;
    }

    @MainThread
    public void k() {
        z();
        b(v());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float m() {
        k9b k9bVar = this.t;
        if (k9bVar == null) {
            return 0.0f;
        }
        return (this.p - k9bVar.p()) / (this.t.f() - this.t.p());
    }

    public float q() {
        return this.p;
    }

    public final float r() {
        k9b k9bVar = this.t;
        if (k9bVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / k9bVar.i()) / Math.abs(this.f13620l);
    }

    public float s() {
        k9b k9bVar = this.t;
        if (k9bVar == null) {
            return 0.0f;
        }
        float f = this.s;
        return f == 2.14748365E9f ? k9bVar.f() : f;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.m) {
            return;
        }
        this.m = false;
        C();
    }

    public float t() {
        k9b k9bVar = this.t;
        if (k9bVar == null) {
            return 0.0f;
        }
        float f = this.r;
        return f == -2.14748365E9f ? k9bVar.p() : f;
    }

    public float u() {
        return this.f13620l;
    }

    public final boolean v() {
        return u() < 0.0f;
    }

    @MainThread
    public void w() {
        z();
        c();
    }

    @MainThread
    public void x() {
        this.u = true;
        f(v());
        E((int) (v() ? s() : t()));
        this.f13621n = 0L;
        this.q = 0;
        y();
    }

    public void y() {
        if (isRunning()) {
            A(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    public void z() {
        A(true);
    }
}
