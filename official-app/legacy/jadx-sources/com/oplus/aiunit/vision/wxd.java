package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class wxd extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gj0 f18434l;

    public wxd(gj0 gj0Var) {
        this.f18434l = gj0Var;
        this.i = 0;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        float fL = rpjVar.n().l(rpjVar.m());
        gj0 gj0Var = this.f18434l;
        t22 s1jVar = gj0Var == null ? new s1j(0.0f, 0.0f, 0.0f, 0.0f) : gj0Var.c(rpjVar.c());
        rxd rxdVar = new rxd(s1jVar, 3.0f * fL, fL);
        rxdVar.m(s1jVar.g());
        rxdVar.n(s1jVar.h() + (fL * 5.0f));
        return rxdVar;
    }
}
