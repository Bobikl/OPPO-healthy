package com.heytap.health.core.webservice;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.webservice.R$id;
import com.heytap.health.webservice.R$layout;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.s11;
import com.oplus.aiunit.vision.z62;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseBrowserActivity extends BaseActivity implements s11 {
    public static boolean p = true;
    public z62 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BrowserView f3740n;
    public WebView o;

    static {
        if (WebView.getCurrentWebViewPackage() == null) {
            a7b.b("BaseBrowserActivity", "No WebView installed ");
            p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p7() {
        if (this.m.k()) {
            this.m.v();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.heytap.health.base.base.BaseViewSizeControl
    public boolean F5() {
        return false;
    }

    @Override // android.app.Activity
    public void finish() {
        v4(this);
        super.finish();
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public z62 m7() {
        return this.m;
    }

    public WebView n7() {
        return this.o;
    }

    public void o7(Bundle bundle) {
        if (!p) {
            a7b.b("BaseBrowserActivity", "No WebView installed ");
            finish();
            return;
        }
        WebView.enableSlowWholeDocumentDraw();
        u7();
        setContentView(q7());
        t7(bundle);
        z62 z62VarS7 = s7(this.f3740n);
        this.m = z62VarS7;
        this.o = z62VarS7.t();
        r7(getMUrl());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        m7().D(i, i2, intent);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.k01
            @Override // java.lang.Runnable
            public final void run() {
                this.i.p7();
            }
        });
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m7().C(configuration);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o7(bundle);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.o;
        if (webView != null) {
            webView.destroy();
            this.o = null;
        }
    }

    @LayoutRes
    public int q7() {
        return R$layout.lib_core_browser_layout;
    }

    public void r7(String str) {
        this.m.u(str);
    }

    public abstract z62 s7(BrowserView browserView);

    @Override // com.oplus.aiunit.vision.az0
    public void t3(BaseActivity baseActivity, boolean z, boolean z2) {
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(z ? 9472 : k18.GL_INVALID_ENUM);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        if (E3()) {
            window.setNavigationBarColor(0);
        } else {
            if (ejg.k()) {
                return;
            }
            window.setNavigationBarColor(ContextCompat.getColor(baseActivity, R$color.lib_base_common_background_color));
        }
    }

    public void t7(Bundle bundle) {
        this.f3740n = (BrowserView) findViewById(R$id.browserView);
    }

    public void u7() {
    }

    public void v7() {
        getWindow().getDecorView().setSystemUiVisibility(qe0.y(this) ? k18.GL_INVALID_ENUM : 9216);
        getWindow().setStatusBarColor(0);
    }

    /* JADX INFO: renamed from: w7 */
    public abstract String getMUrl();
}
