package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class vob extends m1 {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17941j;
    public final h18 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tz f17942l;

    public vob(int i, int i2, h18 h18Var, tz tzVar) {
        this.i = i;
        this.f17941j = i2;
        this.k = new h18(h18Var.c());
        this.f17942l = tzVar;
    }

    public static vob h(Object obj) {
        if (obj instanceof vob) {
            return (vob) obj;
        }
        if (obj != null) {
            return new vob(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(this.i));
        g1Var.a(new k1(this.f17941j));
        g1Var.a(new tj4(this.k.c()));
        g1Var.a(this.f17942l);
        return new xj4(g1Var);
    }

    public tz f() {
        return this.f17942l;
    }

    public h18 g() {
        return this.k;
    }

    public int i() {
        return this.i;
    }

    public int j() {
        return this.f17941j;
    }

    public vob(s1 s1Var) {
        this.i = ((k1) s1Var.p(0)).o().intValue();
        this.f17941j = ((k1) s1Var.p(1)).o().intValue();
        this.k = new h18(((o1) s1Var.p(2)).o());
        this.f17942l = tz.g(s1Var.p(3));
    }
}
