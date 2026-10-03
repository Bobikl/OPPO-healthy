package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class apb extends m1 {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9457j;
    public byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f9458l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f9459n;
    public byte[] o;

    public apb(int i, int i2, j18 j18Var, fne fneVar, ege egeVar, ege egeVar2, h18 h18Var) {
        this.i = i;
        this.f9457j = i2;
        this.k = j18Var.e();
        this.f9458l = fneVar.h();
        this.m = h18Var.c();
        this.f9459n = egeVar.a();
        this.o = egeVar2.a();
    }

    public static apb h(Object obj) {
        if (obj instanceof apb) {
            return (apb) obj;
        }
        if (obj != null) {
            return new apb(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(this.i));
        g1Var.a(new k1(this.f9457j));
        g1Var.a(new tj4(this.k));
        g1Var.a(new tj4(this.f9458l));
        g1Var.a(new tj4(this.f9459n));
        g1Var.a(new tj4(this.o));
        g1Var.a(new tj4(this.m));
        return new xj4(g1Var);
    }

    public j18 f() {
        return new j18(this.k);
    }

    public fne g() {
        return new fne(f(), this.f9458l);
    }

    public int i() {
        return this.f9457j;
    }

    public int j() {
        return this.i;
    }

    public ege k() {
        return new ege(this.f9459n);
    }

    public ege l() {
        return new ege(this.o);
    }

    public h18 m() {
        return new h18(this.m);
    }

    public apb(s1 s1Var) {
        this.i = ((k1) s1Var.p(0)).o().intValue();
        this.f9457j = ((k1) s1Var.p(1)).o().intValue();
        this.k = ((o1) s1Var.p(2)).o();
        this.f9458l = ((o1) s1Var.p(3)).o();
        this.f9459n = ((o1) s1Var.p(4)).o();
        this.o = ((o1) s1Var.p(5)).o();
        this.m = ((o1) s1Var.p(6)).o();
    }
}
