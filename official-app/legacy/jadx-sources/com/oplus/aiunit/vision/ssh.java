package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ssh extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f16737l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16738n;

    public ssh(gj0 gj0Var, String str) {
        this.m = true;
        this.f16738n = true;
        this.f16737l = gj0Var;
        if ("t".equals(str)) {
            this.f16738n = false;
        } else if ("b".equals(str)) {
            this.m = false;
        }
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC = this.f16737l.c(rpjVar);
        if (this.m) {
            t22VarC.n(0.0f);
        }
        if (this.f16738n) {
            t22VarC.m(0.0f);
        }
        return t22VarC;
    }

    public ssh(gj0 gj0Var) {
        this.m = true;
        this.f16738n = true;
        this.f16737l = gj0Var;
    }
}
