package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class qh8 extends h8c {
    public static final gj0 v = t6j.q("ldotp");
    public static final gj0 x = new d4i(1);
    public float u;

    public qh8(int i, float f) {
        super(i, "c", v);
        this.u = f;
    }

    @Override // com.oplus.aiunit.vision.h8c, com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        s1j s1jVar = new s1j(this.u * x.c(rpjVar).k(), 0.0f, 0.0f, 0.0f);
        af9 af9Var = new af9(s1jVar);
        af9Var.b(v.c(rpjVar));
        af9Var.b(s1jVar);
        if (this.f12054n != 0.0f) {
            af9Var.k();
            af9 af9Var2 = new af9(af9Var);
            while (af9Var2.k() < this.f12054n) {
                af9Var2.b(af9Var);
            }
            af9Var = new af9(af9Var2, this.f12054n, 2);
        }
        af9Var.h = 12;
        return af9Var;
    }
}
