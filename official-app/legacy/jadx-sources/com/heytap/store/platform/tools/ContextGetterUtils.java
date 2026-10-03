package com.heytap.store.platform.tools;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/heytap/store/platform/tools/ContextGetterUtils;", "", "()V", "sApp", "Landroid/app/Application;", "getApp", "init", "", "app", "ActivityLifecycleCallbacks", "Consumer", "OnAppStatusChangedListener", "Task", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class ContextGetterUtils {
    public static final ContextGetterUtils INSTANCE = new ContextGetterUtils();

    @SuppressLint({"StaticFieldLeak"})
    private static Application sApp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\b\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\t\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\n\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u000b\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\f\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/platform/tools/ContextGetterUtils$ActivityLifecycleCallbacks;", "", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivityStarted", "onActivityStopped", "onLifecycleChanged", "event", "Landroidx/lifecycle/Lifecycle$Event;", "utils_release"}, k = 1, mv = {1, 4, 0})
    public static final class ActivityLifecycleCallbacks {
        public final void onActivityCreated(@NonNull @Nullable Activity activity) {
        }

        public final void onActivityDestroyed(@NonNull @Nullable Activity activity) {
        }

        public final void onActivityPaused(@NonNull @Nullable Activity activity) {
        }

        public final void onActivityResumed(@NonNull @Nullable Activity activity) {
        }

        public final void onActivityStarted(@NonNull @Nullable Activity activity) {
        }

        public final void onActivityStopped(@NonNull @Nullable Activity activity) {
        }

        public final void onLifecycleChanged(@NonNull @Nullable Activity activity, @Nullable Lifecycle.Event event) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/platform/tools/ContextGetterUtils$Consumer;", ExifInterface.GPS_DIRECTION_TRUE, "", "accept", "", "t", "(Ljava/lang/Object;)V", "utils_release"}, k = 1, mv = {1, 4, 0})
    public interface Consumer<T> {
        void accept(T t);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/platform/tools/ContextGetterUtils$OnAppStatusChangedListener;", "", "onBackground", "", "activity", "Landroid/app/Activity;", "onForeground", "utils_release"}, k = 1, mv = {1, 4, 0})
    public interface OnAppStatusChangedListener {
        void onBackground(@Nullable Activity activity);

        void onForeground(@Nullable Activity activity);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tR\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/heytap/store/platform/tools/ContextGetterUtils$Task;", "Result", "Lcom/heytap/store/platform/tools/ThreadUtils$SimpleTask;", "mConsumer", "Lcom/heytap/store/platform/tools/ContextGetterUtils$Consumer;", "(Lcom/heytap/store/platform/tools/ContextGetterUtils$Consumer;)V", "onSuccess", "", "result", "(Ljava/lang/Object;)V", "utils_release"}, k = 1, mv = {1, 4, 0})
    public static abstract class Task<Result> extends ThreadUtils.SimpleTask<Result> {
        private final Consumer<Result> mConsumer;

        public Task(@Nullable Consumer<Result> consumer) {
            this.mConsumer = consumer;
        }

        @Override // com.heytap.store.platform.tools.ThreadUtils.Task
        public void onSuccess(Result result) {
            Consumer<Result> consumer = this.mConsumer;
            if (consumer != null) {
                consumer.accept(result);
            }
        }
    }

    private ContextGetterUtils() {
    }

    @NotNull
    public final Application getApp() {
        Application application = sApp;
        if (application != null) {
            if (application != null) {
                return application;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        UtilsBridge utilsBridge = UtilsBridge.INSTANCE;
        init(utilsBridge.getApplicationByReflect());
        if (sApp == null) {
            throw new NullPointerException("reflect failed.");
        }
        Log.i("Utils", String.valueOf(utilsBridge.getCurrentProcessName()) + " reflect app success.");
        Application application2 = sApp;
        if (application2 != null) {
            return application2;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }

    public final void init(@Nullable Application app) {
        if (app == null) {
            Log.e("Utils", "app is null.");
            return;
        }
        Application application = sApp;
        if (application == null) {
            sApp = app;
            UtilsBridge utilsBridge = UtilsBridge.INSTANCE;
            Application application2 = sApp;
            Intrinsics.checkNotNull(application2);
            utilsBridge.init(application2);
            return;
        }
        if (Intrinsics.areEqual(application, app)) {
            return;
        }
        UtilsBridge utilsBridge2 = UtilsBridge.INSTANCE;
        Application application3 = sApp;
        Intrinsics.checkNotNull(application3);
        utilsBridge2.unInit(application3);
        sApp = app;
        Intrinsics.checkNotNull(app);
        utilsBridge2.init(app);
    }
}
