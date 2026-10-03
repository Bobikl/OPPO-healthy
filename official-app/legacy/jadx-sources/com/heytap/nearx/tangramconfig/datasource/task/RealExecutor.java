package com.heytap.nearx.tangramconfig.datasource.task;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.api.Callback;
import com.heytap.nearx.tangramconfig.api.ICloudStepTask;
import com.heytap.nearx.tangramconfig.api.IExecutor;
import com.heytap.nearx.tangramconfig.observable.NamedRunnable;
import com.heytap.nearx.tangramconfig.util.LogUtils;
import com.oplus.smartenginehelper.ParserTag;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NotImplementedError;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001\u0017B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\r\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/heytap/nearx/tangramconfig/datasource/task/RealExecutor;", "In", "Out", "Lcom/heytap/nearx/tangramconfig/api/IExecutor;", "stepTask", "Lcom/heytap/nearx/tangramconfig/api/ICloudStepTask;", "(Lcom/heytap/nearx/tangramconfig/api/ICloudStepTask;)V", "executedFlag", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getStepTask", "()Lcom/heytap/nearx/tangramconfig/api/ICloudStepTask;", "cancel", "", "dispatcher", "Lcom/heytap/nearx/tangramconfig/datasource/task/LogicDispatcher;", "enqueue", "callback", "Lcom/heytap/nearx/tangramconfig/api/Callback;", "execute", "()Ljava/lang/Object;", "isExecuted", "", "requireNotExecuted", "AsyncLogic", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class RealExecutor<In, Out> implements IExecutor<In, Out> {

    @NotNull
    private AtomicBoolean executedFlag;

    @NotNull
    private final ICloudStepTask<In, Out> stepTask;

    public RealExecutor(@NotNull ICloudStepTask<In, Out> stepTask) {
        Intrinsics.checkNotNullParameter(stepTask, "stepTask");
        this.stepTask = stepTask;
        this.executedFlag = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogicDispatcher dispatcher() {
        return LogicDispatcher.INSTANCE.getInstance();
    }

    private final void requireNotExecuted() {
        if (!this.executedFlag.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    @Override // com.heytap.nearx.tangramconfig.api.IExecutor
    public void cancel() {
        throw new NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IExecutor
    public void enqueue(@NotNull Callback<Out> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        requireNotExecuted();
        dispatcher().enqueue(new AsyncLogic(this, this.stepTask.configId(), callback));
    }

    @Override // com.heytap.nearx.tangramconfig.api.IExecutor
    public Out execute() {
        requireNotExecuted();
        try {
            dispatcher().executed(this);
            return this.stepTask.process();
        } finally {
            dispatcher().finished((RealExecutor<?, ?>) this);
        }
    }

    @NotNull
    public final ICloudStepTask<In, Out> getStepTask() {
        return this.stepTask;
    }

    @Override // com.heytap.nearx.tangramconfig.api.IExecutor
    public boolean isExecuted() {
        return this.executedFlag.get();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0019\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0000¢\u0006\u0002\b\u0011J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u0003J!\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0015\u001a\u000e0\u0000R\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0002\b\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/heytap/nearx/tangramconfig/datasource/task/RealExecutor$AsyncLogic;", "Lcom/heytap/nearx/tangramconfig/observable/NamedRunnable;", "id", "", "responseCallback", "Lcom/heytap/nearx/tangramconfig/api/Callback;", "(Lcom/heytap/nearx/tangramconfig/datasource/task/RealExecutor;Ljava/lang/String;Lcom/heytap/nearx/tangramconfig/api/Callback;)V", "logicPerModule", "Ljava/util/concurrent/atomic/AtomicInteger;", "execute", "", "executeOn", "executorService", "Ljava/util/concurrent/ExecutorService;", "executeOn$com_heytap_nearx_tangramconfig", ParserTag.TAG_GET, "Lcom/heytap/nearx/tangramconfig/datasource/task/RealExecutor;", "get$com_heytap_nearx_tangramconfig", "logicPerModule$com_heytap_nearx_tangramconfig", "moduleId", "reuseLogicModuleFrom", "other", "reuseLogicModuleFrom$com_heytap_nearx_tangramconfig", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class AsyncLogic extends NamedRunnable {

        @NotNull
        private final String id;

        @NotNull
        private volatile AtomicInteger logicPerModule;

        @NotNull
        private final Callback<Out> responseCallback;
        final /* synthetic */ RealExecutor<In, Out> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncLogic(@NotNull RealExecutor realExecutor, @NotNull String id, Callback<Out> responseCallback) {
            super("Logic %s", responseCallback);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.this$0 = realExecutor;
            this.id = id;
            this.responseCallback = responseCallback;
            this.logicPerModule = new AtomicInteger(0);
        }

        @Override // com.heytap.nearx.tangramconfig.observable.NamedRunnable
        public void execute() {
            boolean z;
            try {
                try {
                    z = true;
                    try {
                        this.responseCallback.onResult(this.this$0.getStepTask().process());
                    } catch (IOException e2) {
                        e = e2;
                        if (z) {
                            LogUtils logUtils = LogUtils.INSTANCE;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "executeError";
                            }
                            logUtils.w("RealExecutor", message, e, new Object[0]);
                        } else {
                            this.responseCallback.onFailure(e);
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    z = false;
                }
            } finally {
                this.this$0.dispatcher().finished((RealExecutor<?, ?>.AsyncLogic) this);
            }
        }

        public final void executeOn$com_heytap_nearx_tangramconfig(@NotNull ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            Thread.holdsLock(this.this$0.dispatcher());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    this.responseCallback.onFailure(interruptedIOException);
                    this.this$0.dispatcher().finished((RealExecutor<?, ?>.AsyncLogic) this);
                }
            } catch (Throwable th) {
                this.this$0.dispatcher().finished((RealExecutor<?, ?>.AsyncLogic) this);
                throw th;
            }
        }

        @NotNull
        public final RealExecutor<In, Out> get$com_heytap_nearx_tangramconfig() {
            return this.this$0;
        }

        @NotNull
        /* JADX INFO: renamed from: logicPerModule$com_heytap_nearx_tangramconfig, reason: from getter */
        public final AtomicInteger getLogicPerModule() {
            return this.logicPerModule;
        }

        @NotNull
        /* JADX INFO: renamed from: moduleId, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final void reuseLogicModuleFrom$com_heytap_nearx_tangramconfig(@NotNull RealExecutor<?, ?>.AsyncLogic other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.logicPerModule = other.logicPerModule;
        }

        public /* synthetic */ AsyncLogic(RealExecutor realExecutor, String str, Callback callback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(realExecutor, (i & 1) != 0 ? "" : str, callback);
        }
    }
}
