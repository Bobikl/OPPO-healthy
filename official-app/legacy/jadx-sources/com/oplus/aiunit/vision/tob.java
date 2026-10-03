package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class tob extends m1 {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17090j;
    public byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f17091l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public tz f17092n;

    public tob(int i, int i2, j18 j18Var, fne fneVar, ege egeVar, tz tzVar) {
        this.i = i;
        this.f17090j = i2;
        this.k = j18Var.e();
        this.f17091l = fneVar.h();
        this.m = egeVar.a();
        this.f17092n = tzVar;
    }

    public static tob i(Object obj) {
        if (obj instanceof tob) {
            return (tob) obj;
        }
        if (obj != null) {
            return new tob(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(this.i));
        g1Var.a(new k1(this.f17090j));
        g1Var.a(new tj4(this.k));
        g1Var.a(new tj4(this.f17091l));
        g1Var.a(new tj4(this.m));
        g1Var.a(this.f17092n);
        return new xj4(g1Var);
    }

    public tz f() {
        return this.f17092n;
    }

    public j18 g() {
        return new j18(this.k);
    }

    public fne h() {
        return new fne(g(), this.f17091l);
    }

    public int j() {
        return this.f17090j;
    }

    public int k() {
        return this.i;
    }

    public ege l() {
        return new ege(this.m);
    }

    public tob(s1 s1Var) {
        this.i = ((k1) s1Var.p(0)).o().intValue();
        this.f17090j = ((k1) s1Var.p(1)).o().intValue();
        this.k = ((o1) s1Var.p(2)).o();
        this.f17091l = ((o1) s1Var.p(3)).o();
        this.m = ((o1) s1Var.p(4)).o();
        this.f17092n = tz.g(s1Var.p(5));
    }
}
