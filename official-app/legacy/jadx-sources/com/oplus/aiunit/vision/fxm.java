package com.oplus.aiunit.vision;

import android.webkit.JavascriptInterface;
import com.customer.feedback.sdk.FeedbackThirdWebManager;
import com.customer.feedback.sdk.util.LogUtil;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class fxm {
    @JavascriptInterface
    @NotNull
    public final String invoke(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        LogUtil.d("ThirdWebJsInterface", "invoke ->method:" + method);
        String strInvoke = FeedbackThirdWebManager.getInstance().invoke(method);
        Intrinsics.checkNotNullExpressionValue(strInvoke, "getInstance().invoke(method)");
        return strInvoke;
    }

    @JavascriptInterface
    @NotNull
    public final String invokeWithParams(@NotNull String method, @NotNull String params) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(params, "params");
        LogUtil.d("ThirdWebJsInterface", "invokeWithParams ->method:" + method + ";params:" + params);
        String strInvokeWithParams = FeedbackThirdWebManager.getInstance().invokeWithParams(method, params);
        Intrinsics.checkNotNullExpressionValue(strInvokeWithParams, "getInstance().invokeWithParams(method, params)");
        return strInvokeWithParams;
    }
}
