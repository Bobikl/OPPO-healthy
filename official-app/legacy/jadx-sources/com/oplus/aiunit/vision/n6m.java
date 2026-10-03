package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class n6m extends m1 {
    public final k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14369j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tz f14370l;

    public n6m(int i, int i2, tz tzVar) {
        this.i = new k1(0L);
        this.f14369j = i;
        this.k = i2;
        this.f14370l = tzVar;
    }

    public static n6m g(Object obj) {
        if (obj instanceof n6m) {
            return (n6m) obj;
        }
        if (obj != null) {
            return new n6m(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(new k1(this.f14369j));
        g1Var.a(new k1(this.k));
        g1Var.a(this.f14370l);
        return new xj4(g1Var);
    }

    public int f() {
        return this.f14369j;
    }

    public int h() {
        return this.k;
    }

    public tz i() {
        return this.f14370l;
    }

    public n6m(s1 s1Var) {
        this.i = k1.m(s1Var.p(0));
        this.f14369j = k1.m(s1Var.p(1)).o().intValue();
        this.k = k1.m(s1Var.p(2)).o().intValue();
        this.f14370l = tz.g(s1Var.p(3));
    }
}
