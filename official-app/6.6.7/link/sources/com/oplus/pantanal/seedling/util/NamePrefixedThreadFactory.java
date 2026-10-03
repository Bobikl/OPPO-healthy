package com.oplus.pantanal.seedling.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/oplus/pantanal/seedling/util/NamePrefixedThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "namePrefix", "", "(Ljava/lang/String;)V", "group", "Ljava/lang/ThreadGroup;", "namePrefixInternal", "threadNumber", "Ljava/util/concurrent/atomic/AtomicInteger;", "newThread", "Ljava/lang/Thread;", "runnable", "Ljava/lang/Runnable;", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NamePrefixedThreadFactory implements ThreadFactory {

    @NotNull
    private static final AtomicInteger poolNumber = new AtomicInteger(1);

    @NotNull
    private final ThreadGroup group;

    @NotNull
    private final String namePrefixInternal;

    @NotNull
    private final AtomicInteger threadNumber;

    public NamePrefixedThreadFactory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "namePrefix");
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Intrinsics.checkNotNull(threadGroup, "null cannot be cast to non-null type java.lang.ThreadGroup");
        this.group = threadGroup;
        this.threadNumber = new AtomicInteger(1);
        this.namePrefixInternal = str + "-pool-" + poolNumber.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@Nullable Runnable runnable) {
        Thread thread = new Thread(this.group, runnable, this.namePrefixInternal + this.threadNumber.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
