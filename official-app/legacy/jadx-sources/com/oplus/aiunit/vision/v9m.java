package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/v9m;", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "Ljava/lang/ThreadGroup;", "i", "Ljava/lang/ThreadGroup;", "group", "Ljava/util/concurrent/atomic/AtomicInteger;", "j", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNumber", "", MapSchema.FIELD_NAME_KEY, "Ljava/lang/String;", "namePrefixInternal", "namePrefix", "<init>", "(Ljava/lang/String;)V", "d", "a", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public final class v9m implements ThreadFactory {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f17768l = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ThreadGroup group;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicInteger threadNumber;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final String namePrefixInternal;

    public v9m(@NotNull String namePrefix) {
        Intrinsics.checkNotNullParameter(namePrefix, "namePrefix");
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Intrinsics.checkNotNull(threadGroup, "null cannot be cast to non-null type java.lang.ThreadGroup");
        this.group = threadGroup;
        this.threadNumber = new AtomicInteger(1);
        this.namePrefixInternal = namePrefix + "-pool-" + f17768l.getAndIncrement() + "-thread-";
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
