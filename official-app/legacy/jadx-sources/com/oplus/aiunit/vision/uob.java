package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class uob extends sob {
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17539l;
    public j18 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public fne f17540n;
    public ege o;
    public h18 p;
    public fne[] q;

    public uob(int i, int i2, j18 j18Var, fne fneVar, ege egeVar, String str) {
        this(i, i2, j18Var, fneVar, p98.a(j18Var, fneVar), egeVar, str);
    }

    public j18 c() {
        return this.m;
    }

    public fne d() {
        return this.f17540n;
    }

    public h18 e() {
        return this.p;
    }

    public int f() {
        return this.f17539l;
    }

    public int g() {
        return this.k;
    }

    public ege h() {
        return this.o;
    }

    public fne[] i() {
        return this.q;
    }

    public uob(int i, int i2, j18 j18Var, fne fneVar, h18 h18Var, ege egeVar, String str) {
        super(true, str);
        this.k = i;
        this.f17539l = i2;
        this.m = j18Var;
        this.f17540n = fneVar;
        this.p = h18Var;
        this.o = egeVar;
        this.q = new hne(j18Var, fneVar).c();
    }
}
