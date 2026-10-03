package com.coui.appcompat.animation.dynamicanimation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.FloatValueHolder;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends COUIDynamicAnimation<b> {
    public c s;
    public float t;
    public boolean u;

    public b(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.s = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
    }

    public c A() {
        return this.s;
    }

    public boolean B(float f, float f2) {
        return this.s.f(f, f2);
    }

    public void C() {
        if (!y()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        c();
        float f = this.t;
        if (f != Float.MAX_VALUE) {
            this.s.k(f);
            this.t = Float.MAX_VALUE;
        }
        this.d = this.s.b();
        this.f1525c = 0.0f;
        this.u = false;
    }

    public final void D() {
        c cVar = this.s;
        if (cVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dB = cVar.b();
        if (dB > this.k) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dB < this.f1528l) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public b E(c cVar) {
        this.s = cVar;
        return this;
    }

    public void F() {
        if (!y()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!this.h && Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f1527j) {
            this.u = true;
        }
    }

    @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation
    public boolean h(long j2) {
        return ((float) j2) >= (A().c() * 1000.0f) + 50.0f;
    }

    @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation
    public void j(long j2) {
        super.j(j2);
        float fA = A().a();
        if (fA > 0.0f) {
            float f = j2;
            r(this.d);
            s(this.f1525c);
            if (f >= fA) {
                A().p(A().c());
                A().h(0.0f);
                return;
            }
            float fD = A().d();
            A().p(fD + ((A().c() - fD) * (f / fA)));
            A().h(fA - f);
        }
    }

    @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation
    public void t(float f) {
    }

    @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation
    public void u() {
        D();
        this.s.n(g());
        super.u();
    }

    @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation
    public boolean w(long j2) {
        if (this.u) {
            float f = this.t;
            if (f != Float.MAX_VALUE) {
                this.s.k(f);
                this.t = Float.MAX_VALUE;
            }
            this.d = this.s.b();
            this.f1525c = 0.0f;
            this.u = false;
            return true;
        }
        if (this.t != Float.MAX_VALUE) {
            this.s.b();
            long j3 = j2 / 2;
            COUIDynamicAnimation.p pVarQ = this.s.q(this.d, this.f1525c, j3);
            this.s.k(this.t);
            this.t = Float.MAX_VALUE;
            COUIDynamicAnimation.p pVarQ2 = this.s.q(pVarQ.a, pVarQ.b, j3);
            this.d = pVarQ2.a;
            this.f1525c = pVarQ2.b;
        } else {
            COUIDynamicAnimation.p pVarQ3 = this.s.q(this.d, this.f1525c, j2);
            this.d = pVarQ3.a;
            this.f1525c = pVarQ3.b;
        }
        float fMax = Math.max(this.d, this.f1528l);
        this.d = fMax;
        float fMin = Math.min(fMax, this.k);
        this.d = fMin;
        if (!B(fMin, this.f1525c)) {
            return false;
        }
        this.d = this.s.b();
        this.f1525c = 0.0f;
        return true;
    }

    public void x(float f) {
        if (i()) {
            this.t = f;
            return;
        }
        if (this.s == null) {
            this.s = new c(f);
        }
        this.s.k(f);
        u();
    }

    public boolean y() {
        return this.s.b > 0.0d;
    }

    public void z() {
        super.c();
        this.t = Float.MAX_VALUE;
        this.f1525c = 0.0f;
        this.u = false;
    }

    public <K> b(K k, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k, floatPropertyCompat);
        this.s = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
    }

    public <K> b(K k, FloatPropertyCompat<K> floatPropertyCompat, float f) {
        super(k, floatPropertyCompat);
        this.s = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
        this.s = new c(f);
    }
}
