package com.oplus.aiunit.vision;

import android.content.Context;
import android.webkit.WebView;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class sr9 {
    public static final String TAG = "IJsExecutor";
    private z62 browser;
    private boolean needCheckDomain;
    private String[] safeDomain;
    private WebView webView;

    public sr9() {
        this.needCheckDomain = true;
    }

    public void callJsMethod(String str, String... strArr) {
        StringBuilder sb = new StringBuilder("javascript:if(window." + str + "){window." + str + "(");
        if (strArr == null || strArr.length == 0) {
            sb.append(");}");
        } else {
            for (int i = 0; i < strArr.length; i++) {
                if (i == strArr.length - 1) {
                    sb.append(String.format("'%s'", strArr[i]) + ");}");
                } else {
                    sb.append(String.format("'%s'", strArr[i]) + ", ");
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("JsApp---callJsMethod: ");
        sb2.append(sb.toString());
        try {
            WebView webViewT = getBrowser().t();
            if (webViewT != null) {
                webViewT.evaluateJavascript(sb.toString(), null);
            }
        } catch (Throwable th) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("JsApp---callJsMethod: error ");
            sb3.append(th.getMessage());
        }
    }

    public z62 getBrowser() {
        return this.browser;
    }

    public String[] getSafeDomain() {
        return this.safeDomain;
    }

    public WebView getWebView() {
        return this.webView;
    }

    public boolean needCheckDomain() {
        return this.needCheckDomain;
    }

    public void onAppCallBack(boolean z, JsonElement jsonElement, String str, String str2) {
        HashMap map = new HashMap();
        map.put("code", Integer.valueOf(z ? 200 : 201));
        map.put("data", jsonElement);
        map.put("type", str);
        map.put("message", str2);
        onAppCallBack(map);
    }

    public abstract rja onMethodCall(Context context, String str, String str2);

    public void setBrowser(z62 z62Var) {
        this.browser = z62Var;
        this.webView = z62Var.t();
    }

    public void setSafeDomain(String[] strArr) {
        this.safeDomain = strArr;
    }

    public sr9(boolean z) {
        this.needCheckDomain = z;
    }

    public sr9(String... strArr) {
        this.needCheckDomain = true;
        this.safeDomain = strArr;
    }

    public void onAppCallBack(Map<String, Object> map) {
        JsonObject asJsonObject = new Gson().toJsonTree(map).getAsJsonObject();
        String str = String.format("javascript:onAppCallBack('%s')", asJsonObject == null ? "" : asJsonObject.toString());
        StringBuilder sb = new StringBuilder();
        sb.append("JsApp---onAppCallBack: ");
        sb.append(str);
        try {
            WebView webViewT = getBrowser().t();
            if (webViewT != null) {
                webViewT.evaluateJavascript(str, null);
            }
        } catch (Throwable th) {
            a7b.f(TAG, "JsApp---onAppCallBack: error " + th.getMessage());
        }
    }
}
