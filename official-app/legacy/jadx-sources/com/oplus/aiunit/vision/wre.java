package com.oplus.aiunit.vision;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes3.dex */
public class wre {
    public boolean a;
    public boolean b;

    public void a(boolean z) {
        this.b = z;
    }

    public void b(boolean z) {
        this.a = z;
    }

    @JavascriptInterface
    public boolean hasNativeRequest() {
        return this.a;
    }

    @JavascriptInterface
    public boolean isNativePreload() {
        return this.b;
    }
}
