package com.heytap.health.wallet.jsbridge;

import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.heytap.health.base.task.ThreadUtils;
import com.oplus.aiunit.vision.a94;
import com.oplus.aiunit.vision.t6b;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class JsCallback {
    public static final String CALLBACK_JS_FORMAT = "javascript:RainbowBridge.onComplete(%s,%s);";
    private static final String TAG = "JsCallback";
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

    private void callWithErrorCode(boolean z, int i, JSONObject jSONObject, String str) throws JsCallbackException {
        WebView webView = this.mWebViewWeakRef.get();
        if (webView == null) {
            throw new JsCallbackException("The WebView related to the JsCallback has been recycled!");
        }
        doJSCallback(z, i, jSONObject, str, webView);
    }

    private void doJSCallback(boolean z, int i, JSONObject jSONObject, String str, final WebView webView) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("code", z ? 0 : 1);
            if (TextUtils.isEmpty(str)) {
                jSONObject3.put("msg", "");
            } else {
                jSONObject3.put("msg", str);
            }
            if (i > 0) {
                jSONObject3.put("errorCode", i);
            }
            jSONObject2.put("status", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
        } catch (JSONException e2) {
            t6b.d(TAG, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
        final String str2 = String.format(Locale.US, "javascript:RainbowBridge.onComplete(%s,%s);", this.mPort, jSONObject2.toString());
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lambda$doJSCallback$0(webView, str2);
        } else {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.mja
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$doJSCallback$0(webView, str2);
                }
            });
        }
    }

    public static void invokeJsCallback(JsCallback jsCallback, boolean z, JSONObject jSONObject, String str) {
        if (jsCallback == null) {
            return;
        }
        try {
            jsCallback.call(z, jSONObject, str);
        } catch (JsCallbackException e2) {
            t6b.d(TAG, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadUrl, reason: merged with bridge method [inline-methods] */
    public void lambda$doJSCallback$0(WebView webView, String str) {
        if (a94.a(webView.getContext())) {
            webView.loadUrl(str);
        }
    }

    public static JsCallback newInstance(WebView webView, String str) {
        return new JsCallback(webView, str);
    }

    public void call(boolean z, JSONObject jSONObject, String str) throws JsCallbackException {
        callWithErrorCode(z, 0, jSONObject, str);
    }
}
