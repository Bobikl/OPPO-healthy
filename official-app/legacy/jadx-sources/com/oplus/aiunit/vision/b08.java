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
import com.heytap.health.base.R$id;
import com.heytap.health.core.webservice.BrowserProgressBar;
import com.heytap.health.core.webservice.ExtWebView;
import com.heytap.health.core.webservice.TransparentToolbar;
import com.heytap.health.webservice.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public class b08 extends use {
    public final String g;
    public final WebView h;
    public COUIToolbar i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FrameLayout f9539j;
    public final BrowserProgressBar k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RelativeLayout f9540l;
    public WebChromeClient.CustomViewCallback m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f9541n;
    public final boolean o;

    public b08(Activity activity, String str) {
        this(activity, str, false);
    }

    private boolean t(String str) {
        if (this.f9539j.getVisibility() == 0) {
            return false;
        }
        if (!rpc.c()) {
            return true;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return l().getUrl() == null || z62.y(str, l().getUrl());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(View view) {
        if (l().canGoBack()) {
            l().goBack();
        } else {
            ((AppCompatActivity) i()).finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        if (l().canGoBack()) {
            l().goBack();
        } else {
            ((AppCompatActivity) i()).finish();
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
        y(z62Var, str, i);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void d(z62 z62Var) {
        super.d(z62Var);
        x();
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void e(z62 z62Var, String str) {
        super.e(z62Var, str);
        StringBuilder sb = new StringBuilder();
        sb.append("onPageFinished---url: ");
        sb.append(str);
        if (this.f9539j.getVisibility() == 0) {
            return;
        }
        if (this.o) {
            this.k.e();
            this.k.setProgress(100);
        }
        this.h.setVisibility(0);
        this.k.setVisibility(8);
        this.i.setVisibility(8);
    }

    @Override // com.oplus.aiunit.vision.use, com.oplus.aiunit.vision.hid
    public void f(z62 z62Var, String str, Bitmap bitmap) {
        super.f(z62Var, str, bitmap);
        StringBuilder sb = new StringBuilder();
        sb.append("onPageStart---url: ");
        sb.append(str);
        if (this.o && rpc.c() && this.k.getVisibility() == 4) {
            this.k.d();
        }
        if (this.i.getVisibility() != 8) {
            this.i.setVisibility(0);
        }
        x();
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
            this.f9540l.removeView(this.f9541n);
        }
    }

    @Override // com.oplus.aiunit.vision.use
    public void o(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        ((AppCompatActivity) i()).setRequestedOrientation(0);
        ((AppCompatActivity) i()).getWindow().addFlags(1024);
        this.m = customViewCallback;
        this.f9541n = view;
        if (view != null) {
            this.h.setVisibility(8);
            this.f9540l.addView(this.f9541n);
        }
    }

    @Override // com.oplus.aiunit.vision.use
    public void p(boolean z) {
        if (j() == z) {
            return;
        }
        super.p(z);
        if (!z) {
            this.f9540l.removeView(this.i);
            COUIToolbar cOUIToolbar = (COUIToolbar) h(R$id.lib_base_toolbar);
            this.i = cOUIToolbar;
            cOUIToolbar.setVisibility(0);
            return;
        }
        TransparentToolbar transparentToolbar = new TransparentToolbar(i());
        transparentToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.zz7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.w(view);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ejg.a(i(), 50.0f));
        layoutParams.topMargin = ejg.a(i(), 42.0f);
        transparentToolbar.setTitle(" ");
        ((AppCompatActivity) i()).setSupportActionBar(transparentToolbar);
        ActionBar supportActionBar = ((AppCompatActivity) i()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        this.f9540l.addView(transparentToolbar, layoutParams);
        this.i.setVisibility(8);
        this.i = transparentToolbar;
    }

    @Override // com.oplus.aiunit.vision.use
    public void q(String str) {
        this.i.setTitle(str);
    }

    public final void u(COUIToolbar cOUIToolbar, String str) {
        if (TextUtils.isEmpty(str)) {
            str = " ";
        }
        cOUIToolbar.setTitle(str);
        ((AppCompatActivity) i()).setSupportActionBar(cOUIToolbar);
        ActionBar supportActionBar = ((AppCompatActivity) i()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        cOUIToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.a08
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.v(view);
            }
        });
        cOUIToolbar.setVisibility(8);
    }

    public final void x() {
        if (m()) {
            return;
        }
        this.f9539j.removeAllViews();
        this.f9539j.setVisibility(8);
    }

    public void y(z62 z62Var, String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("showErrorView---failingUrl: ");
        sb.append(str);
        sb.append(",errorCode: ");
        sb.append(i);
        if (t(str)) {
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
                this.f9539j.addView(viewA);
                this.f9539j.setVisibility(0);
                this.h.setVisibility(4);
                this.i.setVisibility(0);
                this.k.setVisibility(this.o ? 4 : 8);
            }
        }
    }

    public b08(Activity activity, String str, boolean z) {
        this(activity, str, z, true);
    }

    public b08(Activity activity, String str, boolean z, boolean z2) {
        super(activity, R$layout.lib_core_browser_fullscreen, str);
        this.g = "FullScreenPresentation";
        RelativeLayout relativeLayout = (RelativeLayout) h(com.heytap.health.webservice.R$id.layout_root);
        if (z) {
            this.h = apl.INSTANCE.e(activity);
        } else {
            this.h = new ExtWebView(activity);
        }
        this.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.h.setForceDarkAllowed(false);
        relativeLayout.addView(this.h, 0);
        this.i = (COUIToolbar) h(R$id.lib_base_toolbar);
        this.f9539j = (FrameLayout) h(com.heytap.health.webservice.R$id.error_view);
        BrowserProgressBar browserProgressBar = (BrowserProgressBar) h(com.heytap.health.webservice.R$id.progressbar);
        this.k = browserProgressBar;
        this.o = z2;
        browserProgressBar.setVisibility(z2 ? 4 : 8);
        this.f9540l = relativeLayout;
        u(this.i, str);
    }
}
