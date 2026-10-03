package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001c\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0011\u0010\u0011\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/ro;", "", "Landroid/app/Application;", "application", "", "b", "Ljava/util/concurrent/atomic/AtomicLong;", "a", "Ljava/util/concurrent/atomic/AtomicLong;", "getActivityCounter$annotations", "()V", "activityCounter", "", "Z", "isInitialized", "c", "()Z", "isFrontActivity", "<init>", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ro {

    @NotNull
    public static final ro INSTANCE = new ro();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static AtomicLong activityCounter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean isInitialized;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"com/oplus/aiunit/vision/ro$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            AtomicLong atomicLong = ro.activityCounter;
            if (atomicLong == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityCounter");
                atomicLong = null;
            }
            atomicLong.incrementAndGet();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            AtomicLong atomicLong = ro.activityCounter;
            if (atomicLong == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityCounter");
                atomicLong = null;
            }
            atomicLong.decrementAndGet();
        }
    }

    @JvmStatic
    public static final void b(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (isInitialized) {
            return;
        }
        synchronized (INSTANCE) {
            if (isInitialized) {
                throw new RuntimeException("ActivityCounter has been initialized");
            }
            activityCounter = new AtomicLong(0L);
            isInitialized = true;
            application.registerActivityLifecycleCallbacks(new a());
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    @JvmName(name = "isFrontActivity")
    public static final boolean c() {
        AtomicLong atomicLong = activityCounter;
        if (atomicLong == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityCounter");
            atomicLong = null;
        }
        return atomicLong.get() > 0;
    }
}
