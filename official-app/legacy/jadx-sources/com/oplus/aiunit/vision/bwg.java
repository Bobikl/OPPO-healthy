package com.oplus.aiunit.vision;

import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@eja(method = "setClientStatusBar", product = "pay")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/bwg;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "Lcom/oplus/aiunit/vision/or9;", "fragment", "Lcom/oplus/aiunit/vision/kja;", "apiArguments", "Lcom/oplus/aiunit/vision/lr9;", "callback", "", "handleJsApi", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class bwg extends BaseJsApiExecutor {
    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable or9 fragment, @Nullable kja apiArguments, @Nullable lr9 callback) {
        Object objM5287constructorimpl;
        Unit unit = null;
        if ((fragment != null ? fragment.getActivity() : null) == null) {
            if (callback != null) {
                callback.fail(-1, "setClientStatusBar Fragment or activity is null");
            }
            jnl.h("setClientStatusBar Fragment or activity is null");
            return;
        }
        String strC = apiArguments != null ? apiArguments.c("statusBarBackColor") : null;
        if (strC == null || strC.length() == 0) {
            if (callback != null) {
                callback.fail(-1, "dark is null ");
            }
            jnl.h("setClientStatusBar dark is null");
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            zni.c(fragment.getActivity(), Intrinsics.areEqual(strC, "dark"));
            if (callback != null) {
                callback.success();
                unit = Unit.INSTANCE;
            }
            objM5287constructorimpl = Result.m5287constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            jnl.b("setStatusBarModel error: " + thM5290exceptionOrNullimpl.getMessage());
            if (callback != null) {
                callback.fail(-1, "setStatusBarModel error: " + thM5290exceptionOrNullimpl.getMessage());
            }
        }
    }
}
