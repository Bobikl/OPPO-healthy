package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class wki extends y11 {
    public uki h;

    public wki() {
    }

    public void m(uki ukiVar) {
        this.h = ukiVar;
        i(ukiVar.p());
        g(ukiVar.l());
    }

    public wki n(mk3 mk3Var) {
        uki ukiVar = this.h;
        uki bVar = ukiVar instanceof ptj.b ? new ptj.b((ptj.b) ukiVar) : new uki(ukiVar);
        bVar.z(mk3Var);
        bVar.E(getMinWidth(), getMinHeight());
        wki wkiVar = new wki(bVar);
        wkiVar.a(j());
        wkiVar.b(f());
        wkiVar.e(h());
        wkiVar.c(d());
        return wkiVar;
    }

    public wki(uki ukiVar) {
        m(ukiVar);
    }
}
