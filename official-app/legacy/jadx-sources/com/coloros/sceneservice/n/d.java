package com.coloros.sceneservice.n;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class d implements ThreadFactory {
    public static final String TAG = "DefaultThreadFactory";
    public static final AtomicInteger Xc = new AtomicInteger(1);
    public final AtomicInteger Yc = new AtomicInteger(1);
    public final ThreadGroup Zc;
    public final String _c;

    public d() {
        SecurityManager securityManager = System.getSecurityManager();
        this.Zc = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this._c = "SceneService task pool No." + Xc.getAndIncrement() + ", thread No.";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.Zc, runnable, this._c + this.Yc.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        thread.setUncaughtExceptionHandler(new c(this));
        return thread;
    }
}
