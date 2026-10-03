package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class y66 extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public tpj f18885l = new tpj();
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18886n;
    public boolean o;

    public y66(String str, String str2) {
        this.m = str;
        if (str2 == null || !str2.equals("i")) {
            return;
        }
        this.f18886n = true;
    }

    public static boolean j() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        return new s1j(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public gj0 f() {
        if (!this.o) {
            throw null;
        }
        gj0 gj0Var = this.f18885l.d;
        return gj0Var == null ? new sl6() : gj0Var;
    }

    public boolean i() {
        return this.f18886n;
    }
}
