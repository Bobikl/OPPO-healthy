package com.oplus.aiunit.vision;

import com.unionpay.WebViewJavascriptBridge;

/* JADX INFO: loaded from: classes10.dex */
public final class mdm implements rdm {
    public final String a;
    public final /* synthetic */ WebViewJavascriptBridge b;

    public mdm(WebViewJavascriptBridge webViewJavascriptBridge, String str) {
        this.b = webViewJavascriptBridge;
        this.a = str;
    }

    @Override // com.oplus.aiunit.vision.rdm
    public final void a(String str) {
        this.b._callbackJs(this.a, str);
    }
}
