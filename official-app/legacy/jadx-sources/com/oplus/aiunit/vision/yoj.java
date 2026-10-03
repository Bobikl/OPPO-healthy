package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0003\u0012\u0016\u0010B\u000f\u0012\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/yoj;", "", "Lcom/oplus/aiunit/vision/xoj;", "taskQueue", "", b2n.g, "(Lcom/oplus/aiunit/vision/xoj;)V", "Lcom/oplus/aiunit/vision/koj;", "d", "i", "f", "task", MapSchema.FIELD_NAME_ENTRY, "j", "", "delayNanos", "c", "", "a", "I", "nextQueueName", "", "b", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "Lcom/oplus/aiunit/vision/yoj$a;", b2n.f, "Lcom/oplus/aiunit/vision/yoj$a;", "()Lcom/oplus/aiunit/vision/yoj$a;", "backend", "<init>", "(Lcom/oplus/aiunit/vision/yoj$a;)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class yoj {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final yoj INSTANCE = new yoj(new c(sqk.M(sqk.okHttpName + " TaskRunner", true)));

    @NotNull
    public static final Logger h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int nextQueueName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean coordinatorWaiting;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long coordinatorWakeUpAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final List<xoj> busyQueues;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final List<xoj> readyQueues;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Runnable runnable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final a backend;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/yoj$a;", "", "", "nanoTime", "Lcom/oplus/aiunit/vision/yoj;", "taskRunner", "", "a", "nanos", "b", "Ljava/lang/Runnable;", "runnable", "execute", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public interface a {
        void a(@NotNull yoj taskRunner);

        void b(@NotNull yoj taskRunner, long nanos);

        void execute(@NotNull Runnable runnable);

        long nanoTime();
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.yoj$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/yoj$b;", "", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Lcom/oplus/aiunit/vision/yoj;", "INSTANCE", "Lcom/oplus/aiunit/vision/yoj;", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Logger a() {
            return yoj.h;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/yoj$c;", "Lcom/oplus/aiunit/vision/yoj$a;", "", "nanoTime", "Lcom/oplus/aiunit/vision/yoj;", "taskRunner", "", "a", "nanos", "b", "Ljava/lang/Runnable;", "runnable", "execute", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final ThreadPoolExecutor executor;

        public c(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // com.oplus.aiunit.vision.yoj.a
        public void a(@NotNull yoj taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // com.oplus.aiunit.vision.yoj.a
        public void b(@NotNull yoj taskRunner, long nanos) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j2 = nanos / 1000000;
            long j3 = nanos - (1000000 * j2);
            if (j2 > 0 || nanos > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        @Override // com.oplus.aiunit.vision.yoj.a
        public void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.executor.execute(runnable);
        }

        @Override // com.oplus.aiunit.vision.yoj.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/oplus/aiunit/vision/yoj$d", "Ljava/lang/Runnable;", "", "run", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            koj kojVarD;
            long jNanoTime;
            while (true) {
                synchronized (yoj.this) {
                    kojVarD = yoj.this.d();
                }
                if (kojVarD == null) {
                    return;
                }
                xoj queue = kojVarD.getQueue();
                Intrinsics.checkNotNull(queue);
                boolean zIsLoggable = yoj.INSTANCE.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = queue.getTaskRunner().getBackend().nanoTime();
                    toj.c(kojVarD, queue, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    yoj.this.j(kojVarD);
                    try {
                        Unit unit = Unit.INSTANCE;
                        if (zIsLoggable) {
                            toj.c(kojVarD, queue, "finished run in " + toj.b(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
                        }
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            toj.c(kojVarD, queue, "failed a run in " + toj.b(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    yoj.this.getBackend().execute(this);
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(yoj.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        h = logger;
    }

    public yoj(@NotNull a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new d();
    }

    public final void c(koj task, long delayNanos) {
        if (sqk.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        xoj queue = task.getQueue();
        Intrinsics.checkNotNull(queue);
        if (!(queue.getActiveTask() == task)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean cancelActiveTask = queue.getCancelActiveTask();
        queue.m(false);
        queue.l(null);
        this.busyQueues.remove(queue);
        if (delayNanos != -1 && !cancelActiveTask && !queue.getShutdown()) {
            queue.k(task, delayNanos, true);
        }
        if (!queue.e().isEmpty()) {
            this.readyQueues.add(queue);
        }
    }

    @Nullable
    public final koj d() {
        boolean z;
        if (sqk.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        while (!this.readyQueues.isEmpty()) {
            long jNanoTime = this.backend.nanoTime();
            Iterator<xoj> it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            koj kojVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                koj kojVar2 = it.next().e().get(0);
                long jMax = Math.max(0L, kojVar2.getNextExecuteNanoTime() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (kojVar != null) {
                        z = true;
                        break;
                    }
                    kojVar = kojVar2;
                }
            }
            if (kojVar != null) {
                e(kojVar);
                if (z || (!this.coordinatorWaiting && (!this.readyQueues.isEmpty()))) {
                    this.backend.execute(this.runnable);
                }
                return kojVar;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - jNanoTime) {
                    this.backend.a(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jNanoTime + jMin;
            try {
                try {
                    this.backend.b(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
                this.coordinatorWaiting = false;
            } catch (Throwable th) {
                this.coordinatorWaiting = false;
                throw th;
            }
        }
        return null;
    }

    public final void e(koj task) {
        if (!sqk.assertionsEnabled || Thread.holdsLock(this)) {
            task.g(-1L);
            xoj queue = task.getQueue();
            Intrinsics.checkNotNull(queue);
            queue.e().remove(task);
            this.readyQueues.remove(queue);
            queue.l(task);
            this.busyQueues.add(queue);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void f() {
        for (int size = this.busyQueues.size() - 1; size >= 0; size--) {
            this.busyQueues.get(size).b();
        }
        for (int size2 = this.readyQueues.size() - 1; size2 >= 0; size2--) {
            xoj xojVar = this.readyQueues.get(size2);
            xojVar.b();
            if (xojVar.e().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final a getBackend() {
        return this.backend;
    }

    public final void h(@NotNull xoj taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (sqk.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (taskQueue.getActiveTask() == null) {
            if (!taskQueue.e().isEmpty()) {
                sqk.a(this.readyQueues, taskQueue);
            } else {
                this.readyQueues.remove(taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.a(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    @NotNull
    public final xoj i() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new xoj(this, sb.toString());
    }

    public final void j(koj task) {
        if (sqk.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread2, "Thread.currentThread()");
        String name = threadCurrentThread2.getName();
        threadCurrentThread2.setName(task.getName());
        try {
            long jF = task.f();
            synchronized (this) {
                c(task, jF);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            synchronized (this) {
                c(task, -1L);
                Unit unit2 = Unit.INSTANCE;
                threadCurrentThread2.setName(name);
            }
        }
    }
}
