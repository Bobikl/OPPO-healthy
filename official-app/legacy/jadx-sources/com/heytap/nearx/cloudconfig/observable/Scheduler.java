package com.heytap.nearx.cloudconfig.observable;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0004\r\u000e\u000f\u0010B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/heytap/nearx/cloudconfig/observable/Scheduler;", "", "onMain", "", "(Z)V", "mainWorker", "Lcom/heytap/nearx/cloudconfig/observable/Scheduler$MainWorker;", "getMainWorker", "()Lcom/heytap/nearx/cloudconfig/observable/Scheduler$MainWorker;", "mainWorker$delegate", "Lkotlin/Lazy;", "createWorker", "Lcom/heytap/nearx/cloudconfig/observable/Scheduler$Worker;", "Companion", "IOWorker", "MainWorker", "Worker", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final class Scheduler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Scheduler ioScheduler;

    /* JADX INFO: renamed from: mainWorker$delegate, reason: from kotlin metadata */
    private final Lazy mainWorker;
    private final boolean onMain;
    private static ExecutorService ioExecutor = Executors.newFixedThreadPool(5);
    private static final Scheduler mainScheduler = new Scheduler(true);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u0007H\u0007J\u0015\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fJ\b\u0010\u0010\u001a\u00020\u0007H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/heytap/nearx/cloudconfig/observable/Scheduler$Companion;", "", "()V", "ioExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "ioScheduler", "Lcom/heytap/nearx/cloudconfig/observable/Scheduler;", "mainScheduler", "executeIO", "", "task", "Ljava/lang/Runnable;", "io", "executor", "ioExecutor$com_heytap_nearx_cloudconfig", "main", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void executeIO(@NotNull Runnable task) {
            Intrinsics.checkParameterIsNotNull(task, "task");
            Scheduler.ioExecutor.execute(task);
        }

        @JvmStatic
        @NotNull
        public final Scheduler io() {
            return Scheduler.ioScheduler;
        }

        public final void ioExecutor$com_heytap_nearx_cloudconfig(@NotNull ExecutorService executor) {
            Intrinsics.checkParameterIsNotNull(executor, "executor");
            Scheduler.ioExecutor = executor;
        }

        @JvmStatic
        @NotNull
        public final Scheduler main() {
            return Scheduler.mainScheduler;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/heytap/nearx/cloudconfig/observable/Scheduler$IOWorker;", "Lcom/heytap/nearx/cloudconfig/observable/Scheduler$Worker;", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "schedule", "", "action", "Ljava/lang/Runnable;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public static final class IOWorker implements Worker {
        private final Executor executor;

        public IOWorker(@NotNull Executor executor) {
            Intrinsics.checkParameterIsNotNull(executor, "executor");
            this.executor = executor;
        }

        @Override // com.heytap.nearx.cloudconfig.observable.Scheduler.Worker
        public void schedule(@NotNull Runnable action) {
            Intrinsics.checkParameterIsNotNull(action, "action");
            this.executor.execute(action);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/heytap/nearx/cloudconfig/observable/Scheduler$MainWorker;", "Lcom/heytap/nearx/cloudconfig/observable/Scheduler$Worker;", "()V", "mainHandler", "Landroid/os/Handler;", "schedule", "", "action", "Ljava/lang/Runnable;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public static final class MainWorker implements Worker {
        private final Handler mainHandler = new Handler(Looper.getMainLooper());

        @Override // com.heytap.nearx.cloudconfig.observable.Scheduler.Worker
        public void schedule(@NotNull final Runnable action) {
            Intrinsics.checkParameterIsNotNull(action, "action");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                action.run();
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.heytap.nearx.cloudconfig.observable.Scheduler$MainWorker$schedule$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        action.run();
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/nearx/cloudconfig/observable/Scheduler$Worker;", "", "schedule", "", "action", "Ljava/lang/Runnable;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public interface Worker {
        void schedule(@NotNull Runnable action);
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        ioScheduler = new Scheduler(false, 1, defaultConstructorMarker);
    }

    private Scheduler(boolean z) {
        this.onMain = z;
        this.mainWorker = LazyKt__LazyJVMKt.lazy(new Function0<MainWorker>() { // from class: com.heytap.nearx.cloudconfig.observable.Scheduler$mainWorker$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Scheduler.MainWorker invoke() {
                return new Scheduler.MainWorker();
            }
        });
    }

    private final MainWorker getMainWorker() {
        return (MainWorker) this.mainWorker.getValue();
    }

    @JvmStatic
    @NotNull
    public static final Scheduler io() {
        return INSTANCE.io();
    }

    @JvmStatic
    @NotNull
    public static final Scheduler main() {
        return INSTANCE.main();
    }

    @NotNull
    public final Worker createWorker() {
        if (this.onMain) {
            return getMainWorker();
        }
        ExecutorService ioExecutor2 = ioExecutor;
        Intrinsics.checkExpressionValueIsNotNull(ioExecutor2, "ioExecutor");
        return new IOWorker(ioExecutor2);
    }

    public /* synthetic */ Scheduler(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
