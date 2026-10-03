package com.oplus.aiunit.vision;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.heytap.health.core.webservice.BrowserProgressBar;
import com.heytap.health.device.ota.R$id;
import com.heytap.health.device.ota.R$layout;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.webview.extension.activity.FragmentStyle;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J.\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002J$\u0010\u0016\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002R\u0016\u0010\u001a\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/l6d;", "Lcom/oplus/aiunit/vision/use;", "Lcom/oplus/aiunit/vision/z62;", FragmentStyle.BROWSER, "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "f", MapSchema.FIELD_NAME_ENTRY, "failUrl", "", "errorCode", iim.a.f, "c", "title", "q", "Landroid/webkit/WebView;", LogFieldKey.LEVEL_KEY, "", "s", "v", "u", b2n.f, "Landroid/webkit/WebView;", "webView", "Landroid/widget/FrameLayout;", b2n.g, "Landroid/widget/FrameLayout;", "errorView", "Lcom/heytap/health/core/webservice/BrowserProgressBar;", "i", "Lcom/heytap/health/core/webservice/BrowserProgressBar;", "loadingView", "Landroid/app/Activity;", "context", "<init>", "(Landroid/app/Activity;)V", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
public final class l6d extends use {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public WebView webView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public FrameLayout errorView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public BrowserProgressBar loadingView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6d(@NotNull Activity context) {
        super(context, R$layout.device_ota_feature_presentation, null);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewH = h(R$id.ext_webview);
        Intrinsics.checkNotNull(viewH, "null cannot be cast to non-null type android.webkit.WebView");
        this.webView = (WebView) viewH;
        View viewH2 = h(R$id.error_view);
        Intrinsics.checkNotNull(viewH2, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.errorView = (FrameLayout) viewH2;
        View viewH3 = h(R$id.progressbar);
        Intrinsics.checkNotNull(viewH3, "null cannot be cast to non-null type com.heytap.health.core.webservice.BrowserProgressBar");
        this.loadingView = (BrowserProgressBar) viewH3;
        this.webView.setAlpha(0.0f);
        this.loadingView.setVisibility(4);
    }

    public static final void t(l6d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.errorView.getVisibility() == 0) {
            return;
        }
        this$0.loadingView.setVisibility(8);
        this$0.webView.setAlpha(1.0f);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void c(@Nullable z62 browser, @Nullable String failUrl, int errorCode, @Nullable String description) {
        super.c(browser, failUrl, errorCode, description);
        v(browser, failUrl, errorCode);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void e(@Nullable z62 browser, @Nullable String url) {
        super.e(browser, url);
        if (this.errorView.getVisibility() == 0) {
            return;
        }
        this.loadingView.e();
        this.loadingView.setProgress(100);
        this.webView.setVisibility(0);
        this.loadingView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.k6d
            @Override // java.lang.Runnable
            public final void run() {
                l6d.t(this.i);
            }
        }, 300L);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void f(@Nullable z62 browser, @Nullable String url, @Nullable Bitmap favicon) {
        super.f(browser, url, favicon);
        if (rpc.c() && this.loadingView.getVisibility() == 4) {
            this.loadingView.d();
        }
        u();
    }

    @Override // com.oplus.aiunit.vision.use
    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public WebView getWebView() {
        return this.webView;
    }

    @Override // com.oplus.aiunit.vision.use
    public void q(@Nullable String title) {
    }

    public final boolean s(String failUrl) {
        if (this.errorView.getVisibility() == 0) {
            return false;
        }
        if (!rpc.c()) {
            return true;
        }
        if (URLUtil.isNetworkUrl(failUrl)) {
            return this.webView.getUrl() == null || z62.y(failUrl, this.webView.getUrl());
        }
        return false;
    }

    public final void u() {
        this.errorView.removeAllViews();
        this.errorView.setVisibility(8);
    }

    public final void v(z62 browser, String failUrl, int errorCode) {
        if (s(failUrl)) {
            if (!rpc.c()) {
                errorCode = -1;
            }
            View viewA = op6.a(browser, errorCode, failUrl);
            if (viewA != null) {
                this.errorView.addView(viewA);
                this.errorView.setVisibility(0);
                this.webView.setAlpha(0.0f);
                this.webView.setVisibility(4);
                this.loadingView.setVisibility(4);
            }
        }
    }
}
