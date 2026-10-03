package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class qta extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f15935l;
    public char m;

    public qta(gj0 gj0Var, char c2) {
        this.f15935l = gj0Var;
        this.m = c2;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC = this.f15935l.c(rpjVar);
        tvk tvkVar = new tvk();
        tvkVar.b(t22VarC);
        tvkVar.p(0.0f);
        char c2 = this.m;
        if (c2 == 'l') {
            t22VarC.o(-t22VarC.k());
        } else if (c2 != 'r') {
            t22VarC.o((-t22VarC.k()) / 2.0f);
        } else {
            t22VarC.o(0.0f);
        }
        return tvkVar;
    }
}
