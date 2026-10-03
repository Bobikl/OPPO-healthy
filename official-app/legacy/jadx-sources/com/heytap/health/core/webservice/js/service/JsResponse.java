package com.heytap.health.core.webservice.js.service;

import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.Keep;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.heytap.webview.extension.activity.FragmentStyle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class JsResponse {
    private WeakReference<WebView> webViewRef;
    private final String TAG = "JsResponse";
    private boolean debug = false;
    private final String JsCallBack = "javascript:onAppCallBack('%s')";

    public JsResponse(WebView webView) {
        this.webViewRef = new WeakReference<>(webView);
    }

    public String buildReponse(int i, String str, Object obj, String str2) {
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject.addProperty("code", Integer.valueOf(i));
        jsonObject2.addProperty("method", str);
        if (obj instanceof JsonElement) {
            jsonObject2.add("data", (JsonElement) obj);
        } else {
            jsonObject2.addProperty("data", String.valueOf(obj));
        }
        jsonObject.add("data", jsonObject2);
        jsonObject.addProperty("msg", str2);
        return jsonObject.toString();
    }

    public void debug(Object obj, String str) {
        if (this.debug) {
            evaluate(buildReponse(200, FragmentStyle.DEBUG, obj, str), null);
        }
    }

    public void enableDebug(boolean z) {
        this.debug = z;
    }

    public void error(String str, String str2) {
        evaluate(buildReponse(400, str, null, str2), null);
    }

    public void evaluate(String str, final ValueCallback valueCallback) {
        StringBuilder sb = new StringBuilder();
        sb.append("evaluate: ");
        sb.append(str);
        final String str2 = String.format("javascript:onAppCallBack('%s')", str);
        final WebView webView = this.webViewRef.get();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (webView != null) {
                webView.evaluateJavascript(str2, valueCallback);
            }
        } else if (webView != null) {
            webView.post(new Runnable() { // from class: com.oplus.aiunit.vision.qja
                @Override // java.lang.Runnable
                public final void run() {
                    webView.evaluateJavascript(str2, valueCallback);
                }
            });
        }
    }

    public WebView getWebView() {
        return this.webViewRef.get();
    }

    public void success(String str, String str2, String str3) {
        evaluate(buildReponse(200, str, str2, str3), null);
    }

    public void error(int i, String str, String str2) {
        evaluate(buildReponse(i, str, null, str2), null);
    }

    public void success(String str, JsonElement jsonElement, String str2) {
        evaluate(buildReponse(200, str, jsonElement, str2), null);
    }
}
