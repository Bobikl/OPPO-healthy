package com.oppo.store.web.jsbridge.javacalljs;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.heytap.store.platform.tools.LogUtils;
import com.oppo.store.web.jsbridge.AsyncTaskExecutor;
import com.oppo.store.web.jsbridge.jscalljava.HeyTapJSInterfaceManager;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class JavaCallJs {
    public static final String CALLBACK_JS_FORMAT = "javascript:RainbowBridge.onComplete(%s,%s);";
    public static final String JS_METHOD_CALENDAR = "OPPO_MODULE_FN['app'].getCalendar";
    public static final String JS_METHOD_CALENDAR_STATUS = "OPPO_MODULE_FN['app'].getCalendarStatus";
    private static final String JS_METHOD_FORMAT = "javascript:%s(%s);";
    public static final String JS_METHOD_GETVERSION = "OPPO_MODULE_FN['app'].getVersion";
    public static final String JS_METHOD_GET_NAVIGATION = "OPPO_MODULE_FN['app'].getNotifyAuth";
    public static final String JS_METHOD_GET_POSTER_URL = "OPPO_MODULE_FN['app'].pdPosterShare";
    public static final String JS_METHOD_NAV_SHARE = "OPPO_MODULE_FN['app'].navShare";
    public static final String JS_METHOD_NAV_STYLE_CHANGE = "OPPO_MODULE_FN['app'].onNavStyleChange";
    public static final String JS_METHOD_NAV_TAB_SWITCH = "OPPO_MODULE_FN['app'].navTabSwitch";
    public static final String JS_METHOD_NETWORK_TYPE_CHANGE = "OPPO_MODULE_FN['app'].onNetworkTypeChange";
    public static final String JS_METHOD_NOTIFY_ALIPAY = "'notifyAlipay'";
    public static final String JS_METHOD_NOTIFY_CLOSE_ALERT = "OPPO_MODULE_FN['app'].notifyCloseAlert";
    public static final String JS_METHOD_ON_CART_VISIBILITY_CHANGE = "'onCartVisibilityChange'";
    public static final String JS_METHOD_ON_CLOSE_HALF_SCREEN = "'onCloseHalfScreen'";
    public static final String JS_METHOD_ON_KEY_EVENT = "OPPO_MODULE_FN['app'].onKeyEvent";
    public static final String JS_METHOD_ON_TITLE_RIGHT_ICON_TEXT_CLICK = "'onTitleRightIconTextClick'";
    public static final String JS_METHOD_ON_VISIBILITY_CHANGE = "'onVisibilityChange'";
    public static final String JS_METHOD_POST_EVENT = "'postEvent'";
    public static final String JS_METHOD_SET_INTEGRAL = "OPPO_MODULE_FN['app'].getIntegral";
    public static final String JS_METHOD_SET_PUSH_STATUS = "OPPO_MODULE_FN['app'].getPushStatus";
    private static final String TAG = "JavaCallJs";
    private final String mPort;
    private final WeakReference<WebView> mWebViewWeakRef;

    public static class JsValueCallbackWrapper implements ValueCallback<String> {
        private ValueCallback mValueCallback;
        private WebView mWebView;
        private Runnable onTimeCallbackRunnable = new Runnable() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJs.JsValueCallbackWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                if (JsValueCallbackWrapper.this.mValueCallback != null) {
                    JsValueCallbackWrapper.this.mValueCallback.onReceiveValue("");
                }
            }
        };

        public JsValueCallbackWrapper(WebView webView, ValueCallback valueCallback) {
            this.mWebView = webView;
            this.mValueCallback = valueCallback;
        }

        public void startOnTimeCallbackTimer() {
            Runnable runnable;
            WebView webView = this.mWebView;
            if (webView == null || (runnable = this.onTimeCallbackRunnable) == null) {
                return;
            }
            webView.postDelayed(runnable, 1000L);
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            Runnable runnable;
            WebView webView = this.mWebView;
            if (webView != null && (runnable = this.onTimeCallbackRunnable) != null) {
                webView.removeCallbacks(runnable);
            }
            ValueCallback valueCallback = this.mValueCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(str);
            }
        }
    }

    private JavaCallJs(WebView webView, String str) {
        this.mWebViewWeakRef = new WeakReference<>(webView);
        this.mPort = str;
    }

    public static void invokeJsCallback(JavaCallJs javaCallJs, boolean z, JSONObject jSONObject, String str) {
        if (javaCallJs == null) {
            return;
        }
        javaCallJs.call(z, jSONObject, str);
    }

    public static void invokeNoMethodJsCallback(JavaCallJs javaCallJs) {
        if (javaCallJs == null) {
            return;
        }
        javaCallJs.callNoMethod();
    }

    public static void javaCallJs(WebView webView, String str, JSONObject jSONObject, ValueCallback valueCallback) {
        if (webView == null) {
            return;
        }
        String str2 = String.format(JS_METHOD_FORMAT, str, jSONObject != null ? jSONObject.toString() : "");
        try {
            JsValueCallbackWrapper jsValueCallbackWrapper = new JsValueCallbackWrapper(webView, valueCallback);
            webView.evaluateJavascript(str2, jsValueCallbackWrapper);
            jsValueCallbackWrapper.startOnTimeCallbackTimer();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static JavaCallJs newInstance(WebView webView, String str) {
        return new JavaCallJs(webView, str);
    }

    public void call(boolean z, JSONObject jSONObject, String str) {
        WebView webView = this.mWebViewWeakRef.get();
        if (webView == null) {
            return;
        }
        sendJSCallback(z, jSONObject, str, webView);
    }

    public void callNoMethod() {
        final WebView webView = this.mWebViewWeakRef.get();
        if (webView == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", -999);
            jSONObject2.put("msg", HeyTapJSInterfaceManager.JS_CALL_JAVA_METHOD_FAIL_MESSAGE);
            jSONObject.put("status", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        final String str = String.format(Locale.US, "javascript:RainbowBridge.onComplete(%s,%s);", this.mPort, jSONObject.toString());
        if (!AsyncTaskExecutor.isMainThread()) {
            AsyncTaskExecutor.runOnMainThread(new Runnable() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJs.1
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView2 = webView;
                    String str2 = str;
                    webView2.loadUrl(str2);
                    JSHookAop.loadUrl(webView2, str2);
                }
            });
            return;
        }
        LogUtils.INSTANCE.d(TAG, str);
        webView.loadUrl(str);
        JSHookAop.loadUrl(webView, str);
    }

    public String getPort() {
        return this.mPort;
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
            e2.printStackTrace();
        }
        final String str2 = String.format(Locale.US, "javascript:RainbowBridge.onComplete(%s,%s);", this.mPort, jSONObject2.toString());
        if (!AsyncTaskExecutor.isMainThread()) {
            AsyncTaskExecutor.runOnMainThread(new Runnable() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJs.2
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView2 = webView;
                    String str3 = str2;
                    webView2.loadUrl(str3);
                    JSHookAop.loadUrl(webView2, str3);
                }
            });
        } else {
            webView.loadUrl(str2);
            JSHookAop.loadUrl(webView, str2);
        }
    }
}
