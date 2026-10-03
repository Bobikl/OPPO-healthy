package com.heytap.health.wallet.web;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.oplus.aiunit.vision.t6b;

/* JADX INFO: loaded from: classes18.dex */
public class TimeoutCheckWebView extends WebView {

    public static abstract class a extends WebViewClient {
    }

    public TimeoutCheckWebView(Context context) {
        super(context);
    }

    public void a(String str, int i) {
        b(str);
    }

    public final void b(String str) {
        loadUrl(str);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Exception e2) {
            t6b.c(e2.getMessage());
        }
    }

    public TimeoutCheckWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TimeoutCheckWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
