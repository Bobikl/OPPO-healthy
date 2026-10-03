package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class o5m extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f14794l;
    public gj0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14795n;

    public o5m(gj0 gj0Var, gj0 gj0Var2, boolean z) {
        this.f14794l = gj0Var;
        this.m = gj0Var2;
        this.f14795n = z;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        gj0 gj0Var = this.f14794l;
        t22 t22VarC = gj0Var != null ? gj0Var.c(rpjVar.C()) : new s1j(0.0f, 0.0f, 0.0f, 0.0f);
        gj0 gj0Var2 = this.m;
        t22 t22VarC2 = gj0Var2 != null ? gj0Var2.c(rpjVar.B()) : new s1j(0.0f, 0.0f, 0.0f, 0.0f);
        t22 t22VarC3 = new d4i(0, 1.5f, 0.0f, 0.0f).c(rpjVar.C());
        t22 t22VarC4 = new d4i(0, 1.5f, 0.0f, 0.0f).c(rpjVar.B());
        t22 t22VarC5 = new d4i(5, 0.0f, 2.0f, 0.0f).c(rpjVar);
        float fMax = Math.max(t22VarC.k() + (t22VarC3.k() * 2.0f), t22VarC2.k() + (t22VarC4.k() * 2.0f));
        t22 t22VarB = r5m.b(this.f14795n, rpjVar, fMax);
        af9 af9Var = new af9(t22VarC, fMax, 2);
        af9 af9Var2 = new af9(t22VarC2, fMax, 2);
        tvk tvkVar = new tvk();
        tvkVar.b(af9Var);
        tvkVar.b(t22VarC5);
        tvkVar.b(t22VarB);
        tvkVar.b(t22VarC5);
        tvkVar.b(af9Var2);
        float fH = tvkVar.h() + tvkVar.g();
        float fH2 = t22VarC5.h() + t22VarC5.g() + af9Var2.h() + af9Var2.g();
        tvkVar.m(fH2);
        tvkVar.n(fH - fH2);
        return new af9(tvkVar, tvkVar.k() + (t22VarC5.h() * 2.0f), 2);
    }
}
