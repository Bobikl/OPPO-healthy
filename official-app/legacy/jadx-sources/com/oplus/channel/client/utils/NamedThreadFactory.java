package com.oplus.channel.client.utils;

import android.text.TextUtils;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/oplus/channel/client/utils/NamedThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "name", "", "(Ljava/lang/String;)V", "group", "Ljava/lang/ThreadGroup;", "namePrefix", "poolNumber", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNumber", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NamedThreadFactory implements ThreadFactory {

    @Nullable
    private ThreadGroup group;

    @Nullable
    private String namePrefix;

    @NotNull
    private final AtomicInteger poolNumber;

    @NotNull
    private final AtomicInteger threadNumber;

    public NamedThreadFactory(@Nullable String str) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.poolNumber = atomicInteger;
        this.threadNumber = new AtomicInteger(1);
        SecurityManager securityManager = System.getSecurityManager();
        this.group = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(str) ? "pool-" : Intrinsics.stringPlus(str, "-"));
        sb.append(atomicInteger.getAndIncrement());
        sb.append("-thread-");
        this.namePrefix = sb.toString();
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@Nullable Runnable r) {
        Thread thread = new Thread(this.group, r, Intrinsics.stringPlus(this.namePrefix, Integer.valueOf(this.threadNumber.getAndIncrement())), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
