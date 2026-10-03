package com.heytap.webview.extension.jsapi.common.executor;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.jsapi.IJsApiExecutor;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.JsApi;
import com.heytap.webview.extension.jsapi.JsApiObject;
import com.heytap.webview.extension.protocol.Const;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@JsApi(method = "call")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/heytap/webview/extension/jsapi/common/executor/CommonCallExecutor;", "Lcom/heytap/webview/extension/jsapi/IJsApiExecutor;", "()V", Const.Arguments.Call.DIAL, "", "fragment", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "number", "", "execute", "apiArguments", "Lcom/heytap/webview/extension/jsapi/JsApiObject;", "callback", "Lcom/heytap/webview/extension/jsapi/IJsApiCallback;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonCallExecutor implements IJsApiExecutor {
    private final void dial(IJsApiFragmentInterface fragment, String number) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + number));
        intent.setFlags(268435456);
        fragment.getActivity().startActivity(intent);
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiExecutor
    public void execute(@NotNull IJsApiFragmentInterface fragment, @NotNull JsApiObject apiArguments, @NotNull IJsApiCallback callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(apiArguments, "apiArguments");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = apiArguments.getString("number");
        if (TextUtils.isEmpty(string)) {
            callback.fail(2, Const.JsApiResponse.IllegalArgument.MESSAGE);
        } else {
            dial(fragment, string);
            IJsApiCallback.DefaultImpls.success$default(callback, null, 1, null);
        }
    }
}
