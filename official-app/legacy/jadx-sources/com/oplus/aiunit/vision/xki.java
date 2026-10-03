package com.oplus.aiunit.vision;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class xki<T> implements b4h<T> {
    public static final int q = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object r = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18664j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18665l;
    public AtomicReferenceArray<Object> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18666n;
    public AtomicReferenceArray<Object> o;
    public final AtomicLong i = new AtomicLong();
    public final AtomicLong p = new AtomicLong();

    public xki(int i) {
        int iA = joe.a(Math.max(8, i));
        int i2 = iA - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iA + 1);
        this.m = atomicReferenceArray;
        this.f18665l = i2;
        a(iA);
        this.o = atomicReferenceArray;
        this.f18666n = i2;
        this.k = i2 - 1;
        r(0L);
    }

    public static int b(int i) {
        return i;
    }

    public static int c(long j2, int i) {
        return b(((int) j2) & i);
    }

    public static Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public static void p(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    public final void a(int i) {
        this.f18664j = Math.min(i / 4, q);
    }

    @Override // com.oplus.aiunit.vision.f4h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final long d() {
        return this.p.get();
    }

    public final long e() {
        return this.i.get();
    }

    public final long f() {
        return this.p.get();
    }

    public final AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int iB = b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, iB);
        p(atomicReferenceArray, iB, null);
        return atomicReferenceArray2;
    }

    public final long i() {
        return this.i.get();
    }

    @Override // com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        return i() == f();
    }

    public final T j(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i) {
        this.o = atomicReferenceArray;
        return (T) g(atomicReferenceArray, c(j2, i));
    }

    public final T k(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i) {
        this.o = atomicReferenceArray;
        int iC = c(j2, i);
        T t = (T) g(atomicReferenceArray, iC);
        if (t != null) {
            p(atomicReferenceArray, iC, null);
            o(j2 + 1);
        }
        return t;
    }

    public boolean l(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.m;
        long jI = i();
        int i = this.f18665l;
        long j2 = 2 + jI;
        if (g(atomicReferenceArray, c(j2, i)) == null) {
            int iC = c(jI, i);
            p(atomicReferenceArray, iC + 1, t2);
            p(atomicReferenceArray, iC, t);
            r(j2);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.m = atomicReferenceArray2;
        int iC2 = c(jI, i);
        p(atomicReferenceArray2, iC2 + 1, t2);
        p(atomicReferenceArray2, iC2, t);
        q(atomicReferenceArray, atomicReferenceArray2);
        p(atomicReferenceArray, iC2, r);
        r(j2);
        return true;
    }

    public final void m(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.m = atomicReferenceArray2;
        this.k = (j3 + j2) - 1;
        p(atomicReferenceArray2, i, t);
        q(atomicReferenceArray, atomicReferenceArray2);
        p(atomicReferenceArray, i, r);
        r(j2 + 1);
    }

    public int n() {
        long jF = f();
        while (true) {
            long jI = i();
            long jF2 = f();
            if (jF == jF2) {
                return (int) (jI - jF2);
            }
            jF = jF2;
        }
    }

    public final void o(long j2) {
        this.p.lazySet(j2);
    }

    @Override // com.oplus.aiunit.vision.f4h
    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.m;
        long jE = e();
        int i = this.f18665l;
        int iC = c(jE, i);
        if (jE < this.k) {
            return s(atomicReferenceArray, t, jE, iC);
        }
        long j2 = ((long) this.f18664j) + jE;
        if (g(atomicReferenceArray, c(j2, i)) == null) {
            this.k = j2 - 1;
            return s(atomicReferenceArray, t, jE, iC);
        }
        if (g(atomicReferenceArray, c(1 + jE, i)) == null) {
            return s(atomicReferenceArray, t, jE, iC);
        }
        m(atomicReferenceArray, jE, iC, t, i);
        return true;
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.o;
        long jD = d();
        int i = this.f18666n;
        T t = (T) g(atomicReferenceArray, c(jD, i));
        return t == r ? j(h(atomicReferenceArray, i + 1), jD, i) : t;
    }

    @Override // com.oplus.aiunit.vision.b4h, com.oplus.aiunit.vision.f4h
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.o;
        long jD = d();
        int i = this.f18666n;
        int iC = c(jD, i);
        T t = (T) g(atomicReferenceArray, iC);
        boolean z = t == r;
        if (t == null || z) {
            if (z) {
                return k(h(atomicReferenceArray, i + 1), jD, i);
            }
            return null;
        }
        p(atomicReferenceArray, iC, null);
        o(jD + 1);
        return t;
    }

    public final void q(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        p(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    public final void r(long j2) {
        this.i.lazySet(j2);
    }

    public final boolean s(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i) {
        p(atomicReferenceArray, i, t);
        r(j2 + 1);
        return true;
    }
}
