package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class w1j extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18079l;
    public gj0 m;

    public w1j(int i, gj0 gj0Var) {
        this.f18079l = i;
        this.m = gj0Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        int iM = rpjVar.m();
        rpjVar.z(this.f18079l);
        t22 t22VarC = this.m.c(rpjVar);
        rpjVar.z(iM);
        return t22VarC;
    }
}
