package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class zyc extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gj0 f19595l;
    public final gj0 m;

    public zyc(gj0 gj0Var, gj0 gj0Var2) {
        this.f19595l = gj0Var == null ? new sl6() : gj0Var;
        this.m = gj0Var2 == null ? new sl6() : gj0Var2;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        spj spjVarN = rpjVar.n();
        int iM = rpjVar.m();
        float fL = spjVarN.l(iM);
        float fAbs = (Math.abs(iM < 2 ? spjVarN.y(iM, spjVarN.s("sqrt", iM).e()) : fL) / 4.0f) + fL;
        af9 af9Var = new af9(this.f19595l.c(rpjVar.c()));
        af9Var.b(new d4i(5, 1.0f, 0.0f, 0.0f).c(rpjVar.c()));
        float fH = af9Var.h() + af9Var.g() + fAbs;
        t22 t22VarB = a95.b("sqrt", rpjVar, fH + fL);
        float fG = fAbs + ((t22VarB.g() - fH) / 2.0f);
        t22VarB.o(-(af9Var.h() + fG));
        rxd rxdVar = new rxd(af9Var, fG, t22VarB.h());
        rxdVar.o(-(af9Var.h() + fG + fL));
        af9 af9Var2 = new af9(t22VarB);
        af9Var2.b(rxdVar);
        gj0 gj0Var = this.m;
        if (gj0Var == null) {
            return af9Var2;
        }
        t22 t22VarC = gj0Var.c(rpjVar.s());
        t22VarC.o((af9Var2.g() - t22VarC.g()) - ((af9Var2.h() + af9Var2.g()) * 0.55f));
        t22 t22VarC2 = new d4i(5, -10.0f, 0.0f, 0.0f).c(rpjVar);
        af9 af9Var3 = new af9();
        float fK = t22VarC.k() + t22VarC2.k();
        if (fK < 0.0f) {
            af9Var3.b(new s1j(-fK, 0.0f, 0.0f, 0.0f));
        }
        af9Var3.b(t22VarC);
        af9Var3.b(t22VarC2);
        af9Var3.b(af9Var2);
        return af9Var3;
    }
}
