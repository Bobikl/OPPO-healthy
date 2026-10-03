package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class ytj extends y11 {
    public xtj h;

    public ytj() {
    }

    public void m(xtj xtjVar) {
        this.h = xtjVar;
        if (xtjVar != null) {
            i(xtjVar.c());
            g(xtjVar.b());
        }
    }

    public t46 n(mk3 mk3Var) {
        xtj xtjVar = this.h;
        uki bVar = xtjVar instanceof ptj.a ? new ptj.b((ptj.a) xtjVar) : new uki(xtjVar);
        bVar.z(mk3Var);
        bVar.E(getMinWidth(), getMinHeight());
        wki wkiVar = new wki(bVar);
        wkiVar.a(j());
        wkiVar.b(f());
        wkiVar.e(h());
        wkiVar.c(d());
        return wkiVar;
    }

    public ytj(xtj xtjVar) {
        m(xtjVar);
    }

    public ytj(ytj ytjVar) {
        super(ytjVar);
        m(ytjVar.h);
    }
}
