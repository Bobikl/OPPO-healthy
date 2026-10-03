package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class jtj extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13024l;
    public gj0 m;

    public jtj(gj0 gj0Var, String str) {
        this.f13024l = str;
        this.m = gj0Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        String strO = rpjVar.o();
        rpjVar.A(this.f13024l);
        t22 t22VarC = this.m.c(rpjVar);
        rpjVar.A(strO);
        return t22VarC;
    }
}
