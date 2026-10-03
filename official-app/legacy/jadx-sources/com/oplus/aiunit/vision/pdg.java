package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class pdg extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f15330l;
    public double m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f15331n;

    public pdg(gj0 gj0Var, double d, double d2) {
        this.i = gj0Var.i;
        this.f15330l = gj0Var;
        this.m = d;
        this.f15331n = d2;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        return new qdg(this.f15330l.c(rpjVar), this.m, this.f15331n);
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int d() {
        return this.f15330l.d();
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int e() {
        return this.f15330l.e();
    }

    public pdg(gj0 gj0Var, double d) {
        this.i = gj0Var.i;
        this.f15330l = gj0Var;
        this.m = d;
        this.f15331n = d;
    }
}
