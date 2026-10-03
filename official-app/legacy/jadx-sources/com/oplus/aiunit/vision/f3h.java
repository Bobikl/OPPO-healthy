package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class f3h extends m1 implements h1e {
    public k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u1 f11199j;
    public k74 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u1 f11200l;
    public u1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u1 f11201n;

    public f3h(k1 k1Var, u1 u1Var, k74 k74Var, u1 u1Var2, u1 u1Var3, u1 u1Var4) {
        this.i = k1Var;
        this.f11199j = u1Var;
        this.k = k74Var;
        this.f11200l = u1Var2;
        this.m = u1Var3;
        this.f11201n = u1Var4;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f11199j);
        g1Var.a(this.k);
        if (this.f11200l != null) {
            g1Var.a(new ck4(false, 0, this.f11200l));
        }
        if (this.m != null) {
            g1Var.a(new ck4(false, 1, this.m));
        }
        g1Var.a(this.f11201n);
        return new qp0(g1Var);
    }
}
