package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class qsc extends y11 {
    public psc h;

    public qsc() {
    }

    public psc m() {
        return this.h;
    }

    public void n(psc pscVar) {
        this.h = pscVar;
        if (pscVar != null) {
            i(pscVar.k());
            g(pscVar.j());
            e(pscVar.g());
            b(pscVar.f());
            c(pscVar.d());
            a(pscVar.e());
        }
    }

    public qsc o(mk3 mk3Var) {
        qsc qscVar = new qsc(this);
        qscVar.h = new psc(qscVar.m(), mk3Var);
        return qscVar;
    }

    public qsc(psc pscVar) {
        n(pscVar);
    }

    public qsc(qsc qscVar) {
        super(qscVar);
        this.h = qscVar.h;
    }
}
