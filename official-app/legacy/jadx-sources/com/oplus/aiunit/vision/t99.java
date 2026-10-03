package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class t99 extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f16933l;
    public float m;

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        bf9 bf9Var = new bf9(rpjVar.n().l(rpjVar.m()), this.f16933l, this.m, false);
        tvk tvkVar = new tvk();
        tvkVar.b(bf9Var);
        tvkVar.h = 13;
        return tvkVar;
    }

    public void f(float f) {
        this.m = f;
    }

    public void i(float f) {
        this.f16933l = f;
    }
}
