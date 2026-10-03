package com.oplus.aiunit.vision;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.core.webservice.BrowserProgressBar;
import com.heytap.health.core.webservice.ExtWebView;
import com.heytap.health.core.webservice.TransparentToolbar;
import com.heytap.health.webservice.R$id;
import com.heytap.health.webservice.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public class wuc extends use {
    public final String g;
    public WebView h;
    public COUIToolbar i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FrameLayout f18407j;
    public BrowserProgressBar k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FrameLayout f18408l;
    public WebChromeClient.CustomViewCallback m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f18409n;
    public View o;
    public z62 p;
    public final boolean q;

    public wuc(Activity activity, String str) {
        this(activity, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        z62 z62Var = this.p;
        if (z62Var != null && z62Var.k()) {
            a7b.f("NormalPresentation", "click back, browser go back");
            this.p.v();
        } else if (l().canGoBack()) {
            a7b.f("NormalPresentation", "click back, webview go back");
            l().goBack();
        } else {
            a7b.f("NormalPresentation", "click back, activity go back");
            ((AppCompatActivity) i()).finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(View view) {
        if (l().canGoBack()) {
            l().goBack();
        } else {
            ((AppCompatActivity) i()).finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        this.k.setVisibility(8);
    }

    public final void A(z62 z62Var, String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("showErrorView---failingUrl: ");
        sb.append(str);
        sb.append(",errorCode: ");
        sb.append(i);
        if (u(str)) {
            if (!rpc.c()) {
                i = -1;
            }
            View viewA = op6.a(z62Var, i, str);
            if (viewA != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("setErrorViewVisible---failingUrl: ");
                sb2.append(str);
                sb2.append(",errorCode: ");
                sb2.append(i);
                this.f18407j.addView(viewA);
                this.f18407j.setVisibility(0);
                this.h.setVisibility(4);
                if (this.q) {
                    this.k.e();
                    this.k.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.tuc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.i.y();
                        }
                    }, 300L);
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void a(z62 z62Var, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onLoadProgress---newProgress: ");
        sb.append(i);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void b(z62 z62Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("onReceivedTitle---title: ");
        sb.append(str);
        if (g(str)) {
            return;
        }
        this.i.setTitle(str);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void c(z62 z62Var, String str, int i, String str2) {
        super.c(z62Var, str, i, str2);
        StringBuilder sb = new StringBuilder();
        sb.append("onReceivedError---getUrl: ");
        sb.append(l().getUrl());
        sb.append(", failUrl: ");
        sb.append(str);
        sb.append(",errorCode: ");
        sb.append(i);
        sb.append(",description: ");
        sb.append(str2);
        A(z62Var, str, i);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void d(z62 z62Var) {
        super.d(z62Var);
        z();
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void e(z62 z62Var, String str) {
        super.e(z62Var, str);
        StringBuilder sb = new StringBuilder();
        sb.append("onPageFinished---url: ");
        sb.append(str);
        if (this.f18407j.getVisibility() != 0) {
            this.h.setVisibility(0);
        }
        if (this.q) {
            this.k.e();
            this.k.setProgress(100);
            this.k.setVisibility(8);
        }
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void f(z62 z62Var, String str, Bitmap bitmap) {
        super.f(z62Var, str, bitmap);
        this.p = z62Var;
        StringBuilder sb = new StringBuilder();
        sb.append("onPageStart---url: ");
        sb.append(str);
        if (this.q && rpc.c()) {
            this.k.d();
        }
        z();
    }

    @Override // com.oplus.aiunit.vision.use
    public WebView l() {
        cpl.b(this.h);
        return this.h;
    }

    @Override // com.oplus.aiunit.vision.use
    public void n() {
        ((AppCompatActivity) i()).setRequestedOrientation(1);
        ((AppCompatActivity) i()).getWindow().clearFlags(1024);
        WebChromeClient.CustomViewCallback customViewCallback = this.m;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.h.setVisibility(0);
            this.i.setVisibility(0);
            this.f18408l.removeAllViews();
            this.f18408l.setVisibility(8);
        }
    }

    @Override // com.oplus.aiunit.vision.use
    public void o(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        ((AppCompatActivity) i()).setRequestedOrientation(0);
        ((AppCompatActivity) i()).getWindow().addFlags(1024);
        this.m = customViewCallback;
        this.f18409n = view;
        if (view != null) {
            this.h.setVisibility(8);
            this.i.setVisibility(4);
            this.f18408l.addView(this.f18409n);
            this.f18408l.setVisibility(0);
        }
    }

    @Override // com.oplus.aiunit.vision.use
    public void p(boolean z) {
        if (j() == z) {
            return;
        }
        super.p(z);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
        if (!z) {
            layoutParams.addRule(3, R$id.toolbar);
            this.h.setLayoutParams(layoutParams);
            ((RelativeLayout) h(R$id.layout_root)).removeView(this.i);
            this.i = (COUIToolbar) h(com.heytap.health.base.R$id.lib_base_toolbar);
            return;
        }
        TransparentToolbar transparentToolbar = new TransparentToolbar(i());
        transparentToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.vuc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.x(view);
            }
        });
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, ejg.a(i(), 50.0f));
        layoutParams2.topMargin = ejg.a(i(), 42.0f);
        transparentToolbar.setTitle(" ");
        ((AppCompatActivity) i()).setSupportActionBar(transparentToolbar);
        ActionBar supportActionBar = ((AppCompatActivity) i()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ((RelativeLayout) h(R$id.layout_root)).addView(transparentToolbar, layoutParams2);
        layoutParams.removeRule(3);
        this.h.setLayoutParams(layoutParams);
        this.i = transparentToolbar;
    }

    @Override // com.oplus.aiunit.vision.use
    public void q(String str) {
        this.i.setTitle(str);
    }

    public final boolean u(String str) {
        if (this.f18407j.getVisibility() == 0) {
            return false;
        }
        if (rpc.c()) {
            return URLUtil.isNetworkUrl(str) && (l().getUrl() == null || z62.y(str, l().getUrl()));
        }
        return true;
    }

    public final void v(COUIToolbar cOUIToolbar, String str, boolean z) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin += ejg.h();
        this.o.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(str)) {
            str = " ";
        }
        cOUIToolbar.setTitle(str);
        cOUIToolbar.setPadding(cOUIToolbar.getPaddingLeft(), 10, cOUIToolbar.getPaddingRight(), cOUIToolbar.getPaddingBottom());
        ((AppCompatActivity) i()).setSupportActionBar(cOUIToolbar);
        ActionBar supportActionBar = ((AppCompatActivity) i()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(z);
        }
        cOUIToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.uuc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.w(view);
            }
        });
    }

    public final void z() {
        if (m()) {
            return;
        }
        this.f18407j.removeAllViews();
        this.f18407j.setVisibility(8);
    }

    public wuc(Activity activity, String str, boolean z) {
        this(activity, str, z, true);
    }

    public wuc(Activity activity, String str, boolean z, boolean z2) {
        super(activity, R$layout.lib_core_browser_normal, str);
        this.g = "NormalPresentation";
        int i = R$id.toolbar;
        this.o = h(i);
        RelativeLayout relativeLayout = (RelativeLayout) h(R$id.layout_root);
        if (z) {
            this.h = apl.INSTANCE.e(activity);
        } else {
            this.h = new ExtWebView(activity);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, i);
        this.h.setLayoutParams(layoutParams);
        relativeLayout.addView(this.h, 1);
        this.i = (COUIToolbar) h(com.heytap.health.base.R$id.lib_base_toolbar);
        this.f18407j = (FrameLayout) h(R$id.error_view);
        BrowserProgressBar browserProgressBar = (BrowserProgressBar) h(R$id.progressbar);
        this.k = browserProgressBar;
        this.q = z2;
        if (!z2) {
            browserProgressBar.setVisibility(8);
        }
        this.f18408l = (FrameLayout) h(R$id.video_view);
        v(this.i, str, true);
    }
}
