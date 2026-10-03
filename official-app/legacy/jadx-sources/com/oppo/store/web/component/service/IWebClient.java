package com.oppo.store.web.component.service;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.oplus.aiunit.vision.iim;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J5\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u001e"}, d2 = {"Lcom/oppo/store/web/component/service/IWebClient;", "", "onPageCommitVisible", "", "webView", "Landroid/webkit/WebView;", "url", "", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "errorCode", "", iim.a.f, "failingUrl", "(Landroid/webkit/WebView;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "onReceivedSslError", "view", "handler", "Landroid/webkit/SslErrorHandler;", "error", "Landroid/net/http/SslError;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "request", "Landroid/webkit/WebResourceRequest;", "shouldOverrideUrlLoading", "", "webbrowser-service_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IWebClient {
    void onPageCommitVisible(@Nullable WebView webView, @Nullable String url);

    void onPageFinished(@Nullable WebView webView, @Nullable String url);

    void onPageStarted(@Nullable WebView webView, @Nullable String url, @Nullable Bitmap favicon);

    void onReceivedError(@Nullable WebView webView, @Nullable Integer errorCode, @Nullable String description, @Nullable String failingUrl);

    void onReceivedSslError(@Nullable WebView view, @Nullable SslErrorHandler handler, @Nullable SslError error);

    @Nullable
    WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request);

    @Nullable
    WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable String url);

    boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String url);
}
