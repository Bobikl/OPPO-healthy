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

/* JADX INFO: loaded from: classes2.dex */
public class e3f extends WebChromeClient {
    public final e1a a;
    public g1a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<WebChromeClient> f10778c = new CopyOnWriteArrayList();

    public class a extends WebViewClient {
        public final /* synthetic */ WebView a;

        public a(WebView webView) {
            this.a = webView;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String string = webResourceRequest.getUrl().toString();
            if (!icg.e(string)) {
                m7b.l("ProxySystemWebChromeClient", "not hit white!");
                Toast.makeText(webView.getContext(), R$string.web_container_sdk_engine_link_warn_v2, 1).show();
                return true;
            }
            if (e3f.this.b != null && e3f.this.b.a(e3f.this.a, string)) {
                return true;
            }
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            if (URLUtil.isNetworkUrl(string)) {
                e3f.this.g(this.a, string);
                return true;
            }
            if (e3f.this.f(webView, string, this.a)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public e3f(e1a e1aVar) {
        this.a = e1aVar;
    }

    public void e(WebChromeClient webChromeClient) {
        if (this.f10778c.contains(webChromeClient)) {
            return;
        }
        this.f10778c.add(webChromeClient);
    }

    public final boolean f(WebView webView, String str, WebView webView2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (webView2 != null) {
            try {
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                webView2.getContext().startActivity(intent);
                return true;
            } catch (Exception e2) {
                m7b.f("ProxySystemWebChromeClient", "onBlankStartActivity failed!", e2);
            }
        }
        return false;
    }

    public final void g(WebView webView, String str) {
        webView.loadUrl(str);
        JSHookAop.loadUrl(webView, str);
    }

    public void h() {
        this.f10778c.clear();
    }

    public void i(g1a g1aVar) {
        this.b = g1aVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            lni.h(kg1.a(consoleMessage.sourceId(), consoleMessage.message(), this.a.getUrl()));
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
        lni.h(kg1.b(this.a.getUrl()));
        g1a g1aVar = this.b;
        if (g1aVar != null) {
            g1aVar.h(this.a, i);
        }
        Iterator<WebChromeClient> it = this.f10778c.iterator();
        while (it.hasNext()) {
            it.next().onProgressChanged(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(@NonNull WebView webView, @Nullable Bitmap bitmap) {
        if (this.b != null) {
            lni.h(kg1.c(this.a.getUrl()));
            this.b.c(this.a, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(@NonNull WebView webView, @Nullable String str) {
        if (this.b != null) {
            lni.h(kg1.d(str, this.a.getUrl()));
            this.b.g(this.a, str);
        }
    }
}
