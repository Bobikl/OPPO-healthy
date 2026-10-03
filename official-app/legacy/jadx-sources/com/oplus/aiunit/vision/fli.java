package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class fli extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f11426l;

    public fli(gj0 gj0Var) {
        this.f11426l = gj0Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        rpj rpjVarB = rpjVar.b(rpjVar.n().copy());
        rpjVarB.n().k(true);
        t22 t22VarC = this.f11426l.c(rpjVarB);
        rpjVarB.n().k(false);
        return t22VarC;
    }
}
