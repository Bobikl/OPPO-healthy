package com.oplus.aiunit.vision;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.heytap.health.watchface.R$id;

/* JADX INFO: loaded from: classes19.dex */
public class j72 extends use {
    public WebView g;
    public FrameLayout h;

    public j72(Activity activity, int i, String str) {
        super(activity, i, str);
        this.g = (WebView) h(R$id.ext_webview);
        this.h = (FrameLayout) h(R$id.error_view);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void c(z62 z62Var, String str, int i, String str2) {
        View viewA;
        super.c(z62Var, str, i, str2);
        String str3 = "onReceivedError---getUrl: " + l().getUrl() + ", failUrl: " + str + ",errorCode: " + i + ",description: " + str2;
        ltl.a("BrowserFragmentPresentation", str3);
        ltl.f("BrowserFragmentPresentation", str3);
        if (URLUtil.isNetworkUrl(str) && (viewA = op6.a(z62Var, i, str)) != null) {
            this.h.removeAllViews();
            this.h.addView(viewA);
            this.h.setVisibility(0);
            this.g.setVisibility(4);
        }
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void e(z62 z62Var, String str) {
        super.e(z62Var, str);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void f(z62 z62Var, String str, Bitmap bitmap) {
        super.f(z62Var, str, bitmap);
        r();
        this.g.setVisibility(0);
    }

    @Override // com.oplus.aiunit.vision.use
    public WebView l() {
        return this.g;
    }

    @Override // com.oplus.aiunit.vision.use
    public void q(String str) {
    }

    public final void r() {
        this.h.removeAllViews();
        this.h.setVisibility(8);
    }
}
