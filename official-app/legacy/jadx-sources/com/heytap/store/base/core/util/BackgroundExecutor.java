package com.heytap.store.base.core.util;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.base.core.util.BackgroundExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/heytap/store/base/core/util/BackgroundExecutor;", "", "()V", "executor", "Ljava/util/concurrent/ExecutorService;", "submit", "Ljava/util/concurrent/Future;", ExifInterface.GPS_DIRECTION_TRUE, "task", "Lkotlin/Function0;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BackgroundExecutor {

    @NotNull
    public static final BackgroundExecutor INSTANCE = new BackgroundExecutor();

    @NotNull
    private static ExecutorService executor;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(2…().availableProcessors())");
        executor = scheduledExecutorServiceNewScheduledThreadPool;
    }

    private BackgroundExecutor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submit$lambda-0, reason: not valid java name */
    public static final Object m4773submit$lambda0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke();
    }

    @NotNull
    public final <T> Future<T> submit(@NotNull final Function0<? extends T> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Future<T> futureSubmit = executor.submit(new Callable() { // from class: com.oplus.aiunit.vision.rr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BackgroundExecutor.m4773submit$lambda0(task);
            }
        });
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "executor.submit(task)");
        return futureSubmit;
    }
}
