package com.heytap.accessory.base;

import android.util.LongSparseArray;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class d {
    public static long a = 0;
    public static final String b = "d";
    public static LongSparseArray<a> c = new LongSparseArray<>();
    public static boolean d = false;

    public static class a {
        public AtomicLong a = new AtomicLong(0);
        public AtomicLong b = new AtomicLong(0);
        public AtomicLong c = new AtomicLong(0);
        public AtomicLong d = new AtomicLong(0);
        public AtomicLong e = new AtomicLong(0);
        public AtomicLong f = new AtomicLong(0);
        public AtomicLong g = new AtomicLong(0);
    }

    public static void a(long j) {
        if (d) {
            a aVarG = g(j);
            long jA = a();
            long j2 = jA - aVarG.g.get();
            aVarG.d.set(jA);
            a("dequeue message time from notify dequeue: " + j2);
        }
    }

    public static void b(long j) {
        if (d) {
            a aVarG = g(j);
            long jA = a();
            long j2 = jA - aVarG.b.get();
            aVarG.c.set(jA);
            a("enqueueMsgTime from read end: " + j2);
        }
    }

    public static void c(long j) {
        if (d) {
            a aVarG = g(j);
            long jA = a();
            long j2 = jA - aVarG.a.get();
            aVarG.b.set(jA);
            a("read end time from read start: " + j2);
        }
    }

    public static void d(long j) {
        if (d) {
            a aVarG = g(j);
            long jA = a();
            long j2 = jA - aVarG.e.get();
            aVarG.f.set(jA);
            a("write end time from write start: " + j2);
        }
    }

    public static void e(long j) {
        if (d) {
            a aVarG = g(j);
            long jA = a();
            long j2 = jA - aVarG.d.get();
            aVarG.e.set(jA);
            a("write start time from dequeue buffer: " + j2);
        }
    }

    public static void f(long j) {
        if (d) {
            long jA = a() - j;
            a += jA;
            a("receiver write end time from write start: " + jA);
        }
    }

    public static a g(long j) {
        if (c.indexOfKey(j) < 0) {
            c.put(j, new a());
        }
        return c.get(j);
    }

    public static void h(long j) {
        if (d) {
            g(j).a.set(a());
        }
    }

    public static void a(long j, boolean z) {
        String str;
        if (d) {
            a aVarG = g(j);
            long jA = a();
            long j2 = jA - aVarG.f.get();
            aVarG.g.set(jA);
            if (z) {
                str = "notify dequeue time from write end: " + j2;
            } else {
                str = "new add to queue time from write end: " + j2;
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
