package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class g9g extends m1 {
    public final k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tz f11679j;

    public g9g(tz tzVar) {
        this.i = new k1(0L);
        this.f11679j = tzVar;
    }

    public static final g9g f(Object obj) {
        if (obj instanceof g9g) {
            return (g9g) obj;
        }
        if (obj != null) {
            return new g9g(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f11679j);
        return new xj4(g1Var);
    }

    public tz g() {
        return this.f11679j;
    }

    public g9g(s1 s1Var) {
        this.i = k1.m(s1Var.p(0));
        this.f11679j = tz.g(s1Var.p(1));
    }
}
