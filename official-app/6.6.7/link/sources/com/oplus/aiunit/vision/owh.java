package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class owh extends r01 {
    public lyk o;
    public lyk p;

    public owh() {
        this(vr3.UNSET);
    }

    @Override // com.oplus.aiunit.vision.r01
    public void B() {
        super.B();
        if (this.m == null) {
            L();
        } else {
            R();
        }
    }

    @Override // com.oplus.aiunit.vision.r01
    public boolean C() {
        M();
        return super.C();
    }

    public final void K() {
        if (this.p == null) {
            this.p = new lyk();
        }
        this.p.d((vr3.d(this.o.a) + this.k.c().a) / this.a, (vr3.d(this.o.b) + this.k.c().b) / this.a);
    }

    public final void L() {
        if (e(this.l)) {
            R();
        }
    }

    public final void M() {
        k();
    }

    public final void N(float f, float f2) {
        this.o.d(f, f2);
    }

    public void O() {
        B();
    }

    public void P(float f) {
        Q(f, vr3.UNSET);
    }

    public void Q(float f, float f2) {
        if (z25.b()) {
            z25.c("SnapBehavior : start : x =:" + f + ",y =:" + f2);
        }
        N(f, f2);
        O();
    }

    public final void R() {
        K();
        this.m.i(this.p);
    }

    @Override // com.oplus.aiunit.vision.r01
    public void m() {
        this.j.d.e(this.k.f());
        super.m();
    }

    @Override // com.oplus.aiunit.vision.r01
    public int r() {
        return 4;
    }

    public owh(float f) {
        this(f, vr3.UNSET);
    }

    public owh(float f, float f2) {
        g();
        this.o = new lyk(f, f2);
    }
}
