package com.heytap.accessory.base;

import android.util.LongSparseArray;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public class d {
    public static long a = 0;
    public static final String b = "d";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LongSparseArray<a> f2438c = new LongSparseArray<>();
    public static boolean d = false;

    public static class a {
        public AtomicLong a = new AtomicLong(0);
        public AtomicLong b = new AtomicLong(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AtomicLong f2439c = new AtomicLong(0);
        public AtomicLong d = new AtomicLong(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AtomicLong f2440e = new AtomicLong(0);
        public AtomicLong f = new AtomicLong(0);
        public AtomicLong g = new AtomicLong(0);
    }

    public static void a(long j2) {
        if (d) {
            a aVarG = g(j2);
            long jA = a();
            long j3 = jA - aVarG.g.get();
            aVarG.d.set(jA);
            a("dequeue message time from notify dequeue: " + j3);
        }
    }

    public static void b(long j2) {
        if (d) {
            a aVarG = g(j2);
            long jA = a();
            long j3 = jA - aVarG.b.get();
            aVarG.f2439c.set(jA);
            a("enqueueMsgTime from read end: " + j3);
        }
    }

    public static void c(long j2) {
        if (d) {
            a aVarG = g(j2);
            long jA = a();
            long j3 = jA - aVarG.a.get();
            aVarG.b.set(jA);
            a("read end time from read start: " + j3);
        }
    }

    public static void d(long j2) {
        if (d) {
            a aVarG = g(j2);
            long jA = a();
            long j3 = jA - aVarG.f2440e.get();
            aVarG.f.set(jA);
            a("write end time from write start: " + j3);
        }
    }

    public static void e(long j2) {
        if (d) {
            a aVarG = g(j2);
            long jA = a();
            long j3 = jA - aVarG.d.get();
            aVarG.f2440e.set(jA);
            a("write start time from dequeue buffer: " + j3);
        }
    }

    public static void f(long j2) {
        if (d) {
            long jA = a() - j2;
            a += jA;
            a("receiver write end time from write start: " + jA);
        }
    }

    public static a g(long j2) {
        if (f2438c.indexOfKey(j2) < 0) {
            f2438c.put(j2, new a());
        }
        return f2438c.get(j2);
    }

    public static void h(long j2) {
        if (d) {
            g(j2).a.set(a());
        }
    }

    public static void a(long j2, boolean z) {
        String str;
        if (d) {
            a aVarG = g(j2);
            long jA = a();
            long j3 = jA - aVarG.f.get();
            aVarG.g.set(jA);
            if (z) {
                str = "notify dequeue time from write end: " + j3;
            } else {
                str = "new add to queue time from write end: " + j3;
            }
            a(str);
        }
    }

    public static long a() {
        return System.currentTimeMillis();
    }

    public static void a(String str) {
        com.heytap.accessory.base.logging.a.c(b, str);
    }
}
