package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class b07 extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f9537l;
    public final gj0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public lk3 f9538n;
    public lk3 o;

    public b07(gj0 gj0Var) {
        this.f9537l = 0.65f;
        this.f9538n = null;
        this.o = null;
        if (gj0Var == null) {
            this.m = new ozf();
        } else {
            this.m = gj0Var;
            this.i = gj0Var.i;
        }
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC = this.m.c(rpjVar);
        float fL = rpjVar.n().l(rpjVar.m());
        float fI = this.f9537l * d4i.i(0, rpjVar);
        if (this.f9538n == null) {
            return new yy7(t22VarC, fL, fI);
        }
        rpjVar.f16300l = true;
        return new yy7(t22VarC, fL, fI, this.o, this.f9538n);
    }

    public b07(gj0 gj0Var, lk3 lk3Var, lk3 lk3Var2) {
        this(gj0Var);
        this.f9538n = lk3Var;
        this.o = lk3Var2;
    }
}
