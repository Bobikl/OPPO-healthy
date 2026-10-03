package com.oplus.web.container.engine.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.oplus.aiunit.vision.bh4;
import com.oplus.aiunit.vision.d1a;
import com.oplus.aiunit.vision.dsl;
import com.oplus.aiunit.vision.l2a;
import com.oplus.aiunit.vision.n2a;
import com.oplus.aiunit.vision.q5f;
import com.oplus.aiunit.vision.s5f;
import com.oplus.aiunit.vision.tfg;
import com.oplus.aiunit.vision.ws9;
import com.oplus.web.container.engine.config.IWebViewSettings;
import com.oplus.webcontainer.lib_biz_webview_engine.R$string;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SystemWebViewEngine {
    public boolean a;

    public class a implements l2a {
        public final ConcurrentHashMap<String, ws9> a = new ConcurrentHashMap<>();
        public final s5f b;
        public final q5f c;
        public final /* synthetic */ WebView d;
        public final /* synthetic */ Context e;

        public a(WebView webView, Context context) {
            this.d = webView;
            this.e = context;
            s5f s5fVar = new s5f(this, SystemWebViewEngine.this.a);
            this.b = s5fVar;
            q5f q5fVar = new q5f(this);
            this.c = q5fVar;
            webView.setWebViewClient(s5fVar);
            webView.setWebChromeClient(q5fVar);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void a(Bundle bundle) {
            WebView webView = this.d;
            if (webView != null) {
                webView.restoreState(bundle);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void addJavascriptInterface(Object obj, String str) {
            WebView webView = this.d;
            if (webView != null) {
                webView.addJavascriptInterface(obj, str);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void b(String str, Map<String, String> map) {
            if (!tfg.e(str)) {
                Toast.makeText(this.e, R$string.web_container_sdk_engine_link_warn_v2, 1).show();
                SystemWebViewEngine.this.l(this.e);
                return;
            }
            WebView webView = this.d;
            if (webView != null) {
                webView.loadUrl(str, map);
                JSHookAop.loadUrl(webView, str, map);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public boolean c() {
            WebView webView = this.d;
            if (webView != null) {
                return webView.canGoForward();
            }
            return false;
        }

        @Override // com.oplus.aiunit.vision.l2a
        public boolean canGoBack() {
            WebView webView = this.d;
            if (webView != null) {
                return webView.canGoBack();
            }
            return false;
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void d(Bundle bundle) {
            WebView webView = this.d;
            if (webView != null) {
                webView.saveState(bundle);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void destroy() {
            WebView webView = this.d;
            if (webView != null) {
                webView.destroy();
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void e(String str, d1a<String> d1aVar) {
            bh4 bh4Var = d1aVar != null ? new bh4(d1aVar) : null;
            WebView webView = this.d;
            if (webView != null) {
                webView.evaluateJavascript(str, bh4Var);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void f(n2a n2aVar) {
            this.b.g(n2aVar);
            this.c.i(n2aVar);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void g(ws9 ws9Var) {
            this.a.put(o("", ws9Var.getJsApiProduct(), ws9Var.getJsApiMethod()), ws9Var);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public Context getContext() {
            WebView webView = this.d;
            if (webView != null) {
                return webView.getContext();
            }
            return null;
        }

        @Override // com.oplus.aiunit.vision.l2a
        public IWebViewSettings getSettings() {
            return SystemWebViewEngine.this.i(this.d, this);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public String getUrl() {
            WebView webView = this.d;
            return webView != null ? webView.getUrl() : "";
        }

        @Override // com.oplus.aiunit.vision.l2a
        public View getWebView() {
            return this.d;
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void goBack() {
            WebView webView = this.d;
            if (webView != null) {
                webView.goBack();
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void h(Object obj) {
            if (obj instanceof WebChromeClient) {
                this.c.e((WebChromeClient) obj);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void i(Object obj) {
            if (obj instanceof WebViewClient) {
                this.b.b((WebViewClient) obj);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void j() {
            WebView webView = this.d;
            if (webView != null) {
                webView.goForward();
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void k() {
            WebView webView = this.d;
            if (webView != null) {
                webView.stopLoading();
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void l(String str) {
            WebView webView = this.d;
            if (webView != null) {
                webView.removeJavascriptInterface(str);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void m(String str) {
            if (!tfg.e(str)) {
                Toast.makeText(this.e, R$string.web_container_sdk_engine_link_warn_v2, 1).show();
                SystemWebViewEngine.this.l(this.e);
                return;
            }
            WebView webView = this.d;
            if (webView != null) {
                webView.loadUrl(str);
                JSHookAop.loadUrl(webView, str);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public ws9 n(String str, String str2, String str3) {
            ws9 ws9Var = this.a.get(o(str, str2, str3));
            return (ws9Var != null || str == null) ? ws9Var : this.a.get(o(null, str2, str3));
        }

        public final String o(String str, String str2, String str3) {
            return TextUtils.isEmpty(str) ? String.format("%s-%s", str2, str3) : String.format("%s-%s-%s", str, str2, str3);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void onDestroy() {
            this.b.e();
            this.c.h();
            WebView webView = this.d;
            if (webView != null) {
                webView.destroy();
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void onPause() {
            WebView webView = this.d;
            if (webView != null) {
                webView.onPause();
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void onResume() {
            WebView webView = this.d;
            if (webView != null) {
                webView.onResume();
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void reload() {
            WebView webView = this.d;
            if (webView != null) {
                webView.reload();
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void setBackgroundColor(int i) {
            WebView webView = this.d;
            if (webView != null) {
                webView.setBackgroundColor(i);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void setForceDarkAllowed(boolean z) {
            WebView webView = this.d;
            if (webView != null) {
                webView.setForceDarkAllowed(z);
            }
        }
    }

    public class b implements IWebViewSettings {
        public final /* synthetic */ WebView a;
        public final /* synthetic */ String b;

        public b(WebView webView, String str) {
            this.a = webView;
            this.b = str;
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void a(boolean z) {
            this.a.getSettings().setUseWideViewPort(true);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void b(IWebViewSettings.ZoomDensity zoomDensity) {
            this.a.getSettings().setDefaultZoom(SystemWebViewEngine.this.g(zoomDensity));
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void c(String str) {
            this.a.getSettings().setUserAgentString(str);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public String d() {
            return this.a.getSettings().getUserAgentString();
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void e(IWebViewSettings.LayoutAlgorithm layoutAlgorithm) {
            this.a.getSettings().setLayoutAlgorithm(SystemWebViewEngine.this.f(layoutAlgorithm));
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void f(int i) {
            this.a.getSettings().setMixedContentMode(i);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void g(boolean z) {
            this.a.getSettings().setAllowFileAccessFromFileURLs(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void h(boolean z) {
            this.a.getSettings().setSupportMultipleWindows(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void i(boolean z) {
            this.a.getSettings().setLoadsImagesAutomatically(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void j(boolean z) {
            this.a.getSettings().setSaveFormData(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void k(String str) {
            if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(str)) {
                this.a.getSettings().setDatabasePath(str);
                return;
            }
            String str2 = str + File.separator + this.b;
            new File(str2).mkdirs();
            this.a.getSettings().setDatabasePath(str2);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void l(boolean z) {
            this.a.getSettings().setBlockNetworkLoads(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void m(boolean z) {
            this.a.getSettings().setDatabaseEnabled(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void n(boolean z) {
            this.a.getSettings().setAllowUniversalAccessFromFileURLs(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void o(int i) {
            this.a.getSettings().setTextZoom(i);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void p(boolean z) {
            this.a.getSettings().setBuiltInZoomControls(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void q(boolean z) {
            this.a.getSettings().setDomStorageEnabled(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void r(boolean z) {
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void removeAllViews() {
            this.a.removeAllViews();
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void s(boolean z) {
            this.a.getSettings().setAllowContentAccess(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void setForceDarkAllowed(boolean z) {
            this.a.setForceDarkAllowed(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void t() {
            this.a.clearHistory();
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void u(boolean z) {
            this.a.getSettings().setSupportZoom(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void v(boolean z) {
            this.a.getSettings().setJavaScriptEnabled(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void w(boolean z) {
            this.a.getSettings().setAllowFileAccess(z);
        }

        @Override // com.oplus.web.container.engine.config.IWebViewSettings
        public void x(boolean z) {
            this.a.getSettings().setLoadWithOverviewMode(z);
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[IWebViewSettings.ZoomDensity.values().length];
            b = iArr;
            try {
                iArr[IWebViewSettings.ZoomDensity.FAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[IWebViewSettings.ZoomDensity.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[IWebViewSettings.ZoomDensity.CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[IWebViewSettings.LayoutAlgorithm.values().length];
            a = iArr2;
            try {
                iArr2[IWebViewSettings.LayoutAlgorithm.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[IWebViewSettings.LayoutAlgorithm.SINGLE_COLUMN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IWebViewSettings.LayoutAlgorithm.NARROW_COLUMNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IWebViewSettings.LayoutAlgorithm.TEXT_AUTOSIZING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public SystemWebViewEngine(boolean z) {
        this.a = z;
    }

    public final WebSettings.LayoutAlgorithm f(IWebViewSettings.LayoutAlgorithm layoutAlgorithm) {
        int i = c.a[layoutAlgorithm.ordinal()];
        if (i == 1) {
            return WebSettings.LayoutAlgorithm.NORMAL;
        }
        if (i == 2) {
            return WebSettings.LayoutAlgorithm.SINGLE_COLUMN;
        }
        if (i != 3) {
            return i != 4 ? WebSettings.LayoutAlgorithm.NORMAL : WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING;
        }
        return WebSettings.LayoutAlgorithm.NARROW_COLUMNS;
    }

    public final WebSettings.ZoomDensity g(IWebViewSettings.ZoomDensity zoomDensity) {
        int i = c.b[zoomDensity.ordinal()];
        if (i != 1) {
            return i != 2 ? WebSettings.ZoomDensity.CLOSE : WebSettings.ZoomDensity.MEDIUM;
        }
        return WebSettings.ZoomDensity.FAR;
    }

    public final void h(LifecycleOwner lifecycleOwner, final l2a l2aVar) {
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.oplus.web.container.engine.impl.SystemWebViewEngine.2
            public void onCreate(@NonNull LifecycleOwner lifecycleOwner2) {
            }

            public void onDestroy(@NonNull LifecycleOwner lifecycleOwner2) {
                l2a l2aVar2 = l2aVar;
                if (l2aVar2 != null) {
                    l2aVar2.onDestroy();
                }
            }

            public void onPause(@NonNull LifecycleOwner lifecycleOwner2) {
                l2a l2aVar2 = l2aVar;
                if (l2aVar2 != null) {
                    l2aVar2.onPause();
                }
            }

            public void onResume(@NonNull LifecycleOwner lifecycleOwner2) {
                l2a l2aVar2 = l2aVar;
                if (l2aVar2 != null) {
                    l2aVar2.onResume();
                }
            }

            public void onStart(@NonNull LifecycleOwner lifecycleOwner2) {
            }

            public void onStop(@NonNull LifecycleOwner lifecycleOwner2) {
            }
        });
    }

    public final IWebViewSettings i(WebView webView, l2a l2aVar) {
        return new b(webView, m(webView.getContext()));
    }

    @Nullable
    public final l2a j(WebView webView, Context context) {
        return new a(webView, context);
    }

    public l2a k(Context context, LifecycleOwner lifecycleOwner) {
        String strM = m(context);
        if (!TextUtils.isEmpty(strM)) {
            try {
                WebView.setDataDirectorySuffix(strM);
            } catch (Exception unused) {
            }
        }
        dsl.d(context);
        l2a l2aVarJ = j(new WebView(context), context);
        h(lifecycleOwner, l2aVarJ);
        return l2aVarJ;
    }

    public final void l(Context context) {
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public final String m(Context context) {
        return Application.getProcessName();
    }

    public SystemWebViewEngine() {
        this.a = false;
    }
}
