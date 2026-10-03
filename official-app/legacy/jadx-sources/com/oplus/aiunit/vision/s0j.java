package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class s0j extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f16427l;

    public s0j(gj0 gj0Var) {
        this.f16427l = gj0Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        spj spjVarN = rpjVar.n();
        int iM = rpjVar.m();
        float fD = spjVarN.d(iM);
        float fL = spjVarN.l(iM);
        t22 t22VarC = this.f16427l.c(rpjVar);
        bf9 bf9Var = new bf9(fL, t22VarC.k(), (-fD) + fL, false);
        af9 af9Var = new af9();
        af9Var.b(t22VarC);
        af9Var.b(new s1j(-t22VarC.k(), 0.0f, 0.0f, 0.0f));
        af9Var.b(bf9Var);
        return af9Var;
    }
}
