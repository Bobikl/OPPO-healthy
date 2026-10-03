package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class t06 extends b07 {
    public t06(gj0 gj0Var) {
        super(gj0Var);
    }

    @Override // com.oplus.aiunit.vision.b07, com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC = this.m.c(rpjVar);
        float fL = rpjVar.n().l(rpjVar.m());
        float fI = this.f9537l * d4i.i(0, rpjVar);
        float f = 1.5f * fL;
        return new yy7(new yy7(t22VarC, fL * 0.75f, fI), f, (d4i.i(3, rpjVar) * 0.5f) + f);
    }
}
