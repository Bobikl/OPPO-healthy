package com.oplus.aiunit.vision;

import org.scilab.forge.jlatexmath.InvalidUnitException;

/* JADX INFO: loaded from: classes11.dex */
public class uxd extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gj0 f17633l;
    public gj0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t6j f17634n;
    public final d4i o;
    public final boolean p;

    public uxd(gj0 gj0Var, gj0 gj0Var2, t6j t6jVar, int i, float f, boolean z) throws InvalidUnitException {
        this.i = 7;
        this.f17633l = gj0Var;
        this.m = gj0Var2;
        this.f17634n = t6jVar;
        this.o = new d4i(i, 0.0f, f, 0.0f);
        this.p = z;
    }

    public static float i(t22 t22Var, t22 t22Var2, t22 t22Var3) {
        float fMax = Math.max(t22Var.k(), t22Var2.h() + t22Var2.g());
        return t22Var3 != null ? Math.max(fMax, t22Var3.k()) : fMax;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC;
        gj0 gj0Var = this.f17633l;
        t22 s1jVar = gj0Var == null ? new s1j(0.0f, 0.0f, 0.0f, 0.0f) : gj0Var.c(rpjVar);
        t22 t22VarB = a95.b(this.f17634n.r(), rpjVar, s1jVar.k());
        gj0 gj0Var2 = this.m;
        if (gj0Var2 != null) {
            t22VarC = gj0Var2.c(this.p ? rpjVar.C() : rpjVar.B());
        } else {
            t22VarC = null;
        }
        float fI = i(s1jVar, t22VarB, t22VarC);
        return new txd(fI - s1jVar.k() > 1.0E-7f ? new af9(s1jVar, fI, 2) : s1jVar, new tvk(t22VarB, fI, 2), (t22VarC == null || fI - t22VarC.k() <= 1.0E-7f) ? t22VarC : new af9(t22VarC, fI, 2), this.o.c(rpjVar).h(), this.p);
    }

    public void f(gj0 gj0Var) {
        this.m = gj0Var;
    }

    public boolean j() {
        return this.p;
    }
}
