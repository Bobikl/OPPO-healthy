package com.tencent.connect.auth;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.caverock.androidsvg.SVGParser;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.h75;
import com.oplus.aiunit.vision.iz9;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.kcm;
import com.oplus.aiunit.vision.lim;
import com.oplus.aiunit.vision.q8g;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.vpg;
import com.oplus.aiunit.vision.yfk;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import com.tencent.open.utils.HttpUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a extends Dialog {
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public iz9 f20268j;
    public Handler k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FrameLayout f20269l;
    public LinearLayout m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FrameLayout f20270n;
    public ProgressBar o;
    public Button p;
    public String q;
    public com.tencent.open.b.c r;
    public Context s;
    public boolean t;
    public int u;
    public String v;
    public String w;
    public long x;
    public long y;
    public HashMap<String, Runnable> z;

    /* JADX INFO: renamed from: com.tencent.connect.auth.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC1005a implements View.OnClickListener {
        public ViewOnClickListenerC1005a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            a.this.dismiss();
            if (!a.this.t) {
                a.q(a.this);
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    public class d extends WebViewClient {

        /* JADX INFO: renamed from: com.tencent.connect.auth.a$d$a, reason: collision with other inner class name */
        public class RunnableC1006a implements Runnable {
            public RunnableC1006a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.tencent.open.b.c cVar = a.this.r;
                String str = a.this.v;
                cVar.loadUrl(str);
                JSHookAop.loadUrl(cVar, str);
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public final /* synthetic */ SslErrorHandler i;

            public b(SslErrorHandler sslErrorHandler) {
                this.i = sslErrorHandler;
            }

            @Override // android.content.DialogInterface.OnClickListener
            @SensorsDataInstrumented
            public void onClick(DialogInterface dialogInterface, int i) {
                this.i.proceed();
                SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
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
                this.i.cancel();
                a.this.dismiss();
                SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
            }
        }

        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q8g.j("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
            a.this.f20270n.setVisibility(8);
            if (a.this.r != null) {
                a.this.r.setVisibility(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a.this.k.removeCallbacks((Runnable) a.this.z.remove(str));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q8g.j("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
            super.onPageStarted(webView, str, bitmap);
            a.this.f20270n.setVisibility(0);
            a.this.x = SystemClock.elapsedRealtime();
            if (!TextUtils.isEmpty(a.this.v)) {
                a.this.k.removeCallbacks((Runnable) a.this.z.remove(a.this.v));
            }
            a.this.v = str;
            a aVar = a.this;
            f fVar = aVar.new f(aVar.v);
            a.this.z.put(str, fVar);
            a.this.k.postDelayed(fVar, 120000L);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            q8g.i("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i + " | description: " + str);
            if (!com.tencent.open.utils.b.w(a.this.s)) {
                a.q(a.this);
                new yfk(9001, "当前网络不可用，请稍后重试！", str2);
                throw null;
            }
            if (a.this.v.startsWith("https://login.imgcache.qq.com/ptlogin/static/qzsjump.html?")) {
                a.q(a.this);
                new yfk(i, str, str2);
                throw null;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - a.this.x;
            if (a.this.u < 1 && jElapsedRealtime < a.this.y) {
                a.y(a.this);
                a.this.k.postDelayed(new RunnableC1006a(), 500L);
            } else {
                com.tencent.open.b.c cVar = a.this.r;
                String strC = a.this.c();
                cVar.loadUrl(strC);
                JSHookAop.loadUrl(cVar, strC);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String str;
            String str2;
            String str3;
            q8g.f("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
            if (Locale.getDefault().getLanguage().equals("zh")) {
                str = "ssl证书无效，是否继续访问？";
                str2 = "是";
                str3 = "否";
            } else {
                str = "The SSL certificate is invalid,do you countinue?";
                str2 = "yes";
                str3 = SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(a.this.s);
            builder.setMessage(str);
            builder.setPositiveButton(str2, new b(sslErrorHandler));
            builder.setNegativeButton(str3, new c(sslErrorHandler));
            builder.create().show();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            q8g.j("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
            if (str.startsWith("auth://browser")) {
                JSONObject jSONObjectY = com.tencent.open.utils.b.y(str);
                a aVar = a.this;
                aVar.t = aVar.r();
                if (!a.this.t) {
                    if (jSONObjectY.optString("fail_cb", null) != null) {
                        a.this.d(jSONObjectY.optString("fail_cb"), "");
                    } else if (jSONObjectY.optInt("fall_to_wv") == 1) {
                        a aVar2 = a.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append(a.this.i);
                        sb.append(a.this.i.indexOf("?") > -1 ? "&" : "?");
                        aVar2.i = sb.toString();
                        a.this.i = a.this.i + "browser_error=1";
                        com.tencent.open.b.c cVar = a.this.r;
                        String str2 = a.this.i;
                        cVar.loadUrl(str2);
                        JSHookAop.loadUrl(cVar, str2);
                    } else {
                        String strOptString = jSONObjectY.optString("redir", null);
                        if (strOptString != null) {
                            com.tencent.open.b.c cVar2 = a.this.r;
                            cVar2.loadUrl(strOptString);
                            JSHookAop.loadUrl(cVar2, strOptString);
                        }
                    }
                }
                return true;
            }
            if (str.startsWith("auth://tauth.qq.com/")) {
                a.q(a.this);
                com.tencent.open.utils.b.y(str);
                throw null;
            }
            if (str.startsWith(s04.CANCEL_URI)) {
                a.q(a.this);
                throw null;
            }
            if (str.startsWith(s04.CLOSE_URI)) {
                a.this.dismiss();
                return true;
            }
            if (str.startsWith(s04.DOWNLOAD_URI) || str.endsWith(".apk")) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", str.startsWith(s04.DOWNLOAD_URI) ? Uri.parse(Uri.decode(str.substring(11))) : Uri.parse(Uri.decode(str)));
                    intent.addFlags(268435456);
                    a.this.s.startActivity(intent);
                } catch (Exception e2) {
                    q8g.g("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e2);
                }
                return true;
            }
            if (!str.startsWith("auth://progress")) {
                if (!str.startsWith("auth://onLoginSubmit")) {
                    a.t(a.this);
                    com.tencent.open.b.c unused = a.this.r;
                    throw null;
                }
                try {
                    List<String> pathSegments = Uri.parse(str).getPathSegments();
                    if (!pathSegments.isEmpty()) {
                        a.this.w = pathSegments.get(0);
                    }
                } catch (Exception unused2) {
                }
                return true;
            }
            try {
                List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                if (pathSegments2.isEmpty()) {
                    return true;
                }
                int iIntValue = Integer.valueOf(pathSegments2.get(0)).intValue();
                if (iIntValue == 0) {
                    a.this.f20270n.setVisibility(8);
                    a.this.r.setVisibility(0);
                } else if (iIntValue == 1) {
                    a.this.f20270n.setVisibility(0);
                }
            } catch (Exception unused3) {
            }
            return true;
        }

        public /* synthetic */ d(a aVar, ViewOnClickListenerC1005a viewOnClickListenerC1005a) {
            this();
        }
    }

    public class e extends h75 {
    }

    public class f implements Runnable {
        public String i;

        public f(String str) {
            this.i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            q8g.j("openSDK_LOG.AuthDialog", "-->timeoutUrl: " + this.i + " | mRetryUrl: " + a.this.v);
            if (this.i.equals(a.this.v)) {
                a.q(a.this);
                new yfk(9002, "请求页面超时，请稍后重试！", a.this.v);
                throw null;
            }
        }
    }

    public static /* synthetic */ e q(a aVar) {
        aVar.getClass();
        return null;
    }

    public static /* synthetic */ lim t(a aVar) {
        aVar.getClass();
        return null;
    }

    public static /* synthetic */ int y(a aVar) {
        int i = aVar.u;
        aVar.u = i + 1;
        return i;
    }

    public final String c() {
        String str = this.i;
        String str2 = "https://login.imgcache.qq.com/ptlogin/static/qzsjump.html?" + str.substring(str.indexOf("?") + 1);
        q8g.i("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: https://login.imgcache.qq.com/ptlogin/static/qzsjump.html?");
        return str2;
    }

    public void d(String str, String str2) {
        String str3 = "javascript:" + str + "(" + str2 + ");void(" + System.currentTimeMillis() + ");";
        com.tencent.open.b.c cVar = this.r;
        cVar.loadUrl(str3);
        JSHookAop.loadUrl(cVar, str3);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.z.clear();
        this.k.removeCallbacksAndMessages(null);
        try {
            Context context = this.s;
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && isShowing()) {
                super.dismiss();
                q8g.i("openSDK_LOG.AuthDialog", "-->dismiss dialog");
            }
        } catch (Exception e2) {
            q8g.g("openSDK_LOG.AuthDialog", "-->dismiss dialog exception:", e2);
        }
        com.tencent.open.b.c cVar = this.r;
        if (cVar != null) {
            cVar.destroy();
            this.r = null;
        }
    }

    public final void g() {
        n();
        j();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        com.tencent.open.b.c cVar = new com.tencent.open.b.c(this.s);
        this.r = cVar;
        cVar.setLayerType(1, null);
        this.r.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(this.s);
        this.f20269l = frameLayout;
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        this.f20269l.addView(this.r);
        this.f20269l.addView(this.f20270n);
        String string = com.tencent.open.utils.b.t(this.i).getString(Const.Arguments.Open.STYLE);
        if (string != null && "qr".equals(string)) {
            this.f20269l.addView(this.p);
        }
        setContentView(this.f20269l);
    }

    public final void j() {
        Button button = new Button(this.s);
        this.p = button;
        button.setBackgroundDrawable(com.tencent.open.utils.b.b("h5_qr_back.png", this.s));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = kcm.a(this.s, 20.0f);
        layoutParams.topMargin = kcm.a(this.s, 10.0f);
        this.p.setLayoutParams(layoutParams);
        this.p.setOnClickListener(new ViewOnClickListenerC1005a());
    }

    public final void n() {
        TextView textView;
        this.o = new ProgressBar(this.s);
        this.o.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.m = new LinearLayout(this.s);
        if (this.q.equals("action_login")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            textView = new TextView(this.s);
            if (Locale.getDefault().getLanguage().equals("zh")) {
                textView.setText("登录中...");
            } else {
                textView.setText("Logging in...");
            }
            textView.setTextColor(Color.rgb(255, 255, 255));
            textView.setTextSize(18.0f);
            textView.setLayoutParams(layoutParams);
        } else {
            textView = null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.m.setLayoutParams(layoutParams2);
        this.m.addView(this.o);
        if (textView != null) {
            this.m.addView(textView);
        }
        this.f20270n = new FrameLayout(this.s);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f20270n.setLayoutParams(layoutParams3);
        this.f20270n.setBackgroundColor(Color.parseColor("#B3000000"));
        this.f20270n.addView(this.m);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (!this.t) {
            throw null;
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setFlags(1024, 1024);
        }
        super.onCreate(bundle);
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(k18.GL_INVALID_ENUM);
        }
        g();
        p();
        this.z = new HashMap<>();
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void p() {
        this.r.setVerticalScrollBarEnabled(false);
        this.r.setHorizontalScrollBarEnabled(false);
        this.r.setWebViewClient(new d(this, null));
        this.r.setWebChromeClient(new WebChromeClient());
        this.r.clearFormData();
        this.r.clearSslPreferences();
        this.r.setOnLongClickListener(new b());
        this.r.setOnTouchListener(new c());
        WebSettings settings = this.r.getSettings();
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(this.s.getDir("databases", 0).getPath());
        settings.setDomStorageEnabled(true);
        q8g.j("openSDK_LOG.AuthDialog", "-->mUrl : " + this.i);
        String str = this.i;
        this.v = str;
        com.tencent.open.b.c cVar = this.r;
        cVar.loadUrl(str);
        JSHookAop.loadUrl(cVar, str);
        this.r.setVisibility(4);
        this.r.getSettings().setSavePassword(false);
        new vpg();
        throw null;
    }

    public final boolean r() {
        com.tencent.connect.auth.b bVarA = com.tencent.connect.auth.b.a();
        String strD = bVarA.d();
        com.tencent.connect.auth.b.a aVar = new com.tencent.connect.auth.b.a();
        aVar.a = this.f20268j;
        aVar.b = this;
        aVar.f20275c = strD;
        String strB = bVarA.b(aVar);
        String str = this.i;
        String strSubstring = str.substring(0, str.indexOf("?"));
        Bundle bundleT = com.tencent.open.utils.b.t(this.i);
        bundleT.putString("token_key", strD);
        bundleT.putString("serial", strB);
        bundleT.putString(FragmentStyle.BROWSER, "1");
        String str2 = strSubstring + "?" + HttpUtils.f(bundleT);
        this.i = str2;
        return com.tencent.open.utils.b.n(this.s, str2);
    }
}
