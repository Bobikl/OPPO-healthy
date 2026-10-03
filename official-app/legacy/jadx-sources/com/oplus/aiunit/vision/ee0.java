package com.oplus.aiunit.vision;

import android.app.Activity;
import android.webkit.URLUtil;

/* JADX INFO: loaded from: classes16.dex */
public class ee0 extends b08 {
    public final String p;

    public ee0(Activity activity, String str) {
        super(activity, str);
        this.p = "BrowserFragmentPresentation";
    }

    @Override // com.oplus.aiunit.vision.b08, com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void c(z62 z62Var, String str, int i, String str2) {
        String str3 = "onReceivedError---getUrl: " + l().getUrl() + ", failUrl: " + str + ",errorCode: " + i + ",description: " + str2;
        s5l.a("BrowserFragmentPresentation", str3);
        s5l.e("BrowserFragmentPresentation", str3);
        if (t(str)) {
            y(z62Var, str, i);
        }
    }

    public boolean t(String str) {
        return URLUtil.isNetworkUrl(str) && (l().getUrl() == null || z62.y(str, l().getUrl()));
    }
}
