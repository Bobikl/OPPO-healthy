package com.tencent.open;

import android.R;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.oplus.aiunit.vision.dzm;
import com.oplus.aiunit.vision.h75;
import com.oplus.aiunit.vision.iz9;
import com.oplus.aiunit.vision.p4f;
import com.oplus.aiunit.vision.q8g;
import com.oplus.aiunit.vision.rxm;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.yfk;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class TDialog extends b {
    public static WeakReference<ProgressDialog> u;
    public WeakReference<Context> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f20302l;
    public OnTimeListener m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public iz9 f20303n;
    public FrameLayout o;
    public com.tencent.open.b.b p;
    public Handler q;
    public boolean r;
    public p4f s;
    public static final FrameLayout.LayoutParams t = new FrameLayout.LayoutParams(-1, -1);
    public static Toast v = null;

    public class FbWebViewClient extends WebViewClient {
        private FbWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            TDialog.this.p.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q8g.j("openSDK_LOG.TDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            TDialog.this.m.onError(new yfk(i, str, str2));
            if (TDialog.this.k != null && TDialog.this.k.get() != null) {
                Toast.makeText((Context) TDialog.this.k.get(), "网络连接异常或系统错误", 0).show();
            }
            TDialog.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            q8g.j("openSDK_LOG.TDialog", "Redirect URL: " + str);
            if (str.startsWith(dzm.a().b((Context) TDialog.this.k.get(), "auth://tauth.qq.com/"))) {
                TDialog.this.m.onComplete(com.tencent.open.utils.b.y(str));
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (str.startsWith(s04.CANCEL_URI)) {
                TDialog.this.m.onCancel();
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (str.startsWith(s04.CLOSE_URI)) {
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (!str.startsWith(s04.DOWNLOAD_URI) && !str.endsWith(".apk")) {
                return str.startsWith("auth://progress");
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", str.startsWith(s04.DOWNLOAD_URI) ? Uri.parse(Uri.decode(str.substring(11))) : Uri.parse(Uri.decode(str)));
                intent.addFlags(268435456);
                if (TDialog.this.k != null && TDialog.this.k.get() != null) {
                    ((Context) TDialog.this.k.get()).startActivity(intent);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return true;
        }
    }

    public class JsListener extends a.b {
        private JsListener() {
        }

        public void onAddShare(String str) {
            q8g.d("openSDK_LOG.TDialog", "JsListener onAddShare");
            onComplete(str);
        }

        public void onCancel(String str) {
            q8g.f("openSDK_LOG.TDialog", "JsListener onCancel --msg = " + str);
            TDialog.this.q.obtainMessage(2, str).sendToTarget();
            TDialog.this.dismiss();
        }

        public void onCancelAddShare(String str) {
            q8g.f("openSDK_LOG.TDialog", "JsListener onCancelAddShare" + str);
            onCancel("cancel");
        }

        public void onCancelInvite() {
            q8g.f("openSDK_LOG.TDialog", "JsListener onCancelInvite");
            onCancel("");
        }

        public void onCancelLogin() {
            onCancel("");
        }

        public void onComplete(String str) {
            TDialog.this.q.obtainMessage(1, str).sendToTarget();
            q8g.f("openSDK_LOG.TDialog", "JsListener onComplete" + str);
            TDialog.this.dismiss();
        }

        public void onInvite(String str) {
            onComplete(str);
        }

        public void onLoad(String str) {
            TDialog.this.q.obtainMessage(4, str).sendToTarget();
        }

        public void showMsg(String str) {
            TDialog.this.q.obtainMessage(3, str).sendToTarget();
        }
    }

    public static class OnTimeListener extends h75 {
        String a;
        String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<Context> f20304c;
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private iz9 f20305e;

        public OnTimeListener(Context context, String str, String str2, String str3, iz9 iz9Var) {
            this.f20304c = new WeakReference<>(context);
            this.d = str;
            this.a = str2;
            this.b = str3;
            this.f20305e = iz9Var;
        }

        @Override // com.oplus.aiunit.vision.h75, com.oplus.aiunit.vision.iz9
        public void onCancel() {
            iz9 iz9Var = this.f20305e;
            if (iz9Var != null) {
                iz9Var.onCancel();
                this.f20305e = null;
            }
        }

        @Override // com.oplus.aiunit.vision.h75, com.oplus.aiunit.vision.iz9
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            rxm.b().e(this.d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.a, false);
            iz9 iz9Var = this.f20305e;
            if (iz9Var != null) {
                iz9Var.onComplete(jSONObject);
                this.f20305e = null;
            }
        }

        @Override // com.oplus.aiunit.vision.h75, com.oplus.aiunit.vision.iz9
        public void onError(yfk yfkVar) {
            String str;
            if (yfkVar.b != null) {
                str = yfkVar.b + this.a;
            } else {
                str = this.a;
            }
            rxm rxmVarB = rxm.b();
            rxmVarB.e(this.d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, yfkVar.a, str, false);
            iz9 iz9Var = this.f20305e;
            if (iz9Var != null) {
                iz9Var.onError(yfkVar);
                this.f20305e = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
            try {
                onComplete(com.tencent.open.utils.b.C(str));
            } catch (JSONException e2) {
                e2.printStackTrace();
                onError(new yfk(-4, s04.MSG_JSON_ERROR, str));
            }
        }
    }

    public class THandler extends Handler {
        private OnTimeListener b;

        public THandler(OnTimeListener onTimeListener, Looper looper) {
            super(looper);
            this.b = onTimeListener;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            q8g.d("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + message.what);
            int i = message.what;
            if (i == 1) {
                this.b.a((String) message.obj);
                return;
            }
            if (i == 2) {
                this.b.onCancel();
                return;
            }
            if (i == 3) {
                if (TDialog.this.k == null || TDialog.this.k.get() == null) {
                    return;
                }
                TDialog.h((Context) TDialog.this.k.get(), (String) message.obj);
                return;
            }
            if (i != 5 || TDialog.this.k == null || TDialog.this.k.get() == null) {
                return;
            }
            TDialog.j((Context) TDialog.this.k.get(), (String) message.obj);
        }
    }

    public TDialog(Context context, String str, String str2, iz9 iz9Var, p4f p4fVar) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.r = false;
        this.s = null;
        this.k = new WeakReference<>(context);
        this.f20302l = str2;
        this.m = new OnTimeListener(context, str, str2, p4fVar.h(), iz9Var);
        this.q = new THandler(this.m, context.getMainLooper());
        this.f20303n = iz9Var;
        this.s = p4fVar;
    }

    public static void h(Context context, String str) {
        try {
            JSONObject jSONObjectC = com.tencent.open.utils.b.C(str);
            int i = jSONObjectC.getInt("type");
            String string = jSONObjectC.getString("msg");
            if (i == 0) {
                Toast toast = v;
                if (toast == null) {
                    v = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    v.setText(string);
                    v.setDuration(0);
                }
                v.show();
                return;
            }
            if (i == 1) {
                Toast toast2 = v;
                if (toast2 == null) {
                    v = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    v.setText(string);
                    v.setDuration(1);
                }
                v.show();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void j(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObjectC = com.tencent.open.utils.b.C(str);
            int i = jSONObjectC.getInt("action");
            String string = jSONObjectC.getString("msg");
            if (i == 1) {
                WeakReference<ProgressDialog> weakReference = u;
                if (weakReference == null || weakReference.get() == null) {
                    ProgressDialog progressDialog = new ProgressDialog(context);
                    progressDialog.setMessage(string);
                    u = new WeakReference<>(progressDialog);
                    progressDialog.show();
                } else {
                    u.get().setMessage(string);
                    if (!u.get().isShowing()) {
                        u.get().show();
                    }
                }
            } else if (i == 0) {
                WeakReference<ProgressDialog> weakReference2 = u;
                if (weakReference2 == null) {
                    return;
                }
                if (weakReference2.get() != null && u.get().isShowing()) {
                    u.get().dismiss();
                    u = null;
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void a() {
        new TextView(this.k.get()).setText("test");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        com.tencent.open.b.b bVar = new com.tencent.open.b.b(this.k.get());
        this.p = bVar;
        bVar.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(this.k.get());
        this.o = frameLayout;
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        this.o.addView(this.p);
        setContentView(this.o);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void e() {
        this.p.setVerticalScrollBarEnabled(false);
        this.p.setHorizontalScrollBarEnabled(false);
        this.p.setWebViewClient(new FbWebViewClient());
        this.p.setWebChromeClient(this.f20307j);
        this.p.clearFormData();
        WebSettings settings = this.p.getSettings();
        if (settings == null) {
            return;
        }
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setJavaScriptEnabled(true);
        WeakReference<Context> weakReference = this.k;
        if (weakReference != null && weakReference.get() != null) {
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.k.get().getApplicationContext().getDir("databases", 0).getPath());
        }
        settings.setDomStorageEnabled(true);
        this.i.a(new JsListener(), "sdk_js_if");
        com.tencent.open.b.b bVar = this.p;
        String str = this.f20302l;
        bVar.loadUrl(str);
        JSHookAop.loadUrl(bVar, str);
        this.p.setLayoutParams(t);
        this.p.setVisibility(4);
        this.p.getSettings().setSavePassword(false);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        OnTimeListener onTimeListener = this.m;
        if (onTimeListener != null) {
            onTimeListener.onCancel();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.open.b, android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        a();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.open.TDialog.1
            @Override // java.lang.Runnable
            public void run() {
                View decorView;
                View childAt;
                Window window = TDialog.this.getWindow();
                if (window == null || (decorView = window.getDecorView()) == null || (childAt = ((ViewGroup) decorView).getChildAt(0)) == null) {
                    return;
                }
                childAt.setPadding(0, 0, 0, 0);
            }
        });
        e();
    }

    @Override // com.tencent.open.b
    public void a(String str) {
        q8g.d("openSDK_LOG.TDialog", "--onConsoleMessage--");
        try {
            this.i.c(this.p, str);
        } catch (Exception unused) {
        }
    }
}
