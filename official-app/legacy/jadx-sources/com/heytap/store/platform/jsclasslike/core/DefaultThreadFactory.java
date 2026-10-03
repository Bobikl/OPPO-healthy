package com.heytap.store.platform.jsclasslike.core;

import android.util.Log;
import com.heytap.store.platform.jsclasslike.core.DefaultThreadFactory;
import com.heytap.store.platform.jsclasslike.utils.Consts;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/store/platform/jsclasslike/core/DefaultThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "group", "Ljava/lang/ThreadGroup;", "namePrefix", "", "threadNumber", "Ljava/util/concurrent/atomic/AtomicInteger;", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "Companion", "jsclasslike-api_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DefaultThreadFactory implements ThreadFactory {

    @NotNull
    private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);

    @Nullable
    private ThreadGroup group;

    @NotNull
    private String namePrefix;

    @NotNull
    private final AtomicInteger threadNumber = new AtomicInteger(1);

    public DefaultThreadFactory() {
        SecurityManager securityManager = System.getSecurityManager();
        ThreadGroup threadGroup = securityManager == null ? null : securityManager.getThreadGroup();
        this.group = threadGroup == null ? Thread.currentThread().getThreadGroup() : threadGroup;
        this.namePrefix = "AppLike task pool No." + POOL_NUMBER.getAndIncrement() + ", thread No.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: newThread$lambda-0, reason: not valid java name */
    public static final void m5052newThread$lambda0(Thread thread, Throwable th) {
        Log.i(Consts.TAG, "Running task appeared exception! thread [" + ((Object) thread.getName()) + "], because [" + ((Object) th.getMessage()) + ']');
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@Nullable Runnable r) {
        String strStringPlus = Intrinsics.stringPlus(this.namePrefix, Integer.valueOf(this.threadNumber.getAndIncrement()));
        Log.i(Consts.TAG, "Thread production, name is [" + strStringPlus + ']');
        Thread thread = new Thread(this.group, r, strStringPlus, 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.oplus.aiunit.vision.y65
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread2, Throwable th) {
                DefaultThreadFactory.m5052newThread$lambda0(thread2, th);
            }
        });
        return thread;
    }
}
