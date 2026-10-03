package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public final class t6m {
    public final s6m a;
    public final org.spongycastle.pqc.crypto.xmss.d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16913c;
    public final int d;

    public t6m(int i, ns5 ns5Var) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (ns5Var == null) {
            throw new NullPointerException("digest == null");
        }
        org.spongycastle.pqc.crypto.xmss.d dVar = new org.spongycastle.pqc.crypto.xmss.d(new g5l(ns5Var));
        this.b = dVar;
        this.f16913c = i;
        this.d = a();
        this.a = s75.b(b().c(), c(), g(), dVar.d().c(), i);
    }

    public final int a() {
        int i = 2;
        while (true) {
            int i2 = this.f16913c;
            if (i > i2) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i2 - i) % 2 == 0) {
                return i;
            }
            i++;
        }
    }

    public ns5 b() {
        return this.b.d().a();
    }

    public int c() {
        return this.b.d().b();
    }

    public int d() {
        return this.f16913c;
    }

    public int e() {
        return this.d;
    }

    public org.spongycastle.pqc.crypto.xmss.d f() {
        return this.b;
    }

    public int g() {
        return this.b.d().d();
    }
}
