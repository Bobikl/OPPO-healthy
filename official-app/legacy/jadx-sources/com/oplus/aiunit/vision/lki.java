package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class lki {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ve6 f13747c;
    public ve6 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13748e;
    public float f;
    public float g;
    public float i;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public bv1 f13750l;
    public bv1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nuk f13751n;
    public final nuk o;
    public final nuk p;
    public final nuk q;
    public final nuk r;
    public final ghb s;
    public lki a = null;
    public lki b = null;
    public float h = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f13749j = 0.0f;

    public lki(nuk nukVar, oki okiVar) {
        nuk nukVar2 = new nuk();
        this.f13751n = nukVar2;
        this.o = new nuk();
        nuk nukVar3 = new nuk();
        this.p = nukVar3;
        this.q = new nuk();
        this.s = new ghb();
        this.r = nukVar;
        this.f13750l = okiVar.a;
        this.m = okiVar.b;
        this.f13748e = false;
        this.f13747c = new ve6();
        this.d = new ve6();
        if (okiVar.f14974e < 0.0f || okiVar.d < 0.0f || okiVar.f < 0.0f) {
            return;
        }
        nukVar3.e(okiVar.f14973c);
        nukVar2.e(nukVar3).g(this.m.f());
        this.i = okiVar.d;
        this.f = okiVar.f14974e;
        this.g = okiVar.f;
    }

    public static lki a(g2m g2mVar, oki okiVar) {
        return new lki(g2mVar.f(), okiVar);
    }

    public final bv1 b() {
        return this.f13750l;
    }

    public final bv1 c() {
        return this.m;
    }

    public nuk d() {
        return this.p;
    }

    public void e(bv1 bv1Var, float f) {
        this.k = bv1Var.s;
        float f2 = this.f * 6.2831855f;
        float fE = bv1Var.e() * 2.0f * this.g * f2;
        float fE2 = bv1Var.e() * f2 * f2 * f;
        float f3 = fE + fE2;
        if (f3 > 1.1920929E-7f) {
            this.f13749j = f * f3;
        }
        float f4 = this.f13749j;
        if (f4 != 0.0f) {
            this.f13749j = 1.0f / f4;
        }
        float f5 = this.f13749j;
        this.h = fE2 * f5;
        ghb ghbVar = this.s;
        nuk nukVar = ghbVar.a;
        float f6 = this.k;
        nukVar.a = f6 + f5;
        ghbVar.b.b = f6 + f5;
        ghbVar.a();
        this.o.e(bv1Var.f9864c).g(this.f13751n).g(this.p).b(this.h);
        nuk nukVar2 = bv1Var.f9865e;
        float f7 = nukVar2.a;
        float f8 = this.k;
        nuk nukVar3 = this.q;
        nukVar2.a = f7 + (nukVar3.a * f8);
        nukVar2.b += f8 * nukVar3.b;
    }

    public void f(float f) {
        this.g = f;
    }

    public void g(float f) {
        this.f = f;
    }

    public void h(float f, float f2) {
        nuk nukVar = this.p;
        nukVar.a = f;
        nukVar.b = f2;
    }

    public void i(nuk nukVar) {
        this.p.e(nukVar);
    }

    public void j(bv1 bv1Var) {
        this.r.e(this.q);
        this.r.b(this.f13749j).a(this.o).a(bv1Var.f9865e).c();
        ghb ghbVar = this.s;
        nuk nukVar = this.r;
        ghb.b(ghbVar, nukVar, nukVar);
        this.q.a(this.r);
        bv1Var.f9865e.a(this.r.b(this.k));
    }

    public String toString() {
        return "Spring{mIsSolved=" + this.f13748e + ", mFrequencyHz=" + this.f + ", mDampingRatio=" + this.g + ", mBeta=" + this.h + ", mMaxForce=" + this.i + ", mGamma=" + this.f13749j + ", mInvMass=" + this.k + ", mTarget=" + this.p + ", mLocalAnchor=" + this.f13751n + ", mPositionCenter=" + this.o + ", mImpulse=" + this.q + ", mImpulseTemp=" + this.r + "}@" + hashCode();
    }
}
