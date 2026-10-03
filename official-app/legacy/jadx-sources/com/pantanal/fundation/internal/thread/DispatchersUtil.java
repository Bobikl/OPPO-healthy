package com.pantanal.fundation.internal.thread;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.so2;
import com.oplus.aiunit.vision.t6e;
import com.oplus.channel.server.utils.NamedThreadFactory;
import com.pantanal.fundation.internal.thread.DispatchersUtil;
import io.protostuff.MapSchema;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u000f\u001a\u00020\rH\u0007J\b\u0010\u0010\u001a\u00020\rH\u0007J\b\u0010\u0011\u001a\u00020\rH\u0007J\b\u0010\u0012\u001a\u00020\rH\u0007R\u001b\u0010\u0017\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001b\u0010 \u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u001f\u0010\u001a¨\u0006#"}, d2 = {"Lcom/pantanal/fundation/internal/thread/DispatchersUtil;", "", "", "threadName", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", b2n.f, "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "Ljava/util/concurrent/ExecutorService;", LogFieldKey.PROCESS_NAME_KEY, "f", "", LogFieldKey.LEVEL_KEY, "Lkotlinx/coroutines/CoroutineDispatcher;", "o", MapSchema.FIELD_NAME_ENTRY, "q", "i", "d", "a", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_KEY, "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "cardServerDispatcher", "b", "n", "()Lkotlinx/coroutines/CoroutineDispatcher;", "queryInfoDispatcher", "c", LogFieldKey.MESSAGE_KEY, "decisionAppDispatcher", "j", "cardConvertDispatcher", "<init>", "()V", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final class DispatchersUtil {

    @NotNull
    public static final DispatchersUtil INSTANCE = new DispatchersUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy cardServerDispatcher = LazyKt__LazyJVMKt.lazy(new Function0<ExecutorCoroutineDispatcher>() { // from class: com.pantanal.fundation.internal.thread.DispatchersUtil$cardServerDispatcher$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ExecutorCoroutineDispatcher invoke() {
            return DispatchersUtil.g("pcs_server");
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy queryInfoDispatcher = LazyKt__LazyJVMKt.lazy(new Function0<ExecutorCoroutineDispatcher>() { // from class: com.pantanal.fundation.internal.thread.DispatchersUtil$queryInfoDispatcher$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ExecutorCoroutineDispatcher invoke() {
            return DispatchersUtil.f("pcs_query");
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy decisionAppDispatcher = LazyKt__LazyJVMKt.lazy(new Function0<ExecutorCoroutineDispatcher>() { // from class: com.pantanal.fundation.internal.thread.DispatchersUtil$decisionAppDispatcher$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ExecutorCoroutineDispatcher invoke() {
            return DispatchersUtil.g("pcs_decision");
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Lazy cardConvertDispatcher = LazyKt__LazyJVMKt.lazy(DispatchersUtil$cardConvertDispatcher$2.INSTANCE);

    @JvmStatic
    @NotNull
    public static final CoroutineDispatcher d() {
        return INSTANCE.j();
    }

    @JvmStatic
    @NotNull
    public static final CoroutineDispatcher e() {
        return INSTANCE.k();
    }

    @JvmStatic
    public static final ExecutorCoroutineDispatcher f(String threadName) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, l() * 2, 120L, TimeUnit.SECONDS, new LinkedBlockingQueue(200), new NamedThreadFactory(threadName), new so2());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return ExecutorsKt.from((ExecutorService) threadPoolExecutor);
    }

    @JvmStatic
    public static final ExecutorCoroutineDispatcher g(final String threadName) {
        ExecutorService single = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.oplus.aiunit.vision.qu5
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return DispatchersUtil.h(threadName, runnable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(single, "single");
        return ExecutorsKt.from(single);
    }

    public static final Thread h(String threadName, Runnable runnable) {
        Intrinsics.checkNotNullParameter(threadName, "$threadName");
        return new Thread(runnable, threadName);
    }

    @JvmStatic
    @NotNull
    public static final CoroutineDispatcher i() {
        return INSTANCE.m();
    }

    @JvmStatic
    public static final int l() {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            bs9.a.c(t6e.INSTANCE, "DispatchersUtil", "core = " + iAvailableProcessors, false, null, false, 0, false, null, 252, null);
            objM5287constructorimpl = Result.m5287constructorimpl(Integer.valueOf(iAvailableProcessors));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5290exceptionOrNullimpl(objM5287constructorimpl) != null) {
            bs9.a.b(t6e.INSTANCE, "DispatchersUtil", "availableProcessors error, use default count:8", false, null, false, 0, false, null, 252, null);
        }
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = 8;
        }
        return ((Number) objM5287constructorimpl).intValue();
    }

    @JvmStatic
    @NotNull
    public static final CoroutineDispatcher o() {
        return Dispatchers.getMain();
    }

    @JvmStatic
    @NotNull
    public static final ExecutorService p(@Nullable ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 120L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    @JvmStatic
    @NotNull
    public static final CoroutineDispatcher q() {
        return INSTANCE.n();
    }

    public final CoroutineDispatcher j() {
        return (CoroutineDispatcher) cardConvertDispatcher.getValue();
    }

    public final ExecutorCoroutineDispatcher k() {
        return (ExecutorCoroutineDispatcher) cardServerDispatcher.getValue();
    }

    public final ExecutorCoroutineDispatcher m() {
        return (ExecutorCoroutineDispatcher) decisionAppDispatcher.getValue();
    }

    public final CoroutineDispatcher n() {
        return (CoroutineDispatcher) queryInfoDispatcher.getValue();
    }
}
