package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class t43 extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f16883l;

    public t43(gj0 gj0Var) {
        this.f16883l = gj0Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC = this.f16883l.c(rpjVar);
        tvk tvkVar = new tvk();
        tvkVar.b(t22VarC);
        u73 u73VarS = rpjVar.n().s("jlatexmathcedilla", rpjVar.m());
        float fG = u73VarS.g();
        t22 w73Var = new w73(u73VarS);
        if (Math.abs(fG) > 1.0E-7f) {
            af9 af9Var = new af9(new s1j(-fG, 0.0f, 0.0f, 0.0f));
            af9Var.b(w73Var);
            w73Var = af9Var;
        }
        af9 af9Var2 = new af9(w73Var, t22VarC.k(), 2);
        tvkVar.b(new s1j(0.0f, -(d4i.i(5, rpjVar) * 0.4f), 0.0f, 0.0f));
        tvkVar.b(af9Var2);
        float fH = tvkVar.h() + tvkVar.g();
        tvkVar.n(t22VarC.h());
        tvkVar.m(fH - t22VarC.h());
        return tvkVar;
    }
}
