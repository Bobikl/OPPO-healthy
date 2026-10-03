package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aBK\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0017B;\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0018BM\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/hg4;", "Ljava/util/concurrent/ThreadPoolExecutor;", "", "i", "Ljava/lang/String;", "mLogTag", "", "corePoolSize", "maximumPoolSize", "", "keepAliveTime", "Ljava/util/concurrent/TimeUnit;", "unit", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "workQueue", "Lcom/oplus/aiunit/vision/hg4$a;", "threadFactory", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/lang/String;Lcom/oplus/aiunit/vision/hg4$a;)V", "poolSize", "logTag", "newPriority", "(ILjava/lang/String;I)V", "(IIJLjava/util/concurrent/TimeUnit;Ljava/lang/String;I)V", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/lang/String;I)V", "a", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class hg4 extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String mLogTag;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/hg4$a;", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "", "i", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "threadName", "", "j", "I", "mPriority", "Ljava/util/concurrent/atomic/AtomicInteger;", MapSchema.FIELD_NAME_KEY, "Ljava/util/concurrent/atomic/AtomicInteger;", "mCount", "mThreadName", "<init>", "(Ljava/lang/String;I)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final String threadName;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public int mPriority;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final AtomicInteger mCount;

        public a(@NotNull String mThreadName, int i) {
            Intrinsics.checkNotNullParameter(mThreadName, "mThreadName");
            this.mPriority = 1;
            this.mCount = new AtomicInteger(1);
            this.threadName = mThreadName;
            this.mPriority = i;
        }

        public static final void c(Thread thread, Throwable th) {
            t7b.INSTANCE.e("CustomThreadFactory", "Running task appeared exception!!! Thread [" + ((Object) thread.getName()) + "], because [" + ((Object) th.getMessage()) + ']', th);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getThreadName() {
            return this.threadName;
        }

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r) {
            Intrinsics.checkNotNullParameter(r, "r");
            Thread thread = new Thread(r, this.threadName + " # " + this.mCount.getAndIncrement());
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.oplus.aiunit.vision.gg4
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread2, Throwable th) {
                    hg4.a.c(thread2, th);
                }
            });
            int i = this.mPriority;
            if (i >= 1 && i <= 10) {
                thread.setPriority(i);
            }
            return thread;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg4(int i, int i2, long j2, @Nullable TimeUnit timeUnit, @Nullable BlockingQueue<Runnable> blockingQueue, @NotNull String mLogTag, @NotNull final a threadFactory) {
        super(i, i2, j2, timeUnit, blockingQueue, threadFactory, new RejectedExecutionHandler() { // from class: com.oplus.aiunit.vision.fg4
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                hg4.g(threadFactory, runnable, threadPoolExecutor);
            }
        });
        Intrinsics.checkNotNullParameter(mLogTag, "mLogTag");
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        this.mLogTag = mLogTag;
    }

    public static final void g(a threadFactory, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Intrinsics.checkNotNullParameter(threadFactory, "$threadFactory");
        t7b.INSTANCE.k("CustomThreadPoolExecutor", Intrinsics.stringPlus(threadFactory.getThreadName(), " Task rejected, too many task!"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public hg4(int i, @NotNull String logTag, int i2) {
        this(i, i, 0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue(1024), logTag, i2);
        Intrinsics.checkNotNullParameter(logTag, "logTag");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hg4(int i, int i2, long j2, @Nullable TimeUnit timeUnit, @NotNull String logTag, int i3) {
        this(i, i2, j2, timeUnit, new LinkedBlockingQueue(128), logTag, i3);
        Intrinsics.checkNotNullParameter(logTag, "logTag");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hg4(int i, int i2, long j2, @Nullable TimeUnit timeUnit, @Nullable BlockingQueue<Runnable> blockingQueue, @NotNull String logTag, int i3) {
        this(i, i2, j2, timeUnit, blockingQueue, logTag, new a(logTag, i3));
        Intrinsics.checkNotNullParameter(logTag, "logTag");
    }
}
