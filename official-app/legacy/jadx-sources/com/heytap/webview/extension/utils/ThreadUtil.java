package com.heytap.webview.extension.utils;

import android.os.Handler;
import android.os.Looper;
import com.alipay.sdk.m.x.d;
import com.heytap.webview.extension.WebExtManager;
import com.heytap.webview.extension.utils.ThreadUtil;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0000¢\u0006\u0002\b\u000bJ%\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0000¢\u0006\u0002\b\rJ9\u0010\u000e\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000f0\n2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u000f\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0002\b\u0013J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/heytap/webview/extension/utils/ThreadUtil;", "", "()V", "uiHandler", "Landroid/os/Handler;", "execute", "", "uiThread", "", "runnable", "Lkotlin/Function0;", "execute$lib_webext_release", "post", "post$lib_webext_release", "postBackToUI", "R", "callable", d.u, "Lkotlin/Function1;", "postBackToUI$lib_webext_release", "postToUIThread", "delayMillis", "", "Ljava/lang/Runnable;", "removeFromUI", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThreadUtil {

    @NotNull
    public static final ThreadUtil INSTANCE = new ThreadUtil();

    @NotNull
    private static final Handler uiHandler = new Handler(Looper.getMainLooper());

    private ThreadUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$2(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$3(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static /* synthetic */ void execute$lib_webext_release$default(ThreadUtil threadUtil, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        threadUtil.execute$lib_webext_release(z, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void post$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void post$lambda$1(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static /* synthetic */ void post$lib_webext_release$default(ThreadUtil threadUtil, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        threadUtil.post$lib_webext_release(z, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postBackToUI$lambda$5(Function0 callable, final Function1 back) {
        final Object objInvoke;
        Intrinsics.checkNotNullParameter(callable, "$callable");
        Intrinsics.checkNotNullParameter(back, "$back");
        try {
            objInvoke = callable.invoke();
        } catch (Exception unused) {
            objInvoke = null;
        }
        uiHandler.post(new Runnable() { // from class: com.oplus.aiunit.vision.xwj
            @Override // java.lang.Runnable
            public final void run() {
                ThreadUtil.postBackToUI$lambda$5$lambda$4(back, objInvoke);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postBackToUI$lambda$5$lambda$4(Function1 back, Object obj) {
        Intrinsics.checkNotNullParameter(back, "$back");
        back.invoke(obj);
    }

    public final void execute$lib_webext_release(boolean uiThread, @NotNull final Function0<Unit> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (uiThread) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.invoke();
                return;
            } else {
                uiHandler.post(new Runnable() { // from class: com.oplus.aiunit.vision.twj
                    @Override // java.lang.Runnable
                    public final void run() {
                        ThreadUtil.execute$lambda$2(runnable);
                    }
                });
                return;
            }
        }
        Executor threadExecutor = WebExtManager.INSTANCE.getThreadExecutor();
        if (threadExecutor != null) {
            threadExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.uwj
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadUtil.execute$lambda$3(runnable);
                }
            });
        }
    }

    public final void post$lib_webext_release(boolean uiThread, @NotNull final Function0<Unit> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (uiThread) {
            uiHandler.post(new Runnable() { // from class: com.oplus.aiunit.vision.vwj
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadUtil.post$lambda$0(runnable);
                }
            });
            return;
        }
        Executor threadExecutor = WebExtManager.INSTANCE.getThreadExecutor();
        if (threadExecutor != null) {
            threadExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.wwj
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadUtil.post$lambda$1(runnable);
                }
            });
        }
    }

    public final <R> void postBackToUI$lib_webext_release(@NotNull final Function0<? extends R> callable, @NotNull final Function1<? super R, Unit> back) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(back, "back");
        Executor threadExecutor = WebExtManager.INSTANCE.getThreadExecutor();
        if (threadExecutor != null) {
            threadExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.rwj
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadUtil.postBackToUI$lambda$5(callable, back);
                }
            });
        }
    }

    public final void postToUIThread(long delayMillis, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        uiHandler.postDelayed(runnable, delayMillis);
    }

    public final void removeFromUI(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        uiHandler.removeCallbacks(runnable);
    }
}
