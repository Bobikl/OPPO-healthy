package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public final class o6m {
    public final s6m a;
    public final t6m b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14806c;
    public final int d;

    public o6m(int i, int i2, ns5 ns5Var) {
        this.f14806c = i;
        this.d = i2;
        this.b = new t6m(h(i, i2), ns5Var);
        this.a = r75.b(a().c(), b(), f(), e(), c(), i2);
    }

    public static int h(int i, int i2) throws IllegalArgumentException {
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = i / i2;
        if (i3 != 1) {
            return i3;
        }
        throw new IllegalArgumentException("height / layers must be greater than 1");
    }

    public ns5 a() {
        return this.b.b();
    }

    public int b() {
        return this.b.c();
    }

    public int c() {
        return this.f14806c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.b.f().d().c();
    }

    public int f() {
        return this.b.g();
    }

    public t6m g() {
        return this.b;
    }
}
