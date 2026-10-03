package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class tam {
    public static final String a = "CDT";
    public static final int b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16951c = 2;
    public static final int d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16952e = 4;
    public static final int f = 5;
    public static ConcurrentHashMap<Integer, Pair<Long, ?>> g;
    public static ExecutorService h = Executors.newFixedThreadPool(16);

    public interface a<T, R> {
        R a(T t);
    }

    public static Context a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    public static Pair<Boolean, ?> b(int i, TimeUnit timeUnit, long j2) {
        Pair<Long, ?> pair;
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = g;
        if (concurrentHashMap != null && (pair = concurrentHashMap.get(Integer.valueOf(i))) != null) {
            Long l2 = (Long) pair.first;
            return (l2 == null || SystemClock.elapsedRealtime() - l2.longValue() > TimeUnit.MILLISECONDS.convert(j2, timeUnit)) ? new Pair<>(Boolean.FALSE, null) : new Pair<>(Boolean.TRUE, pair.second);
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    public static <T> T c(int i, long j2, TimeUnit timeUnit, a<Object, Boolean> aVar, Callable<T> callable, boolean z, long j3, TimeUnit timeUnit2, qam qamVar, boolean z2) {
        T tCall;
        try {
            Pair<Boolean, ?> pairB = b(i, timeUnit, j2);
            if (((Boolean) pairB.first).booleanValue() && aVar.a(pairB.second).booleanValue()) {
                qrm.h("getC", i + " got " + pairB.second);
                return (T) pairB.second;
            }
            if (z2 && com.alipay.sdk.m.u.a.Y()) {
                l9m.h(qamVar, sgm.f16581l, "ch_get_main", "" + i);
                qrm.h("getC", i + " skip");
                tCall = null;
            } else {
                tCall = z ? h.submit(callable).get(j3, timeUnit2) : callable.call();
                d(i, tCall);
            }
            qrm.h("getC", i + " new " + tCall);
            return tCall;
        } catch (Throwable th) {
            qrm.c(a, "ch_get_e|" + i, th);
            l9m.d(qamVar, sgm.f16581l, "ch_get_e|" + i, th);
            qrm.h("getC", i + " err");
            return null;
        }
    }

    public static synchronized void d(int i, Object obj) {
        if (g == null) {
            g = new ConcurrentHashMap<>();
        }
        g.put(Integer.valueOf(i), new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), obj));
    }
}
