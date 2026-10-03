package com.unionpay;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.oplus.aiunit.vision.b9n;
import com.oplus.aiunit.vision.f1n;
import com.oplus.aiunit.vision.mdm;
import com.oplus.aiunit.vision.pdm;
import com.oplus.aiunit.vision.rdm;
import com.oplus.weatherservicesdk.data.Weather;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class WebViewJavascriptBridge implements Serializable {
    pdm _messageHandler;
    Activity mContext;
    WebView mWebView;
    private boolean mAllowScheme = false;
    Map _messageHandlers = new HashMap();
    Map _responseCallbacks = new HashMap();
    long _uniqueId = 0;

    public WebViewJavascriptBridge(Activity activity, WebView webView, pdm pdmVar) {
        byte b = 0;
        this.mContext = activity;
        this.mWebView = webView;
        this._messageHandler = pdmVar;
        WebSettings settings = this.mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        try {
            this.mWebView.removeJavascriptInterface("accessibility");
            this.mWebView.removeJavascriptInterface("accessibilityTraversal");
            this.mWebView.removeJavascriptInterface("searchBoxJavaBridge_");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.mWebView.addJavascriptInterface(this, "_WebViewJavascriptBridge");
        this.mWebView.setWebViewClient(new b(this, b));
        this.mWebView.setWebChromeClient(new a(this, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _callbackJs(String str, String str2) {
        HashMap map = new HashMap();
        map.put("responseId", str);
        map.put("responseData", str2);
        _dispatchMessage(map);
    }

    private void _dispatchMessage(Map map) {
        String string = new JSONObject(map).toString();
        f1n.b("uppay", "sending:" + string);
        this.mContext.runOnUiThread(new c(this, String.format("javascript:WebViewJavascriptBridge._handleMessageFromJava('%s');", doubleEscapeString(string))));
    }

    private void _sendData(String str, rdm rdmVar, String str2) {
        HashMap map = new HashMap();
        map.put("data", str);
        if (rdmVar != null) {
            StringBuilder sb = new StringBuilder("java_cb_");
            long j2 = this._uniqueId + 1;
            this._uniqueId = j2;
            sb.append(j2);
            String string = sb.toString();
            this._responseCallbacks.put(string, rdmVar);
            map.put("callbackId", string);
        }
        if (str2 != null) {
            map.put("handlerName", str2);
        }
        _dispatchMessage(map);
    }

    public static String convertStreamToString(InputStream inputStream) {
        String next = "";
        try {
            Scanner scannerUseDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
            next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            inputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return next;
    }

    private String doubleEscapeString(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace(Weather.SEPARATOR, "\\n").replace("\r", "\\r").replace("\f", "\\f");
    }

    private void loadWebViewJavascriptBridgeJs(WebView webView) {
        String str = "javascript:" + convertStreamToString(getClass().getResourceAsStream("res/webviewjavascriptbridge.js"));
        webView.loadUrl(str);
        JSHookAop.loadUrl(webView, str);
    }

    @JavascriptInterface
    public void _handleMessageFromJs(String str, String str2, String str3, String str4, String str5) {
        pdm pdmVar;
        if (str2 != null) {
            ((rdm) this._responseCallbacks.get(str2)).a(str3);
            this._responseCallbacks.remove(str2);
            return;
        }
        mdm mdmVar = str4 != null ? new mdm(this, str4) : null;
        if (str5 != null) {
            pdmVar = (pdm) this._messageHandlers.get(str5);
            if (pdmVar == null) {
                f1n.d("uppay", "WVJB Warning: No handler for " + str5);
                return;
            }
        } else {
            pdmVar = this._messageHandler;
        }
        try {
            this.mContext.runOnUiThread(new b9n(this, pdmVar, str, mdmVar));
        } catch (Exception e2) {
            f1n.d("uppay", "WebViewJavascriptBridge: WARNING: java handler threw. " + e2.getMessage());
        }
    }

    public void callHandler(String str) {
        callHandler(str, null, null);
    }

    public void registerHandler(String str, pdm pdmVar) {
        this._messageHandlers.put(str, pdmVar);
    }

    public void send(String str) {
        send(str, null);
    }

    public void setAllowScheme(boolean z) {
        this.mAllowScheme = z;
    }

    public void callHandler(String str, String str2) {
        callHandler(str, str2, null);
    }

    public void send(String str, rdm rdmVar) {
        _sendData(str, rdmVar, null);
    }

    public void callHandler(String str, String str2, rdm rdmVar) {
        _sendData(str2, rdmVar, str);
    }
}
