package com.pantanal.server.content.utils;

import com.oplus.aiunit.vision.rec;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R#\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0011\u001a\u00020\u0002*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/pantanal/server/content/utils/ThreadExecutor;", "", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "c", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getSingleScheduledExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "singleScheduledExecutor", "Ljava/util/concurrent/ThreadPoolExecutor;", "b", "()Ljava/util/concurrent/ThreadPoolExecutor;", "governDefaultCacheExecutor", "Lkotlinx/coroutines/Dispatchers;", "(Lkotlinx/coroutines/Dispatchers;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "DefaultThread", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class ThreadExecutor {

    @NotNull
    public static final ThreadExecutor INSTANCE = new ThreadExecutor();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy singleScheduledExecutor = LazyKt__LazyJVMKt.lazy(new Function0<ScheduledExecutorService>() { // from class: com.pantanal.server.content.utils.ThreadExecutor$singleScheduledExecutor$2
        @Override // p010kotlin.jvm.functions.Function0
        public final ScheduledExecutorService invoke() {
            return Executors.newSingleThreadScheduledExecutor(new rec("#se_single"));
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy governDefaultCacheExecutor = LazyKt__LazyJVMKt.lazy(new Function0<ThreadPoolExecutor>() { // from class: com.pantanal.server.content.utils.ThreadExecutor$governDefaultCacheExecutor$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ThreadPoolExecutor invoke() {
            return new ThreadPoolExecutor(0, Runtime.getRuntime().availableProcessors(), 60L, TimeUnit.SECONDS, new SynchronousQueue(), new rec("#sg_executor"));
        }
    });

    @NotNull
    public final ExecutorCoroutineDispatcher a(@NotNull Dispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "<this>");
        return c();
    }

    public final ThreadPoolExecutor b() {
        return (ThreadPoolExecutor) governDefaultCacheExecutor.getValue();
    }

    @NotNull
    public final ExecutorCoroutineDispatcher c() {
        return ExecutorsKt.from((ExecutorService) b());
    }
}
