package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.oplus.webcontainer.lib_biz_webview_engine.R$string;
import com.oppo.store.web.widget.CrashCatchWebView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class g3f extends WebViewClient {
    public final e1a a;
    public g1a b;
    public boolean d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<WebViewClient> f11614c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11615e = 0;

    public g3f(e1a e1aVar, boolean z) {
        this.a = e1aVar;
        this.d = z;
    }

    public void b(WebViewClient webViewClient) {
        if (this.f11614c.contains(webViewClient)) {
            return;
        }
        this.f11614c.add(webViewClient);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(WebView webView) {
        boolean z;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), Bitmap.Config.ARGB_8888);
            webView.draw(new Canvas(bitmapCreateBitmap));
            int width = bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight();
            int[] iArr = new int[width];
            bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            for (int i = 0; i < width; i++) {
                int i2 = iArr[i];
                if (i2 != -1 && i2 != 0) {
                    z = false;
                    lni.h(kg1.e(String.valueOf(z), this.a.getUrl()));
                }
            }
            z = true;
            lni.h(kg1.e(String.valueOf(z), this.a.getUrl()));
        } catch (Throwable th) {
            m7b.f("ProxySystemWebViewClient", "detectWhiteScreen failed!", th);
        }
    }

    public void e() {
        this.f11614c.clear();
    }

    public boolean f(Context context, Uri uri) {
        if (!TextUtils.isEmpty(uri.toString())) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            try {
                String strA = g35.a(context, intent);
                intent.addFlags(268435456);
                boolean zC = icg.c(strA);
                m7b.i("ProxySystemWebViewClient", "hitBlackPkg:" + zC);
                if (!zC) {
                    context.startActivity(intent);
                    return true;
                }
                Toast.makeText(context, R$string.web_container_sdk_engine_link_warn_v2, 1).show();
            } catch (Throwable th) {
                m7b.f("ProxySystemWebViewClient", "startDeepLink failed!", th);
            }
        }
        return false;
    }

    public void g(g1a g1aVar) {
        this.b = g1aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
        super.onPageCommitVisible(webView, str);
        lni.h(kg1.g(str));
        m7b.c("ProxySystemWebViewClient", "onPageCommitVisible url: %s", str);
        g1a g1aVar = this.b;
        if (g1aVar != null) {
            g1aVar.i(this.a, str);
        }
        Iterator<WebViewClient> it = this.f11614c.iterator();
        while (it.hasNext()) {
            it.next().onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(final WebView webView, String str) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.f3f
            @Override // java.lang.Runnable
            public final void run() {
                this.i.d(webView);
            }
        }, 3000L);
        super.onPageFinished(webView, str);
        lni.h(kg1.i(str));
        g1a g1aVar = this.b;
        if (g1aVar != null) {
            g1aVar.f(this.a, str);
        }
        lni.h(kg1.f(String.valueOf(System.currentTimeMillis() - this.f11615e), this.a.getUrl()));
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f11615e = System.currentTimeMillis();
        m7b.c("ProxySystemWebViewClient", "onPageStarted url: %s", str);
        g1a g1aVar = this.b;
        if (g1aVar != null) {
            g1aVar.e(this.a, str, bitmap);
        }
        for (WebViewClient webViewClient : this.f11614c) {
            lni.h(kg1.h(str));
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        String string = webResourceError.getDescription().toString();
        m7b.c("ProxySystemWebViewClient", "onReceivedError errorCode: %s errorMsg:%s", Integer.valueOf(errorCode), string);
        g1a g1aVar = this.b;
        if (g1aVar != null) {
            g1aVar.b(this.a, errorCode, string, "", webResourceRequest.isForMainFrame());
        }
        Iterator<WebViewClient> it = this.f11614c.iterator();
        while (it.hasNext()) {
            it.next().onReceivedError(webView, webResourceRequest, webResourceError);
            lni.h(kg1.j(String.valueOf(errorCode), string, this.a.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        g1a g1aVar = this.b;
        if (g1aVar != null) {
            g1aVar.d(this.a, sslError.getPrimaryError() + "");
        }
        Iterator<WebViewClient> it = this.f11614c.iterator();
        while (it.hasNext()) {
            it.next().onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        m7b.c("ProxySystemWebViewClient", "shouldOverrideUrlLoading url: %s,ignoreCheckHost:%s", webResourceRequest.getUrl(), Boolean.valueOf(this.d));
        if (CrashCatchWebView.URL_BLANK.equals(webResourceRequest.getUrl().toString())) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        lni.h(kg1.k(this.a.getUrl()));
        String string = webResourceRequest.getUrl().toString();
        if (!(icg.e(string) || this.d)) {
            m7b.l("ProxySystemWebViewClient", "not hit white!");
            Toast.makeText(webView.getContext(), R$string.web_container_sdk_engine_link_warn_v2, 1).show();
            return true;
        }
        Iterator<WebViewClient> it = this.f11614c.iterator();
        while (it.hasNext()) {
            it.next().shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        g1a g1aVar = this.b;
        if (g1aVar != null && g1aVar.a(this.a, webResourceRequest.getUrl().toString())) {
            return true;
        }
        if (!ppc.a(string)) {
            m7b.l("ProxySystemWebViewClient", "not valid network url! startDeepLink");
            if (f(webView.getContext(), webResourceRequest.getUrl())) {
                return true;
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
