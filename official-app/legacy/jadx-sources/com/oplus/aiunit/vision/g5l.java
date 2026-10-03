package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public final class g5l {
    public final s6m a;
    public final ns5 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11645c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11646e;
    public final int f;
    public final int g;

    public g5l(ns5 ns5Var) {
        if (ns5Var == null) {
            throw new NullPointerException("digest == null");
        }
        this.b = ns5Var;
        int iH = x6m.h(ns5Var);
        this.f11645c = iH;
        this.d = 16;
        int iCeil = (int) Math.ceil(((double) (iH * 8)) / ((double) x6m.n(16)));
        this.f = iCeil;
        int iFloor = ((int) Math.floor(x6m.n((16 - 1) * iCeil) / x6m.n(16))) + 1;
        this.g = iFloor;
        int i = iCeil + iFloor;
        this.f11646e = i;
        f5l f5lVarB = f5l.b(ns5Var.c(), iH, 16, i);
        this.a = f5lVarB;
        if (f5lVarB != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + ns5Var.c());
    }

    public ns5 a() {
        return this.b;
    }

    public int b() {
        return this.f11645c;
    }

    public int c() {
        return this.f11646e;
    }

    public int d() {
        return this.d;
    }
}
