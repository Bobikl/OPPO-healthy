package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.speech.engine.constant.EngineConstant;
import io.protostuff.MapSchema;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0003R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00020\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/yr5;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "context", "c", "Lkotlin/Function0;", "", "i", "Lkotlin/jvm/functions/Function0;", "needDismissOnResume", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "j", "Ljava/lang/ref/WeakReference;", "act", "Landroid/app/Dialog;", MapSchema.FIELD_NAME_KEY, "dg", EngineConstant.ROUTER_TYPE_DIALOG, "<init>", "(Landroid/app/Activity;Landroid/app/Dialog;Lkotlin/jvm/functions/Function0;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class yr5 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Function0<Boolean> needDismissOnResume;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public WeakReference<Activity> act;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<Dialog> dg;

    public yr5(@NotNull Activity activity, @NotNull Dialog dialog, @NotNull Function0<Boolean> needDismissOnResume) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(needDismissOnResume, "needDismissOnResume");
        this.needDismissOnResume = needDismissOnResume;
        this.act = new WeakReference<>(activity);
        this.dg = new WeakReference<>(dialog);
    }

    public static final void b(yr5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.dg.get();
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final void c(Activity context) {
        context.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String simpleName = activity.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append(":onActivityDestroyed");
        if (this.act.get() == null || this.dg.get() == null) {
            c(activity);
        } else {
            if (activity != this.act.get()) {
                return;
            }
            c(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String simpleName = activity.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append(":onActivityPaused");
        if (this.act.get() == null || this.dg.get() == null) {
            c(activity);
            return;
        }
        if (activity != this.act.get()) {
            return;
        }
        Dialog dialog = this.dg.get();
        boolean z = false;
        if (dialog != null && dialog.isShowing()) {
            z = true;
        }
        if (z) {
            return;
        }
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String simpleName = activity.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append(":onActivityResumed");
        if (this.act.get() == null || this.dg.get() == null) {
            c(activity);
        } else if (activity == this.act.get() && this.needDismissOnResume.invoke().booleanValue()) {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.xr5
                @Override // java.lang.Runnable
                public final void run() {
                    yr5.b(this.i);
                }
            }, 100L);
            c(activity);
        }
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
