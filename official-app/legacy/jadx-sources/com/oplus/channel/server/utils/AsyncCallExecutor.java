package com.oplus.channel.server.utils;

import com.oplus.channel.server.utils.AsyncCallExecutor;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/oplus/channel/server/utils/AsyncCallExecutor;", "", "()V", "task", "Ljava/util/concurrent/ThreadPoolExecutor;", "getTask", "()Ljava/util/concurrent/ThreadPoolExecutor;", "task$delegate", "Lkotlin/Lazy;", "run", "", "clientName", "", "action", "Lkotlin/Function0;", "Companion", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AsyncCallExecutor {
    private static final int CORE_THREAD_POOL_SIZE = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<AsyncCallExecutor> INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(new Function0<AsyncCallExecutor>() { // from class: com.oplus.channel.server.utils.AsyncCallExecutor$Companion$INSTANCE$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AsyncCallExecutor invoke() {
            return new AsyncCallExecutor();
        }
    });
    private static final int MAX_THREAD_POOL_SIZE = 8;

    @NotNull
    private static final String TAG = "AsyncCallExecutor";
    private static final long TASK_TIME_OUT = 10;

    @NotNull
    private static final String THREAD_POOL_NAME = "channel-async-call";
    private static final long TIME_EXECUTOR_KEEP_ALIVE = 60;

    /* JADX INFO: renamed from: task$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy task = LazyKt__LazyJVMKt.lazy(new Function0<ThreadPoolExecutor>() { // from class: com.oplus.channel.server.utils.AsyncCallExecutor$task$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ThreadPoolExecutor invoke() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("channel-async-call"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }
    });

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/oplus/channel/server/utils/AsyncCallExecutor$Companion;", "", "()V", "CORE_THREAD_POOL_SIZE", "", "INSTANCE", "Lcom/oplus/channel/server/utils/AsyncCallExecutor;", "getINSTANCE", "()Lcom/oplus/channel/server/utils/AsyncCallExecutor;", "INSTANCE$delegate", "Lkotlin/Lazy;", "MAX_THREAD_POOL_SIZE", "TAG", "", "TASK_TIME_OUT", "", "THREAD_POOL_NAME", "TIME_EXECUTOR_KEEP_ALIVE", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AsyncCallExecutor getINSTANCE() {
            return (AsyncCallExecutor) AsyncCallExecutor.INSTANCE$delegate.getValue();
        }
    }

    private final ThreadPoolExecutor getTask() {
        return (ThreadPoolExecutor) this.task.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: run$lambda-0, reason: not valid java name */
    public static final void m5174run$lambda0(String clientName, Function0 action) {
        Intrinsics.checkNotNullParameter(clientName, "$clientName");
        Intrinsics.checkNotNullParameter(action, "$action");
        LogUtil.d(TAG, Intrinsics.stringPlus("run. task submit... : ", clientName));
        action.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: run$lambda-3, reason: not valid java name */
    public static final Result m5175run$lambda3(AsyncCallExecutor this$0, Future future, String clientName) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(clientName, "$clientName");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(future.get(10L, TimeUnit.SECONDS));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            future.cancel(true);
            LogUtil.e(TAG, "run. e: " + ((Object) thM5290exceptionOrNullimpl.getMessage()) + ": " + clientName);
        }
        return Result.m5286boximpl(objM5287constructorimpl);
    }

    public final void run(@NotNull final String clientName, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(action, "action");
        LogUtil.d(TAG, Intrinsics.stringPlus("run. task handle... : ", clientName));
        final Future<?> futureSubmit = getTask().submit(new Runnable() { // from class: com.oplus.aiunit.vision.ri0
            @Override // java.lang.Runnable
            public final void run() {
                AsyncCallExecutor.m5174run$lambda0(clientName, action);
            }
        });
        CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.si0
            @Override // java.util.function.Supplier
            public final Object get() {
                return AsyncCallExecutor.m5175run$lambda3(this.a, futureSubmit, clientName);
            }
        });
    }
}
