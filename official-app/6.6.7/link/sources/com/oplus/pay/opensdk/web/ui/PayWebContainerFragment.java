package com.oplus.pay.opensdk.web.ui;

import android.os.Bundle;
import com.oplus.aiunit.vision.erl;
import com.oplus.aiunit.vision.l2a;
import com.oplus.aiunit.vision.s65;
import com.oplus.aiunit.vision.wz9;
import com.oplus.web.container.engine.config.IWebViewSettings;
import com.oplus.web.container.webview.core.WebContainerFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\r"}, d2 = {"Lcom/oplus/pay/opensdk/web/ui/PayWebContainerFragment;", "Lcom/oplus/web/container/webview/core/WebContainerFragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/oplus/aiunit/vision/wz9;", "onCreateStateViewAdapter", "Lcom/oplus/aiunit/vision/l2a;", "webView", "onConfigWebView", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class PayWebContainerFragment extends WebContainerFragment {
    @Override // com.oplus.web.container.webview.core.WebContainerFragment
    public void onConfigWebView(@Nullable l2a webView) {
        IWebViewSettings settings;
        super.onConfigWebView(webView);
        String strC = erl.d(getContext(), (webView == null || (settings = webView.getSettings()) == null) ? null : settings.d()).b().a(erl.IDENTIFY, erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE).a("paySDKVersion", "30301").c();
        IWebViewSettings settings2 = webView != null ? webView.getSettings() : null;
        if (settings2 == null) {
            return;
        }
        settings2.c(strC);
    }

    @Override // com.oplus.web.container.webview.core.WebContainerFragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        IWebViewSettings settings;
        super.onCreate(savedInstanceState);
        setWebViewSaveInstanceState(false);
        l2a webView = getWebView();
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.u(false);
    }

    @Override // com.oplus.web.container.webview.core.WebContainerFragment
    @NotNull
    public wz9 onCreateStateViewAdapter() {
        return new s65(this);
    }
}
