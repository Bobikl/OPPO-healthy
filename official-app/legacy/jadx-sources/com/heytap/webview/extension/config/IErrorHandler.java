package com.heytap.webview.extension.config;

import android.net.http.SslError;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.oplus.aiunit.vision.iim;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/heytap/webview/extension/config/IErrorHandler;", "", "onReceivedError", "", "fragment", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "errorCode", "", iim.a.f, "", "onReceivedSslError", "error", "Landroid/net/http/SslError;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IErrorHandler {
    void onReceivedError(@NotNull IJsApiFragmentInterface fragment, int errorCode, @NotNull String description);

    void onReceivedSslError(@NotNull IJsApiFragmentInterface fragment, @NotNull SslError error);
}
