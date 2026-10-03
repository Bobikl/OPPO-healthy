package com.oplus.aiunit.vision;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.heytap.health.core.webservice.ExtWebView;
import com.heytap.health.operation.R$id;

/* JADX INFO: loaded from: classes17.dex */
public class k72 extends use {
    public String g;
    public WebView h;
    public FrameLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f13180j;

    public k72(Activity activity, int i, String str, boolean z) {
        super(activity, i, str);
        this.g = "BrowserFragmentPresentation";
        RelativeLayout relativeLayout = (RelativeLayout) h(R$id.layout_root);
        if (z) {
            this.h = apl.INSTANCE.e(activity);
        } else {
            this.h = new ExtWebView(activity);
        }
        this.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.addView(this.h, 0);
        this.i = (FrameLayout) h(R$id.error_view);
        this.f13180j = h(R$id.layout_loading);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void c(z62 z62Var, String str, int i, String str2) {
        View viewA;
        super.c(z62Var, str, i, str2);
        a7b.f(this.g, "onReceivedError---failUrl: " + str + ",errorCode: " + i);
        if (this.i.getVisibility() == 0 || (viewA = op6.a(z62Var, i, str)) == null) {
            return;
        }
        this.f13180j.setVisibility(8);
        this.i.addView(viewA);
        this.i.setVisibility(0);
        this.h.setVisibility(4);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void d(z62 z62Var) {
        super.d(z62Var);
        r();
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void e(z62 z62Var, String str) {
        super.e(z62Var, str);
        a7b.f(this.g, "onPageFinished");
        this.f13180j.setVisibility(8);
        if (this.i.getVisibility() == 0) {
            return;
        }
        r();
        this.h.setVisibility(0);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void f(z62 z62Var, String str, Bitmap bitmap) {
        super.f(z62Var, str, bitmap);
        this.f13180j.setVisibility(0);
    }

    @Override // com.oplus.aiunit.vision.use
    /* JADX INFO: renamed from: l */
    public WebView getWebView() {
        return this.h;
    }

    @Override // com.oplus.aiunit.vision.use
    public void q(String str) {
    }

    public final void r() {
        this.i.removeAllViews();
        this.i.setVisibility(8);
    }
}
