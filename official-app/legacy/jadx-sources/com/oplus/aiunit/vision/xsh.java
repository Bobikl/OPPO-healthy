package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class xsh extends d01 {
    public nuk o;
    public nuk p;

    public xsh() {
        this(0.0f);
    }

    @Override // com.oplus.aiunit.vision.d01
    public void B() {
        super.B();
        if (this.m == null) {
            L();
        } else {
            R();
        }
    }

    @Override // com.oplus.aiunit.vision.d01
    public boolean C() {
        M();
        return super.C();
    }

    public final void K() {
        if (this.p == null) {
            this.p = new nuk();
        }
        this.p.d((hr3.d(this.o.a) + this.k.c().a) / this.a, (hr3.d(this.o.b) + this.k.c().b) / this.a);
    }

    public final void L() {
        if (e(this.f10314l)) {
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
        Q(f, 0.0f);
    }

    public void Q(float f, float f2) {
        if (g25.b()) {
            g25.c("SnapBehavior : start : x =:" + f + ",y =:" + f2);
        }
        N(f, f2);
        O();
    }

    public final void R() {
        K();
        this.m.i(this.p);
    }

    @Override // com.oplus.aiunit.vision.d01
    public void m() {
        this.f10313j.d.e(this.k.f());
        super.m();
    }

    @Override // com.oplus.aiunit.vision.d01
    public int r() {
        return 4;
    }

    public xsh(float f) {
        this(f, 0.0f);
    }

    public xsh(float f, float f2) {
        g();
        this.o = new nuk(f, f2);
    }
}
