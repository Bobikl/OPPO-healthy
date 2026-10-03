package com.heytap.webview.extension.adapter.webview;

import android.content.Context;
import com.heytap.browser.export.webview.ValueCallback;
import com.heytap.browser.export.webview.WebView;
import com.heytap.webview.extension.adapter.WebViewInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/heytap/webview/extension/adapter/webview/BrowserWebViewImpl;", "Lcom/heytap/webview/extension/adapter/WebViewInterface;", "webView", "Lcom/heytap/browser/export/webview/WebView;", "(Lcom/heytap/browser/export/webview/WebView;)V", "getWebView", "()Lcom/heytap/browser/export/webview/WebView;", "addJavascriptInterface", "", "obj", "", "interfaceName", "", "evaluateJavascript", "script", "resultCallback", "Lkotlin/Function0;", "getContext", "Landroid/content/Context;", "setBackgroundColor", "color", "", "setForceDarkAllowed", "allow", "", "lib_webtheme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BrowserWebViewImpl implements WebViewInterface {

    @NotNull
    private final WebView webView;

    public BrowserWebViewImpl(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
    }

    private static final void evaluateJavascript$lambda$0(String str) {
    }

    @Override // com.heytap.webview.extension.adapter.WebViewInterface
    public void addJavascriptInterface(@NotNull Object obj, @NotNull String interfaceName) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(interfaceName, "interfaceName");
        this.webView.addJavascriptInterface(obj, interfaceName);
    }

    @Override // com.heytap.webview.extension.adapter.WebViewInterface
    public void evaluateJavascript(@Nullable String script, @NotNull Function0<Unit> resultCallback) {
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        this.webView.evaluateJavascript(script, new ValueCallback() { // from class: com.oplus.aiunit.vision.o72
        });
    }

    @Override // com.heytap.webview.extension.adapter.WebViewInterface
    @NotNull
    public Context getContext() {
        Context context = this.webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "webView.context");
        return context;
    }

    @NotNull
    public final WebView getWebView() {
        return this.webView;
    }

    @Override // com.heytap.webview.extension.adapter.WebViewInterface
    public void setBackgroundColor(int color) {
        this.webView.setBackgroundColor(color);
    }

    @Override // com.heytap.webview.extension.adapter.WebViewInterface
    public void setForceDarkAllowed(boolean allow) {
        this.webView.setForceDarkAllowed(allow);
    }
}
