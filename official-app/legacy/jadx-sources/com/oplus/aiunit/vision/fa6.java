package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class fa6 {
    public kde a;

    public static class a {
        public static final fa6 a = new fa6();
    }

    public static fa6 d() {
        return a.a;
    }

    public void a() {
        if (c()) {
            aa6.c("ECGPdf", "contentUri:" + this.a.a().a());
            aa6.a("ECGPdf", prb.a(this.a.a()) + " pdf delete successful");
            this.a = null;
        }
    }

    public kde b(dv9 dv9Var) {
        kde kdeVarA = dv9Var.a();
        this.a = kdeVarA;
        return kdeVarA;
    }

    public boolean c() {
        return this.a != null;
    }

    public kde e() {
        return this.a;
    }

    public fa6() {
    }
}
