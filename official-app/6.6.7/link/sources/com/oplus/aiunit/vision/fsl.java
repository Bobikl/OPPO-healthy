package com.oplus.aiunit.vision;

import java.lang.ref.SoftReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class fsl {
    public static final ConcurrentHashMap<Integer, SoftReference<n2a>> a = new ConcurrentHashMap<>();
    public static final AtomicInteger b = new AtomicInteger(1);
    public static final ConcurrentHashMap<Integer, List<ws9>> c = new ConcurrentHashMap<>();
    public static final AtomicInteger d = new AtomicInteger(1);

    public static List<ws9> a(int i) {
        return c.get(Integer.valueOf(i));
    }

    public static n2a b(int i) {
        SoftReference<n2a> softReference = a.get(Integer.valueOf(i));
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static int c(n2a n2aVar) {
        if (n2aVar == null) {
            return 0;
        }
        int iIncrementAndGet = b.incrementAndGet();
        a.put(Integer.valueOf(iIncrementAndGet), new SoftReference<>(n2aVar));
        return iIncrementAndGet;
    }

    public static int d(List<ws9> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int iIncrementAndGet = d.incrementAndGet();
        c.put(Integer.valueOf(iIncrementAndGet), list);
        return iIncrementAndGet;
    }

    public static void e(int i) {
        a.remove(Integer.valueOf(i));
    }

    public static void f(int i) {
        c.remove(Integer.valueOf(i));
    }
}
