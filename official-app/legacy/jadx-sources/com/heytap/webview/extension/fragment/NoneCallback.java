package com.heytap.webview.extension.fragment;

import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0011\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0096\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/heytap/webview/extension/fragment/NoneCallback;", "Lcom/heytap/webview/extension/jsapi/IJsApiCallback;", "()V", AcBaseTraceHelper.VAL_FAIL, "", "code", "", "message", "", "invoke", "obj", "success", "Lorg/json/JSONObject;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NoneCallback implements IJsApiCallback {
    @Override // com.heytap.webview.extension.jsapi.IJsApiCallback
    public void fail(@NotNull Object code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiCallback
    public void invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiCallback
    public void success(@NotNull JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
    }
}
