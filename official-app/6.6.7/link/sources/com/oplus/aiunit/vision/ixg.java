package com.oplus.aiunit.vision;

import java.util.Random;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ixg {
    public static final int INVALID_SEQ = -1;
    public static final Object e = new Object();
    public static volatile ixg f;
    public volatile long a;
    public long b = 1;
    public long c = 2305843009213693951L;
    public long d = -1;

    public ixg() {
        this.a = 0L;
        this.a = Math.abs(new Random(System.currentTimeMillis()).nextLong());
    }

    public static ixg b() {
        if (f == null) {
            synchronized (e) {
                if (f == null) {
                    f = new ixg();
                }
            }
        }
        return f;
    }

    public long a() {
        long j;
        synchronized (e) {
            long j2 = this.d + 1;
            this.d = j2;
            if (j2 > this.c) {
                this.d = this.b;
            }
            j = this.d;
        }
        return j;
    }
}
