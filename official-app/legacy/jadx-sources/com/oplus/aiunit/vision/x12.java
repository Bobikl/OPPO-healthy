package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class x12 extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f18467l;

    public x12(gj0 gj0Var) {
        this.f18467l = gj0Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        if (this.f18467l == null) {
            return new s1j(0.0f, 0.0f, 0.0f, 0.0f);
        }
        rpj rpjVarB = rpjVar.b(rpjVar.n().copy());
        rpjVarB.n().H(true);
        return this.f18467l.c(rpjVarB);
    }
}
