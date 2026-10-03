package com.oppo.store.web.jsbridge.jscalljava2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.oppo.store.web.browser.R;

/* JADX INFO: loaded from: classes9.dex */
public class JsBridgeWebChromeClient extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    @Nullable
    public Bitmap getDefaultVideoPoster() {
        return super.getDefaultVideoPoster() == null ? BitmapFactory.decodeResource(ContextGetterUtils.INSTANCE.getApp().getResources(), R.drawable.activity_bg) : super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        jsPromptResult.confirm();
        JsCallJava.newInstance().call(webView, null, str2);
        return true;
    }
}
