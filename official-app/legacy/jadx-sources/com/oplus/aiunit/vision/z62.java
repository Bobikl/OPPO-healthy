package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.ComponentActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.core.webservice.BrowserView;
import com.heytap.health.core.webservice.js.JsRegistry;
import com.heytap.health.core.webservice.js.JsScheduler;
import com.heytap.health.core.webservice.lifecycle.BrowserLifeCycle;
import com.heytap.health.core.webservice.uiObserver.UiStatusObserver;
import com.platform.account.webview.constant.Constants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class z62 {
    public static final int BROWSER_FILE_CHOOSER_REQUSET_CODE = 10000;
    public static final String RES_PREFIX = "https://resource/";
    public static final String TAG = "Browser";
    public static String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List<Class<? extends sr9>> f19282n = new ArrayList();
    public WebView a;
    public jmk b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public umk f19283c;
    public JsRegistry d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public use f19284e;
    public Handler f;
    public final int g;
    public JsScheduler h;
    public UiStatusObserver i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WebChromeClient f19285j;
    public ValueCallback<Uri[]> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f19286l;

    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            super.onHideCustomView();
            if (z62.this.f19284e != null) {
                z62.this.f19284e.n();
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            z62.b(z62.this);
            return super.onJsAlert(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            a7b.f(z62.TAG, "onJsConfirm---url: " + str + ", message: " + str2);
            z62.b(z62.this);
            return super.onJsConfirm(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            a7b.f(z62.TAG, "onJsPrompt---url: " + str + ", message: " + str2 + ", defaultValue: " + str3);
            z62.b(z62.this);
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            a7b.f(z62.TAG, "onProgressChanged---newProgress: " + i + ",url: " + k99.a(webView.getUrl()));
            z62.this.f19283c.w(webView, i);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            a7b.f(z62.TAG, "onReceivedTitle---title: " + str);
            z62.this.f19283c.A(webView, str);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, customViewCallback);
            if (z62.this.f19284e != null) {
                z62.this.f19284e.o(view, customViewCallback);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            z62.this.k = valueCallback;
            return z62.this.E(fileChooserParams);
        }
    }

    public static class b {
        public BrowserView a;
        public Activity b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<String> f19288e;
        public os9 f;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f19291n;
        public boolean p;
        public rz9[] q;
        public List<sr9> r;
        public hid s;
        public use v;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f19287c = null;
        public int d = 0;
        public List<Object> g = new ArrayList();
        public boolean h = false;
        public boolean i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f19289j = true;
        public boolean k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f19290l = false;
        public boolean m = true;
        public boolean o = true;
        public int t = 0;
        public int u = 0;
        public int w = -1;
        public boolean x = false;
        public boolean y = true;

        public b(Activity activity) {
            this.b = activity;
        }

        public static /* bridge */ /* synthetic */ uhd l(b bVar) {
            bVar.getClass();
            return null;
        }

        public b A(sr9 sr9Var) {
            if (this.r == null) {
                this.r = new ArrayList();
            }
            if (!this.r.contains(sr9Var)) {
                this.r.add(sr9Var);
            }
            return this;
        }

        public b B(Object... objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (!this.g.contains(obj)) {
                        this.g.add(obj);
                    }
                }
            }
            return this;
        }

        public b C(boolean z) {
            this.i = z;
            return this;
        }

        public z62 D() {
            return new z62(this);
        }

        public b E(boolean z) {
            this.m = z;
            return this;
        }

        public b F() {
            this.f19291n = true;
            return this;
        }

        public b G(use useVar) {
            this.v = useVar;
            return this;
        }

        public b H(rz9... rz9VarArr) {
            this.q = rz9VarArr;
            return this;
        }

        public b I(boolean z) {
            this.x = z;
            return this;
        }

        public b J(BrowserView browserView) {
            this.a = browserView;
            return this;
        }

        public b K(boolean z) {
            this.y = z;
            return this;
        }

        public b L(boolean z) {
            this.k = z;
            return this;
        }

        public b M(boolean z) {
            this.f19290l = z;
            return this;
        }

        public b N(boolean z) {
            this.f19289j = z;
            return this;
        }

        public b O(int i) {
            this.u = i;
            return this;
        }

        public b P(int i) {
            this.t = i;
            return this;
        }

        public b Q(int i) {
            this.f19287c = this.b.getString(i);
            return this;
        }

        public b R(String str) {
            this.f19287c = str;
            return this;
        }

        public b S(String[] strArr) {
            if (strArr != null) {
                this.f19288e = Arrays.asList(strArr);
            }
            return this;
        }
    }

    public static class d implements DownloadListener {
        public WeakReference<Context> a;

        public d(Context context) {
            this.a = new WeakReference<>(context);
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
            a7b.f(z62.TAG, "onDownloadStart");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            Context context = this.a.get();
            if (context == null || intent.resolveActivity(context.getPackageManager()) == null) {
                return;
            }
            context.startActivity(intent);
        }
    }

    public static /* synthetic */ boolean A(View view) {
        return false;
    }

    public static void M(Context context) {
        String strC = gxe.c();
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append("setUpDataDirSuffix processName ： ");
        sb.append(strC);
        if (TextUtils.isEmpty(strC) || packageName.equals(strC)) {
            return;
        }
        try {
            WebView.setDataDirectorySuffix(strC);
        } catch (Exception e2) {
            a7b.b(TAG, "setUpDataDirSuffix Exception:" + e2.getMessage());
        }
    }

    public static b P(Activity activity) {
        return new b(activity);
    }

    public static /* bridge */ /* synthetic */ uhd b(z62 z62Var) {
        z62Var.getClass();
        return null;
    }

    public static String l(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("checkIfNeedUrlDecode: ");
        sb.append(str);
        try {
            str = URLDecoder.decode(str);
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception: ");
            sb2.append(e2.getMessage());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("checkIfNeedUrlDecode---after: ");
        sb3.append(str);
        return str;
    }

    public static void m(Context context) {
        if (context == null || !gxe.f(context)) {
            return;
        }
        WebStorage.getInstance().deleteAllData();
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
    }

    public static void x(Context context, String str, List<Class<? extends sr9>> list) {
        m = str;
        f19282n.addAll(list);
        M(context);
    }

    public static boolean y(String str, String str2) {
        try {
            if (URLUtil.isNetworkUrl(str) && URLUtil.isNetworkUrl(str2)) {
                URI uri = new URI(str);
                URI uri2 = new URI(str2);
                return (uri.getScheme() + uri.getHost() + uri.getPath() + uri.getFragment() + uri.getQuery()).equalsIgnoreCase(uri2.getScheme() + uri2.getHost() + uri2.getPath() + uri2.getFragment() + uri2.getQuery());
            }
            return false;
        } catch (URISyntaxException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("isSameUrl---Exception: ");
            sb.append(e2.getMessage());
            return false;
        }
    }

    public static boolean z(String str, String str2) {
        if (!URLUtil.isValidUrl(str2)) {
            return false;
        }
        if (qe0.E() && !str2.startsWith("https://")) {
            return false;
        }
        try {
            URI uri = new URI(str);
            URI uri2 = new URI(str2);
            StringBuilder sb = new StringBuilder();
            sb.append("isUrlSameDomain uriHost: ");
            sb.append(uri2.getHost());
            return uri.getHost().equalsIgnoreCase(uri2.getHost());
        } catch (URISyntaxException e2) {
            a7b.f(TAG, "isUrlSameDomain Exception: " + e2.getMessage());
            return false;
        }
    }

    public void B(String str, String str2, String str3, String str4, String str5) {
        this.f19283c.q(str, str2, str3, str4, str5);
    }

    public void C(@NonNull Configuration configuration) {
        this.d.getHeyTapTheme().notifyThemeChanged(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    public void D(int i, int i2, @Nullable Intent intent) {
        Uri[] uriArr;
        if (i == 10000) {
            if (i2 == -1) {
                String dataString = intent.getDataString();
                ClipData clipData = intent.getClipData();
                if (clipData != null) {
                    uriArr = new Uri[clipData.getItemCount()];
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        uriArr[i3] = clipData.getItemAt(i3).getUri();
                    }
                } else if (TextUtils.isEmpty(dataString)) {
                    uriArr = null;
                } else {
                    uriArr = new Uri[]{Uri.parse(dataString)};
                }
            } else {
                uriArr = null;
            }
            ValueCallback<Uri[]> valueCallback = this.k;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
                this.k = null;
            }
        }
    }

    public final boolean E(WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes;
        if (fileChooserParams == null || (acceptTypes = fileChooserParams.getAcceptTypes()) == null || acceptTypes.length == 0) {
            return false;
        }
        int mode = fileChooserParams.getMode();
        String str = i(acceptTypes) ? "image/*" : "*/*";
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", mode == 1);
        intent.setType(str);
        ((ComponentActivity) s().i()).startActivityForResult(intent, 10000);
        return true;
    }

    public void F() {
        a7b.f(TAG, "refresh");
        this.f19283c.B();
    }

    public final void G(boolean z) {
        this.a.getSettings().setUseWideViewPort(z);
        this.a.getSettings().setLoadWithOverviewMode(z);
    }

    public final void H(WebView webView) {
        try {
            Method method = webView.getSettings().getClass().getMethod("setAllowUniversalAccessFromFileURLs", Boolean.TYPE);
            if (method != null) {
                method.invoke(webView.getSettings(), Boolean.TRUE);
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public void I(String str) {
        JsScheduler jsScheduler = this.h;
        if (jsScheduler != null) {
            jsScheduler.setDefaultSafeDomain(str);
        }
    }

    public final void J(boolean z) {
        this.a.getSettings().setJavaScriptEnabled(z);
    }

    public final void K(boolean z) {
        if (z) {
            this.a.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.oplus.aiunit.vision.x62
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return z62.A(view);
                }
            });
            this.a.setLongClickable(true);
        }
    }

    public final void L(boolean z) {
        this.a.getSettings().setSupportZoom(z);
    }

    public final void N(int i) {
        this.a.getSettings().setCacheMode(i);
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final void O(WebView webView, b bVar) {
        if (webView != null) {
            J(bVar.m);
            G(bVar.i);
            L(bVar.f19289j);
            K(bVar.f19290l);
            N(bVar.w);
            webView.setDrawingCacheEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setAllowContentAccess(false);
            webView.getSettings().setTextZoom(100);
            webView.getSettings().setTextZoom(100);
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setAllowFileAccess(bVar.p);
            webView.getSettings().setAllowFileAccessFromFileURLs(false);
            webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
            webView.setWebChromeClient(this.f19285j);
            webView.setWebViewClient(this.f19286l);
            webView.setDownloadListener(new d(bVar.b));
            this.d.enableJsLog(bVar.f19291n);
            this.d.registerJsInterfaces(bVar.g);
            this.d.enableHttpProxy(bVar.h);
            webView.getSettings().setMixedContentMode(1);
            String str = "Manufacturer/" + Build.MANUFACTURER.toLowerCase() + " HeytapHealth/" + y80.VERSION_NAME_SHORT + " Locale/" + kta.b();
            String userAgentString = webView.getSettings().getUserAgentString();
            webView.getSettings().setUserAgentString(userAgentString + " " + str);
            WebView.setWebContentsDebuggingEnabled(qe0.E() ^ true);
            webView.setForceDarkAllowed(bVar.k);
        }
    }

    public wzk.c Q() {
        return new wzk.c(this.a);
    }

    public final boolean i(String[] strArr) {
        return strArr.length == 1 && strArr[0].contains(c8l.IMAGE_KEY);
    }

    public final os9 j(b bVar) {
        List listAsList;
        a7b.f(TAG, "setupWhiteList---resId: " + bVar.d);
        if (bVar.f != null) {
            return bVar.f;
        }
        if (bVar.f19288e != null) {
            listAsList = bVar.f19288e;
        } else if (bVar.d != 0) {
            try {
                listAsList = Arrays.asList(bVar.b.getResources().getStringArray(bVar.d));
            } catch (Exception unused) {
                a7b.m(TAG, "setupWhiteList---Unable to find resource: " + bVar.d);
                listAsList = null;
            }
        } else {
            listAsList = null;
        }
        if (listAsList == null || listAsList.size() <= 0) {
            return null;
        }
        return new rmk(listAsList);
    }

    public boolean k() {
        a7b.f(TAG, "canGoBack");
        return this.f19283c.f();
    }

    public final use n(int i, Activity activity, String str, boolean z, boolean z2) {
        String strL = l(str);
        if (i == 0) {
            return new wuc(activity, strL, z, z2);
        }
        if (i == 1) {
            return new b08(activity, strL, z, z2);
        }
        return i == 2 ? new ajg(activity, strL, z, z2) : new wuc(activity, strL, z, z2);
    }

    public void o(String str, ValueCallback valueCallback) {
        a7b.f(TAG, "evaluteJs: " + k99.a(str));
        this.a.evaluateJavascript(str, valueCallback);
    }

    public void p() {
        this.f19283c.h();
    }

    public String q() {
        lmk lmkVarK = this.f19283c.k();
        return lmkVarK != null ? lmkVarK.f() : "";
    }

    public Handler r() {
        return this.f;
    }

    public use s() {
        return this.f19284e;
    }

    public WebView t() {
        return this.a;
    }

    public void u(String str) {
        a7b.f(TAG, "go---url: " + k99.a(str));
        this.f19283c.s(str);
    }

    public void v() {
        a7b.f(TAG, Constants.JsbConstants.METHOD_GO_BACK);
        this.f19283c.d();
    }

    public void w() {
        a7b.f(TAG, "goForword");
        this.f19283c.i();
    }

    public final class c extends WebViewClient {
        public static final int ERROR_INVALID_URL = -100;

        public c() {
        }

        public final void a(WebView webView, String str, int i, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceivedError---failingUrl: ");
            sb.append(str);
            sb.append(",url: ");
            sb.append(k99.a(webView.getUrl()));
            sb.append(",originalUrl: ");
            sb.append(k99.a(webView.getOriginalUrl()));
            z62.this.f19283c.x(webView, str, i, str2);
        }

        public final boolean b(String str, WebView webView, boolean z) {
            boolean zB = z62.this.b.b(z62.this.a, str);
            a7b.f(z62.TAG, "canHandle: " + zB);
            if (zB) {
                return true;
            }
            return z62.this.f19283c.E(str, webView, z);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            StringBuilder sb = new StringBuilder();
            sb.append("onPageFinished---url: ");
            sb.append(k99.a(str));
            a7b.f(z62.TAG, "onPageFinished");
            z62.this.f19283c.u(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            StringBuilder sb = new StringBuilder();
            sb.append("onPageStarted---url: ");
            sb.append(k99.a(str));
            z62.this.f19283c.v(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            a(webView, str2, i, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            StringBuilder sb = new StringBuilder();
            sb.append("onReceivedHttpError---url: ");
            sb.append(webView.getUrl());
            sb.append(",requestUrl: ");
            sb.append(webResourceRequest.getUrl());
            sb.append(",originalUrl: ");
            sb.append(webView.getOriginalUrl());
            z62.this.f19283c.y(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceivedSslError---error: ");
            sb.append(sslError.toString());
            z62.this.f19283c.z(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            a7b.b(z62.TAG, "onRenderProcessGone---Render process gone: didCrash=" + renderProcessGoneDetail.didCrash() + ", rendererPriorityAtExit=" + renderProcessGoneDetail.rendererPriorityAtExit());
            return true;
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String string = webResourceRequest.getUrl().toString();
            a7b.f(z62.TAG, "shouldInterceptRequest---url: " + string);
            if (string.startsWith(z62.RES_PREFIX)) {
                try {
                    Uri uri = Uri.parse(string.substring(17));
                    return new WebResourceResponse(webView.getContext().getContentResolver().getType(uri), "UTF-8", webView.getContext().getContentResolver().openInputStream(uri));
                } catch (Exception e2) {
                    a7b.c(z62.TAG, "shouldInterceptRequest error.", e2);
                }
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            a7b.f(z62.TAG, "shouldOverrideUrlLoading---url: " + k99.a(webResourceRequest.getUrl().toString()));
            StringBuilder sb = new StringBuilder();
            sb.append("shouldOverrideUrlLoading---isRedirect: ");
            sb.append(webResourceRequest.isRedirect());
            return b(webResourceRequest.getUrl().toString(), webView, webResourceRequest.isRedirect());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            a(webView, webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("shouldOverrideUrlLoading---url: ");
            sb.append(k99.a(str));
            return b(str, webView, false);
        }
    }

    public z62(b bVar) {
        this.f = new Handler(Looper.getMainLooper());
        this.g = 10;
        this.f19285j = new a();
        this.f19286l = new c();
        this.f19284e = bVar.v == null ? n(bVar.u, bVar.b, bVar.f19287c, bVar.x, bVar.y) : bVar.v;
        bVar.a.addView(this.f19284e.k());
        this.a = this.f19284e.l();
        this.d = new JsRegistry(this);
        this.h = new JsScheduler(this, m, f19282n, bVar.r);
        this.f19283c = new umk(this, j(bVar), bVar.t != 0 ? bVar.t : 10);
        this.b = new jmk(bVar.q);
        this.f19283c.addOnPageLoadListener(this.f19284e);
        kwa.c(((ComponentActivity) bVar.b).getLifecycle(), new BrowserLifeCycle(this.a, this.f, bVar.o));
        this.i = new UiStatusObserver(bVar.b, this.a);
        if (bVar.s != null) {
            this.f19283c.addOnPageLoadListener(bVar.s);
        }
        b.l(bVar);
        this.d.registerJsInterface(this.h);
        O(this.a, bVar);
        if (qe0.E()) {
            return;
        }
        H(this.a);
    }
}
