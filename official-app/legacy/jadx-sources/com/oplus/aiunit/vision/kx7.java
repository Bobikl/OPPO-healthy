package com.oplus.aiunit.vision;

import org.scilab.forge.jlatexmath.InvalidUnitException;

/* JADX INFO: loaded from: classes11.dex */
public class kx7 extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13440l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13441n;
    public int o;
    public gj0 p;
    public gj0 q;
    public float r;
    public float t;
    public boolean u;

    public kx7(gj0 gj0Var, gj0 gj0Var2, boolean z) {
        this(gj0Var, gj0Var2, !z, 2, 0.0f);
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        float fU;
        float fX;
        spj spjVarN = rpjVar.n();
        int iM = rpjVar.m();
        float fL = spjVarN.l(iM);
        if (this.f13440l) {
            this.r *= d4i.i(this.m, rpjVar);
        } else {
            this.r = this.u ? this.t * fL : fL;
        }
        gj0 gj0Var = this.p;
        t22 s1jVar = gj0Var == null ? new s1j(0.0f, 0.0f, 0.0f, 0.0f) : gj0Var.c(rpjVar.q());
        gj0 gj0Var2 = this.q;
        t22 s1jVar2 = gj0Var2 == null ? new s1j(0.0f, 0.0f, 0.0f, 0.0f) : gj0Var2.c(rpjVar.d());
        if (s1jVar.k() < s1jVar2.k()) {
            s1jVar = new af9(s1jVar, s1jVar2.k(), this.f13441n);
        } else {
            s1jVar2 = new af9(s1jVar2, s1jVar.k(), this.o);
        }
        if (iM < 2) {
            fX = spjVarN.i(iM);
            fU = spjVarN.r(iM);
        } else {
            fU = spjVarN.u(iM);
            fX = this.r > 0.0f ? spjVarN.x(iM) : spjVarN.A(iM);
        }
        tvk tvkVar = new tvk();
        tvkVar.b(s1jVar);
        float fD = spjVarN.d(iM);
        float f = this.r;
        if (f > 0.0f) {
            float f2 = iM < 2 ? 3.0f * f : f;
            float f3 = f / 2.0f;
            float fG = (fX - s1jVar.g()) - (fD + f3);
            float fH = (fD - f3) - (s1jVar2.h() - fU);
            float f4 = f2 - fG;
            float f5 = f2 - fH;
            if (f4 > 0.0f) {
                fX += f4;
                fG += f4;
            }
            if (f5 > 0.0f) {
                fU += f5;
                fH += f5;
            }
            tvkVar.b(new s1j(0.0f, fG, 0.0f, 0.0f));
            tvkVar.b(new bf9(this.r, s1jVar.k(), 0.0f));
            tvkVar.b(new s1j(0.0f, fH, 0.0f, 0.0f));
        } else {
            float f6 = iM < 2 ? fL * 7.0f : fL * 3.0f;
            float fG2 = (fX - s1jVar.g()) - (s1jVar2.h() - fU);
            float f7 = (f6 - fG2) / 2.0f;
            if (f7 > 0.0f) {
                fX += f7;
                fU += f7;
                fG2 += f7 * 2.0f;
            }
            tvkVar.b(new s1j(0.0f, fG2, 0.0f, 0.0f));
        }
        tvkVar.b(s1jVar2);
        tvkVar.n(fX + s1jVar.h());
        tvkVar.m(fU + s1jVar2.g());
        return new af9(tvkVar, tvkVar.k() + (new d4i(0, 0.12f, 0.0f, 0.0f).c(rpjVar).k() * 2.0f), 2);
    }

    public final int f(int i) {
        if (i == 0 || i == 1) {
            return i;
        }
        return 2;
    }

    public kx7(gj0 gj0Var, gj0 gj0Var2, boolean z, int i, float f) throws InvalidUnitException {
        this.f13440l = false;
        this.f13441n = 2;
        this.o = 2;
        this.u = false;
        d4i.f(i);
        this.p = gj0Var;
        this.q = gj0Var2;
        this.f13440l = z;
        this.r = f;
        this.m = i;
        this.i = 7;
    }

    public kx7(gj0 gj0Var, gj0 gj0Var2, boolean z, int i, int i2) {
        this(gj0Var, gj0Var2, z);
        this.f13441n = f(i);
        this.o = f(i2);
    }

    public kx7(gj0 gj0Var, gj0 gj0Var2, int i, float f) {
        this(gj0Var, gj0Var2, true, i, f);
    }
}
