package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class hik extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gj0 f12170l;

    public hik(gj0 gj0Var) {
        this.f12170l = gj0Var;
        this.i = 0;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        float fL = rpjVar.n().l(rpjVar.m());
        gj0 gj0Var = this.f12170l;
        t22 s1jVar = gj0Var == null ? new s1j(0.0f, 0.0f, 0.0f, 0.0f) : gj0Var.c(rpjVar);
        tvk tvkVar = new tvk();
        tvkVar.b(s1jVar);
        tvkVar.b(new s1j(0.0f, 3.0f * fL, 0.0f, 0.0f));
        tvkVar.b(new bf9(fL, s1jVar.k(), 0.0f));
        tvkVar.m(s1jVar.g() + (fL * 5.0f));
        tvkVar.n(s1jVar.h());
        return tvkVar;
    }
}
