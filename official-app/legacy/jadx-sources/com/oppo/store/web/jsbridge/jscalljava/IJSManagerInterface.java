package com.oppo.store.web.jsbridge.jscalljava;

import android.webkit.WebView;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH&J.\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/oppo/store/web/jsbridge/jscalljava/IJSManagerInterface;", "", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "(Landroid/webkit/WebView;)V", "invokeJavaScriptCallback", "", "jsCallbackMethodName", "", "code", "", "message", "data", "Lorg/json/JSONObject;", "queryJavaScriptInterface", "methodName", "webbrowser-service_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IJSManagerInterface {
    @Nullable
    WebView getWebView();

    void invokeJavaScriptCallback(@Nullable String jsCallbackMethodName, int code, @Nullable String message);

    void invokeJavaScriptCallback(@Nullable String jsCallbackMethodName, int code, @Nullable String message, @Nullable JSONObject data);

    @Nullable
    Object queryJavaScriptInterface(@Nullable String methodName);

    void setWebView(@Nullable WebView webView);
}
