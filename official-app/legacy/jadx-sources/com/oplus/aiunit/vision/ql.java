package com.oplus.aiunit.vision;

import org.scilab.forge.jlatexmath.InvalidSymbolTypeException;
import org.scilab.forge.jlatexmath.SymbolNotFoundException;

/* JADX INFO: loaded from: classes11.dex */
public class ql extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t6j f15841l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15842n;
    public gj0 o;
    public gj0 p;

    public ql(gj0 gj0Var, gj0 gj0Var2) throws InvalidSymbolTypeException {
        this.m = false;
        this.f15842n = true;
        this.p = null;
        this.o = gj0Var;
        if (gj0Var instanceof ql) {
            this.p = ((ql) gj0Var).p;
        } else {
            this.p = gj0Var;
        }
        if (!(gj0Var2 instanceof t6j)) {
            throw new InvalidSymbolTypeException("Invalid accent");
        }
        this.f15841l = (t6j) gj0Var2;
        this.m = true;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        spj spjVarN = rpjVar.n();
        int iM = rpjVar.m();
        gj0 gj0Var = this.o;
        t22 s1jVar = gj0Var == null ? new s1j(0.0f, 0.0f, 0.0f, 0.0f) : gj0Var.c(rpjVar.c());
        float fK = s1jVar.k();
        gj0 gj0Var2 = this.p;
        float fJ = gj0Var2 instanceof y73 ? spjVarN.j(((y73) gj0Var2).f(spjVarN), iM) : 0.0f;
        u73 u73VarS = spjVarN.s(this.f15841l.r(), iM);
        while (spjVarN.K(u73VarS)) {
            u73 u73VarF = spjVarN.f(u73VarS, iM);
            if (u73VarF.i() > fK) {
                break;
            }
            u73VarS = u73VarF;
        }
        float fMin = -d4i.i(5, rpjVar);
        if (!this.m) {
            fMin = Math.min(s1jVar.h(), spjVarN.y(iM, u73VarS.e()));
        }
        tvk tvkVar = new tvk();
        float fG = u73VarS.g();
        t22 w73Var = new w73(u73VarS);
        if (this.m) {
            t6j t6jVar = this.f15841l;
            if (this.f15842n) {
                rpjVar = rpjVar.B();
            }
            w73Var = t6jVar.c(rpjVar);
        }
        if (Math.abs(fG) > 1.0E-7f) {
            af9 af9Var = new af9(new s1j(-fG, 0.0f, 0.0f, 0.0f));
            af9Var.b(w73Var);
            w73Var = af9Var;
        }
        float fK2 = (fK - w73Var.k()) / 2.0f;
        w73Var.o(fJ + (fK2 > 0.0f ? fK2 : 0.0f));
        if (fK2 < 0.0f) {
            s1jVar = new af9(s1jVar, w73Var.k(), 2);
        }
        tvkVar.b(w73Var);
        tvkVar.b(new s1j(0.0f, this.f15842n ? -fMin : -s1jVar.h(), 0.0f, 0.0f));
        tvkVar.b(s1jVar);
        float fH = tvkVar.h() + tvkVar.g();
        float fG2 = s1jVar.g();
        tvkVar.m(fG2);
        tvkVar.n(fH - fG2);
        if (fK2 >= 0.0f) {
            return tvkVar;
        }
        af9 af9Var2 = new af9(new s1j(fK2, 0.0f, 0.0f, 0.0f));
        af9Var2.b(tvkVar);
        af9Var2.p(fK);
        return af9Var2;
    }

    public ql(gj0 gj0Var, gj0 gj0Var2, boolean z) throws InvalidSymbolTypeException {
        this(gj0Var, gj0Var2);
        this.f15842n = z;
    }

    public ql(gj0 gj0Var, String str) throws SymbolNotFoundException, InvalidSymbolTypeException {
        this.m = false;
        this.f15842n = true;
        this.o = null;
        this.p = null;
        t6j t6jVarQ = t6j.q(str);
        this.f15841l = t6jVarQ;
        if (t6jVarQ.i == 10) {
            this.o = gj0Var;
            if (gj0Var instanceof ql) {
                this.p = ((ql) gj0Var).p;
                return;
            } else {
                this.p = gj0Var;
                return;
            }
        }
        throw new InvalidSymbolTypeException("The symbol with the name '" + str + "' is not defined as an accent (type='acc') in '" + xpj.RESOURCE_NAME + "'!");
    }
}
