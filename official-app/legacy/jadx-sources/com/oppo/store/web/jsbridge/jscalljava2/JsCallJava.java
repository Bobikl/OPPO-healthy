package com.oppo.store.web.jsbridge.jscalljava2;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.gson.JsonSyntaxException;
import com.heytap.store.base.core.util.exposure.WeakHandler;
import com.heytap.store.platform.tools.GsonUtils;
import com.oppo.store.web.jsbridge.javacalljs.JavaCallJs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class JsCallJava {
    private static final String JS_BRIDGE_PROTOCOL_SCHEMA = "rainbow";
    private String mClassName;
    private String mMethodName;
    private JSONObject mParams;
    private String mPort;

    private JsCallJava() {
    }

    private void invokeNativeMethod(WebView webView, WeakHandler weakHandler) {
        Method methodFindMethod = NativeMethodInjectHelper.getInstance().findMethod(this.mClassName, this.mMethodName);
        JavaCallJs javaCallJsNewInstance = JavaCallJs.newInstance(webView, this.mPort);
        if (methodFindMethod == null) {
            JavaCallJs.invokeNoMethodJsCallback(javaCallJsNewInstance);
            return;
        }
        try {
            methodFindMethod.invoke(null, webView, this.mParams, javaCallJsNewInstance, weakHandler);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public static final boolean isJSONValid(String str) {
        try {
            GsonUtils.INSTANCE.fromJson(str, Object.class);
            return true;
        } catch (JsonSyntaxException unused) {
            return false;
        }
    }

    public static JsCallJava newInstance() {
        return new JsCallJava();
    }

    private void parseMessage(String str) {
        Uri uri;
        if (str.startsWith(JS_BRIDGE_PROTOCOL_SCHEMA) && (uri = Uri.parse(str)) != null) {
            this.mClassName = uri.getHost();
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                this.mMethodName = "";
            } else {
                this.mMethodName = path.replace("/", "");
            }
            try {
                this.mPort = String.valueOf(uri.getPort());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                this.mParams = new JSONObject();
                String encodedQuery = uri.getEncodedQuery();
                if (!TextUtils.isEmpty(encodedQuery) && isJSONValid(encodedQuery)) {
                    this.mParams = new JSONObject(encodedQuery);
                } else {
                    if (TextUtils.isEmpty(encodedQuery)) {
                        return;
                    }
                    this.mParams = new JSONObject(str.substring(str.indexOf("?{") + 1));
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                HashMap map = new HashMap();
                if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                    for (String str2 : queryParameterNames) {
                        map.put(str2, uri.getQueryParameter(str2));
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                this.mParams = new JSONObject(map);
            }
        }
    }

    public void call(WebView webView, WeakHandler weakHandler, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        parseMessage(str);
        invokeNativeMethod(webView, weakHandler);
    }

    public void notifyAlipay(WebView webView, boolean z) {
        if (webView != null) {
            JavaCallJs javaCallJsNewInstance = JavaCallJs.newInstance(webView, JavaCallJs.JS_METHOD_NOTIFY_ALIPAY);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("payStatus", z ? "1" : "0");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            javaCallJsNewInstance.call(true, jSONObject, "0");
        }
    }
}
