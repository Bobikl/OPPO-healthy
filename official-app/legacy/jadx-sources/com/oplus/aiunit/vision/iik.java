package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class iik extends gj0 {
    public static d4i w = new d4i(0, 0.7f, 0.0f, 0.0f);
    public static d4i s = new d4i(0, 0.06f, 0.0f, 0.0f);

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        float fL = rpjVar.n().l(rpjVar.m());
        af9 af9Var = new af9(s.c(rpjVar));
        af9Var.b(new bf9(fL, w.c(rpjVar).k(), 0.0f));
        return af9Var;
    }
}
