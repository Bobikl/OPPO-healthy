package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class bpb extends yob {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9809j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j18 f9810l;
    public fne m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h18 f9811n;
    public ege o;
    public ege p;
    public h18 q;
    public fne[] r;

    public bpb(int i, int i2, j18 j18Var, fne fneVar, ege egeVar, ege egeVar2, h18 h18Var) {
        super(true, null);
        this.k = i2;
        this.f9809j = i;
        this.f9810l = j18Var;
        this.m = fneVar;
        this.f9811n = h18Var;
        this.o = egeVar;
        this.p = egeVar2;
        this.q = p98.a(j18Var, fneVar);
        this.r = new hne(j18Var, fneVar).c();
    }

    public j18 b() {
        return this.f9810l;
    }

    public fne c() {
        return this.m;
    }

    public h18 d() {
        return this.q;
    }

    public int e() {
        return this.k;
    }

    public int f() {
        return this.f9809j;
    }

    public ege g() {
        return this.o;
    }

    public ege h() {
        return this.p;
    }

    public fne[] i() {
        return this.r;
    }

    public h18 j() {
        return this.f9811n;
    }
}
