package com.unionpay;

import android.webkit.WebView;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Runnable {
    public final /* synthetic */ String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WebViewJavascriptBridge f20349j;

    public c(WebViewJavascriptBridge webViewJavascriptBridge, String str) {
        this.f20349j = webViewJavascriptBridge;
        this.i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.f20349j.mWebView;
        String str = this.i;
        webView.loadUrl(str);
        JSHookAop.loadUrl(webView, str);
    }
}
