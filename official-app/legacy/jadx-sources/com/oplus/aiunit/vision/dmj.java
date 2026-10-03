package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class dmj extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10628l;

    public dmj(boolean z) {
        this.f10628l = z;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        u73 u73VarS = rpjVar.n().s("bar", rpjVar.m());
        float fG = u73VarS.g();
        w73 w73Var = new w73(rpjVar.n().G(this.f10628l ? 'T' : 't', "mathnormal", rpjVar.m()));
        t22 w73Var2 = new w73(u73VarS);
        if (Math.abs(fG) > 1.0E-7f) {
            af9 af9Var = new af9(new s1j(-fG, 0.0f, 0.0f, 0.0f));
            af9Var.b(w73Var2);
            w73Var2 = af9Var;
        }
        af9 af9Var2 = new af9(w73Var2, w73Var.k(), 2);
        tvk tvkVar = new tvk();
        tvkVar.b(w73Var);
        tvkVar.b(new s1j(0.0f, w73Var.h() * (-0.5f), 0.0f, 0.0f));
        tvkVar.b(af9Var2);
        return tvkVar;
    }
}
