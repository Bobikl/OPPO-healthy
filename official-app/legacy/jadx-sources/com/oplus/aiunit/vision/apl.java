package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.core.webservice.ExtWebView;
import io.protostuff.MapSchema;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0004J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/apl;", "", "Landroid/app/Application;", "application", "", "d", "Landroid/content/Context;", "context", "Lcom/heytap/health/core/webservice/ExtWebView;", MapSchema.FIELD_NAME_ENTRY, "b", "f", "c", "Ljava/util/concurrent/CopyOnWriteArrayList;", "a", "Ljava/util/concurrent/CopyOnWriteArrayList;", "pool", "<init>", "()V", "lib_webservice_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebViewPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewPool.kt\ncom/heytap/health/core/webservice/pool/WebViewPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1855#2,2:118\n*S KotlinDebug\n*F\n+ 1 WebViewPool.kt\ncom/heytap/health/core/webservice/pool/WebViewPool\n*L\n111#1:118,2\n*E\n"})
public final class apl {

    @NotNull
    public static final apl INSTANCE = new apl();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final CopyOnWriteArrayList<ExtWebView> pool = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"com/oplus/aiunit/vision/apl$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "lib_webservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final void c() {
            Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.oplus.aiunit.vision.zol
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    return apl.a.d();
                }
            });
        }

        public static final boolean d() {
            apl.INSTANCE.f();
            return false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Intrinsics.areEqual(activity.getClass().getSimpleName(), "MainActivity")) {
                apl.INSTANCE.b();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            a7b.f("WebViewPool", "onActivityResumed activity = " + activity.getClass().getName());
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.yol
                @Override // java.lang.Runnable
                public final void run() {
                    apl.a.c();
                }
            }, 2000L);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/oplus/aiunit/vision/apl$b", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "onLowMemory", "", "level", "onTrimMemory", "lib_webservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NotNull Configuration newConfig) {
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            if (level == 15 || level == 60 || level == 80) {
                apl.INSTANCE.b();
            }
        }
    }

    public final void b() {
        CopyOnWriteArrayList<ExtWebView> copyOnWriteArrayList = pool;
        synchronized (copyOnWriteArrayList) {
            for (ExtWebView extWebView : copyOnWriteArrayList) {
                if (extWebView != null) {
                    extWebView.destroy();
                }
            }
            pool.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final ExtWebView c(Context context) {
        return new ExtWebView(context);
    }

    public final void d(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
    }

    @NotNull
    public final ExtWebView e(@NotNull Context context) {
        ExtWebView extWebViewRemove;
        Intrinsics.checkNotNullParameter(context, "context");
        CopyOnWriteArrayList<ExtWebView> copyOnWriteArrayList = pool;
        if (!(!copyOnWriteArrayList.isEmpty())) {
            a7b.f("WebViewPool", "obtainWebView create new webview");
            return c(context);
        }
        a7b.f("WebViewPool", "obtainWebView use cache webView. size = " + copyOnWriteArrayList.size());
        synchronized (copyOnWriteArrayList) {
            extWebViewRemove = copyOnWriteArrayList.remove(0);
        }
        Context context2 = extWebViewRemove.getContext();
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(context);
        }
        Intrinsics.checkNotNullExpressionValue(extWebViewRemove, "{\n            LogUtils.i…        webView\n        }");
        return extWebViewRemove;
    }

    public final void f() {
        CopyOnWriteArrayList<ExtWebView> copyOnWriteArrayList = pool;
        if (copyOnWriteArrayList.size() >= 1) {
            return;
        }
        a7b.f("WebViewPool", "preloadWebView");
        ExtWebView extWebView = new ExtWebView(new MutableContextWrapper(b78.a()));
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(extWebView);
        }
    }
}
