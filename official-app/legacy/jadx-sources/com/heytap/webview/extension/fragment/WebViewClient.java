package com.heytap.webview.extension.fragment;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import com.heytap.webview.extension.WebExtEnvironment;
import com.heytap.webview.extension.WebExtManager;
import com.heytap.webview.extension.cache.WebExtCacheClient;
import com.heytap.webview.extension.config.IUrlInterceptor;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.iim;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0017J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J(\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016J \u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/heytap/webview/extension/fragment/WebViewClient;", "Landroid/webkit/WebViewClient;", "fragment", "Lcom/heytap/webview/extension/fragment/WebExtFragment;", "(Lcom/heytap/webview/extension/fragment/WebExtFragment;)V", "onPageCommitVisible", "", "webView", "Landroid/webkit/WebView;", "url", "", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "view", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", iim.a.f, "failingUrl", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "shouldOverrideUrlLoading", "", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class WebViewClient extends android.webkit.WebViewClient {

    @NotNull
    private final WebExtFragment fragment;

    public WebViewClient(@NotNull WebExtFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public void onPageCommitVisible(@NotNull WebView webView, @NotNull String url) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageCommitVisible(webView, url);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public void onPageFinished(@NotNull WebView webView, @NotNull String url) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(webView, url);
        if (WebExtEnvironment.INSTANCE.getDebug()) {
            Log.d(Const.Tag.LOADING_PROCESS, "url: " + url + " \n onPageFinished");
        }
        this.fragment.onPageFinished$lib_webext_release();
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public void onPageStarted(@NotNull WebView webView, @NotNull String url, @Nullable Bitmap favicon) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageStarted(webView, url, favicon);
        if (WebExtEnvironment.INSTANCE.getDebug()) {
            Log.d(Const.Tag.LOADING_PROCESS, "url: " + url + " \n onPageStarted");
        }
        this.fragment.onPageStarted$lib_webext_release();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@NotNull WebView webView, int errorCode, @NotNull String description, @NotNull String failingUrl) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(@NotNull WebView webView, @NotNull SslErrorHandler handler, @NotNull SslError error) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        this.fragment.onReceivedSslError(handler, error);
        WebExtManager.INSTANCE.getErrorHandler().onReceivedSslError(this.fragment, error);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return URLUtil.isNetworkUrl(url) ? WebExtCacheClient.INSTANCE.loadCacheData(url) : super.shouldInterceptRequest(view, url);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @Nullable String url) {
        Boolean boolValueOf;
        boolean zIntercept;
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (url == null) {
            return false;
        }
        String url2 = webView.getUrl();
        if (url2 != null) {
            if (TextUtils.equals(url2, url)) {
                zIntercept = false;
            } else {
                IUrlInterceptor urlInterceptor = WebExtManager.INSTANCE.getUrlInterceptor();
                WebExtFragment webExtFragment = this.fragment;
                Uri uri = Uri.parse(url2);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(oldUrl)");
                Uri uri2 = Uri.parse(url);
                Intrinsics.checkNotNullExpressionValue(uri2, "parse(newUrl)");
                zIntercept = urlInterceptor.intercept(webExtFragment, uri, uri2);
            }
            boolValueOf = Boolean.valueOf(zIntercept);
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
        if (WebExtEnvironment.INSTANCE.getDebug()) {
            Log.d(Const.Tag.LOADING_PROCESS, "url: " + request.getUrl() + " \n onReceivedError");
        }
        if (request.isForMainFrame()) {
            Log.d("TAG", "onReceivedError: request.isForMainFrame");
            WebExtManager.INSTANCE.getErrorHandler().onReceivedError(this.fragment, error.getErrorCode(), error.getDescription().toString());
            this.fragment.onReceivedError$lib_webext_release(error.getErrorCode(), error.getDescription().toString());
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(21)
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        if (URLUtil.isNetworkUrl(request.getUrl().toString())) {
            WebExtCacheClient webExtCacheClient = WebExtCacheClient.INSTANCE;
            String string = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string, "request.url.toString()");
            return webExtCacheClient.loadCacheData(string);
        }
        return super.shouldInterceptRequest(view, request);
    }
}
