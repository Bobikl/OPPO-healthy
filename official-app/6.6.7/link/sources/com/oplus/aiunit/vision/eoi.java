package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class eoi {
    public tf6 c;
    public tf6 d;
    public boolean e;
    public float f;
    public float g;
    public float i;
    public float k;
    public pv1 l;
    public pv1 m;
    public final lyk n;
    public final lyk o;
    public final lyk p;
    public final lyk q;
    public final lyk r;
    public final vib s;
    public eoi a = null;
    public eoi b = null;
    public float h = vr3.UNSET;
    public float j = vr3.UNSET;

    public eoi(lyk lykVar, hoi hoiVar) {
        lyk lykVar2 = new lyk();
        this.n = lykVar2;
        this.o = new lyk();
        lyk lykVar3 = new lyk();
        this.p = lykVar3;
        this.q = new lyk();
        this.s = new vib();
        this.r = lykVar;
        this.l = hoiVar.a;
        this.m = hoiVar.b;
        this.e = false;
        this.c = new tf6();
        this.d = new tf6();
        if (hoiVar.e < vr3.UNSET || hoiVar.d < vr3.UNSET || hoiVar.f < vr3.UNSET) {
            return;
        }
        lykVar3.e(hoiVar.c);
        lykVar2.e(lykVar3).g(this.m.f());
        this.i = hoiVar.d;
        this.f = hoiVar.e;
        this.g = hoiVar.f;
    }

    public static eoi a(f6m f6mVar, hoi hoiVar) {
        return new eoi(f6mVar.f(), hoiVar);
    }

    public final pv1 b() {
        return this.l;
    }

    public final pv1 c() {
        return this.m;
    }

    public lyk d() {
        return this.p;
    }

    public void e(pv1 pv1Var, float f) {
        this.k = pv1Var.s;
        float f2 = this.f * 6.2831855f;
        float fE = pv1Var.e() * 2.0f * this.g * f2;
        float fE2 = pv1Var.e() * f2 * f2 * f;
        float f3 = fE + fE2;
        if (f3 > 1.1920929E-7f) {
            this.j = f * f3;
        }
        float f4 = this.j;
        if (f4 != vr3.UNSET) {
            this.j = 1.0f / f4;
        }
        float f5 = this.j;
        this.h = fE2 * f5;
        vib vibVar = this.s;
        lyk lykVar = vibVar.a;
        float f6 = this.k;
        lykVar.a = f6 + f5;
        vibVar.b.b = f6 + f5;
        vibVar.a();
        this.o.e(pv1Var.c).g(this.n).g(this.p).b(this.h);
        lyk lykVar2 = pv1Var.e;
        float f7 = lykVar2.a;
        float f8 = this.k;
        lyk lykVar3 = this.q;
        lykVar2.a = f7 + (lykVar3.a * f8);
        lykVar2.b += f8 * lykVar3.b;
    }

    public void f(float f) {
        this.g = f;
    }

    public void g(float f) {
        this.f = f;
    }

    public void h(float f, float f2) {
        lyk lykVar = this.p;
        lykVar.a = f;
        lykVar.b = f2;
    }

    public void i(lyk lykVar) {
        this.p.e(lykVar);
    }

    public void j(pv1 pv1Var) {
        this.r.e(this.q);
        this.r.b(this.j).a(this.o).a(pv1Var.e).c();
        vib vibVar = this.s;
        lyk lykVar = this.r;
        vib.b(vibVar, lykVar, lykVar);
        this.q.a(this.r);
        pv1Var.e.a(this.r.b(this.k));
    }

    public String toString() {
        return "Spring{mIsSolved=" + this.e + ", mFrequencyHz=" + this.f + ", mDampingRatio=" + this.g + ", mBeta=" + this.h + ", mMaxForce=" + this.i + ", mGamma=" + this.j + ", mInvMass=" + this.k + ", mTarget=" + this.p + ", mLocalAnchor=" + this.n + ", mPositionCenter=" + this.o + ", mImpulse=" + this.q + ", mImpulseTemp=" + this.r + "}@" + hashCode();
    }
}
