package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class g2l extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f11602l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11603n;

    public g2l(int i) {
        this.f11603n = i;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        int i;
        if (this.f11603n == 0) {
            return new s1j(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float fL = rpjVar.n().l(rpjVar.m());
        bf9 bf9Var = new bf9(this.f11602l, fL, this.m);
        s1j s1jVar = new s1j(fL * 2.0f, 0.0f, 0.0f, 0.0f);
        af9 af9Var = new af9();
        int i2 = 0;
        while (true) {
            i = this.f11603n;
            if (i2 >= i - 1) {
                break;
            }
            af9Var.b(bf9Var);
            af9Var.b(s1jVar);
            i2++;
        }
        if (i > 0) {
            af9Var.b(bf9Var);
        }
        return af9Var;
    }

    public float f(rpj rpjVar) {
        if (this.f11603n != 0) {
            return rpjVar.n().l(rpjVar.m()) * ((this.f11603n * 3) - 2);
        }
        return 0.0f;
    }

    public void i(float f) {
        this.f11602l = f;
    }

    public void j(float f) {
        this.m = f;
    }
}
