package com.heytap.webview.extension.pool;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NotImplementedError;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0017\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/heytap/webview/extension/pool/PooledWebView;", "Lcom/heytap/webview/extension/pool/PooledObject;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mWebView", "mWebViewState", "", "compareTo", "", "other", "getActiveTimeMillis", "", "getCreateTime", "getIdleTimeMillis", "getLastBorrowTime", "getLastReturnTime", "getLastUsedTime", "getObject", "getState", "reback", "", "use", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PooledWebView implements PooledObject<WebView> {

    @NotNull
    private final WebView mWebView;

    @NotNull
    private String mWebViewState;

    public PooledWebView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WebView webView = new WebView(context);
        webView.setWebViewClient(new WebViewClient() { // from class: com.heytap.webview.extension.pool.PooledWebView$mWebView$1$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                view.loadUrl(url);
                JSHookAop.loadUrl(view, url);
                return true;
            }
        });
        this.mWebView = webView;
        this.mWebViewState = "object-idle";
    }

    @Override // com.heytap.webview.extension.pool.PooledObject
    public long getActiveTimeMillis() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.heytap.webview.extension.pool.PooledObject
    public long getCreateTime() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.heytap.webview.extension.pool.PooledObject
    public long getIdleTimeMillis() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.heytap.webview.extension.pool.PooledObject
    public long getLastBorrowTime() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.heytap.webview.extension.pool.PooledObject
    public long getLastReturnTime() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.heytap.webview.extension.pool.PooledObject
    public long getLastUsedTime() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.heytap.webview.extension.pool.PooledObject
    @NotNull
    /* JADX INFO: renamed from: getState, reason: from getter */
    public String getMWebViewState() {
        return this.mWebViewState;
    }

    @Override // com.heytap.webview.extension.pool.PooledObject
    public void reback() {
        this.mWebViewState = "object-idle";
    }

    @Override // com.heytap.webview.extension.pool.PooledObject
    public void use() {
        this.mWebViewState = "object-using";
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull PooledObject<WebView> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.heytap.webview.extension.pool.PooledObject
    @NotNull
    /* JADX INFO: renamed from: getObject, reason: from getter */
    public WebView getMWebView() {
        return this.mWebView;
    }
}
