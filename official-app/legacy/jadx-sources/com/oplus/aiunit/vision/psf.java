package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class psf extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f15469l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15470n;
    public float o;
    public float p;
    public boolean q;

    public psf(gj0 gj0Var, String str, String str2, boolean z) {
        this.i = gj0Var.i;
        this.f15469l = gj0Var;
        this.q = z;
        float[] fArrJ = d4i.j(str == null ? "" : str);
        float[] fArrJ2 = d4i.j(str2 == null ? "" : str2);
        if (fArrJ.length != 2) {
            this.m = -1;
        } else {
            this.m = (int) fArrJ[0];
            this.o = fArrJ[1];
        }
        if (fArrJ2.length != 2) {
            this.f15470n = -1;
        } else {
            this.f15470n = (int) fArrJ2[0];
            this.p = fArrJ2[1];
        }
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        double dI;
        double d;
        double d2;
        t22 t22VarC = this.f15469l.c(rpjVar);
        int i = this.m;
        if (i == -1 && this.f15470n == -1) {
            return t22VarC;
        }
        if (i != -1 && this.f15470n != -1) {
            double dI2 = (this.o * d4i.i(i, rpjVar)) / t22VarC.d;
            double dI3 = (this.p * d4i.i(this.f15470n, rpjVar)) / t22VarC.f16854e;
            if (this.q) {
                dI = Math.min(dI2, dI3);
            } else {
                d = dI3;
                d2 = dI2;
            }
            return new qdg(t22VarC, d2, d);
        }
        dI = (i == -1 || this.f15470n != -1) ? (this.p * d4i.i(this.f15470n, rpjVar)) / t22VarC.f16854e : (this.o * d4i.i(i, rpjVar)) / t22VarC.d;
        d2 = dI;
        d = d2;
        return new qdg(t22VarC, d2, d);
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int d() {
        return this.f15469l.d();
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int e() {
        return this.f15469l.e();
    }
}
