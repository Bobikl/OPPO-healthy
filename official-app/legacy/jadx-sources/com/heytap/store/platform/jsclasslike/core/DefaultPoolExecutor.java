package com.heytap.store.platform.jsclasslike.core;

import android.util.Log;
import com.heytap.store.platform.jsclasslike.utils.Consts;
import com.heytap.store.platform.jsclasslike.utils.TextUtils;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B=\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/platform/jsclasslike/core/DefaultPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "corePoolSize", "", "maximumPoolSize", "keepAliveTime", "", "unit", "Ljava/util/concurrent/TimeUnit;", "workQueue", "Ljava/util/concurrent/ArrayBlockingQueue;", "Ljava/lang/Runnable;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ArrayBlockingQueue;Ljava/util/concurrent/ThreadFactory;)V", "afterExecute", "", "r", "t", "", "Companion", "jsclasslike-api_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DefaultPoolExecutor extends ThreadPoolExecutor {
    private static final int CPU_COUNT;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int INIT_THREAD_COUNT;

    @NotNull
    private static final Lazy<DefaultPoolExecutor> INSTANCE$delegate;
    private static final int MAX_THREAD_COUNT;
    private static final long SURPLUS_THREAD_LIFE = 30;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/platform/jsclasslike/core/DefaultPoolExecutor$Companion;", "", "()V", "CPU_COUNT", "", "INIT_THREAD_COUNT", "INSTANCE", "Lcom/heytap/store/platform/jsclasslike/core/DefaultPoolExecutor;", "getINSTANCE", "()Lcom/heytap/store/platform/jsclasslike/core/DefaultPoolExecutor;", "INSTANCE$delegate", "Lkotlin/Lazy;", "MAX_THREAD_COUNT", "SURPLUS_THREAD_LIFE", "", "jsclasslike-api_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DefaultPoolExecutor getINSTANCE() {
            return (DefaultPoolExecutor) DefaultPoolExecutor.INSTANCE$delegate.getValue();
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int i = iAvailableProcessors + 1;
        INIT_THREAD_COUNT = i;
        MAX_THREAD_COUNT = i;
        INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(new Function0<DefaultPoolExecutor>() { // from class: com.heytap.store.platform.jsclasslike.core.DefaultPoolExecutor$Companion$INSTANCE$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DefaultPoolExecutor invoke() {
                return new DefaultPoolExecutor(DefaultPoolExecutor.INIT_THREAD_COUNT, DefaultPoolExecutor.MAX_THREAD_COUNT, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(64), new DefaultThreadFactory(), null);
            }
        });
    }

    public /* synthetic */ DefaultPoolExecutor(int i, int i2, long j2, TimeUnit timeUnit, ArrayBlockingQueue arrayBlockingQueue, ThreadFactory threadFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j2, timeUnit, arrayBlockingQueue, threadFactory);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(@Nullable Runnable r, @Nullable Throwable t) {
        super.afterExecute(r, t);
        if (t == null && (r instanceof Future)) {
            try {
                ((Future) r).get();
            } catch (InterruptedException | CancellationException | ExecutionException unused) {
            }
        }
        if (t != null) {
            Log.w(Consts.TAG, "Running task appear exception! Thread [" + ((Object) Thread.currentThread().getName()) + "], because [" + ((Object) t.getMessage()) + "]\n " + TextUtils.INSTANCE.formatStackTrace(t.getStackTrace()));
        }
    }

    private DefaultPoolExecutor(int i, int i2, long j2, TimeUnit timeUnit, ArrayBlockingQueue<Runnable> arrayBlockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j2, timeUnit, arrayBlockingQueue, threadFactory, new RejectedExecutionHandler() { // from class: com.oplus.aiunit.vision.j55
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Log.e(Consts.TAG, "Task rejected, too many tasks");
            }
        });
    }
}
