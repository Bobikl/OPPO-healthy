package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class hqa extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12230l;

    public hqa(boolean z) {
        this.f12230l = z;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        w73 w73Var = new w73(rpjVar.n().s("textapos", rpjVar.m()));
        af9 af9Var = new af9(new w73(rpjVar.n().G(this.f12230l ? rnb.MATRIX_TYPE_RANDOM_LT : 'l', "mathnormal", rpjVar.m())));
        if (this.f12230l) {
            af9Var.b(new d4i(0, -0.3f, 0.0f, 0.0f).c(rpjVar));
        } else {
            af9Var.b(new d4i(0, -0.13f, 0.0f, 0.0f).c(rpjVar));
        }
        af9Var.b(w73Var);
        return af9Var;
    }
}
