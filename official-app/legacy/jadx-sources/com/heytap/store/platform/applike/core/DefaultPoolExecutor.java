package com.heytap.store.platform.applike.core;

import android.util.Log;
import com.heytap.store.platform.applike.utils.Consts;
import com.heytap.store.platform.applike.utils.TextUtils;
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
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.PropertyReference1Impl;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B=\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/platform/applike/core/DefaultPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "corePoolSize", "", "maximumPoolSize", "keepAliveTime", "", "unit", "Ljava/util/concurrent/TimeUnit;", "workQueue", "Ljava/util/concurrent/ArrayBlockingQueue;", "Ljava/lang/Runnable;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ArrayBlockingQueue;Ljava/util/concurrent/ThreadFactory;)V", "afterExecute", "", "r", "t", "", "Companion", "applike-api_release"}, k = 1, mv = {1, 1, 15})
public final class DefaultPoolExecutor extends ThreadPoolExecutor {
    private static final int CPU_COUNT;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int INIT_THREAD_COUNT;

    @NotNull
    private static final Lazy INSTANCE$delegate;
    private static final int MAX_THREAD_COUNT;
    private static final long SURPLUS_THREAD_LIFE = 30;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/platform/applike/core/DefaultPoolExecutor$Companion;", "", "()V", "CPU_COUNT", "", "INIT_THREAD_COUNT", "INSTANCE", "Lcom/heytap/store/platform/applike/core/DefaultPoolExecutor;", "getINSTANCE", "()Lcom/heytap/store/platform/applike/core/DefaultPoolExecutor;", "INSTANCE$delegate", "Lkotlin/Lazy;", "MAX_THREAD_COUNT", "SURPLUS_THREAD_LIFE", "", "applike-api_release"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "INSTANCE", "getINSTANCE()Lcom/heytap/store/platform/applike/core/DefaultPoolExecutor;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DefaultPoolExecutor getINSTANCE() {
            Lazy lazy = DefaultPoolExecutor.INSTANCE$delegate;
            KProperty kProperty = $$delegatedProperties[0];
            return (DefaultPoolExecutor) lazy.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Ljava/util/concurrent/ThreadPoolExecutor;", "rejectedExecution"}, k = 3, mv = {1, 1, 15})
    public static final class a implements RejectedExecutionHandler {
        public static final a INSTANCE = new a();

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Log.e(Consts.TAG, "Task rejected, too many tasks");
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int i = iAvailableProcessors + 1;
        INIT_THREAD_COUNT = i;
        MAX_THREAD_COUNT = i;
        INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(new Function0<DefaultPoolExecutor>() { // from class: com.heytap.store.platform.applike.core.DefaultPoolExecutor$Companion$INSTANCE$2
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
            StringBuilder sb = new StringBuilder();
            sb.append("Running task appear exception! Thread [");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append("],");
            sb.append(" because [");
            sb.append(t.getMessage());
            sb.append("]\n ");
            sb.append(TextUtils.INSTANCE.formatStackTrace(t.getStackTrace()));
            Log.w(Consts.TAG, sb.toString());
        }
    }

    private DefaultPoolExecutor(int i, int i2, long j2, TimeUnit timeUnit, ArrayBlockingQueue<Runnable> arrayBlockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j2, timeUnit, arrayBlockingQueue, threadFactory, a.INSTANCE);
    }
}
