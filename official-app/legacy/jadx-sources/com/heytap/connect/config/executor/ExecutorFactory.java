package com.heytap.connect.config.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.PropertyReference1Impl;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/heytap/connect/config/executor/ExecutorFactory;", "", "Ljava/util/concurrent/ExecutorService;", "coreExecutor", "()Ljava/util/concurrent/ExecutorService;", "workExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "receiveMessageExecutor", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface ExecutorFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/heytap/connect/config/executor/ExecutorFactory$Companion;", "", "Lcom/heytap/connect/config/executor/ExecutorFactory;", "DEFAULT$delegate", "Lkotlin/Lazy;", "getDEFAULT", "()Lcom/heytap/connect/config/executor/ExecutorFactory;", "DEFAULT", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "DEFAULT", "getDEFAULT()Lcom/heytap/connect/config/executor/ExecutorFactory;"))};
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: DEFAULT$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy<ExecutorFactory$Companion$DEFAULT$2.AnonymousClass1> DEFAULT = LazyKt__LazyJVMKt.lazy(new Function0<ExecutorFactory$Companion$DEFAULT$2.AnonymousClass1>() { // from class: com.heytap.connect.config.executor.ExecutorFactory$Companion$DEFAULT$2
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.heytap.connect.config.executor.ExecutorFactory$Companion$DEFAULT$2$1] */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final AnonymousClass1 invoke() {
                return new ExecutorFactory() { // from class: com.heytap.connect.config.executor.ExecutorFactory$Companion$DEFAULT$2.1
                    @Override // com.heytap.connect.config.executor.ExecutorFactory
                    @NotNull
                    public ExecutorService coreExecutor() {
                        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(6);
                        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(6)");
                        return executorServiceNewFixedThreadPool;
                    }

                    @Override // com.heytap.connect.config.executor.ExecutorFactory
                    @NotNull
                    public ExecutorService receiveMessageExecutor() {
                        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
                        return executorServiceNewSingleThreadExecutor;
                    }

                    @Override // com.heytap.connect.config.executor.ExecutorFactory
                    @NotNull
                    public ScheduledExecutorService scheduledExecutor() {
                        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(1)");
                        return scheduledExecutorServiceNewScheduledThreadPool;
                    }

                    @Override // com.heytap.connect.config.executor.ExecutorFactory
                    @NotNull
                    public ExecutorService workExecutor() {
                        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
                        return executorServiceNewSingleThreadExecutor;
                    }
                };
            }
        });

        private Companion() {
        }

        @NotNull
        public final ExecutorFactory getDEFAULT() {
            return DEFAULT.getValue();
        }
    }

    @NotNull
    ExecutorService coreExecutor();

    @NotNull
    ExecutorService receiveMessageExecutor();

    @NotNull
    ScheduledExecutorService scheduledExecutor();

    @NotNull
    ExecutorService workExecutor();
}
