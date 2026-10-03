package com.oplus.aiunit.vision;

import com.unionpay.WebViewJavascriptBridge;

/* JADX INFO: loaded from: classes10.dex */
public final class b9n implements Runnable {
    public final /* synthetic */ pdm i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f9650j;
    public final /* synthetic */ rdm k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WebViewJavascriptBridge f9651l;

    public b9n(WebViewJavascriptBridge webViewJavascriptBridge, pdm pdmVar, String str, rdm rdmVar) {
        this.f9651l = webViewJavascriptBridge;
        this.i = pdmVar;
        this.f9650j = str;
        this.k = rdmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pdm pdmVar = this.i;
        if (pdmVar != null) {
            pdmVar.a(this.f9650j, this.k);
        }
    }
}
