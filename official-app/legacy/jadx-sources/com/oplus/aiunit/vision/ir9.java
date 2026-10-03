package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ir9 extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12627l;

    public ir9(boolean z) {
        this.f12627l = z;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        w73 w73Var = new w73(rpjVar.n().G(this.f12627l ? 'I' : 'i', "mathnormal", rpjVar.m()));
        w73 w73Var2 = new w73(rpjVar.n().G(this.f12627l ? 'J' : 'j', "mathnormal", rpjVar.m()));
        af9 af9Var = new af9(w73Var);
        af9Var.b(new d4i(0, -0.065f, 0.0f, 0.0f).c(rpjVar));
        af9Var.b(w73Var2);
        return af9Var;
    }
}
