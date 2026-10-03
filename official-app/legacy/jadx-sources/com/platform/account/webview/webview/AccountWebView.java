package com.platform.account.webview.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes9.dex */
public class AccountWebView extends WebView {
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f20260j;

    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    public AccountWebView(Context context) {
        super(context);
        this.i = "";
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f20260j = null;
        this.i = "";
        super.destroy();
    }

    public String getCurShowUrl() {
        return this.i;
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (URLUtil.isNetworkUrl(str)) {
            this.i = str;
        }
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a aVar = this.f20260j;
        if (aVar != null) {
            aVar.a(i, i2, i3, i4);
        }
    }

    public void setOnScrollListener(a aVar) {
        this.f20260j = aVar;
    }

    public AccountWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = "";
    }

    public AccountWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = "";
    }
}
