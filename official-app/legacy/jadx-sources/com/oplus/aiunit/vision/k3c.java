package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class k3c extends pdg {
    public float o;

    /* JADX WARN: Illegal instructions before constructor call */
    public k3c(gj0 gj0Var, float f) {
        double d = f;
        super(gj0Var, d, d);
        this.o = f;
    }

    @Override // com.oplus.aiunit.vision.pdg, com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        rpj rpjVarA = rpjVar.a();
        float fI = rpjVarA.i();
        rpjVarA.x(this.o);
        return new qdg(this.f15330l.c(rpjVarA), this.o / fI);
    }
}
