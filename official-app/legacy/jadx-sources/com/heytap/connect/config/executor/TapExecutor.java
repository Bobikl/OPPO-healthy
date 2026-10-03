package com.heytap.connect.config.executor;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ-\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/heytap/connect/config/executor/TapExecutor;", "Lcom/heytap/connect/config/executor/IExecutor;", "Ljava/util/concurrent/ExecutorService;", "coreExecutor", "()Ljava/util/concurrent/ExecutorService;", "workExecutor", "receiveMessageExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "heartbeatExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "task", "", "executeTask", "(Ljava/lang/Runnable;)V", "executeWorkTask", "executeReceiveMessageTask", "", ClickApiEntity.TIME, "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Ljava/util/concurrent/ScheduledFuture;", "schedulerTask", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "cancelAllTasks", "()V", "cancelScheduledTask", "cancelMainTask", "", "isExecutorFactoryDefault", "()Z", "Ljava/util/concurrent/ExecutorService;", "Lcom/heytap/connect/config/executor/ExecutorFactory;", "executorFactory", "Lcom/heytap/connect/config/executor/ExecutorFactory;", "recieveMsgExecutor", "scheduledExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "<init>", "(Lcom/heytap/connect/config/executor/ExecutorFactory;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class TapExecutor implements IExecutor {

    @Nullable
    private ExecutorService coreExecutor;

    @NotNull
    private final ExecutorFactory executorFactory;

    @Nullable
    private ExecutorService recieveMsgExecutor;

    @Nullable
    private ScheduledExecutorService scheduledExecutor;

    @Nullable
    private ExecutorService workExecutor;

    public TapExecutor(@NotNull ExecutorFactory executorFactory) {
        Intrinsics.checkNotNullParameter(executorFactory, "executorFactory");
        this.executorFactory = executorFactory;
    }

    private final ExecutorService coreExecutor() {
        if (this.coreExecutor == null) {
            synchronized (this) {
                if (this.coreExecutor == null) {
                    this.coreExecutor = this.executorFactory.coreExecutor();
                }
            }
        }
        ExecutorService executorService = this.coreExecutor;
        Intrinsics.checkNotNull(executorService);
        return executorService;
    }

    private final ScheduledExecutorService heartbeatExecutor() {
        if (this.scheduledExecutor == null) {
            synchronized (this) {
                if (this.scheduledExecutor == null) {
                    this.scheduledExecutor = this.executorFactory.scheduledExecutor();
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutor;
        Intrinsics.checkNotNull(scheduledExecutorService);
        return scheduledExecutorService;
    }

    private final ExecutorService receiveMessageExecutor() {
        if (this.recieveMsgExecutor == null) {
            synchronized (this) {
                if (this.recieveMsgExecutor == null) {
                    this.recieveMsgExecutor = this.executorFactory.receiveMessageExecutor();
                }
            }
        }
        ExecutorService executorService = this.recieveMsgExecutor;
        Intrinsics.checkNotNull(executorService);
        return executorService;
    }

    private final ExecutorService workExecutor() {
        if (this.workExecutor == null) {
            synchronized (this) {
                if (this.workExecutor == null) {
                    this.workExecutor = this.executorFactory.workExecutor();
                }
            }
        }
        ExecutorService executorService = this.workExecutor;
        Intrinsics.checkNotNull(executorService);
        return executorService;
    }

    @Override // com.heytap.connect.config.executor.IExecutor
    public void cancelAllTasks() {
        cancelMainTask();
        cancelScheduledTask();
    }

    @Override // com.heytap.connect.config.executor.IExecutor
    public void cancelMainTask() {
        if (isExecutorFactoryDefault()) {
            ExecutorService executorService = this.coreExecutor;
            if (executorService != null) {
                executorService.shutdown();
            }
            this.coreExecutor = null;
            ExecutorService executorService2 = this.workExecutor;
            if (executorService2 != null && !executorService2.isShutdown()) {
                executorService2.shutdown();
            }
            this.workExecutor = null;
        }
    }

    @Override // com.heytap.connect.config.executor.IExecutor
    public void cancelScheduledTask() {
        if (isExecutorFactoryDefault()) {
            ScheduledExecutorService scheduledExecutorService = this.scheduledExecutor;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            this.scheduledExecutor = null;
        }
    }

    @Override // com.heytap.connect.config.executor.IExecutor
    public void executeReceiveMessageTask(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        receiveMessageExecutor().execute(task);
    }

    @Override // com.heytap.connect.config.executor.IExecutor
    public void executeTask(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        coreExecutor().execute(task);
    }

    @Override // com.heytap.connect.config.executor.IExecutor
    public void executeWorkTask(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        workExecutor().execute(task);
    }

    public final boolean isExecutorFactoryDefault() {
        ExecutorFactory executorFactory = this.executorFactory;
        if (executorFactory == null) {
            return false;
        }
        return Intrinsics.areEqual(executorFactory, ExecutorFactory.INSTANCE.getDEFAULT());
    }

    @Override // com.heytap.connect.config.executor.IExecutor
    @Nullable
    public ScheduledFuture<?> schedulerTask(@NotNull Runnable task, long time, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return heartbeatExecutor().schedule(task, time, timeUnit);
    }
}
