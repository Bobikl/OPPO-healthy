package com.oplus.aiunit.vision;

import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
public class stg {
    public static final int INVALID_SEQ = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f16748e = new Object();
    public static volatile stg f;
    public volatile long a;
    public long b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16749c = 2305843009213693951L;
    public long d = -1;

    public stg() {
        this.a = 0L;
        this.a = Math.abs(new Random(System.currentTimeMillis()).nextLong());
    }

    public static stg b() {
        if (f == null) {
            synchronized (f16748e) {
                if (f == null) {
                    f = new stg();
                }
            }
        }
        return f;
    }

    public long a() {
        long j2;
        synchronized (f16748e) {
            long j3 = this.d + 1;
            this.d = j3;
            if (j3 > this.f16749c) {
                this.d = this.b;
            }
            j2 = this.d;
        }
        return j2;
    }
}
