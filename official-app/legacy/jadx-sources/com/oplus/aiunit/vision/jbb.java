package com.oplus.aiunit.vision;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class jbb implements ThreadFactory {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f12824l = new AtomicInteger(1);
    public final ThreadGroup i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f12825j = new AtomicInteger(1);
    public final String k;

    public jbb() {
        SecurityManager securityManager = System.getSecurityManager();
        this.i = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.k = "lottie-" + f12824l.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.i, runnable, this.k + this.f12825j.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
