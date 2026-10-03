package com.heytap.store.platform.applike.core;

import android.util.Log;
import com.heytap.store.platform.applike.utils.Consts;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/store/platform/applike/core/DefaultThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "group", "Ljava/lang/ThreadGroup;", "namePrefix", "", "threadNumber", "Ljava/util/concurrent/atomic/AtomicInteger;", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "Companion", "applike-api_release"}, k = 1, mv = {1, 1, 15})
public final class DefaultThreadFactory implements ThreadFactory {
    private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
    private ThreadGroup group;
    private String namePrefix;
    private final AtomicInteger threadNumber = new AtomicInteger(1);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "thread", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "ex", "", "uncaughtException"}, k = 3, mv = {1, 1, 15})
    public static final class a implements Thread.UncaughtExceptionHandler {
        public static final a INSTANCE = new a();

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Running task appeared exception! thread [");
            Intrinsics.checkExpressionValueIsNotNull(thread, "thread");
            sb.append(thread.getName());
            sb.append("], because [");
            sb.append(th.getMessage());
            sb.append(']');
            Log.i(Consts.TAG, sb.toString());
        }
    }

    public DefaultThreadFactory() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null || (threadGroup = securityManager.getThreadGroup()) == null) {
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(threadCurrentThread, "Thread.currentThread()");
            threadGroup = threadCurrentThread.getThreadGroup();
        }
        this.group = threadGroup;
        this.namePrefix = "AppLike task pool No." + POOL_NUMBER.getAndIncrement() + ", thread No.";
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@Nullable Runnable r) {
        String str = this.namePrefix + this.threadNumber.getAndIncrement();
        Log.i(Consts.TAG, "Thread production, name is [" + str + ']');
        Thread thread = new Thread(this.group, r, str, 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        thread.setUncaughtExceptionHandler(a.INSTANCE);
        return thread;
    }
}
