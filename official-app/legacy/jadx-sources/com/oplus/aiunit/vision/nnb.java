package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class nnb extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14564l;
    public gj0 m;

    public nnb(gj0 gj0Var, int i) {
        this.m = gj0Var;
        this.f14564l = i;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        rpj rpjVarB = rpjVar.b(rpjVar.n().copy());
        rpjVarB.n().n(false);
        int iM = rpjVarB.m();
        rpjVarB.z(this.f14564l);
        t22 t22VarC = this.m.c(rpjVarB);
        rpjVarB.z(iM);
        return t22VarC;
    }
}
