package com.oplus.nearx.cloudconfig.datasource.task;

import com.oplus.aiunit.vision.lcf;
import io.protostuff.MapSchema;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0003B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e0\u0001R\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e0\u0001R\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/oplus/nearx/cloudconfig/datasource/task/LogicDispatcher;", "", "", "a", "I", "maxRequests", "b", "maxRequestsPerModule", "Ljava/util/ArrayDeque;", "Lcom/oplus/aiunit/vision/lcf;", "c", "Ljava/util/ArrayDeque;", "readyAsyncLogics", "d", "runningAsyncLogics", MapSchema.FIELD_NAME_ENTRY, "runningSyncCalls", "Ljava/util/concurrent/ExecutorService;", "f", "Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "(Ljava/util/concurrent/ExecutorService;)V", "Companion", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class LogicDispatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Lazy g = LazyKt__LazyJVMKt.lazy(new Function0<LogicDispatcher>() { // from class: com.oplus.nearx.cloudconfig.datasource.task.LogicDispatcher$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final LogicDispatcher invoke() {
            return new LogicDispatcher(null, 1, 0 == true ? 1 : 0);
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int maxRequests;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int maxRequestsPerModule;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final ArrayDeque<Object> readyAsyncLogics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final ArrayDeque<Object> runningAsyncLogics;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final ArrayDeque<lcf<?, ?>> runningSyncCalls;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ExecutorService executorService;

    /* JADX INFO: renamed from: com.oplus.nearx.cloudconfig.datasource.task.LogicDispatcher$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/oplus/nearx/cloudconfig/datasource/task/LogicDispatcher$a;", "", "Ljava/util/concurrent/ExecutorService;", "a", "<init>", "()V", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.oplus.nearx.cloudconfig.datasource.task.LogicDispatcher$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/lang/Thread;", "it", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "newThread"}, k = 3, mv = {1, 1, 16})
        public static final class ThreadFactoryC0966a implements ThreadFactory {
            public static final ThreadFactoryC0966a INSTANCE = new ThreadFactoryC0966a();

            @Override // java.util.concurrent.ThreadFactory
            @NotNull
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "Config Logic");
                thread.setDaemon(true);
                return thread;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExecutorService a() {
            return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ThreadFactoryC0966a.INSTANCE);
        }
    }

    public LogicDispatcher(ExecutorService executorService) {
        this.executorService = executorService;
        this.maxRequests = 64;
        this.maxRequestsPerModule = 5;
        this.readyAsyncLogics = new ArrayDeque<>();
        this.runningAsyncLogics = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    public /* synthetic */ LogicDispatcher(ExecutorService executorService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? INSTANCE.a() : executorService);
    }
}
