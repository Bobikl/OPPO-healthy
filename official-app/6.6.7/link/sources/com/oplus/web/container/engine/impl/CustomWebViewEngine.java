package com.oplus.web.container.engine.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.oplus.aiunit.vision.bh4;
import com.oplus.aiunit.vision.d1a;
import com.oplus.aiunit.vision.l2a;
import com.oplus.aiunit.vision.n2a;
import com.oplus.aiunit.vision.ws9;
import com.oplus.web.container.engine.config.IWebViewSettings;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class CustomWebViewEngine {

    public class a implements l2a {
        public final /* synthetic */ WebView a;

        public a(WebView webView) {
            this.a = webView;
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void a(Bundle bundle) {
            this.a.restoreState(bundle);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void addJavascriptInterface(Object obj, String str) {
            this.a.addJavascriptInterface(obj, str);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void b(String str, Map<String, String> map) {
            WebView webView = this.a;
            webView.loadUrl(str, map);
            JSHookAop.loadUrl(webView, str, map);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public boolean c() {
            return this.a.canGoForward();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public boolean canGoBack() {
            return this.a.canGoBack();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void d(Bundle bundle) {
            this.a.saveState(bundle);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void destroy() {
            this.a.destroy();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void e(String str, d1a<String> d1aVar) {
            Objects.requireNonNull(d1aVar);
            this.a.evaluateJavascript(str, new bh4(d1aVar));
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void f(n2a n2aVar) {
            super.f(n2aVar);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void g(ws9 ws9Var) {
        }

        @Override // com.oplus.aiunit.vision.l2a
        public Context getContext() {
            return null;
        }

        @Override // com.oplus.aiunit.vision.l2a
        public IWebViewSettings getSettings() {
            return null;
        }

        @Override // com.oplus.aiunit.vision.l2a
        public String getUrl() {
            return this.a.getUrl();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public View getWebView() {
            return super.getWebView();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void goBack() {
            this.a.goBack();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void h(Object obj) {
            if (obj instanceof WebChromeClient) {
                this.a.setWebChromeClient((WebChromeClient) obj);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void i(Object obj) {
            if (obj instanceof WebViewClient) {
                this.a.setWebViewClient((WebViewClient) obj);
            }
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void j() {
            this.a.goForward();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void k() {
            this.a.stopLoading();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void l(String str) {
            this.a.removeJavascriptInterface(str);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void m(String str) {
            WebView webView = this.a;
            webView.loadUrl(str);
            JSHookAop.loadUrl(webView, str);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public ws9 n(String str, String str2, String str3) {
            return null;
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void onDestroy() {
            this.a.destroy();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void onPause() {
            this.a.onPause();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void onResume() {
            this.a.onResume();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void reload() {
            this.a.reload();
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void setBackgroundColor(int i) {
            super.setBackgroundColor(i);
        }

        @Override // com.oplus.aiunit.vision.l2a
        public void setForceDarkAllowed(boolean z) {
        }
    }

    public final void a(LifecycleOwner lifecycleOwner, final l2a l2aVar) {
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.oplus.web.container.engine.impl.CustomWebViewEngine.2
            public void onDestroy(@NonNull LifecycleOwner lifecycleOwner2) {
                super.onDestroy(lifecycleOwner2);
                l2aVar.onDestroy();
            }

            public void onPause(@NonNull LifecycleOwner lifecycleOwner2) {
                super.onPause(lifecycleOwner2);
                l2aVar.onPause();
            }

            public void onResume(@NonNull LifecycleOwner lifecycleOwner2) {
                super.onResume(lifecycleOwner2);
                l2aVar.onResume();
            }
        });
    }

    @Nullable
    public final l2a b(WebView webView) {
        return new a(webView);
    }

    public l2a c(Context context, LifecycleOwner lifecycleOwner) {
        l2a l2aVarB = b(new WebView(context));
        a(lifecycleOwner, l2aVarB);
        return l2aVarB;
    }
}
