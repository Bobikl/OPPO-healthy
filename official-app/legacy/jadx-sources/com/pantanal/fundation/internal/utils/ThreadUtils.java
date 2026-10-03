package com.pantanal.fundation.internal.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import io.protostuff.MapSchema;
import java.util.concurrent.ScheduledExecutorService;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001b\u0010\f\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\r\u0010\u000bR#\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/pantanal/fundation/internal/utils/ThreadUtils;", "", "Ljava/lang/Runnable;", "runnable", "", MapSchema.FIELD_NAME_ENTRY, "d", "Landroid/os/Handler;", "a", "Lkotlin/Lazy;", "getIoHandler", "()Landroid/os/Handler;", "ioHandler", "b", "mainHandler", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/concurrent/ScheduledExecutorService;", "executor", "", "()Z", "isMainThread$annotations", "()V", "isMainThread", "<init>", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final class ThreadUtils {

    @NotNull
    public static final ThreadUtils INSTANCE = new ThreadUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy ioHandler = LazyKt__LazyJVMKt.lazy(new Function0<Handler>() { // from class: com.pantanal.fundation.internal.utils.ThreadUtils$ioHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Handler invoke() {
            HandlerThread handlerThread = new HandlerThread("PantanalCardSdk-IO-handler");
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mainHandler = LazyKt__LazyJVMKt.lazy(new Function0<Handler>() { // from class: com.pantanal.fundation.internal.utils.ThreadUtils$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy executor = LazyKt__LazyJVMKt.lazy(ThreadUtils$executor$2.INSTANCE);

    public static final boolean c() {
        return Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper());
    }

    @JvmStatic
    public static final void d(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (c()) {
            INSTANCE.a().execute(runnable);
        } else {
            runnable.run();
        }
    }

    @JvmStatic
    public static final void e(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (c()) {
            runnable.run();
        } else {
            INSTANCE.b().post(runnable);
        }
    }

    public final ScheduledExecutorService a() {
        return (ScheduledExecutorService) executor.getValue();
    }

    public final Handler b() {
        return (Handler) mainHandler.getValue();
    }
}
