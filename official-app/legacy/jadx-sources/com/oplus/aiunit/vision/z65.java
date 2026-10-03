package com.oplus.aiunit.vision;

import android.support.annotation.NonNull;
import com.alibaba.android.arouter.facade.template.ILogger;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class z65 implements ThreadFactory {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f19292l = new AtomicInteger(1);
    public final AtomicInteger i = new AtomicInteger(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ThreadGroup f19293j;
    public final String k;

    public class a implements Thread.UncaughtExceptionHandler {
        public a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            x0.logger.info(ILogger.defaultTag, "Running task appeared exception! Thread [" + thread.getName() + "], because [" + th.getMessage() + "]");
        }
    }

    public z65() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f19293j = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.k = "ARouter task pool No." + f19292l.getAndIncrement() + ", thread No.";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@NonNull Runnable runnable) {
        String str = this.k + this.i.getAndIncrement();
        x0.logger.info(ILogger.defaultTag, "Thread production, name is [" + str + "]");
        Thread thread = new Thread(this.f19293j, runnable, str, 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        thread.setUncaughtExceptionHandler(new a());
        return thread;
    }
}
