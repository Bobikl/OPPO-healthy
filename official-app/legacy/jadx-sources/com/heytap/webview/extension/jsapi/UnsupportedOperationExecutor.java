package com.heytap.webview.extension.jsapi;

import com.heytap.webview.extension.protocol.Const;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/heytap/webview/extension/jsapi/UnsupportedOperationExecutor;", "Lcom/heytap/webview/extension/jsapi/IJsApiExecutor;", "()V", "execute", "", "fragment", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "apiArguments", "Lcom/heytap/webview/extension/jsapi/JsApiObject;", "callback", "Lcom/heytap/webview/extension/jsapi/IJsApiCallback;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnsupportedOperationExecutor implements IJsApiExecutor {
    @Override // com.heytap.webview.extension.jsapi.IJsApiExecutor
    public void execute(@Nullable IJsApiFragmentInterface fragment, @Nullable JsApiObject apiArguments, @NotNull IJsApiCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.fail(1, Const.JsApiResponse.UnsupportedOperation.MESSAGE);
    }
}
