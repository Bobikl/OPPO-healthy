package com.glyphix.mas.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes13.dex */
public class d {
    private final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile ScheduledFuture<?> f2319c;
    private final ReentrantLock d = new ReentrantLock();
    private final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    public d(long j2) {
        this.b = j2;
    }

    public void a(Runnable runnable) {
        this.d.lock();
        try {
            if (this.f2319c != null) {
                this.f2319c.cancel(false);
            }
            this.f2319c = this.a.schedule(runnable, this.b, TimeUnit.MILLISECONDS);
        } finally {
            this.d.unlock();
        }
    }

    public void a() {
        this.a.shutdown();
    }
}
