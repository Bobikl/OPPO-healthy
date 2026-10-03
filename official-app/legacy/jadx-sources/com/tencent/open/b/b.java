package com.tencent.open.b;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.oplus.aiunit.vision.q8g;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class b extends WebView {
    public b(Context context) {
        super(context);
        a();
    }

    public void a() {
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        q8g.i("openSDK_LOG.OpenWebView", "removeJSInterface");
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            getSettings().setBuiltInZoomControls(true);
            getSettings().setDisplayZoomControls(false);
            setVisibility(8);
            q8g.i("openSDK_LOG.OpenWebView", "-->OpenWebView.destroy setBuiltInZoomControls");
        } catch (Exception e2) {
            q8g.g("openSDK_LOG.OpenWebView", "-->OpenWebView.destroy setBuiltInZoomControls", e2);
        }
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebSettings settings = getSettings();
        if (settings == null) {
            return;
        }
        settings.setSavePassword(false);
        try {
            Method method = settings.getClass().getMethod("removeJavascriptInterface", String.class);
            if (method != null) {
                method.invoke(this, "searchBoxJavaBridge_");
                method.invoke(this, "accessibility");
                method.invoke(this, "accessibilityTraversal");
                q8g.i("openSDK_LOG.OpenWebView", "remove js interface");
            }
        } catch (Exception e2) {
            q8g.f("openSDK_LOG.OpenWebView", "remove js interface.e:" + e2.toString());
        }
    }
}
