package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class srh extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f16732l;

    public srh(gj0 gj0Var) {
        this.f16732l = gj0Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        boolean zK = rpjVar.k();
        rpjVar.y(true);
        t22 t22VarC = this.f16732l.c(rpjVar);
        rpjVar.y(zK);
        return t22VarC;
    }
}
