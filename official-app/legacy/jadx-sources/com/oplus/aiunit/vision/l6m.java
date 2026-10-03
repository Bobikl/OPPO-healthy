package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class l6m extends m1 {
    public final k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f13545j;
    public final tz k;

    public l6m(int i, tz tzVar) {
        this.i = new k1(0L);
        this.f13545j = i;
        this.k = tzVar;
    }

    public static l6m g(Object obj) {
        if (obj instanceof l6m) {
            return (l6m) obj;
        }
        if (obj != null) {
            return new l6m(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(new k1(this.f13545j));
        g1Var.a(this.k);
        return new xj4(g1Var);
    }

    public int f() {
        return this.f13545j;
    }

    public tz h() {
        return this.k;
    }

    public l6m(s1 s1Var) {
        this.i = k1.m(s1Var.p(0));
        this.f13545j = k1.m(s1Var.p(1)).o().intValue();
        this.k = tz.g(s1Var.p(2));
    }
}
