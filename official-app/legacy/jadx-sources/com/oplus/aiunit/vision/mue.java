package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public abstract class mue<T> {
    public T a;
    public a<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a<T> f14233c;
    public int d;

    public static final class a<T> {
        public final T a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<T> f14234c;

        public a(T t, int i) {
            this.a = t;
            this.b = i;
        }

        public int a(T t, int i) {
            System.arraycopy(this.a, 0, t, i, this.b);
            return i + this.b;
        }

        public T b() {
            return this.a;
        }

        public void c(a<T> aVar) {
            if (this.f14234c != null) {
                throw new IllegalStateException();
            }
            this.f14234c = aVar;
        }

        public a<T> d() {
            return this.f14234c;
        }
    }

    public abstract T a(int i);

    public void b() {
        a<T> aVar = this.f14233c;
        if (aVar != null) {
            this.a = aVar.b();
        }
        this.f14233c = null;
        this.b = null;
        this.d = 0;
    }

    public final T c(T t, int i) {
        a<T> aVar = new a<>(t, i);
        if (this.b == null) {
            this.f14233c = aVar;
            this.b = aVar;
        } else {
            this.f14233c.c(aVar);
            this.f14233c = aVar;
        }
        this.d += i;
        return a(i < 16384 ? i + i : i + (i >> 2));
    }

    public int d() {
        return this.d;
    }

    public T e(T t, int i) {
        int i2 = this.d + i;
        T tA = a(i2);
        int iA = 0;
        for (a<T> aVarD = this.b; aVarD != null; aVarD = aVarD.d()) {
            iA = aVarD.a(tA, iA);
        }
        System.arraycopy(t, 0, tA, iA, i);
        int i3 = iA + i;
        if (i3 == i2) {
            return tA;
        }
        throw new IllegalStateException("Should have gotten " + i2 + " entries, got " + i3);
    }

    public T f() {
        b();
        T t = this.a;
        return t == null ? a(12) : t;
    }
}
