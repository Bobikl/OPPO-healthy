package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.heytap.health.base.task.ThreadUtils;
import io.protostuff.MapSchema;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/zza;", "", "Ljava/lang/Runnable;", "runnable", "", MapSchema.FIELD_NAME_ENTRY, "f", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/ExecutorService;", "a", "Ljava/util/concurrent/ExecutorService;", "mExecutorService", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public final class zza {

    @NotNull
    public static final zza INSTANCE = new zza();

    @NotNull
    public static final String TAG = "ListenerDispatcher";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ExecutorService mExecutorService;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0014R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/zza$a;", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/lang/Thread;", "t", "Ljava/lang/Runnable;", "r", "", "beforeExecute", "", "afterExecute", "", "i", "J", "mTimeoutTime", "Landroid/os/Handler;", "j", "Landroid/os/Handler;", "mTimeoutWatcherHandler", "", "corePoolSize", "maximumPoolSize", "keepAliveTime", "Ljava/util/concurrent/TimeUnit;", "unit", "Ljava/util/concurrent/BlockingQueue;", "workQueue", "Ljava/util/concurrent/ThreadFactory;", "factory", "Ljava/util/concurrent/RejectedExecutionHandler;", "handler", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;J)V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public static final class a extends ThreadPoolExecutor {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public final long mTimeoutTime;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Handler mTimeoutWatcherHandler;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.zza$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/zza$a$a", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
        public static final class HandlerC0950a extends Handler {
            public HandlerC0950a(Looper looper) {
                super(looper);
            }

            public static final void b(a this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y0k.h("耗时>" + this$0.mTimeoutTime + "ms,避免阻塞分发,请优化,已打印堆栈,查看log给对应开发处理");
            }

            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Object obj = msg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Thread");
                Thread thread = (Thread) obj;
                StackTraceElement[] stackTrace = thread.getStackTrace();
                Throwable th = new Throwable("耗时>" + a.this.mTimeoutTime + "ms,避免阻塞分发,请优化");
                th.setStackTrace(stackTrace);
                wil.c(zza.TAG, "dispatch timeout at Thread:" + thread.getId() + " ", th);
                if (qe0.E()) {
                    return;
                }
                final a aVar = a.this;
                ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.yza
                    @Override // java.lang.Runnable
                    public final void run() {
                        zza.a.HandlerC0950a.b(aVar);
                    }
                });
                th.printStackTrace();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, long j2, @Nullable TimeUnit timeUnit, @NotNull BlockingQueue<Runnable> workQueue, @Nullable ThreadFactory threadFactory, @Nullable RejectedExecutionHandler rejectedExecutionHandler, long j3) {
            super(i, i2, j2, timeUnit, workQueue, threadFactory, rejectedExecutionHandler);
            Intrinsics.checkNotNullParameter(workQueue, "workQueue");
            this.mTimeoutTime = j3;
            HandlerThread handlerThread = new HandlerThread("h-disph-watch");
            handlerThread.start();
            this.mTimeoutWatcherHandler = new HandlerC0950a(handlerThread.getLooper());
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(@NotNull Runnable r, @Nullable Throwable t) {
            Intrinsics.checkNotNullParameter(r, "r");
            this.mTimeoutWatcherHandler.removeMessages(r.hashCode());
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void beforeExecute(@NotNull Thread t, @NotNull Runnable r) {
            Intrinsics.checkNotNullParameter(t, "t");
            Intrinsics.checkNotNullParameter(r, "r");
            Message messageObtainMessage = this.mTimeoutWatcherHandler.obtainMessage(r.hashCode(), t);
            Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mTimeoutWatcherHandler.o…nMessage(r.hashCode(), t)");
            this.mTimeoutWatcherHandler.sendMessageDelayed(messageObtainMessage, this.mTimeoutTime);
        }
    }

    static {
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        mExecutorService = new a(1, 6, 100L, TimeUnit.SECONDS, linkedBlockingQueue, new ThreadFactory() { // from class: com.oplus.aiunit.vision.wza
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return zza.c(runnable);
            }
        }, new RejectedExecutionHandler() { // from class: com.oplus.aiunit.vision.xza
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                zza.d(linkedBlockingQueue, runnable, threadPoolExecutor);
            }
        }, 2000L);
    }

    public static final Thread c(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        return new qv8(r, "h-disph");
    }

    public static final void d(LinkedBlockingQueue workQueue, Runnable runnable, ThreadPoolExecutor executor) {
        Intrinsics.checkNotNullParameter(workQueue, "$workQueue");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(executor, "executor");
        wil.b(TAG, "heytap-dispatch: thread pool has full " + workQueue.size() + " " + runnable + executor);
        throw new RejectedExecutionException("Task " + runnable + "  rejected from " + executor);
    }

    public final void e(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        mExecutorService.submit(runnable);
    }

    public final void f(@NotNull Runnable runnable) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        try {
            mExecutorService.submit(runnable).get(10L, TimeUnit.SECONDS);
        } catch (TimeoutException e2) {
            wil.c(TAG, "submitBySingle timeout! caller:" + Thread.currentThread().getName(), e2);
        }
    }
}
