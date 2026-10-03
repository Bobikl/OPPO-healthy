package com.oplus.deepthinker.sdk.common.tasks;

import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/oplus/deepthinker/sdk/common/tasks/TaskExecutors$BackgroundExecutor;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class TaskExecutors$background$2 extends Lambda implements Function0<TaskExecutors$BackgroundExecutor> {
    public static final TaskExecutors$background$2 INSTANCE = new TaskExecutors$background$2();

    public TaskExecutors$background$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.oplus.deepthinker.sdk.common.tasks.TaskExecutors$BackgroundExecutor] */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final TaskExecutors$BackgroundExecutor invoke() {
        return new Executor() { // from class: com.oplus.deepthinker.sdk.common.tasks.TaskExecutors$BackgroundExecutor

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @NotNull
            public final Lazy executor = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ThreadPoolExecutor>() { // from class: com.oplus.deepthinker.sdk.common.tasks.TaskExecutors$BackgroundExecutor$executor$2
                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final ThreadPoolExecutor invoke() {
                    return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardPolicy());
                }
            });

            public final ThreadPoolExecutor a() {
                return (ThreadPoolExecutor) this.executor.getValue();
            }

            @Override // java.util.concurrent.Executor
            public void execute(@Nullable Runnable command) {
                if (command == null) {
                    return;
                }
                a().execute(command);
            }
        };
    }
}
