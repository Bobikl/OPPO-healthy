package com.oplus.aiunit.vision;

import java.lang.ref.SoftReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class hol {
    public static final ConcurrentHashMap<Integer, SoftReference<g1a>> a = new ConcurrentHashMap<>();
    public static final AtomicInteger b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<Integer, List<qr9>> f12216c = new ConcurrentHashMap<>();
    public static final AtomicInteger d = new AtomicInteger(1);

    public static List<qr9> a(int i) {
        return f12216c.get(Integer.valueOf(i));
    }

    public static g1a b(int i) {
        SoftReference<g1a> softReference = a.get(Integer.valueOf(i));
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static int c(g1a g1aVar) {
        if (g1aVar == null) {
            return 0;
        }
        int iIncrementAndGet = b.incrementAndGet();
        a.put(Integer.valueOf(iIncrementAndGet), new SoftReference<>(g1aVar));
        return iIncrementAndGet;
    }

    public static int d(List<qr9> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int iIncrementAndGet = d.incrementAndGet();
        f12216c.put(Integer.valueOf(iIncrementAndGet), list);
        return iIncrementAndGet;
    }

    public static void e(int i) {
        a.remove(Integer.valueOf(i));
    }

    public static void f(int i) {
        f12216c.remove(Integer.valueOf(i));
    }
}
