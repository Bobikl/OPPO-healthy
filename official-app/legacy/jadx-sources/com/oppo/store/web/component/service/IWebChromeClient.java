package com.oppo.store.web.component.service;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J5\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH&J!\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u001c\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u001c\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&¨\u0006\u001f"}, d2 = {"Lcom/oppo/store/web/component/service/IWebChromeClient;", "", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "onCreateWindow", "webView", "Landroid/webkit/WebView;", "isDialog", "isUserGesture", "resultMsg", "Landroid/os/Message;", "(Landroid/webkit/WebView;Ljava/lang/Boolean;Ljava/lang/Boolean;Landroid/os/Message;)Z", "onHideCustomView", "", "onProgressChanged", "newProgress", "", "(Landroid/webkit/WebView;Ljava/lang/Integer;)V", "onReceivedIcon", "view", "icon", "Landroid/graphics/Bitmap;", "onReceivedTitle", "title", "", "onShowCustomView", "Landroid/view/View;", "callback", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "webbrowser-service_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IWebChromeClient {
    boolean onConsoleMessage(@Nullable ConsoleMessage consoleMessage);

    boolean onCreateWindow(@Nullable WebView webView, @Nullable Boolean isDialog, @Nullable Boolean isUserGesture, @Nullable Message resultMsg);

    void onHideCustomView();

    void onProgressChanged(@Nullable WebView webView, @Nullable Integer newProgress);

    void onReceivedIcon(@Nullable WebView view, @Nullable Bitmap icon);

    void onReceivedTitle(@Nullable WebView view, @Nullable String title);

    void onShowCustomView(@Nullable View view, @Nullable WebChromeClient.CustomViewCallback callback);
}
