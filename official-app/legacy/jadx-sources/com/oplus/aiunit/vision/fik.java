package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class fik extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f11378l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11379n;
    public boolean o;

    public fik(gj0 gj0Var, boolean z, boolean z2) {
        this.o = false;
        this.f11378l = gj0Var;
        this.f11379n = z;
        this.m = z2;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarB;
        float f;
        gj0 gj0Var = this.f11378l;
        t22 t22VarC = gj0Var != null ? gj0Var.c(rpjVar) : new s1j(0.0f, 0.0f, 0.0f, 0.0f);
        float fK = new d4i(3, 1.0f, 0.0f, 0.0f).c(rpjVar).k();
        if (this.o) {
            t22VarB = r5m.a(rpjVar, t22VarC.k());
            f = fK * 4.0f;
        } else {
            t22VarB = r5m.b(this.f11379n, rpjVar, t22VarC.k());
            f = -fK;
        }
        tvk tvkVar = new tvk();
        if (this.m) {
            tvkVar.b(t22VarB);
            tvkVar.b(new af9(t22VarC, t22VarB.k(), 2));
            float fG = tvkVar.g() + tvkVar.h();
            tvkVar.m(t22VarC.g());
            tvkVar.n(fG - t22VarC.g());
        } else {
            tvkVar.b(new af9(t22VarC, t22VarB.k(), 2));
            tvkVar.b(new s1j(0.0f, f, 0.0f, 0.0f));
            tvkVar.b(t22VarB);
            tvkVar.m((tvkVar.g() + tvkVar.h()) - t22VarC.h());
            tvkVar.n(t22VarC.h());
        }
        return tvkVar;
    }

    public fik(gj0 gj0Var, boolean z) {
        this.f11379n = false;
        this.f11378l = gj0Var;
        this.m = z;
        this.o = true;
    }
}
