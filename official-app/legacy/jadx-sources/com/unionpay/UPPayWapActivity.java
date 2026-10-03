package com.unionpay;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.oplus.aiunit.vision.a7n;
import com.oplus.aiunit.vision.e1n;
import com.oplus.aiunit.vision.e7n;
import com.oplus.aiunit.vision.ezm;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.j7n;
import com.oplus.aiunit.vision.l2n;
import com.oplus.aiunit.vision.m2n;
import com.oplus.aiunit.vision.m3n;
import com.oplus.aiunit.vision.q4n;
import com.oplus.aiunit.vision.q8n;
import com.oplus.aiunit.vision.rdm;
import com.oplus.aiunit.vision.u8n;
import com.oplus.aiunit.vision.w6n;
import com.oplus.aiunit.vision.w8n;
import com.oplus.aiunit.vision.wum;
import com.oplus.aiunit.vision.wxm;
import com.oplus.aiunit.vision.x5n;
import com.oplus.aiunit.vision.x8n;
import com.oplus.aiunit.vision.z6n;
import com.oplus.aiunit.vision.z8n;
import com.oplus.aiunit.vision.zzm;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class UPPayWapActivity extends Activity {
    public static String q = "ex_mode";
    public WebView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WebViewJavascriptBridge f20346j;
    public AlertDialog k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20347l = false;
    public String m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f20348n;
    public View o;
    public rdm p;

    public static /* synthetic */ void g(UPPayWapActivity uPPayWapActivity, boolean z) {
        View view = uPPayWapActivity.o;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public static String j(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject.put("code", str);
            }
            if (str2 != null) {
                jSONObject.put("msg", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            return jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String k(String str, String str2, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject2.put("code", str);
            }
            if (str2 != null) {
                jSONObject2.put("msg", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("value", jSONObject);
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static /* synthetic */ void m(UPPayWapActivity uPPayWapActivity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(uPPayWapActivity);
        uPPayWapActivity.k = builder.create();
        builder.setMessage(m2n.a().a);
        builder.setTitle(m2n.a().d);
        builder.setPositiveButton(m2n.a().b, new a7n(uPPayWapActivity));
        builder.setNegativeButton(m2n.a().f13929c, new e7n(uPPayWapActivity));
        builder.create().show();
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    public final void h(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("pay_result", str);
        intent.putExtra("result_data", str2);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String string;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String str = "";
                    if (extras.containsKey("pay_result")) {
                        string = extras.getString("pay_result");
                    } else {
                        string = extras.containsKey("code") ? extras.getString("code") : "";
                    }
                    if (TextUtils.isEmpty(string)) {
                        string = "";
                    }
                    String string2 = extras.containsKey("data") ? extras.getString("data") : "";
                    if (!TextUtils.isEmpty(string2)) {
                        str = string2;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", string);
                    jSONObject.put("data", str);
                    rdm rdmVar = this.p;
                    if (rdmVar != null) {
                        rdmVar.a(k("0", null, jSONObject));
                    }
                } else {
                    rdm rdmVar2 = this.p;
                    if (rdmVar2 != null) {
                        rdmVar2.a(j("1", "No pay result", null));
                    }
                }
            } catch (Exception unused) {
                rdm rdmVar3 = this.p;
                if (rdmVar3 != null) {
                    rdmVar3.a(j("1", "No pay result", null));
                }
            }
            this.p = null;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        View.OnClickListener z6nVar;
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        try {
            try {
                if (!"949A1CC".equalsIgnoreCase(getIntent().getStringExtra("magic_data"))) {
                    finish();
                }
                this.f20347l = "link".equals(getIntent().getStringExtra(f04.JSON_KEY_RKE_ACTION_TYPE));
                String stringExtra = getIntent().getStringExtra(q);
                this.m = stringExtra;
                if (TextUtils.isEmpty(stringExtra)) {
                    this.m = "00";
                }
                String stringExtra2 = "";
                getWindow().requestFeature(1);
                RelativeLayout relativeLayout = new RelativeLayout(this);
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                relativeLayout.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -1));
                setContentView(relativeLayout);
                this.i = new WebView(this);
                String stringExtra3 = getIntent().getStringExtra(f04.JSON_KEY_RKE_ACTION_TYPE);
                this.f20348n = stringExtra3;
                if ("link".equals(stringExtra3)) {
                    stringExtra2 = getIntent().getStringExtra("wapurl");
                } else {
                    String stringExtra4 = getIntent().getStringExtra("waptype");
                    String stringExtra5 = getIntent().getStringExtra("wapurl");
                    if ("new_page".equals(stringExtra4)) {
                        stringExtra2 = stringExtra5 != null ? stringExtra5 : "";
                        z6nVar = new zzm(this);
                    } else {
                        String stringExtra6 = getIntent().getStringExtra("paydata");
                        if (stringExtra6 != null) {
                            stringExtra2 = stringExtra5 + "?s=" + stringExtra6;
                        }
                        z6nVar = null;
                    }
                    ImageView imageView = new ImageView(this);
                    imageView.setBackgroundDrawable(wxm.a(ezm.b));
                    int iA = wum.a(this, 24.0f);
                    int iA2 = wum.a(this, 18.0f);
                    int iA3 = wum.a(this, 14.0f);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
                    layoutParams.addRule(9, -1);
                    layoutParams.addRule(10, -1);
                    layoutParams.setMargins(iA2, iA3, 0, 0);
                    relativeLayout.addView(imageView, layoutParams);
                    if (z6nVar == null) {
                        z6nVar = new z6n(this);
                    }
                    imageView.setOnClickListener(z6nVar);
                    this.o = imageView;
                }
                this.i.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                linearLayout.addView(this.i);
                WebViewJavascriptBridge webViewJavascriptBridge = new WebViewJavascriptBridge(this, this.i, null);
                this.f20346j = webViewJavascriptBridge;
                webViewJavascriptBridge.setAllowScheme(true);
                WebView webView = this.i;
                if (webView != null) {
                    webView.loadUrl(stringExtra2);
                    JSHookAop.loadUrl(webView, stringExtra2);
                }
                WebViewJavascriptBridge webViewJavascriptBridge2 = this.f20346j;
                if (webViewJavascriptBridge2 != null) {
                    webViewJavascriptBridge2.registerHandler("getDeviceInfo", new j7n(this));
                    this.f20346j.registerHandler("saveData", new q8n(this));
                    this.f20346j.registerHandler("getData", new u8n(this));
                    this.f20346j.registerHandler("removeData", new w8n(this));
                    this.f20346j.registerHandler("setPageBackEnable", new x8n(this));
                    this.f20346j.registerHandler("payBySDK", new z8n(this));
                    this.f20346j.registerHandler("payResult", new e1n(this));
                    this.f20346j.registerHandler("closePage", new l2n(this));
                    this.f20346j.registerHandler("openNewPage", new m3n(this));
                    this.f20346j.registerHandler("checkBankSchemes", new q4n(this));
                    this.f20346j.registerHandler("openBankApp", new x5n(this));
                    this.f20346j.registerHandler("openScheme", new w6n(this));
                }
            } catch (Exception unused) {
                finish();
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f20347l) {
            WebView webView = this.i;
            if (webView != null && webView.canGoBack()) {
                this.i.goBack();
                return true;
            }
            h("cancel", null);
        } else {
            onPause();
        }
        return true;
    }

    @Override // android.app.Activity
    @SensorsDataInstrumented
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PushAutoTrackHelper.onNewIntent(this, intent);
    }
}
