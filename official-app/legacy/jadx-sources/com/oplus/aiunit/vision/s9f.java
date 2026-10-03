package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class s9f extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f16511l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16512n;
    public int o;
    public float p;
    public float q;
    public float r;

    public s9f(gj0 gj0Var, int i, float f, int i2, float f2, int i3, float f3) {
        this.f16511l = gj0Var;
        this.m = i;
        this.p = f;
        this.f16512n = i2;
        this.q = f2;
        this.o = i3;
        this.r = f3;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC = this.f16511l.c(rpjVar);
        int i = this.m;
        if (i == -1) {
            t22VarC.o(0.0f);
        } else {
            t22VarC.o((-this.p) * d4i.i(i, rpjVar));
        }
        if (this.f16512n == -1) {
            return t22VarC;
        }
        af9 af9Var = new af9(t22VarC);
        af9Var.n(this.q * d4i.i(this.f16512n, rpjVar));
        int i2 = this.o;
        if (i2 == -1) {
            af9Var.m(0.0f);
        } else {
            af9Var.m(this.r * d4i.i(i2, rpjVar));
        }
        return af9Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int d() {
        return this.f16511l.d();
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int e() {
        return this.f16511l.e();
    }
}
