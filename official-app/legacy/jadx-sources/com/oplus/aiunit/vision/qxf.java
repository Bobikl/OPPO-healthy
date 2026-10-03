package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class qxf extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f15981l;

    public qxf(gj0 gj0Var) {
        this.f15981l = gj0Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        if (this.f15981l == null) {
            return new s1j(0.0f, 0.0f, 0.0f, 0.0f);
        }
        rpj rpjVarB = rpjVar.b(rpjVar.n().copy());
        rpjVarB.n().n(true);
        return this.f15981l.c(rpjVarB);
    }
}
