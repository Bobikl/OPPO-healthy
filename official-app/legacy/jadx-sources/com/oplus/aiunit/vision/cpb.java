package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class cpb extends m1 {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10186j;
    public final h18 k;

    public cpb(int i, int i2, h18 h18Var) {
        this.i = i;
        this.f10186j = i2;
        this.k = new h18(h18Var);
    }

    public static cpb g(Object obj) {
        if (obj instanceof cpb) {
            return (cpb) obj;
        }
        if (obj != null) {
            return new cpb(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(this.i));
        g1Var.a(new k1(this.f10186j));
        g1Var.a(new tj4(this.k.c()));
        return new xj4(g1Var);
    }

    public h18 f() {
        return new h18(this.k);
    }

    public int h() {
        return this.i;
    }

    public int i() {
        return this.f10186j;
    }

    public cpb(s1 s1Var) {
        this.i = ((k1) s1Var.p(0)).o().intValue();
        this.f10186j = ((k1) s1Var.p(1)).o().intValue();
        this.k = new h18(((o1) s1Var.p(2)).o());
    }
}
