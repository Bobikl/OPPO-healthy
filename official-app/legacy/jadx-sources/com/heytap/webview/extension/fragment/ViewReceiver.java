package com.heytap.webview.extension.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/webview/extension/fragment/ViewReceiver;", "", "()V", "<set-?>", "Landroid/view/View;", "root", "getRoot", "()Landroid/view/View;", "Landroid/view/ViewGroup;", "statusLayer", "getStatusLayer", "()Landroid/view/ViewGroup;", "Landroid/webkit/WebView;", "webView", "getWebView", "()Landroid/webkit/WebView;", "receiveRoot", "receiveStatusLayer", "receiveWebView", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewReceiver {
    private View root;
    private ViewGroup statusLayer;
    private WebView webView;

    @NotNull
    public final View getRoot() {
        View view = this.root;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("root");
        return null;
    }

    @NotNull
    public final ViewGroup getStatusLayer() {
        ViewGroup viewGroup = this.statusLayer;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statusLayer");
        return null;
    }

    @NotNull
    public final WebView getWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        return null;
    }

    @NotNull
    public final ViewReceiver receiveRoot(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        return this;
    }

    @NotNull
    public final ViewReceiver receiveStatusLayer(@NotNull ViewGroup statusLayer) {
        Intrinsics.checkNotNullParameter(statusLayer, "statusLayer");
        this.statusLayer = statusLayer;
        return this;
    }

    @NotNull
    public final ViewReceiver receiveWebView(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        return this;
    }
}
