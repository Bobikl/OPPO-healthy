package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ijg extends gj0 {
    public static final d4i p = new d4i(3, 0.5f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gj0 f12564l;
    public final gj0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gj0 f12565n;
    public int o;

    public ijg(gj0 gj0Var, gj0 gj0Var2, gj0 gj0Var3) {
        this.o = 0;
        this.f12564l = gj0Var;
        this.m = gj0Var2;
        this.f12565n = gj0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x016a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0196  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0201  */
    /* JADX WARN: Code duplicated, block: B:75:0x0231  */
    /* JADX WARN: Code duplicated, block: B:77:0x024c  */
    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        float fH;
        float fG;
        float fC;
        float f;
        af9 af9Var;
        t22 t22Var;
        float f2;
        float fG2;
        gj0 gj0Var;
        t22 t22VarC;
        float fK;
        gj0 gj0Var2;
        af9 af9Var2;
        d4i d4iVar;
        float fN;
        float fMax;
        gj0 gj0Var3;
        float fMax2;
        float fG3;
        float f3;
        float fAbs;
        gj0 gj0Var4 = this.f12564l;
        t22 s1jVar = gj0Var4 == null ? new s1j(0.0f, 0.0f, 0.0f, 0.0f) : gj0Var4.c(rpjVar);
        s1j s1jVar2 = new s1j(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.m == null && this.f12565n == null) {
            return s1jVar;
        }
        spj spjVarN = rpjVar.n();
        int iM = rpjVar.m();
        gj0 gj0Var5 = this.f12564l;
        int i = gj0Var5.f11780j;
        if (i == 2 || (i == 0 && iM == 0)) {
            return new gik(new gik(gj0Var5, this.m, 3, 0.3f, true, false), this.f12565n, 3, 3.0f, true, true).c(rpjVar);
        }
        af9 af9Var3 = new af9(s1jVar);
        int i2 = s1jVar.i();
        if (i2 == -1) {
            i2 = spjVarN.L();
        }
        rpj rpjVarB = rpjVar.B();
        rpj rpjVarC = rpjVar.C();
        gj0 gj0Var6 = this.f12564l;
        if (!(gj0Var6 instanceof ql)) {
            if ((gj0Var6 instanceof t6j) && gj0Var6.i == 1) {
                u73 u73VarS = spjVarN.s(((t6j) gj0Var6).r(), iM);
                if (iM < 2 && spjVarN.K(u73VarS)) {
                    u73VarS = spjVarN.f(u73VarS, iM);
                }
                w73 w73Var = new w73(u73VarS);
                w73Var.o(((-(w73Var.h() + w73Var.g())) / 2.0f) - rpjVar.n().d(rpjVar.m()));
                af9 af9Var4 = new af9(w73Var);
                float fG4 = u73VarS.g();
                t22 t22VarC2 = new d4i(2).c(rpjVar);
                if (fG4 > 1.0E-7f && this.m == null) {
                    af9Var4.b(new s1j(fG4, 0.0f, 0.0f, 0.0f));
                }
                float fH2 = af9Var4.h() - spjVarN.v(rpjVarC.m());
                f2 = fG4;
                fG2 = af9Var4.g() + spjVarN.c(rpjVarB.m());
                f = fH2;
                af9Var = af9Var4;
                t22Var = t22VarC2;
            } else if (gj0Var6 instanceof y73) {
                x73 x73VarF = ((y73) gj0Var6).f(spjVarN);
                float fG5 = (((y73) this.f12564l).i() && spjVarN.o(x73VarF.b)) ? 0.0f : spjVarN.q(x73VarF, iM).g();
                if (fG5 > 1.0E-7f && this.m == null) {
                    af9Var3.b(new s1j(fG5, 0.0f, 0.0f, 0.0f));
                    fG5 = 0.0f;
                }
                f = 0.0f;
                af9Var = af9Var3;
                t22Var = s1jVar2;
                f2 = fG5;
                fG2 = 0.0f;
            } else {
                fH = s1jVar.h() - spjVarN.v(rpjVarC.m());
                fG = s1jVar.g();
                fC = spjVarN.c(rpjVarB.m());
            }
            gj0Var = this.f12565n;
            if (gj0Var == null) {
                t22 t22VarC3 = this.m.c(rpjVarB);
                t22VarC3.o(Math.max(Math.max(fG2, spjVarN.z(iM)), t22VarC3.h() - ((Math.abs(spjVarN.y(iM, i2)) * 4.0f) / 5.0f)));
                af9Var.b(t22VarC3);
                af9Var.b(t22Var);
                return af9Var;
            }
            t22VarC = gj0Var.c(rpjVarC);
            fK = t22VarC.k();
            gj0Var2 = this.m;
            if (gj0Var2 != null && this.o == 1) {
                fK = Math.max(fK, gj0Var2.c(rpjVarB).k());
            }
            af9Var2 = new af9(t22VarC, fK, this.o);
            d4iVar = p;
            af9Var2.b(d4iVar.c(rpjVar));
            if (iM == 0) {
                fN = spjVarN.I(iM);
            } else if (rpjVar.c().m() == iM) {
                fN = spjVarN.M(iM);
            } else {
                fN = spjVarN.N(iM);
            }
            fMax = Math.max(Math.max(f, fN), t22VarC.g() + (Math.abs(spjVarN.y(iM, i2)) / 4.0f));
            gj0Var3 = this.m;
            if (gj0Var3 == null) {
                af9Var2.o(-fMax);
                af9Var.b(af9Var2);
            } else {
                t22 t22VarC4 = gj0Var3.c(rpjVarB);
                af9 af9Var5 = new af9(t22VarC4, fK, this.o);
                af9Var5.b(d4iVar.c(rpjVar));
                fMax2 = Math.max(fG2, spjVarN.w(iM));
                float fL = spjVarN.l(iM);
                fG3 = ((fMax - t22VarC.g()) + fMax2) - t22VarC4.h();
                f3 = fL * 4.0f;
                if (fG3 < f3) {
                    fMax += f3 - fG3;
                    fAbs = ((Math.abs(spjVarN.y(iM, i2)) * 4.0f) / 5.0f) - (fMax - t22VarC.g());
                    if (fAbs > 0.0f) {
                        fMax += fAbs;
                        fMax2 -= fAbs;
                    }
                }
                tvk tvkVar = new tvk();
                af9Var2.o(f2);
                tvkVar.b(af9Var2);
                tvkVar.b(new s1j(0.0f, ((fMax - t22VarC.g()) + fMax2) - t22VarC4.h(), 0.0f, 0.0f));
                tvkVar.b(af9Var5);
                tvkVar.n(fMax + t22VarC.h());
                tvkVar.m(fMax2 + t22VarC4.g());
                af9Var.b(tvkVar);
            }
            af9Var.b(t22Var);
            return af9Var;
        }
        t22 t22VarC5 = ((ql) gj0Var6).o.c(rpjVar.c());
        fH = t22VarC5.h() - spjVarN.v(rpjVarC.m());
        fG = t22VarC5.g();
        fC = spjVarN.c(rpjVarB.m());
        fG2 = fG + fC;
        f = fH;
        af9Var = af9Var3;
        t22Var = s1jVar2;
        f2 = 0.0f;
        gj0Var = this.f12565n;
        if (gj0Var == null) {
            t22 t22VarC6 = this.m.c(rpjVarB);
            t22VarC6.o(Math.max(Math.max(fG2, spjVarN.z(iM)), t22VarC6.h() - ((Math.abs(spjVarN.y(iM, i2)) * 4.0f) / 5.0f)));
            af9Var.b(t22VarC6);
            af9Var.b(t22Var);
            return af9Var;
        }
        t22VarC = gj0Var.c(rpjVarC);
        fK = t22VarC.k();
        gj0Var2 = this.m;
        if (gj0Var2 != null) {
            fK = Math.max(fK, gj0Var2.c(rpjVarB).k());
        }
        af9Var2 = new af9(t22VarC, fK, this.o);
        d4iVar = p;
        af9Var2.b(d4iVar.c(rpjVar));
        if (iM == 0) {
            fN = spjVarN.I(iM);
        } else if (rpjVar.c().m() == iM) {
            fN = spjVarN.M(iM);
        } else {
            fN = spjVarN.N(iM);
        }
        fMax = Math.max(Math.max(f, fN), t22VarC.g() + (Math.abs(spjVarN.y(iM, i2)) / 4.0f));
        gj0Var3 = this.m;
        if (gj0Var3 == null) {
            af9Var2.o(-fMax);
            af9Var.b(af9Var2);
        } else {
            t22 t22VarC7 = gj0Var3.c(rpjVarB);
            af9 af9Var6 = new af9(t22VarC7, fK, this.o);
            af9Var6.b(d4iVar.c(rpjVar));
            fMax2 = Math.max(fG2, spjVarN.w(iM));
            float fL2 = spjVarN.l(iM);
            fG3 = ((fMax - t22VarC.g()) + fMax2) - t22VarC7.h();
            f3 = fL2 * 4.0f;
            if (fG3 < f3) {
                fMax += f3 - fG3;
                fAbs = ((Math.abs(spjVarN.y(iM, i2)) * 4.0f) / 5.0f) - (fMax - t22VarC.g());
                if (fAbs > 0.0f) {
                    fMax += fAbs;
                    fMax2 -= fAbs;
                }
            }
            tvk tvkVar2 = new tvk();
            af9Var2.o(f2);
            tvkVar2.b(af9Var2);
            tvkVar2.b(new s1j(0.0f, ((fMax - t22VarC.g()) + fMax2) - t22VarC7.h(), 0.0f, 0.0f));
            tvkVar2.b(af9Var6);
            tvkVar2.n(fMax + t22VarC.h());
            tvkVar2.m(fMax2 + t22VarC7.g());
            af9Var.b(tvkVar2);
        }
        af9Var.b(t22Var);
        return af9Var;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int d() {
        return this.f12564l.d();
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int e() {
        return this.f12564l.e();
    }

    public ijg(gj0 gj0Var, gj0 gj0Var2, gj0 gj0Var3, boolean z) {
        this(gj0Var, gj0Var2, gj0Var3);
        if (z) {
            return;
        }
        this.o = 1;
    }
}
