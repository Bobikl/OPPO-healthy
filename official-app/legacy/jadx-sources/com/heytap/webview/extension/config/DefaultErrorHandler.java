package com.heytap.webview.extension.config;

import android.net.http.SslError;
import android.util.Log;
import com.heytap.webview.extension.WebExtEnvironment;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.oplus.aiunit.vision.iim;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/heytap/webview/extension/config/DefaultErrorHandler;", "Lcom/heytap/webview/extension/config/IErrorHandler;", "()V", "onReceivedError", "", "fragment", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "errorCode", "", iim.a.f, "", "onReceivedSslError", "error", "Landroid/net/http/SslError;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultErrorHandler implements IErrorHandler {
    @Override // com.heytap.webview.extension.config.IErrorHandler
    public void onReceivedError(@NotNull IJsApiFragmentInterface fragment, int errorCode, @NotNull String description) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(description, "description");
        if (WebExtEnvironment.INSTANCE.getDebug()) {
            Log.d("DefaultErrorHandler", "error-code: " + errorCode + ", description: " + description);
        }
    }

    @Override // com.heytap.webview.extension.config.IErrorHandler
    public void onReceivedSslError(@NotNull IJsApiFragmentInterface fragment, @NotNull SslError error) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(error, "error");
        if (WebExtEnvironment.INSTANCE.getDebug()) {
            Log.d("DefaultErrorHandler", error.toString());
        }
    }
}
