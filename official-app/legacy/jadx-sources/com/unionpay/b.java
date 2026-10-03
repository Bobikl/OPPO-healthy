package com.unionpay;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.oplus.aiunit.vision.f1n;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends WebViewClient {
    public final /* synthetic */ WebViewJavascriptBridge a;

    public b(WebViewJavascriptBridge webViewJavascriptBridge) {
        this.a = webViewJavascriptBridge;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        f1n.b("uppay", "onPageFinished");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f1n.b("uppay", "shouldOverrideUrlLoading：" + str);
        if (this.a.mAllowScheme && !TextUtils.isEmpty(str) && !str.startsWith("http") && !str.startsWith("HTTP")) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                this.a.mContext.startActivity(intent);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public /* synthetic */ b(WebViewJavascriptBridge webViewJavascriptBridge, byte b) {
        this(webViewJavascriptBridge);
    }
}
