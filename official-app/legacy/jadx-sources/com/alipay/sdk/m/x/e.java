package com.alipay.sdk.m.x;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.heytap.health.bitmap.BitmapProviderService;
import com.oplus.aiunit.vision.h2n;
import com.oplus.aiunit.vision.qam;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes12.dex */
public class e extends LinearLayout {
    public static Handler m = new Handler(Looper.getMainLooper());
    public ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f635j;
    public ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ProgressBar f636l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WebView f637n;
    public final C0157e o;
    public f p;
    public g q;
    public h r;
    public final qam s;
    public View.OnClickListener t;
    public final float u;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$a$a, reason: collision with other inner class name */
        public class RunnableC0156a implements Runnable {
            public final /* synthetic */ View i;

            public RunnableC0156a(View view) {
                this.i = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.i.setEnabled(true);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            h hVar = e.this.r;
            if (hVar != null) {
                view.setEnabled(false);
                e.m.postDelayed(new RunnableC0156a(view), 256L);
                if (view == e.this.i) {
                    hVar.h(e.this);
                } else if (view == e.this.k) {
                    hVar.g(e.this);
                }
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class b implements DownloadListener {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                this.a.startActivity(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return e.this.p.a(e.this, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (!e.this.o.b) {
                e.this.f636l.setVisibility(8);
            } else {
                if (i > 90) {
                    e.this.f636l.setVisibility(4);
                    return;
                }
                if (e.this.f636l.getVisibility() == 4) {
                    e.this.f636l.setVisibility(0);
                }
                e.this.f636l.setProgress(i);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            e.this.p.e(e.this, str);
        }
    }

    public class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (e.this.q.b(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (e.this.q.d(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (e.this.q.f(e.this, i, str, str2)) {
                return;
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (e.this.q.i(e.this, sslErrorHandler, sslError)) {
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (e.this.q.c(e.this, str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$e, reason: collision with other inner class name */
    public static final class C0157e {
        public boolean a;
        public boolean b;

        public C0157e(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public interface f {
        boolean a(e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult);

        void e(e eVar, String str);
    }

    public interface g {
        boolean b(e eVar, String str);

        boolean c(e eVar, String str);

        boolean d(e eVar, String str);

        boolean f(e eVar, int i, String str, String str2);

        boolean i(e eVar, SslErrorHandler sslErrorHandler, SslError sslError);
    }

    public interface h {
        void g(e eVar);

        void h(e eVar);
    }

    public e(Context context, qam qamVar, C0157e c0157e) {
        this(context, null, qamVar, c0157e);
    }

    public final int a(int i) {
        return (int) (i * this.u);
    }

    public void c() {
        removeAllViews();
        this.f637n.removeAllViews();
        this.f637n.setWebViewClient(null);
        this.f637n.setWebChromeClient(null);
        this.f637n.destroy();
    }

    public final void d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(this.o.a ? 0 : 8);
        ImageView imageView = new ImageView(context);
        this.i = imageView;
        imageView.setOnClickListener(this.t);
        this.i.setScaleType(ImageView.ScaleType.CENTER);
        this.i.setImageDrawable(h2n.a(h2n.a, context));
        this.i.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.i, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(a(1), a(25)));
        TextView textView = new TextView(context);
        this.f635j = textView;
        textView.setTextColor(-15658735);
        this.f635j.setTextSize(17.0f);
        this.f635j.setMaxLines(1);
        this.f635j.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(a(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f635j, layoutParams);
        ImageView imageView2 = new ImageView(context);
        this.k = imageView2;
        imageView2.setOnClickListener(this.t);
        this.k.setScaleType(ImageView.ScaleType.CENTER);
        this.k.setImageDrawable(h2n.a(h2n.b, context));
        this.k.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.k, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, a(48)));
    }

    public void e(WebView webView, Context context) {
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.getSettings().setUserAgentString(userAgentString + com.alipay.sdk.m.u.a.V(context));
    }

    public void f(String str) {
        WebView webView = this.f637n;
        webView.loadUrl(str);
        JSHookAop.loadUrl(webView, str);
        com.alipay.sdk.m.x.c.j(this.f637n);
    }

    public void g(String str, byte[] bArr) {
        WebView webView = this.f637n;
        webView.postUrl(str, bArr);
        JSHookAop.postUrl(webView, str, bArr);
    }

    public ImageView getBackButton() {
        return this.i;
    }

    public ProgressBar getProgressbar() {
        return this.f636l;
    }

    public ImageView getRefreshButton() {
        return this.k;
    }

    public TextView getTitle() {
        return this.f635j;
    }

    public String getUrl() {
        return this.f637n.getUrl();
    }

    public WebView getWebView() {
        return this.f637n;
    }

    public final void j(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        this.f636l = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_horizontal));
        this.f636l.setMax(100);
        this.f636l.setBackgroundColor(-218103809);
        addView(this.f636l, new LinearLayout.LayoutParams(-1, a(2)));
    }

    public final void l(Context context) {
        WebView webView = new WebView(context);
        this.f637n = webView;
        webView.setVerticalScrollbarOverlay(true);
        e(this.f637n, context);
        WebSettings settings = this.f637n.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setUseWideViewPort(true);
        settings.setAppCacheMaxSize(BitmapProviderService.BITMAP_MAX_SIZE);
        settings.setAppCachePath(context.getCacheDir().getAbsolutePath());
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAppCacheEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        this.f637n.setVerticalScrollbarOverlay(true);
        this.f637n.setDownloadListener(new b(context));
        try {
            try {
                this.f637n.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f637n.removeJavascriptInterface("accessibility");
                this.f637n.removeJavascriptInterface("accessibilityTraversal");
            } catch (Exception unused) {
                Method method = this.f637n.getClass().getMethod("removeJavascriptInterface", new Class[0]);
                if (method != null) {
                    method.invoke(this.f637n, "searchBoxJavaBridge_");
                    method.invoke(this.f637n, "accessibility");
                    method.invoke(this.f637n, "accessibilityTraversal");
                }
            }
        } catch (Throwable unused2) {
        }
        com.alipay.sdk.m.x.c.j(this.f637n);
        addView(this.f637n, new LinearLayout.LayoutParams(-1, -1));
    }

    public void setChromeProxy(f fVar) {
        this.p = fVar;
        if (fVar == null) {
            this.f637n.setWebChromeClient(null);
        } else {
            this.f637n.setWebChromeClient(new c());
        }
    }

    public void setWebClientProxy(g gVar) {
        this.q = gVar;
        if (gVar == null) {
            this.f637n.setWebViewClient(null);
        } else {
            this.f637n.setWebViewClient(new d());
        }
    }

    public void setWebEventProxy(h hVar) {
        this.r = hVar;
    }

    public e(Context context, AttributeSet attributeSet, qam qamVar, C0157e c0157e) {
        super(context, attributeSet);
        this.t = new a();
        this.o = c0157e == null ? new C0157e(false, false) : c0157e;
        this.s = qamVar;
        this.u = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        d(context);
        j(context);
        l(context);
    }
}
