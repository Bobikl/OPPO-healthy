package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class aek extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9322l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gj0 f9323n;

    public aek(int i, int i2, gj0 gj0Var) {
        this.f9322l = i;
        this.m = i2;
        this.f9323n = gj0Var;
        this.f11780j = gj0Var.f11780j;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        return this.f9323n.c(rpjVar);
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int d() {
        return this.f9322l;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int e() {
        return this.m;
    }

    public gj0 f() {
        gj0 gj0Var = this.f9323n;
        gj0Var.f11780j = this.f11780j;
        return gj0Var;
    }
}
