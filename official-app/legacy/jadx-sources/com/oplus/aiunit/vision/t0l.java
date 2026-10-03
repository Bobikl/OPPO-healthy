package com.oplus.aiunit.vision;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public class t0l {
    public WebView a;
    public View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f16840c;

    public View a() {
        return this.b;
    }

    public ViewGroup b() {
        return this.f16840c;
    }

    public WebView c() {
        return this.a;
    }

    public t0l d(View view) {
        this.b = view;
        return this;
    }

    public t0l e(ViewGroup viewGroup) {
        this.f16840c = viewGroup;
        return this;
    }

    public t0l f(WebView webView) {
        this.a = webView;
        return this;
    }
}
