package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class v75 implements ThreadFactory, Thread.UncaughtExceptionHandler {
    public final AtomicInteger i = new AtomicInteger(1);
    public final ThreadGroup j;
    public final String k;

    public v75(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.j = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.k = str + ", thread No.";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.k + this.i.getAndIncrement();
        y8b.c("DefaultThreadFactory", "Create a new thread, name is [%s]", str);
        Thread thread = new Thread(this.j, runnable, str);
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
        y8b.e("DefaultThreadFactory", "Running thread appeared exception! Thread [%s], because [%s]", thread.getName(), th.getMessage());
    }
}
