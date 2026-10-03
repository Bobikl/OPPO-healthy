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
import com.oplus.aiunit.vision.e1a;
import com.oplus.aiunit.vision.g1a;
import com.oplus.aiunit.vision.lg4;
import com.oplus.aiunit.vision.qr9;
import com.oplus.aiunit.vision.wz9;
import com.oplus.web.container.engine.config.IWebViewSettings;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class CustomWebViewEngine {

    public class a implements e1a {
        public final /* synthetic */ WebView a;

        public a(WebView webView) {
            this.a = webView;
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void a(Bundle bundle) {
            this.a.restoreState(bundle);
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void addJavascriptInterface(Object obj, String str) {
            this.a.addJavascriptInterface(obj, str);
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void b(String str, Map<String, String> map) {
            WebView webView = this.a;
            webView.loadUrl(str, map);
            JSHookAop.loadUrl(webView, str, map);
        }

        @Override // com.oplus.aiunit.vision.e1a
        public boolean c() {
            return this.a.canGoForward();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public boolean canGoBack() {
            return this.a.canGoBack();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void d(Bundle bundle) {
            this.a.saveState(bundle);
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void destroy() {
            this.a.destroy();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void e(String str, wz9<String> wz9Var) {
            Objects.requireNonNull(wz9Var);
            this.a.evaluateJavascript(str, new lg4(wz9Var));
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void f(g1a g1aVar) {
            super.f(g1aVar);
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void g(qr9 qr9Var) {
        }

        @Override // com.oplus.aiunit.vision.e1a
        public Context getContext() {
            return null;
        }

        @Override // com.oplus.aiunit.vision.e1a
        public IWebViewSettings getSettings() {
            return null;
        }

        @Override // com.oplus.aiunit.vision.e1a
        public String getUrl() {
            return this.a.getUrl();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public View getWebView() {
            return super.getWebView();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void goBack() {
            this.a.goBack();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void h(Object obj) {
            if (obj instanceof WebChromeClient) {
                this.a.setWebChromeClient((WebChromeClient) obj);
            }
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void i(Object obj) {
            if (obj instanceof WebViewClient) {
                this.a.setWebViewClient((WebViewClient) obj);
            }
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void j() {
            this.a.goForward();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void k() {
            this.a.stopLoading();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void l(String str) {
            this.a.removeJavascriptInterface(str);
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void m(String str) {
            WebView webView = this.a;
            webView.loadUrl(str);
            JSHookAop.loadUrl(webView, str);
        }

        @Override // com.oplus.aiunit.vision.e1a
        public qr9 n(String str, String str2, String str3) {
            return null;
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void onDestroy() {
            this.a.destroy();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void onPause() {
            this.a.onPause();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void onResume() {
            this.a.onResume();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void reload() {
            this.a.reload();
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void setBackgroundColor(int i) {
            super.setBackgroundColor(i);
        }

        @Override // com.oplus.aiunit.vision.e1a
        public void setForceDarkAllowed(boolean z) {
        }
    }

    public final void a(LifecycleOwner lifecycleOwner, final e1a e1aVar) {
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.oplus.web.container.engine.impl.CustomWebViewEngine.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(@NonNull LifecycleOwner lifecycleOwner2) {
                super.onDestroy(lifecycleOwner2);
                e1aVar.onDestroy();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(@NonNull LifecycleOwner lifecycleOwner2) {
                super.onPause(lifecycleOwner2);
                e1aVar.onPause();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(@NonNull LifecycleOwner lifecycleOwner2) {
                super.onResume(lifecycleOwner2);
                e1aVar.onResume();
            }
        });
    }

    @Nullable
    public final e1a b(WebView webView) {
        return new a(webView);
    }

    public e1a c(Context context, LifecycleOwner lifecycleOwner) {
        e1a e1aVarB = b(new WebView(context));
        a(lifecycleOwner, e1aVarB);
        return e1aVarB;
    }
}
