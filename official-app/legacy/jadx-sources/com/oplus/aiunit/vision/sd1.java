package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class sd1 extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t6j f16551l;
    public int m;

    public sd1(t6j t6jVar, int i) {
        this.f16551l = t6jVar;
        this.m = i;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarA = a95.a(this.f16551l, rpjVar, this.m);
        af9 af9Var = new af9();
        float fH = t22VarA.h();
        t22VarA.o((((-(t22VarA.g() + fH)) / 2.0f) + fH) - rpjVar.n().d(rpjVar.m()));
        af9Var.b(t22VarA);
        return af9Var;
    }
}
