package com.oplus.aiunit.vision;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public class c46 extends d01 {
    public bv1 o;
    public oki p;
    public lki q;
    public boolean r = false;
    public boolean s = true;

    public c46() {
        g();
        oki okiVar = new oki();
        this.p = okiVar;
        okiVar.f14974e = 2000000.0f;
        okiVar.f = 100.0f;
    }

    @Override // com.oplus.aiunit.vision.d01
    public <T extends d01> T A(float f, float f2) {
        bv1 bv1Var = this.k;
        if (bv1Var != null) {
            bv1Var.k(f);
        }
        return (T) super.A(f, f2);
    }

    @Override // com.oplus.aiunit.vision.d01
    public void B() {
        super.B();
        M();
    }

    @Override // com.oplus.aiunit.vision.d01
    public boolean C() {
        N();
        return super.C();
    }

    public void K(float f, float f2) {
        L(f, 0.0f, f2, 0.0f);
    }

    public void L(float f, float f2, float f3, float f4) {
        if (g25.b()) {
            g25.c("DragBehavior : beginDrag : x =:" + f + ",y =:" + f2 + ",currentX =:" + f3 + ",currentY =:" + f4);
        }
        this.k.m(f - f3, f2 - f4);
        this.k.y(this);
        this.k.f9865e.f();
        bv1 bv1Var = this.o;
        if (bv1Var != null) {
            bv1Var.f9865e.f();
        }
        this.f10313j.d.d(R(hr3.d(f)), S(hr3.d(f2)));
        V(this.f10313j.d);
        this.r = true;
        B();
    }

    public final void M() {
        if (e(this.f10314l)) {
            this.m.i(this.f10313j.d);
            lki lkiVarF = f(this.p, this.o);
            this.q = lkiVarF;
            if (lkiVarF != null) {
                lkiVarF.i(this.f10313j.d);
                this.o.l(true);
            }
        }
    }

    public final void N() {
        if (k()) {
            l(this.q);
            this.o.l(false);
        }
    }

    public final void O(float f, float f2) {
        if (g25.b()) {
            g25.c("DragBehavior : dragTo : x =:" + f + ",y =:" + f2);
        }
        if (this.m != null) {
            this.f10313j.d.d(R(hr3.d(f)), S(hr3.d(f2)));
            this.m.i(this.f10313j.d);
            lki lkiVar = this.q;
            if (lkiVar != null) {
                lkiVar.i(this.f10313j.d);
            }
        }
    }

    public void P(float f) {
        Q(f, 0.0f);
    }

    public void Q(float f, float f2) {
        if (g25.b()) {
            g25.c("DragBehavior : endDrag : xVel =:" + f + ",yVel =:" + f2);
        }
        N();
        bv1 bv1Var = this.o;
        if (bv1Var != null) {
            nuk nukVar = bv1Var.f9865e;
            float f3 = nukVar.a;
            f = f3 == 0.0f ? 0.0f : (f3 / qnb.a(f3)) * qnb.a(f);
            float f4 = nukVar.b;
            if (f4 == 0.0f) {
                f2 = 0.0f;
            } else {
                f2 = qnb.a(f2) * (f4 / qnb.a(f4));
            }
        }
        this.f10313j.e(f, f2);
        this.r = false;
        this.k.b(this);
    }

    public float R(float f) {
        RectF rectF;
        if (!this.s && (rectF = this.k.i) != null && (this.f10311c || !rectF.isEmpty())) {
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

    public float S(float f) {
        RectF rectF;
        if (!this.s && (rectF = this.k.i) != null && (this.f10311c || !rectF.isEmpty())) {
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

    public boolean T() {
        return this.r;
    }

    public void U(float f) {
        O(f, 0.0f);
    }

    public final void V(nuk nukVar) {
        D(this.k, nukVar);
        bv1 bv1Var = this.o;
        if (bv1Var != null) {
            D(bv1Var, nukVar);
        }
    }

    @Override // com.oplus.aiunit.vision.d01
    public int r() {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.d01
    public boolean t() {
        return !this.r;
    }

    @Override // com.oplus.aiunit.vision.d01
    public void v(bv1 bv1Var) {
        super.v(bv1Var);
        oki okiVar = this.p;
        if (okiVar != null) {
            okiVar.a = bv1Var;
        }
    }

    @Override // com.oplus.aiunit.vision.d01
    public void w() {
    }

    @Override // com.oplus.aiunit.vision.d01
    public void y() {
        super.y();
        this.k.k(this.f10314l.f14974e);
        if (this.p != null) {
            bv1 bv1VarD = d("SimulateTouch", this.o);
            this.o = bv1VarD;
            this.p.b = bv1VarD;
        }
    }

    @Override // com.oplus.aiunit.vision.d01
    public void z() {
        super.z();
        bv1 bv1Var = this.o;
        if (bv1Var != null) {
            j(bv1Var);
        }
    }
}
