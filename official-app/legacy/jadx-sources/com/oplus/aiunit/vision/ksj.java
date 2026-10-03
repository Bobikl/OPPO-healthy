package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ksj extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f13401l;

    public ksj(gj0 gj0Var) {
        this.f13401l = gj0Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC = t6j.q("bigcirc").c(rpjVar);
        t22VarC.o(d4i.i(1, rpjVar) * (-0.07f));
        af9 af9Var = new af9(this.f13401l.c(rpjVar), t22VarC.k(), 2);
        af9Var.b(new s1j(-af9Var.k(), 0.0f, 0.0f, 0.0f));
        af9Var.b(t22VarC);
        return af9Var;
    }
}
