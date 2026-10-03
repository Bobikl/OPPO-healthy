package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes15.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class pu8 implements Runnable {
    public static final int DEFAULT_THREAD_PRIORITY = 5;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15502j;
    public final Runnable k;

    public pu8(@NonNull String str, @NonNull Runnable runnable) {
        this(str, 5, runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int priority = threadCurrentThread.getPriority();
        threadCurrentThread.setName(this.i);
        threadCurrentThread.setPriority(this.f15502j);
        this.k.run();
        if (apj.RECOVER_THREAD_NAME) {
            threadCurrentThread.setName(name);
            threadCurrentThread.setPriority(priority);
        }
    }

    public pu8(String str, int i, @NonNull Runnable runnable) {
        woe.c(runnable, "Runnable must be not null");
        this.k = runnable;
        woe.c(str, "Thread name must be not null");
        this.i = str;
        woe.a(i >= 1, "Thread priority (%s) must be >= %s", i, 1);
        woe.a(i <= 10, "Thread priority (%s) must be <= %s", i, 10);
        this.f15502j = i;
    }
}
