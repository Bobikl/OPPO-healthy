package com.heytap.nearx.tangramconfig.datasource.task;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.api.IExecutor;
import com.heytap.nearx.tangramconfig.datasource.task.LogicDispatcher;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt__MutableCollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e0\fR\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\rJ\u001e\u0010\u0014\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00152\u0010\u0010\u0013\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00150\rJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\u0010\u0018\u00010\fR\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001b\u001a\u00020\u00112\u000e\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\rJ\u001a\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e0\fR\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\rJ)\u0010\u001b\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001e2\u0006\u0010\u0013\u001a\u0002H\u001cH\u0002¢\u0006\u0002\u0010\u001fJ\r\u0010 \u001a\u00020\bH\u0000¢\u0006\u0002\b!J\u0006\u0010\"\u001a\u00020\bJ\b\u0010#\u001a\u00020\u0017H\u0002J\u0014\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&0%J\u0006\u0010'\u001a\u00020\bJ\u0017\u0010(\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b)J\u0006\u0010*\u001a\u00020\bJ\u0014\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&0%J\u0010\u0010,\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010-\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e0\fR\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e0\fR\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/heytap/nearx/tangramconfig/datasource/task/LogicDispatcher;", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "(Ljava/util/concurrent/ExecutorService;)V", "idleCallback", "Ljava/lang/Runnable;", "maxRequests", "", "maxRequestsPerModule", "readyAsyncLogics", "Ljava/util/ArrayDeque;", "Lcom/heytap/nearx/tangramconfig/datasource/task/RealExecutor$AsyncLogic;", "Lcom/heytap/nearx/tangramconfig/datasource/task/RealExecutor;", "runningAsyncLogics", "runningSyncCalls", "cancelAll", "", "enqueue", "call", "executed", "Out", "existRunningLogic", "", "moduleId", "", "findExistingLogicWithModuleId", "finished", ExifInterface.GPS_DIRECTION_TRUE, "calls", "Ljava/util/Deque;", "(Ljava/util/Deque;Ljava/lang/Object;)V", "getMaxLogicPerModule", "getMaxLogicPerModule$com_heytap_nearx_tangramconfig", "getMaxRequests", "promoteAndExecute", "queuedLogic", "", "Lcom/heytap/nearx/tangramconfig/api/IExecutor;", "queuedLogicCount", "removeCallback", "removeCallback$com_heytap_nearx_tangramconfig", "runningCallsCount", "runningLogic", "setIdleCallback", "setMaxRequests", "setMaxRequestsPerModule", "maxRequestsPerHost", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LogicDispatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<LogicDispatcher> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0<LogicDispatcher>() { // from class: com.heytap.nearx.tangramconfig.datasource.task.LogicDispatcher$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final LogicDispatcher invoke() {
            return new LogicDispatcher(null, 1, 0 == true ? 1 : 0);
        }
    });

    @NotNull
    private ExecutorService executorService;

    @Nullable
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerModule;

    @NotNull
    private final ArrayDeque<RealExecutor<?, ?>.AsyncLogic> readyAsyncLogics;

    @NotNull
    private final ArrayDeque<RealExecutor<?, ?>.AsyncLogic> runningAsyncLogics;

    @NotNull
    private final ArrayDeque<RealExecutor<?, ?>> runningSyncCalls;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/heytap/nearx/tangramconfig/datasource/task/LogicDispatcher$Companion;", "", "()V", "instance", "Lcom/heytap/nearx/tangramconfig/datasource/task/LogicDispatcher;", "getInstance", "()Lcom/heytap/nearx/tangramconfig/datasource/task/LogicDispatcher;", "instance$delegate", "Lkotlin/Lazy;", "executorService", "Ljava/util/concurrent/ExecutorService;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread executorService$lambda$1(Runnable runnable) {
            Thread thread = new Thread(runnable, "Config Logic");
            thread.setDaemon(true);
            return thread;
        }

        @NotNull
        public final ExecutorService executorService() {
            return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.oplus.aiunit.vision.e8b
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return LogicDispatcher.Companion.executorService$lambda$1(runnable);
                }
            });
        }

        @NotNull
        public final LogicDispatcher getInstance() {
            return (LogicDispatcher) LogicDispatcher.instance$delegate.getValue();
        }
    }

    private LogicDispatcher(ExecutorService executorService) {
        this.executorService = executorService;
        this.maxRequests = 64;
        this.maxRequestsPerModule = 5;
        this.readyAsyncLogics = new ArrayDeque<>();
        this.runningAsyncLogics = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final RealExecutor<?, ?>.AsyncLogic findExistingLogicWithModuleId(String moduleId) {
        for (RealExecutor<?, ?>.AsyncLogic asyncLogic : this.runningAsyncLogics) {
            if (Intrinsics.areEqual(asyncLogic.getId(), moduleId)) {
                return asyncLogic;
            }
        }
        for (RealExecutor<?, ?>.AsyncLogic asyncLogic2 : this.readyAsyncLogics) {
            if (Intrinsics.areEqual(asyncLogic2.getId(), moduleId)) {
                return asyncLogic2;
            }
        }
        return null;
    }

    private final boolean promoteAndExecute() {
        int i;
        boolean z;
        Thread.holdsLock(this);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        synchronized (this) {
            Iterator<RealExecutor<?, ?>.AsyncLogic> it = this.readyAsyncLogics.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "this.readyAsyncLogics.iterator()");
            while (it.hasNext()) {
                RealExecutor<?, ?>.AsyncLogic next = it.next();
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.heytap.nearx.tangramconfig.datasource.task.RealExecutor.AsyncLogic<*, *>");
                RealExecutor<?, ?>.AsyncLogic asyncLogic = next;
                if (this.runningAsyncLogics.size() >= this.maxRequests) {
                    break;
                }
                if (asyncLogic.getLogicPerModule().get() < this.maxRequestsPerModule) {
                    it.remove();
                    asyncLogic.getLogicPerModule().incrementAndGet();
                    copyOnWriteArrayList.add(asyncLogic);
                    this.runningAsyncLogics.add(asyncLogic);
                }
            }
            z = runningCallsCount() > 0;
            Unit unit = Unit.INSTANCE;
        }
        int size = copyOnWriteArrayList.size();
        for (i = 0; i < size; i++) {
            Object obj = copyOnWriteArrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "executableCalls.get(i)");
            ((RealExecutor.AsyncLogic) obj).executeOn$com_heytap_nearx_tangramconfig(this.executorService);
        }
        return z;
    }

    public final synchronized void cancelAll() {
        Iterator<T> it = this.readyAsyncLogics.iterator();
        while (it.hasNext()) {
            RealExecutor.AsyncLogic asyncLogic = (RealExecutor.AsyncLogic) it.next();
            Intrinsics.checkNotNull(asyncLogic, "null cannot be cast to non-null type com.heytap.nearx.tangramconfig.datasource.task.RealExecutor.AsyncLogic<*, *>");
            asyncLogic.get$com_heytap_nearx_tangramconfig().cancel();
        }
        Iterator<T> it2 = this.runningAsyncLogics.iterator();
        while (it2.hasNext()) {
            RealExecutor.AsyncLogic asyncLogic2 = (RealExecutor.AsyncLogic) it2.next();
            Intrinsics.checkNotNull(asyncLogic2, "null cannot be cast to non-null type com.heytap.nearx.tangramconfig.datasource.task.RealExecutor.AsyncLogic<*, *>");
            asyncLogic2.get$com_heytap_nearx_tangramconfig().cancel();
        }
        Iterator<T> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            ((RealExecutor) it3.next()).cancel();
        }
    }

    public final void enqueue(@NotNull RealExecutor<?, ?>.AsyncLogic call) {
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            this.readyAsyncLogics.add(call);
            RealExecutor<?, ?>.AsyncLogic asyncLogicFindExistingLogicWithModuleId = findExistingLogicWithModuleId(call.getId());
            if (asyncLogicFindExistingLogicWithModuleId != null) {
                call.reuseLogicModuleFrom$com_heytap_nearx_tangramconfig(asyncLogicFindExistingLogicWithModuleId);
            }
            Unit unit = Unit.INSTANCE;
        }
        promoteAndExecute();
    }

    public final synchronized <Out> void executed(@NotNull RealExecutor<?, Out> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.runningSyncCalls.add(call);
    }

    public final boolean existRunningLogic(@NotNull String moduleId) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        return findExistingLogicWithModuleId(moduleId) != null;
    }

    public final void finished(@NotNull RealExecutor<?, ?>.AsyncLogic call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.getLogicPerModule().decrementAndGet();
        finished(this.runningAsyncLogics, call);
    }

    public final synchronized int getMaxLogicPerModule$com_heytap_nearx_tangramconfig() {
        return this.maxRequestsPerModule;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    @NotNull
    public final synchronized List<IExecutor<?, ?>> queuedLogic() {
        ArrayList arrayList;
        ArrayDeque<RealExecutor<?, ?>.AsyncLogic> arrayDeque = this.readyAsyncLogics;
        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayDeque, 10));
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealExecutor.AsyncLogic) it.next()).get$com_heytap_nearx_tangramconfig());
        }
        return arrayList;
    }

    public final synchronized int queuedLogicCount() {
        return this.readyAsyncLogics.size();
    }

    public final void removeCallback$com_heytap_nearx_tangramconfig(@Nullable Runnable idleCallback) {
        if (this.idleCallback == idleCallback) {
            this.idleCallback = null;
        }
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncLogics.size() + this.runningSyncCalls.size();
    }

    @NotNull
    public final synchronized List<IExecutor<?, ?>> runningLogic() {
        List<IExecutor<?, ?>> listUnmodifiableList;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(copyOnWriteArrayList, this.runningSyncCalls);
        Iterator<T> it = this.runningAsyncLogics.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.add(((RealExecutor.AsyncLogic) it.next()).get$com_heytap_nearx_tangramconfig());
        }
        listUnmodifiableList = Collections.unmodifiableList(copyOnWriteArrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final synchronized void setIdleCallback(@Nullable Runnable idleCallback) {
        if (!Intrinsics.areEqual(this.idleCallback, idleCallback)) {
            this.idleCallback = idleCallback;
        }
    }

    public final void setMaxRequests(int maxRequests) {
        if (maxRequests < 1) {
            throw new IllegalArgumentException("max < 1: " + maxRequests);
        }
        synchronized (this) {
            this.maxRequests = maxRequests;
            Unit unit = Unit.INSTANCE;
        }
        promoteAndExecute();
    }

    public final void setMaxRequestsPerModule(int maxRequestsPerHost) {
        if (maxRequestsPerHost < 1) {
            throw new IllegalArgumentException("max < 1: " + maxRequestsPerHost);
        }
        synchronized (this) {
            this.maxRequestsPerModule = maxRequestsPerHost;
            Unit unit = Unit.INSTANCE;
        }
        promoteAndExecute();
    }

    public final void finished(@NotNull RealExecutor<?, ?> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        finished(this.runningSyncCalls, call);
    }

    private final <T> void finished(Deque<T> calls, T call) {
        Runnable runnable;
        synchronized (this) {
            if (calls.remove(call)) {
                runnable = this.idleCallback;
                Unit unit = Unit.INSTANCE;
            } else {
                throw new AssertionError("ILogic wasn't in-flight!");
            }
        }
        if (promoteAndExecute() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public /* synthetic */ LogicDispatcher(ExecutorService executorService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? INSTANCE.executorService() : executorService);
    }
}
