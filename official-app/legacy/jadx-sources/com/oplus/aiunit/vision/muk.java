package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class muk extends gj0 {
    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC = t6j.q("ldotp").c(rpjVar);
        tvk tvkVar = new tvk(t22VarC, 0.0f, 4);
        t22 t22VarC2 = new d4i(5, 0.0f, 4.0f, 0.0f).c(rpjVar);
        tvkVar.b(t22VarC2);
        tvkVar.b(t22VarC);
        tvkVar.b(t22VarC2);
        tvkVar.b(t22VarC);
        float fG = tvkVar.g();
        float fH = tvkVar.h();
        tvkVar.m(0.0f);
        tvkVar.n(fG + fH);
        return tvkVar;
    }
}
