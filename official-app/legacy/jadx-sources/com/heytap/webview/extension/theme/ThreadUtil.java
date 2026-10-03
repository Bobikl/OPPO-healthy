package com.heytap.webview.extension.theme;

import android.os.Handler;
import android.os.Looper;
import com.heytap.webview.extension.theme.ThreadUtil;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/heytap/webview/extension/theme/ThreadUtil;", "", "()V", "uiHandler", "Landroid/os/Handler;", "postToUIThread", "", "delayMillis", "", "work", "Lkotlin/Function0;", "lib_webtheme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThreadUtil {

    @NotNull
    public static final ThreadUtil INSTANCE = new ThreadUtil();

    @NotNull
    private static final Handler uiHandler = new Handler(Looper.getMainLooper());

    private ThreadUtil() {
    }

    public static /* synthetic */ void postToUIThread$default(ThreadUtil threadUtil, long j2, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = 0;
        }
        threadUtil.postToUIThread(j2, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postToUIThread$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void postToUIThread(long delayMillis, @NotNull final Function0<Unit> work) {
        Intrinsics.checkNotNullParameter(work, "work");
        uiHandler.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.swj
            @Override // java.lang.Runnable
            public final void run() {
                ThreadUtil.postToUIThread$lambda$0(work);
            }
        }, delayMillis);
    }
}
