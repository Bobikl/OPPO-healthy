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
import com.oplusos.sau.common.utils.SauAarConstants;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class s5f extends WebViewClient {
    public final l2a a;
    public n2a b;
    public boolean d;
    public final List<WebViewClient> c = new CopyOnWriteArrayList();
    public long e = 0;

    public s5f(l2a l2aVar, boolean z) {
        this.a = l2aVar;
        this.d = z;
    }

    public void b(WebViewClient webViewClient) {
        if (this.c.contains(webViewClient)) {
            return;
        }
        this.c.add(webViewClient);
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
                    dri.h(zg1.e(String.valueOf(z), this.a.getUrl()));
                }
            }
            z = true;
            dri.h(zg1.e(String.valueOf(z), this.a.getUrl()));
        } catch (Throwable th) {
            y8b.f("ProxySystemWebViewClient", "detectWhiteScreen failed!", th);
        }
    }

    public void e() {
        this.c.clear();
    }

    public boolean f(Context context, Uri uri) {
        if (!TextUtils.isEmpty(uri.toString())) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            try {
                String strA = z35.a(context, intent);
                intent.addFlags(SauAarConstants.L);
                boolean zC = tfg.c(strA);
                y8b.i("ProxySystemWebViewClient", "hitBlackPkg:" + zC);
                if (!zC) {
                    context.startActivity(intent);
                    return true;
                }
                Toast.makeText(context, R$string.web_container_sdk_engine_link_warn_v2, 1).show();
            } catch (Throwable th) {
                y8b.f("ProxySystemWebViewClient", "startDeepLink failed!", th);
            }
        }
        return false;
    }

    public void g(n2a n2aVar) {
        this.b = n2aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
        super.onPageCommitVisible(webView, str);
        dri.h(zg1.g(str));
        y8b.c("ProxySystemWebViewClient", "onPageCommitVisible url: %s", str);
        n2a n2aVar = this.b;
        if (n2aVar != null) {
            n2aVar.i(this.a, str);
        }
        Iterator<WebViewClient> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(final WebView webView, String str) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.r5f
            @Override // java.lang.Runnable
            public final void run() {
                this.i.d(webView);
            }
        }, 3000L);
        super.onPageFinished(webView, str);
        dri.h(zg1.i(str));
        n2a n2aVar = this.b;
        if (n2aVar != null) {
            n2aVar.f(this.a, str);
        }
        dri.h(zg1.f(String.valueOf(System.currentTimeMillis() - this.e), this.a.getUrl()));
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.e = System.currentTimeMillis();
        y8b.c("ProxySystemWebViewClient", "onPageStarted url: %s", str);
        n2a n2aVar = this.b;
        if (n2aVar != null) {
            n2aVar.e(this.a, str, bitmap);
        }
        for (WebViewClient webViewClient : this.c) {
            dri.h(zg1.h(str));
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        String string = webResourceError.getDescription().toString();
        y8b.c("ProxySystemWebViewClient", "onReceivedError errorCode: %s errorMsg:%s", Integer.valueOf(errorCode), string);
        n2a n2aVar = this.b;
        if (n2aVar != null) {
            n2aVar.b(this.a, errorCode, string, "", webResourceRequest.isForMainFrame());
        }
        Iterator<WebViewClient> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onReceivedError(webView, webResourceRequest, webResourceError);
            dri.h(zg1.j(String.valueOf(errorCode), string, this.a.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        n2a n2aVar = this.b;
        if (n2aVar != null) {
            n2aVar.d(this.a, sslError.getPrimaryError() + "");
        }
        Iterator<WebViewClient> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        y8b.c("ProxySystemWebViewClient", "shouldOverrideUrlLoading url: %s,ignoreCheckHost:%s", webResourceRequest.getUrl(), Boolean.valueOf(this.d));
        if ("about:blank".equals(webResourceRequest.getUrl().toString())) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        dri.h(zg1.k(this.a.getUrl()));
        String string = webResourceRequest.getUrl().toString();
        if (!(tfg.e(string) || this.d)) {
            y8b.l("ProxySystemWebViewClient", "not hit white!");
            Toast.makeText(webView.getContext(), R$string.web_container_sdk_engine_link_warn_v2, 1).show();
            return true;
        }
        Iterator<WebViewClient> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        n2a n2aVar = this.b;
        if (n2aVar != null && n2aVar.a(this.a, webResourceRequest.getUrl().toString())) {
            return true;
        }
        if (!hrc.a(string)) {
            y8b.l("ProxySystemWebViewClient", "not valid network url! startDeepLink");
            if (f(webView.getContext(), webResourceRequest.getUrl())) {
                return true;
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
