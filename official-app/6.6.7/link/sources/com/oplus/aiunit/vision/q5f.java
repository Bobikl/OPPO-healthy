package com.oplus.aiunit.vision;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.webcontainer.lib_biz_webview_engine.R$string;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class q5f extends WebChromeClient {
    public final l2a a;
    public n2a b;
    public final List<WebChromeClient> c = new CopyOnWriteArrayList();

    public class a extends WebViewClient {
        public final /* synthetic */ WebView a;

        public a(WebView webView) {
            this.a = webView;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String string = webResourceRequest.getUrl().toString();
            if (!tfg.e(string)) {
                y8b.l("ProxySystemWebChromeClient", "not hit white!");
                Toast.makeText(webView.getContext(), R$string.web_container_sdk_engine_link_warn_v2, 1).show();
                return true;
            }
            if (q5f.this.b != null && q5f.this.b.a(q5f.this.a, string)) {
                return true;
            }
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            if (URLUtil.isNetworkUrl(string)) {
                q5f.this.g(this.a, string);
                return true;
            }
            if (q5f.this.f(webView, string, this.a)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public q5f(l2a l2aVar) {
        this.a = l2aVar;
    }

    public void e(WebChromeClient webChromeClient) {
        if (this.c.contains(webChromeClient)) {
            return;
        }
        this.c.add(webChromeClient);
    }

    public final boolean f(WebView webView, String str, WebView webView2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (webView2 != null) {
            try {
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                webView2.getContext().startActivity(intent);
                return true;
            } catch (Exception e) {
                y8b.f("ProxySystemWebChromeClient", "onBlankStartActivity failed!", e);
            }
        }
        return false;
    }

    public final void g(WebView webView, String str) {
        webView.loadUrl(str);
        JSHookAop.loadUrl(webView, str);
    }

    public void h() {
        this.c.clear();
    }

    public void i(n2a n2aVar) {
        this.b = n2aVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            dri.h(zg1.a(consoleMessage.sourceId(), consoleMessage.message(), this.a.getUrl()));
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        webView2.getSettings().setAllowContentAccess(false);
        webView2.getSettings().setAllowFileAccess(false);
        webView2.setWebViewClient(new a(webView));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        dri.h(zg1.b(this.a.getUrl()));
        n2a n2aVar = this.b;
        if (n2aVar != null) {
            n2aVar.h(this.a, i);
        }
        Iterator<WebChromeClient> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onProgressChanged(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(@NonNull WebView webView, @Nullable Bitmap bitmap) {
        if (this.b != null) {
            dri.h(zg1.c(this.a.getUrl()));
            this.b.c(this.a, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(@NonNull WebView webView, @Nullable String str) {
        if (this.b != null) {
            dri.h(zg1.d(str, this.a.getUrl()));
            this.b.g(this.a, str);
        }
    }
}
