package com.oplus.aiunit.vision;

import android.os.SystemClock;
import android.util.LongSparseArray;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class d6n {
    public static volatile d6n g;
    public static Object h = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10405e = new Object();
    public Object f = new Object();
    public LongSparseArray<a> a = new LongSparseArray<>();
    public LongSparseArray<a> b = new LongSparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LongSparseArray<a> f10404c = new LongSparseArray<>();
    public LongSparseArray<a> d = new LongSparseArray<>();

    public static class a {
        public int a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10406c;

        public a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static d6n a() {
        if (g == null) {
            synchronized (h) {
                if (g == null) {
                    g = new d6n();
                }
            }
        }
        return g;
    }

    public static short c(LongSparseArray<a> longSparseArray, long j2) {
        synchronized (longSparseArray) {
            a aVar = longSparseArray.get(j2);
            if (aVar == null) {
                return (short) 0;
            }
            short sMax = (short) Math.max(1L, Math.min(32767L, (f() - aVar.b) / 1000));
            if (!aVar.f10406c) {
                sMax = (short) (-sMax);
            }
            return sMax;
        }
    }

    public static void e(List<c6n> list, LongSparseArray<a> longSparseArray, LongSparseArray<a> longSparseArray2) {
        long jF = f();
        byte b = 0;
        if (longSparseArray.size() == 0) {
            for (c6n c6nVar : list) {
                a aVar = new a(b);
                aVar.a = c6nVar.b();
                aVar.b = jF;
                aVar.f10406c = false;
                longSparseArray2.put(c6nVar.a(), aVar);
            }
            return;
        }
        for (c6n c6nVar2 : list) {
            long jA = c6nVar2.a();
            a aVar2 = longSparseArray.get(jA);
            if (aVar2 == null) {
                aVar2 = new a(b);
                aVar2.a = c6nVar2.b();
                aVar2.b = jF;
                aVar2.f10406c = true;
            } else if (aVar2.a != c6nVar2.b()) {
                aVar2.a = c6nVar2.b();
                aVar2.b = jF;
                aVar2.f10406c = true;
            }
            longSparseArray2.put(jA, aVar2);
        }
    }

    public static long f() {
        return SystemClock.elapsedRealtime();
    }

    public final short b(long j2) {
        return c(this.a, j2);
    }

    public final void d(List<c6n> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.f10405e) {
            e(list, this.a, this.b);
            LongSparseArray<a> longSparseArray = this.a;
            this.a = this.b;
            this.b = longSparseArray;
            longSparseArray.clear();
        }
    }

    public final short g(long j2) {
        return c(this.f10404c, j2);
    }

    public final void h(List<c6n> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.f) {
            e(list, this.f10404c, this.d);
            LongSparseArray<a> longSparseArray = this.f10404c;
            this.f10404c = this.d;
            this.d = longSparseArray;
            longSparseArray.clear();
        }
    }
}
