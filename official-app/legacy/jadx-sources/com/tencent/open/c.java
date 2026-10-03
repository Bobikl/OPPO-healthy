package com.tencent.open;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.oplus.aiunit.vision.dzm;
import com.oplus.aiunit.vision.h75;
import com.oplus.aiunit.vision.q8g;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.yfk;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class c extends com.tencent.open.b implements com.tencent.open.b.a.InterfaceC1012a {
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.tencent.open.b.a f20310l;
    public com.tencent.open.b.b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference<Context> f20311n;
    public int o;

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c.this.m.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q8g.j("openSDK_LOG.PKDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            c.c(c.this);
            new yfk(i, str, str2);
            throw null;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            q8g.j("openSDK_LOG.PKDialog", "Redirect URL: " + str);
            if (str.startsWith(dzm.a().b((Context) c.this.f20311n.get(), "auth://tauth.qq.com/"))) {
                c.c(c.this);
                com.tencent.open.utils.b.y(str);
                throw null;
            }
            if (str.startsWith(s04.CANCEL_URI)) {
                c.c(c.this);
                throw null;
            }
            if (!str.startsWith(s04.CLOSE_URI)) {
                return false;
            }
            c.this.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.open.c$c, reason: collision with other inner class name */
    public class C1013c extends com.tencent.open.a.b {
        public C1013c() {
        }
    }

    public static class d extends h75 {
    }

    public static /* synthetic */ d c(c cVar) {
        cVar.getClass();
        return null;
    }

    @Override // com.tencent.open.b.a.InterfaceC1012a
    public void a(int i) {
        WeakReference<Context> weakReference = this.f20311n;
        if (weakReference != null && weakReference.get() != null) {
            if (i >= this.o || 2 != this.f20311n.get().getResources().getConfiguration().orientation) {
                this.m.getLayoutParams().height = this.o;
            } else {
                this.m.getLayoutParams().height = i;
            }
        }
        q8g.f("openSDK_LOG.PKDialog", "onKeyboardShown keyboard show");
    }

    public final void d() {
        com.tencent.open.b.a aVar = new com.tencent.open.b.a(this.f20311n.get());
        this.f20310l = aVar;
        aVar.setBackgroundColor(1711276032);
        this.f20310l.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        com.tencent.open.b.b bVar = new com.tencent.open.b.b(this.f20311n.get());
        this.m = bVar;
        bVar.setBackgroundColor(0);
        this.m.setBackgroundDrawable(null);
        try {
            View.class.getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this.m, 1, new Paint());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.o);
        layoutParams.addRule(13, -1);
        this.m.setLayoutParams(layoutParams);
        this.f20310l.addView(this.m);
        this.f20310l.a(this);
        setContentView(this.f20310l);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void f() {
        this.m.setVerticalScrollBarEnabled(false);
        this.m.setHorizontalScrollBarEnabled(false);
        this.m.setWebViewClient(new b());
        this.m.setWebChromeClient(this.f20307j);
        this.m.clearFormData();
        WebSettings settings = this.m.getSettings();
        if (settings == null) {
            return;
        }
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setJavaScriptEnabled(true);
        WeakReference<Context> weakReference = this.f20311n;
        if (weakReference != null && weakReference.get() != null) {
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.f20311n.get().getApplicationContext().getDir("databases", 0).getPath());
        }
        settings.setDomStorageEnabled(true);
        this.i.a(new C1013c(), "sdk_js_if");
        this.m.clearView();
        com.tencent.open.b.b bVar = this.m;
        String str = this.k;
        bVar.loadUrl(str);
        JSHookAop.loadUrl(bVar, str);
        this.m.getSettings().setSavePassword(false);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.open.b, android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        getWindow().setSoftInputMode(1);
        d();
        f();
    }

    @Override // com.tencent.open.b.a.InterfaceC1012a
    public void a() {
        this.m.getLayoutParams().height = this.o;
        q8g.f("openSDK_LOG.PKDialog", "onKeyboardHidden keyboard hide");
    }

    @Override // com.tencent.open.b
    public void a(String str) {
        q8g.d("openSDK_LOG.PKDialog", "--onConsoleMessage--");
        try {
            this.i.c(this.m, str);
        } catch (Exception unused) {
        }
    }
}
