package com.oplus.aiunit.vision;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public abstract class x04 extends d01 {
    public static final int COLLISION_MODE_ATTACH = 1;
    public static final int COLLISION_MODE_ERASE = 3;
    public static final int COLLISION_MODE_NO_LIMIT = 0;
    public static final int COLLISION_MODE_REBOUND = 2;
    public static final int COLLISION_MODE_SIMPLE_LIMIT = 4;
    public bv1 p;
    public int v;
    public final RectF o = new RectF();
    public boolean q = false;
    public boolean r = false;
    public float s = 0.0f;
    public float t = 0.0f;
    public int u = 0;

    public x04(int i, RectF rectF) {
        this.v = i;
        f0(rectF);
        if (T()) {
            oki okiVar = new oki();
            this.f10314l = okiVar;
            okiVar.f14974e = 1.0f;
            okiVar.f = 0.4f;
        }
    }

    @Override // com.oplus.aiunit.vision.d01
    public <T extends d01> T A(float f, float f2) {
        if (this.k != null && T()) {
            bv1 bv1Var = this.k;
            if (bv1Var.f9868n == 50.0f) {
                bv1Var.k(f);
            }
        }
        return (T) super.A(f, f2);
    }

    @Override // com.oplus.aiunit.vision.d01
    public void B() {
        super.B();
        d0();
    }

    @Override // com.oplus.aiunit.vision.d01
    public boolean C() {
        this.k.b(this);
        if (T()) {
            N();
            this.p.l(false);
        }
        return super.C();
    }

    public void K() {
        this.q = b0();
        this.r = c0();
        this.s = O(this.k.f().a);
        this.t = P(this.k.f().b);
    }

    public void L(float f, float f2) {
        this.u = 0;
        RectF rectF = this.k.i;
        if (rectF != null) {
            if (this.f10311c || !rectF.isEmpty()) {
                RectF rectF2 = this.k.i;
                if (f < rectF2.left) {
                    this.u |= 1;
                } else if (f > rectF2.right) {
                    this.u |= 4;
                }
                if (f2 < rectF2.top) {
                    this.u |= 2;
                } else if (f2 > rectF2.bottom) {
                    this.u |= 8;
                }
            }
        }
    }

    public final void M() {
        if (e(this.f10314l)) {
            this.m.h(this.s, this.t);
        }
    }

    public final void N() {
        k();
        e0();
    }

    public float O(float f) {
        RectF rectF = this.k.i;
        if (rectF != null && (this.f10311c || !rectF.isEmpty())) {
            RectF rectF2 = this.k.i;
            float f2 = rectF2.left;
            if (f < f2) {
                return f2;
            }
            float f3 = rectF2.right;
            if (f > f3) {
                return f3;
            }
        }
        return f;
    }

    public float P(float f) {
        RectF rectF = this.k.i;
        if (rectF != null && (this.f10311c || !rectF.isEmpty())) {
            RectF rectF2 = this.k.i;
            float f2 = rectF2.top;
            if (f < f2) {
                return f2;
            }
            float f3 = rectF2.bottom;
            if (f > f3) {
                return f3;
            }
        }
        return f;
    }

    public void Q() {
        int i = this.v;
        if (i == 0) {
            this.f10313j.d.e(this.k.f());
            D(this.k, this.f10313j.d);
            return;
        }
        if (i == 1) {
            this.f10313j.d.e(this.k.f());
            if (this.q) {
                this.f10313j.d.a = this.p.f().a;
            } else {
                this.s = O(this.f10313j.d.a);
            }
            if (b0()) {
                this.q = true;
            }
            if (this.r) {
                this.f10313j.d.b = this.p.f().b;
            } else {
                this.t = P(this.f10313j.d.b);
            }
            if (c0()) {
                this.r = true;
            }
            g0(this.f10313j.d);
            return;
        }
        if (i == 2) {
            if (this.q || this.r) {
                this.f10313j.d.e(this.p.f());
            } else {
                if (X()) {
                    bv1 bv1Var = this.k;
                    bv1Var.o(bv1Var.d().b(0.5f).c());
                }
                this.f10313j.d.d(O(this.k.f().a), P(this.k.f().b));
                this.s = O(this.f10313j.d.a);
                this.t = P(this.f10313j.d.b);
            }
            g0(this.f10313j.d);
            return;
        }
        if (i == 3) {
            if (this.q || this.r) {
                this.f10313j.d.e(this.p.f());
            } else {
                if (X()) {
                    this.k.d().f();
                }
                this.f10313j.d.d(O(this.k.f().a), P(this.k.f().b));
                this.s = O(this.f10313j.d.a);
                this.t = P(this.f10313j.d.b);
            }
            g0(this.f10313j.d);
            return;
        }
        if (i != 4) {
            return;
        }
        this.f10313j.d.e(this.k.f());
        if (this.q) {
            this.f10313j.d.a = this.p.f().a;
        } else {
            this.s = O(this.f10313j.d.a);
        }
        if (b0()) {
            this.q = true;
        } else {
            this.q = false;
        }
        if (this.r) {
            this.f10313j.d.b = this.p.f().b;
        } else {
            this.t = P(this.f10313j.d.b);
        }
        if (c0()) {
            this.r = true;
        } else {
            this.r = false;
        }
        g0(this.f10313j.d);
    }

    public final boolean R() {
        return this.v == 1;
    }

    public final boolean S() {
        return this.v == 3;
    }

    public final boolean T() {
        return R() || S() || U() || V();
    }

    public final boolean U() {
        return this.v == 2;
    }

    public final boolean V() {
        return this.v == 4;
    }

    public boolean W() {
        return (this.u & 8) != 0;
    }

    public boolean X() {
        return this.u != 0;
    }

    public boolean Y() {
        return (this.u & 1) != 0;
    }

    public boolean Z() {
        return (this.u & 4) != 0;
    }

    public boolean a0() {
        return (this.u & 2) != 0;
    }

    public boolean b0() {
        return Y() || Z();
    }

    public boolean c0() {
        return a0() || W();
    }

    public void d0() {
        if (this.k.y(this) && T()) {
            L(this.k.f().a, this.k.f().b);
            K();
            this.p.l(true);
            this.p.o(this.k.d());
            D(this.p, this.k.f());
            M();
        }
    }

    public final void e0() {
        this.u = 0;
        this.q = false;
        this.r = false;
    }

    public void f0(RectF rectF) {
        if (rectF == null || rectF.isEmpty()) {
            return;
        }
        this.o.set(rectF);
        bv1 bv1Var = this.k;
        if (bv1Var != null) {
            bv1Var.q(this.o);
            this.k.y(this);
        }
    }

    public void g0(nuk nukVar) {
        D(this.k, nukVar);
        lki lkiVar = this.m;
        if (lkiVar != null) {
            lkiVar.h(this.s, this.t);
            D(this.p, nukVar);
        }
    }

    @Override // com.oplus.aiunit.vision.d01
    public void m() {
        bv1 bv1Var = this.k;
        if (bv1Var.i != null) {
            L(bv1Var.f().a, this.k.f().b);
        }
        Q();
        super.m();
    }

    @Override // com.oplus.aiunit.vision.d01
    public abstract int r();

    @Override // com.oplus.aiunit.vision.d01
    public boolean t() {
        return T() ? super.t() : u(this.k.f9865e);
    }

    @Override // com.oplus.aiunit.vision.d01
    public String toString() {
        return "ConstraintBehavior{sPhysicalSizeToPixelsRatio=" + hr3.sPhysicalSizeToPixelsRatio + ", mConstraintRect=" + this.o + ", mShouldFixXSide=" + this.q + ", mShouldFixYSide=" + this.r + ", mConstraintPointX=" + this.s + ", mConstraintPointY=" + this.t + ", mOverBoundsState=" + this.u + ", mCollisionMode=" + this.v + ", type=" + r() + ", mFirstProperty=" + this.f10312e + ", mValueThreshold=" + this.a + ", mTarget=" + this.f10315n + ", mPropertyBody=" + this.k + ", mActiveUIItem=" + this.f10313j + ", mSpring=" + this.m + ", mSpringDef=" + this.f10314l + ", mIsSpringApplied=" + this.b + ", mIsStarted=" + this.f10311c + ", mHasCustomStartVelocity=" + this.d + ", mAssistBody=" + this.p + "}@" + hashCode();
    }

    @Override // com.oplus.aiunit.vision.d01
    public void v(bv1 bv1Var) {
        if (T()) {
            super.v(bv1Var);
        }
    }

    @Override // com.oplus.aiunit.vision.d01
    public void w() {
        super.w();
        bv1 bv1Var = this.p;
        if (bv1Var != null) {
            D(bv1Var, this.f10313j.d);
        }
    }

    @Override // com.oplus.aiunit.vision.d01
    public void y() {
        RectF rectF = this.o;
        if (rectF != null && !rectF.isEmpty()) {
            this.k.q(this.o);
            this.k.y(this);
            if (T()) {
                bv1 bv1Var = this.k;
                if (bv1Var.f9868n == 50.0f) {
                    bv1Var.k(this.f10314l.f14974e);
                }
            }
        }
        if (this.f10314l != null) {
            bv1 bv1VarD = d("Assist", this.p);
            this.p = bv1VarD;
            this.f10314l.b = bv1VarD;
        }
    }

    @Override // com.oplus.aiunit.vision.d01
    public void z() {
        super.z();
        this.k.a(this);
        if (T()) {
            N();
            j(this.p);
        }
    }
}
