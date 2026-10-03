package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class xo4 extends m1 {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18702j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18703l;

    public xo4(s1 s1Var) {
        this.i = k1.m(s1Var.p(0)).n().intValue();
        if (s1Var.p(1) instanceof k1) {
            this.f18702j = ((k1) s1Var.p(1)).n().intValue();
        } else {
            if (!(s1Var.p(1) instanceof s1)) {
                throw new IllegalArgumentException("object parse error");
            }
            s1 s1VarN = s1.n(s1Var.p(1));
            this.f18702j = k1.m(s1VarN.p(0)).n().intValue();
            this.k = k1.m(s1VarN.p(1)).n().intValue();
            this.f18703l = k1.m(s1VarN.p(2)).n().intValue();
        }
    }

    public static xo4 f(Object obj) {
        if (obj instanceof xo4) {
            return (xo4) obj;
        }
        if (obj != null) {
            return new xo4(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(this.i));
        if (this.k == 0) {
            g1Var.a(new k1(this.f18702j));
        } else {
            g1 g1Var2 = new g1();
            g1Var2.a(new k1(this.f18702j));
            g1Var2.a(new k1(this.k));
            g1Var2.a(new k1(this.f18703l));
            g1Var.a(new xj4(g1Var2));
        }
        return new xj4(g1Var);
    }

    public int g() {
        return this.f18702j;
    }

    public int h() {
        return this.k;
    }

    public int i() {
        return this.f18703l;
    }

    public int j() {
        return this.i;
    }
}
