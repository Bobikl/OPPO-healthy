package com.heytap.health.esim.nec;

import android.net.Uri;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.w38;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/esim/nec/b;", "", "Companion", "a", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class b {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.health.esim.nec.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/heytap/health/esim/nec/b$a;", "", "Landroid/webkit/WebChromeClient;", "defaultClient", "Lcom/oplus/aiunit/vision/w38;", "customClient", "a", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.heytap.health.esim.nec.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\u000f\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J:\u0010\u0012\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0016\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u001c\u0010\u0019\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0016J2\u0010!\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0018\u00010\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¨\u0006%"}, d2 = {"com/heytap/health/esim/nec/b$a$a", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebView;", "view", "", "newProgress", "", "onProgressChanged", "", "url", "message", "Landroid/webkit/JsResult;", "result", "", "onJsAlert", "onJsConfirm", "defaultValue", "Landroid/webkit/JsPromptResult;", "onJsPrompt", "Landroid/view/View;", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "callback", "onShowCustomView", "onHideCustomView", "title", "onReceivedTitle", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "onShowFileChooser", "Landroid/webkit/PermissionRequest;", "request", "onPermissionRequest", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0404a extends WebChromeClient {
            public final /* synthetic */ WebChromeClient a;
            public final /* synthetic */ w38 b;

            public C0404a(WebChromeClient webChromeClient, w38 w38Var) {
                this.a = webChromeClient;
                this.b = w38Var;
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                this.a.onHideCustomView();
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(@Nullable WebView view, @Nullable String url, @Nullable String message, @Nullable JsResult result) {
                return this.a.onJsAlert(view, url, message, result);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(@Nullable WebView view, @Nullable String url, @Nullable String message, @Nullable JsResult result) {
                return this.a.onJsConfirm(view, url, message, result);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(@Nullable WebView view, @Nullable String url, @Nullable String message, @Nullable String defaultValue, @Nullable JsPromptResult result) {
                return this.a.onJsPrompt(view, url, message, defaultValue, result);
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(@Nullable PermissionRequest request) {
                this.b.a(request);
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(@Nullable WebView view, int newProgress) {
                this.a.onProgressChanged(view, newProgress);
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(@Nullable WebView view, @Nullable String title) {
                this.b.onReceivedTitle(view, title);
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(@Nullable View view, @Nullable WebChromeClient.CustomViewCallback callback) {
                this.a.onShowCustomView(view, callback);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(@Nullable WebView webView, @Nullable ValueCallback<Uri[]> filePathCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
                return this.b.b(webView, filePathCallback, fileChooserParams);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WebChromeClient a(@NotNull WebChromeClient defaultClient, @NotNull w38 customClient) {
            Intrinsics.checkNotNullParameter(defaultClient, "defaultClient");
            Intrinsics.checkNotNullParameter(customClient, "customClient");
            return new C0404a(defaultClient, customClient);
        }
    }
}
