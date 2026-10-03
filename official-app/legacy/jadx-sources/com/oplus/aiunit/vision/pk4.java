package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class pk4 extends m1 {
    public kj4 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k1 f15389j;

    public pk4(s1 s1Var) {
        if (s1Var.size() == 2) {
            this.i = kj4.r(s1Var.p(0));
            this.f15389j = k1.m(s1Var.p(1));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + s1Var.size());
        }
    }

    public static pk4 f(Object obj) {
        if (obj instanceof pk4) {
            return (pk4) obj;
        }
        if (obj != null) {
            return new pk4(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f15389j);
        return new xj4(g1Var);
    }
}
