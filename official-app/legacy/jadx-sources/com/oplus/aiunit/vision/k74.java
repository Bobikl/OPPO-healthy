package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class k74 extends m1 implements h1e {
    public n1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f1 f13181j;
    public boolean k = true;

    public k74(n1 n1Var, f1 f1Var) {
        this.i = n1Var;
        this.f13181j = f1Var;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        f1 f1Var = this.f13181j;
        if (f1Var != null) {
            g1Var.a(new up0(true, 0, f1Var));
        }
        return this.k ? new qp0(g1Var) : new sk4(g1Var);
    }
}
