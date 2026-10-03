package com.oplus.aiunit.vision;

import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class ttg {
    public static final int INVALID_SEQ = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f17143e = new Object();
    public static volatile ttg f;
    public volatile long a;
    public long b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17144c = 2305843009213693951L;
    public long d = -1;

    public ttg() {
        this.a = 0L;
        this.a = Math.abs(new Random(System.currentTimeMillis()).nextLong());
    }

    public static ttg b() {
        if (f == null) {
            synchronized (f17143e) {
                if (f == null) {
                    f = new ttg();
                }
            }
        }
        return f;
    }

    public long a() {
        long j2;
        synchronized (f17143e) {
            long j3 = this.d + 1;
            this.d = j3;
            if (j3 > this.f17144c) {
                this.d = this.b;
            }
            j2 = this.d;
        }
        return j2;
    }
}
