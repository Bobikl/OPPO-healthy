package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class qck extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f15751l;

    public qck(gj0 gj0Var) {
        this.f15751l = gj0Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        rpj rpjVarB = rpjVar.b(rpjVar.n().copy());
        rpjVarB.n().a(true);
        t22 t22VarC = this.f15751l.c(rpjVarB);
        rpjVarB.n().a(false);
        return t22VarC;
    }
}
