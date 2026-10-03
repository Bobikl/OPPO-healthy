package com.bytedance.sdk.open.aweme.authorize.ui;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.open.aweme.R$id;
import com.bytedance.sdk.open.aweme.R$layout;
import com.bytedance.sdk.open.aweme.R$string;
import com.bytedance.sdk.open.aweme.authorize.model.Authorization;
import com.oplus.aiunit.vision.bm9;
import com.oplus.aiunit.vision.dlm;
import com.oplus.aiunit.vision.ihm;
import com.oplus.aiunit.vision.re0;
import com.oplus.aiunit.vision.s81;
import com.oplus.aiunit.vision.v81;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseWebAuthorizeActivity extends Activity implements bm9 {
    public static final String WAP_AUTHORIZE_URL = "wap_authorize_url";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WebView f1437l;
    public Authorization.Request m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AlertDialog f1438n;
    public RelativeLayout o;
    public RelativeLayout p;
    public FrameLayout q;
    public int r;
    public boolean s;
    public Context v;
    public ImageView w;
    public int i = -12;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1436j = -13;
    public int k = -15;
    public boolean t = false;
    public boolean u = false;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            BaseWebAuthorizeActivity baseWebAuthorizeActivity = BaseWebAuthorizeActivity.this;
            baseWebAuthorizeActivity.s = false;
            WebView webView2 = baseWebAuthorizeActivity.f1437l;
            if (webView2 == null || webView2.getProgress() != 100) {
                return;
            }
            BaseWebAuthorizeActivity.this.F();
            if (BaseWebAuthorizeActivity.this.r == 0) {
                BaseWebAuthorizeActivity baseWebAuthorizeActivity2 = BaseWebAuthorizeActivity.this;
                if (baseWebAuthorizeActivity2.u) {
                    return;
                }
                dlm.a(baseWebAuthorizeActivity2.f1437l, 0);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            BaseWebAuthorizeActivity baseWebAuthorizeActivity = BaseWebAuthorizeActivity.this;
            if (baseWebAuthorizeActivity.s) {
                return;
            }
            baseWebAuthorizeActivity.r = 0;
            BaseWebAuthorizeActivity baseWebAuthorizeActivity2 = BaseWebAuthorizeActivity.this;
            baseWebAuthorizeActivity2.s = true;
            baseWebAuthorizeActivity2.E();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            BaseWebAuthorizeActivity.this.r = i;
            BaseWebAuthorizeActivity baseWebAuthorizeActivity = BaseWebAuthorizeActivity.this;
            baseWebAuthorizeActivity.C(baseWebAuthorizeActivity.k);
            BaseWebAuthorizeActivity.this.u = true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            BaseWebAuthorizeActivity.this.D(sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!BaseWebAuthorizeActivity.this.u()) {
                BaseWebAuthorizeActivity baseWebAuthorizeActivity = BaseWebAuthorizeActivity.this;
                baseWebAuthorizeActivity.C(baseWebAuthorizeActivity.i);
            } else {
                if (BaseWebAuthorizeActivity.this.p(str)) {
                    return true;
                }
                WebView webView2 = BaseWebAuthorizeActivity.this.f1437l;
                webView2.loadUrl(str);
                JSHookAop.loadUrl(webView2, str);
            }
            return true;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            BaseWebAuthorizeActivity.this.v(-2);
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ SslErrorHandler i;

        public c(SslErrorHandler sslErrorHandler) {
            this.i = sslErrorHandler;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SensorsDataInstrumented
        public void onClick(DialogInterface dialogInterface, int i) {
            BaseWebAuthorizeActivity.this.h(this.i);
            SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public final /* synthetic */ SslErrorHandler i;

        public d(SslErrorHandler sslErrorHandler) {
            this.i = sslErrorHandler;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SensorsDataInstrumented
        public void onClick(DialogInterface dialogInterface, int i) {
            BaseWebAuthorizeActivity.this.h(this.i);
            SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
        }
    }

    public class e implements View.OnClickListener {
        public final /* synthetic */ int i;

        public e(int i) {
            this.i = i;
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            BaseWebAuthorizeActivity.this.v(this.i);
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public boolean A(String str, Authorization.Request request, v81 v81Var) {
        if (v81Var == null || this.v == null || request == null || !v81Var.checkArgs()) {
            return false;
        }
        Bundle bundle = new Bundle();
        v81Var.toBundle(bundle);
        String packageName = this.v.getPackageName();
        String strA = TextUtils.isEmpty(request.callerLocalEntry) ? re0.a(packageName, str) : request.callerLocalEntry;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(packageName, strA));
        intent.putExtras(bundle);
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        try {
            this.v.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void B() {
        RelativeLayout relativeLayout = this.p;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
        }
    }

    public void C(int i) {
        AlertDialog alertDialog = this.f1438n;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (this.f1438n == null) {
                View viewInflate = LayoutInflater.from(this).inflate(R$layout.layout_open_network_error_dialog, (ViewGroup) null, false);
                viewInflate.findViewById(R$id.tv_confirm).setOnClickListener(new e(i));
                this.f1438n = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.Theme.Holo)).setView(viewInflate).setCancelable(false).create();
            }
            if (isFinishing()) {
                return;
            }
            this.f1438n.show();
        }
    }

    public void D(SslErrorHandler sslErrorHandler, SslError sslError) {
        Context context;
        int i;
        try {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this.v).create();
            String string = this.v.getString(R$string.aweme_open_ssl_error);
            int primaryError = sslError.getPrimaryError();
            if (primaryError == 0) {
                context = this.v;
                i = R$string.aweme_open_ssl_notyetvalid;
            } else if (primaryError == 1) {
                context = this.v;
                i = R$string.aweme_open_ssl_expired;
            } else {
                if (primaryError != 2) {
                    if (primaryError == 3) {
                        context = this.v;
                        i = R$string.aweme_open_ssl_untrusted;
                    }
                    String str = string + this.v.getString(R$string.aweme_open_ssl_continue);
                    alertDialogCreate.setTitle(R$string.aweme_open_ssl_warning);
                    alertDialogCreate.setTitle(str);
                    alertDialogCreate.setButton(-1, this.v.getString(R$string.aweme_open_ssl_ok), new c(sslErrorHandler));
                    alertDialogCreate.setButton(-2, this.v.getString(R$string.aweme_open_ssl_cancel), new d(sslErrorHandler));
                    alertDialogCreate.setCanceledOnTouchOutside(false);
                    alertDialogCreate.show();
                }
                context = this.v;
                i = R$string.aweme_open_ssl_mismatched;
            }
            string = context.getString(i);
            String str2 = string + this.v.getString(R$string.aweme_open_ssl_continue);
            alertDialogCreate.setTitle(R$string.aweme_open_ssl_warning);
            alertDialogCreate.setTitle(str2);
            alertDialogCreate.setButton(-1, this.v.getString(R$string.aweme_open_ssl_ok), new c(sslErrorHandler));
            alertDialogCreate.setButton(-2, this.v.getString(R$string.aweme_open_ssl_cancel), new d(sslErrorHandler));
            alertDialogCreate.setCanceledOnTouchOutside(false);
            alertDialogCreate.show();
        } catch (Exception unused) {
            h(sslErrorHandler);
        }
    }

    public void E() {
        dlm.a(this.q, 0);
    }

    public void F() {
        dlm.a(this.q, 8);
    }

    @Override // com.oplus.aiunit.vision.bm9
    public void a(Intent intent) {
    }

    @Override // com.oplus.aiunit.vision.bm9
    public void b(s81 s81Var) {
        if (s81Var instanceof Authorization.Request) {
            Authorization.Request request = (Authorization.Request) s81Var;
            this.m = request;
            request.redirectUri = "https://" + k() + "/oauth/authorize/callback/";
            setRequestedOrientation(-1);
        }
    }

    @Override // com.oplus.aiunit.vision.bm9
    public void c(v81 v81Var) {
    }

    public String g(Authorization.Request request) {
        return ihm.a(this, request, n(), l(), j());
    }

    public void h(SslErrorHandler sslErrorHandler) {
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
        C(this.k);
        this.u = true;
    }

    public void i() {
        this.f1437l.setWebViewClient(new a());
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        try {
            return super.isDestroyed();
        } catch (Throwable unused) {
            return this.t;
        }
    }

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public View m(ViewGroup viewGroup) {
        return LayoutInflater.from(this).inflate(R$layout.layout_open_loading_view, viewGroup, false);
    }

    public abstract String n();

    public abstract boolean o(Intent intent, bm9 bm9Var);

    @Override // android.app.Activity
    public void onBackPressed() {
        w("", -2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.v = this;
        o(getIntent(), this);
        setContentView(R$layout.layout_open_web_authorize);
        s();
        r();
        q();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.t = true;
        WebView webView = this.f1437l;
        if (webView != null) {
            ViewParent parent = webView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f1437l);
            }
            this.f1437l.stopLoading();
            this.f1437l.setWebViewClient(null);
            this.f1437l.removeAllViews();
            this.f1437l.destroy();
        }
    }

    @Override // android.app.Activity
    @SensorsDataInstrumented
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PushAutoTrackHelper.onNewIntent(this, intent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        AlertDialog alertDialog = this.f1438n;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.f1438n.dismiss();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final boolean p(String str) {
        Authorization.Request request;
        String str2;
        int i;
        if (TextUtils.isEmpty(str) || (request = this.m) == null || (str2 = request.redirectUri) == null || !str.startsWith(str2)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("code");
        String queryParameter2 = uri.getQueryParameter("state");
        String queryParameter3 = uri.getQueryParameter("scopes");
        if (!TextUtils.isEmpty(queryParameter)) {
            y(queryParameter, queryParameter2, queryParameter3, 0);
            return true;
        }
        String queryParameter4 = uri.getQueryParameter("errCode");
        if (TextUtils.isEmpty(queryParameter4)) {
            i = -1;
        } else {
            try {
                i = Integer.parseInt(queryParameter4);
            } catch (Exception e2) {
                e2.printStackTrace();
                i = -1;
            }
        }
        w("", i);
        return false;
    }

    public final void q() {
        Authorization.Request request = this.m;
        if (request == null) {
            finish();
            return;
        }
        if (!u()) {
            this.u = true;
            C(this.i);
            return;
        }
        E();
        i();
        WebView webView = this.f1437l;
        String strG = g(request);
        webView.loadUrl(strG);
        JSHookAop.loadUrl(webView, strG);
    }

    public void r() {
    }

    public final void s() {
        this.p = (RelativeLayout) findViewById(R$id.open_rl_container);
        int i = R$id.open_header_view;
        this.o = (RelativeLayout) findViewById(i);
        ImageView imageView = (ImageView) findViewById(R$id.cancel);
        this.w = imageView;
        imageView.setOnClickListener(new b());
        B();
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.open_loading_group);
        this.q = frameLayout;
        View viewM = m(frameLayout);
        if (viewM != null) {
            this.q.removeAllViews();
            this.q.addView(viewM);
        }
        t(this);
        if (this.f1437l.getParent() != null) {
            ((ViewGroup) this.f1437l.getParent()).removeView(this.f1437l);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1437l.getLayoutParams();
        layoutParams.addRule(3, i);
        this.f1437l.setLayoutParams(layoutParams);
        this.f1437l.setVisibility(4);
        this.p.addView(this.f1437l);
    }

    public final void t(Context context) {
        this.f1437l = new WebView(context);
        this.f1437l.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f1437l.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
    }

    public abstract boolean u();

    public void v(int i) {
        w("", i);
    }

    public final void w(String str, int i) {
        x(str, null, i);
    }

    public final void x(String str, String str2, int i) {
        Authorization.Response response = new Authorization.Response();
        response.authCode = str;
        response.errorCode = i;
        response.state = str2;
        z(this.m, response);
        finish();
    }

    public final void y(String str, String str2, String str3, int i) {
        Authorization.Response response = new Authorization.Response();
        response.authCode = str;
        response.errorCode = i;
        response.state = str2;
        response.grantedPermissions = str3;
        z(this.m, response);
        finish();
    }

    public abstract void z(Authorization.Request request, v81 v81Var);
}
