package com.oplus.deepthinker.sdk.common.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/oplus/deepthinker/sdk/common/tasks/TaskExecutors$MainThreadExecutor;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class TaskExecutors$mainThread$2 extends Lambda implements Function0<TaskExecutors$MainThreadExecutor> {
    public static final TaskExecutors$mainThread$2 INSTANCE = new TaskExecutors$mainThread$2();

    public TaskExecutors$mainThread$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.oplus.deepthinker.sdk.common.tasks.TaskExecutors$MainThreadExecutor] */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final TaskExecutors$MainThreadExecutor invoke() {
        return new Executor() { // from class: com.oplus.deepthinker.sdk.common.tasks.TaskExecutors$MainThreadExecutor

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @NotNull
            public final Lazy handler = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Handler>() { // from class: com.oplus.deepthinker.sdk.common.tasks.TaskExecutors$MainThreadExecutor$handler$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final Handler invoke() {
                    return new Handler(Looper.getMainLooper());
                }
            });

            public final Handler a() {
                return (Handler) this.handler.getValue();
            }

            @Override // java.util.concurrent.Executor
            public void execute(@Nullable Runnable command) {
                if (command == null) {
                    return;
                }
                a().post(command);
            }
        };
    }
}
