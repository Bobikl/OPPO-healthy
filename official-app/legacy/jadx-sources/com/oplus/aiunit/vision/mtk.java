package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class mtk extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gj0 f14221l;

    public mtk(gj0 gj0Var) {
        this.f14221l = gj0Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC = this.f14221l.c(rpjVar);
        t22VarC.o((-((t22VarC.h() + t22VarC.g()) / 2.0f)) - rpjVar.n().d(rpjVar.m()));
        return new af9(t22VarC);
    }
}
