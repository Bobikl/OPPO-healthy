package com.oplus.aiunit.vision;

import android.graphics.RectF;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class a56 extends r01 {
    public pv1 o;
    public hoi p;
    public eoi q;
    public boolean r = false;
    public boolean s = true;

    public a56() {
        g();
        hoi hoiVar = new hoi();
        this.p = hoiVar;
        hoiVar.e = 2000000.0f;
        hoiVar.f = 100.0f;
    }

    @Override // com.oplus.aiunit.vision.r01
    public <T extends r01> T A(float f, float f2) {
        pv1 pv1Var = this.k;
        if (pv1Var != null) {
            pv1Var.k(f);
        }
        return (T) super.A(f, f2);
    }

    @Override // com.oplus.aiunit.vision.r01
    public void B() {
        super.B();
        M();
    }

    @Override // com.oplus.aiunit.vision.r01
    public boolean C() {
        N();
        return super.C();
    }

    public void K(float f, float f2) {
        L(f, vr3.UNSET, f2, vr3.UNSET);
    }

    public void L(float f, float f2, float f3, float f4) {
        if (z25.b()) {
            z25.c("DragBehavior : beginDrag : x =:" + f + ",y =:" + f2 + ",currentX =:" + f3 + ",currentY =:" + f4);
        }
        this.k.m(f - f3, f2 - f4);
        this.k.y(this);
        this.k.e.f();
        pv1 pv1Var = this.o;
        if (pv1Var != null) {
            pv1Var.e.f();
        }
        this.j.d.d(R(vr3.d(f)), S(vr3.d(f2)));
        V(this.j.d);
        this.r = true;
        B();
    }

    public final void M() {
        if (e(this.l)) {
            this.m.i(this.j.d);
            eoi eoiVarF = f(this.p, this.o);
            this.q = eoiVarF;
            if (eoiVarF != null) {
                eoiVarF.i(this.j.d);
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
        if (z25.b()) {
            z25.c("DragBehavior : dragTo : x =:" + f + ",y =:" + f2);
        }
        if (this.m != null) {
            this.j.d.d(R(vr3.d(f)), S(vr3.d(f2)));
            this.m.i(this.j.d);
            eoi eoiVar = this.q;
            if (eoiVar != null) {
                eoiVar.i(this.j.d);
            }
        }
    }

    public void P(float f) {
        Q(f, vr3.UNSET);
    }

    public void Q(float f, float f2) {
        if (z25.b()) {
            z25.c("DragBehavior : endDrag : xVel =:" + f + ",yVel =:" + f2);
        }
        N();
        pv1 pv1Var = this.o;
        if (pv1Var != null) {
            lyk lykVar = pv1Var.e;
            float f3 = lykVar.a;
            f = f3 == vr3.UNSET ? 0.0f : (f3 / fpb.a(f3)) * fpb.a(f);
            float f4 = lykVar.b;
            if (f4 == vr3.UNSET) {
                f2 = 0.0f;
            } else {
                f2 = fpb.a(f2) * (f4 / fpb.a(f4));
            }
        }
        this.j.e(f, f2);
        this.r = false;
        this.k.b(this);
    }

    public float R(float f) {
        RectF rectF;
        if (!this.s && (rectF = this.k.i) != null && (this.c || !rectF.isEmpty())) {
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
        if (!this.s && (rectF = this.k.i) != null && (this.c || !rectF.isEmpty())) {
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
        O(f, vr3.UNSET);
    }

    public final void V(lyk lykVar) {
        D(this.k, lykVar);
        pv1 pv1Var = this.o;
        if (pv1Var != null) {
            D(pv1Var, lykVar);
        }
    }

    @Override // com.oplus.aiunit.vision.r01
    public int r() {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.r01
    public boolean t() {
        return !this.r;
    }

    @Override // com.oplus.aiunit.vision.r01
    public void v(pv1 pv1Var) {
        super.v(pv1Var);
        hoi hoiVar = this.p;
        if (hoiVar != null) {
            hoiVar.a = pv1Var;
        }
    }

    @Override // com.oplus.aiunit.vision.r01
    public void w() {
    }

    @Override // com.oplus.aiunit.vision.r01
    public void y() {
        super.y();
        this.k.k(this.l.e);
        if (this.p != null) {
            pv1 pv1VarD = d("SimulateTouch", this.o);
            this.o = pv1VarD;
            this.p.b = pv1VarD;
        }
    }

    @Override // com.oplus.aiunit.vision.r01
    public void z() {
        super.z();
        pv1 pv1Var = this.o;
        if (pv1Var != null) {
            j(pv1Var);
        }
    }
}
