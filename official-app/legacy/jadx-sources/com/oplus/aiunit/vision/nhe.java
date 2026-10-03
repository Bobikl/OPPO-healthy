package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class nhe extends gj0 implements nzf {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ozf f14515l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14516n;
    public boolean o;

    public nhe(gj0 gj0Var) {
        this.m = true;
        this.f14516n = true;
        this.o = true;
        if (gj0Var == null) {
            this.f14515l = new ozf();
        } else {
            this.f14515l = new ozf(gj0Var);
        }
    }

    @Override // com.oplus.aiunit.vision.nzf
    public void a(s66 s66Var) {
        this.f14515l.a(s66Var);
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC = this.f14515l.c(rpjVar);
        return new s1j(this.m ? t22VarC.k() : 0.0f, this.f14516n ? t22VarC.h() : 0.0f, this.o ? t22VarC.g() : 0.0f, t22VarC.j());
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int d() {
        return this.f14515l.d();
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int e() {
        return this.f14515l.e();
    }

    public nhe(gj0 gj0Var, boolean z, boolean z2, boolean z3) {
        this(gj0Var);
        this.m = z;
        this.f14516n = z2;
        this.o = z3;
    }
}
