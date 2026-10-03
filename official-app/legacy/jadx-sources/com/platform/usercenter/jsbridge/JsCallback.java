package com.platform.usercenter.jsbridge;

import android.text.TextUtils;
import android.webkit.WebView;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class JsCallback {
    private static final String CALLBACK_JS_FORMAT = "javascript:RainbowBridge.onComplete(%s,%s);";
    private String mPort;
    private WeakReference<WebView> mWebViewWeakRef;

    public static class JsCallbackException extends Exception {
        public JsCallbackException(String str) {
            super(str);
        }
    }

    private JsCallback(WebView webView, String str) {
        this.mWebViewWeakRef = new WeakReference<>(webView);
        this.mPort = str;
    }

    public static void invokeJsCallback(JsCallback jsCallback, boolean z, JSONObject jSONObject, String str) {
        if (jsCallback == null) {
            return;
        }
        try {
            jsCallback.call(z, jSONObject, str);
        } catch (JsCallbackException e2) {
            UCLogUtil.e(e2);
        }
    }

    public static JsCallback newInstance(WebView webView, String str) {
        return new JsCallback(webView, str);
    }

    public void call(boolean z, JSONObject jSONObject, String str) throws JsCallbackException {
        WebView webView = this.mWebViewWeakRef.get();
        if (webView == null) {
            throw new JsCallbackException("The WebView related to the JsCallback has been recycled!");
        }
        sendJSCallback(z, jSONObject, str, webView);
    }

    public void sendJSCallback(boolean z, JSONObject jSONObject, String str, final WebView webView) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("code", z ? 0 : 1);
            if (TextUtils.isEmpty(str)) {
                jSONObject3.put("msg", "");
            } else {
                jSONObject3.put("msg", str);
            }
            jSONObject2.put("status", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
        } catch (JSONException e2) {
            UCLogUtil.e(e2);
        }
        final String str2 = String.format(Locale.US, "javascript:RainbowBridge.onComplete(%s,%s);", this.mPort, jSONObject2.toString());
        if (AsyncTaskExecutor.isMainThread()) {
            webView.evaluateJavascript(str2, null);
        } else {
            AsyncTaskExecutor.runOnMainThread(new Runnable() { // from class: com.platform.usercenter.jsbridge.JsCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    webView.evaluateJavascript(str2, null);
                }
            });
        }
    }
}
