package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class h28 extends m1 {
    public n1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n1 f11971j;
    public n1 k;

    public h28(n1 n1Var, n1 n1Var2) {
        this.i = n1Var;
        this.f11971j = n1Var2;
        this.k = null;
    }

    public static h28 h(Object obj) {
        if (obj instanceof h28) {
            return (h28) obj;
        }
        if (obj != null) {
            return new h28(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f11971j);
        n1 n1Var = this.k;
        if (n1Var != null) {
            g1Var.a(n1Var);
        }
        return new xj4(g1Var);
    }

    public n1 f() {
        return this.f11971j;
    }

    public n1 g() {
        return this.k;
    }

    public n1 i() {
        return this.i;
    }

    public h28(n1 n1Var, n1 n1Var2, n1 n1Var3) {
        this.i = n1Var;
        this.f11971j = n1Var2;
        this.k = n1Var3;
    }

    public h28(s1 s1Var) {
        this.i = (n1) s1Var.p(0);
        this.f11971j = (n1) s1Var.p(1);
        if (s1Var.size() > 2) {
            this.k = (n1) s1Var.p(2);
        }
    }
}
