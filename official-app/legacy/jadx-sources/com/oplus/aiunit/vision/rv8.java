package com.oplus.aiunit.vision;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes15.dex */
public class rv8 implements ThreadFactory {
    public static final AtomicInteger m = new AtomicInteger(1);
    public final ThreadGroup i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f16368j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f16369l;

    public rv8(String str) {
        this(str, 5);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.i, runnable, this.k + this.f16368j.getAndIncrement(), 0L);
        if (apj.DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("newThread name: ");
            sb.append(thread.getName());
        }
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        thread.setPriority(this.f16369l);
        return thread;
    }

    public rv8(String str, int i) {
        this.f16368j = new AtomicInteger(1);
        this.f16369l = i;
        SecurityManager securityManager = System.getSecurityManager();
        this.i = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        String str2 = str + "#" + m.getAndIncrement() + "#";
        this.k = str2;
        if (apj.DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("namePrefix: ");
            sb.append(str2);
        }
    }
}
