package com.oplus.utrace.hlog;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.utils.Logs;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/oplus/utrace/hlog/ULoggerImpl$activityLifecycleCallbacks$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", ParserTag.TAG_ACTIVITY, "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ULoggerImpl$activityLifecycleCallbacks$1 implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ ULoggerImpl this$0;

    public ULoggerImpl$activityLifecycleCallbacks$1(ULoggerImpl uLoggerImpl) {
        this.this$0 = uLoggerImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityStopped$lambda$1$lambda$0(ULoggerImpl uLoggerImpl) {
        Intrinsics.checkNotNullParameter(uLoggerImpl, "this$0");
        uLoggerImpl.tryFlushInThread(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Object obj;
        Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
        final ULoggerImpl uLoggerImpl = this.this$0;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Boolean.valueOf(uLoggerImpl.getHandler().post(new Runnable() { // from class: com.oplus.utrace.hlog.s
                @Override // java.lang.Runnable
                public final void run() {
                    ULoggerImpl$activityLifecycleCallbacks$1.onActivityStopped$lambda$1$lambda$0(uLoggerImpl);
                }
            })));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        ULoggerImpl uLoggerImpl2 = this.this$0;
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.d("UTrace.Sdk.HLog.ULoggerImpl", uLoggerImpl2.logPrefix + " onActivityStopped exception=" + th2.getMessage(), th2);
        }
    }
}
