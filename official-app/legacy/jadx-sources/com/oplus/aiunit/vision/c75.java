package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public class c75 implements ThreadFactory, Thread.UncaughtExceptionHandler {
    public final AtomicInteger i = new AtomicInteger(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f9972j;

    public c75(String str) {
        this.f9972j = str + ", thread No.";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f9972j + this.i.getAndIncrement();
        bn.b(com.coloros.sceneservice.n.d.TAG, String.format("Create a new thread, name is [%s]", str));
        Thread thread = new Thread(runnable, str);
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
        bn.c(com.coloros.sceneservice.n.d.TAG, String.format("Running thread appeared exception! Thread [%s], because [%s]", thread.getName(), th.getMessage()));
    }
}
