package com.oplus.aiunit.vision;

import org.scilab.forge.jlatexmath.InvalidUnitException;

/* JADX INFO: loaded from: classes11.dex */
public class gik extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gj0 f11778l;
    public final gj0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gj0 f11779n;
    public final float o;
    public final float p;
    public final int q;
    public final int r;
    public final boolean t;
    public final boolean u;

    public gik(gj0 gj0Var, gj0 gj0Var2, int i, float f, boolean z, boolean z2) {
        d4i.f(i);
        this.f11778l = gj0Var;
        if (z2) {
            this.m = null;
            this.o = 0.0f;
            this.q = 0;
            this.t = false;
            this.f11779n = gj0Var2;
            this.r = i;
            this.p = f;
            this.u = z;
            return;
        }
        this.m = gj0Var2;
        this.q = i;
        this.o = f;
        this.t = z;
        this.p = 0.0f;
        this.f11779n = null;
        this.r = 0;
        this.u = false;
    }

    public static t22 f(t22 t22Var, float f) {
        return (t22Var == null || Math.abs(f - t22Var.k()) <= 1.0E-7f) ? t22Var : new af9(t22Var, f, 2);
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC;
        gj0 gj0Var = this.f11778l;
        t22 s1jVar = gj0Var == null ? new s1j(0.0f, 0.0f, 0.0f, 0.0f) : gj0Var.c(rpjVar);
        float fK = s1jVar.k();
        gj0 gj0Var2 = this.f11779n;
        t22 t22VarC2 = null;
        if (gj0Var2 != null) {
            t22VarC = gj0Var2.c(this.u ? rpjVar.B() : rpjVar);
            fK = Math.max(fK, t22VarC.k());
        } else {
            t22VarC = null;
        }
        gj0 gj0Var3 = this.m;
        if (gj0Var3 != null) {
            t22VarC2 = gj0Var3.c(this.t ? rpjVar.B() : rpjVar);
            fK = Math.max(fK, t22VarC2.k());
        }
        tvk tvkVar = new tvk();
        rpjVar.w(s1jVar.i());
        if (this.f11779n != null) {
            tvkVar.b(f(t22VarC, fK));
            tvkVar.b(new d4i(this.r, 0.0f, this.p, 0.0f).c(rpjVar));
        }
        t22 t22VarF = f(s1jVar, fK);
        tvkVar.b(t22VarF);
        float fH = (tvkVar.h() + tvkVar.g()) - t22VarF.g();
        if (this.m != null) {
            tvkVar.b(new d4i(this.r, 0.0f, this.o, 0.0f).c(rpjVar));
            tvkVar.b(f(t22VarC2, fK));
        }
        tvkVar.m((tvkVar.h() + tvkVar.g()) - fH);
        tvkVar.n(fH);
        return tvkVar;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int d() {
        return this.f11778l.d();
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int e() {
        return this.f11778l.e();
    }

    public gik(gj0 gj0Var, gj0 gj0Var2, int i, float f, boolean z, gj0 gj0Var3, int i2, float f2, boolean z2) throws InvalidUnitException {
        d4i.f(i);
        d4i.f(i2);
        this.f11778l = gj0Var;
        this.m = gj0Var2;
        this.q = i;
        this.o = f;
        this.t = z;
        this.f11779n = gj0Var3;
        this.r = i2;
        this.p = f2;
        this.u = z2;
    }
}
