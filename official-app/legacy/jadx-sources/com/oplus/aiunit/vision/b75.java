package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class b75 implements ThreadFactory, Thread.UncaughtExceptionHandler {
    public final AtomicInteger i = new AtomicInteger(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ThreadGroup f9632j;
    public final String k;

    public b75(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.f9632j = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.k = str + ", thread No.";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.k + this.i.getAndIncrement();
        m7b.c(com.coloros.sceneservice.n.d.TAG, "Create a new thread, name is [%s]", str);
        Thread thread = new Thread(this.f9632j, runnable, str);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        thread.setUncaughtExceptionHandler(this);
        return thread;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        m7b.e(com.coloros.sceneservice.n.d.TAG, "Running thread appeared exception! Thread [%s], because [%s]", thread.getName(), th.getMessage());
    }
}
