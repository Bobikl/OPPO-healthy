package com.platform.usercenter.jsbridge;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

    private void invokeNativeMethod(WebView webView, Handler handler) {
        Method methodFindMethod = NativeMethodInjectHelper.getInstance().findMethod(this.mClassName, this.mMethodName);
        JsCallback jsCallbackNewInstance = JsCallback.newInstance(webView, this.mPort);
        if (methodFindMethod == null) {
            JsCallback.invokeJsCallback(jsCallbackNewInstance, false, null, "Method (" + this.mMethodName + ") in this class (" + this.mClassName + ") not found!");
            return;
        }
        try {
            methodFindMethod.invoke(null, webView, this.mParams, jsCallbackNewInstance, handler);
        } catch (IllegalAccessException e2) {
            UCLogUtil.e(e2);
        } catch (InvocationTargetException e3) {
            UCLogUtil.e(e3);
        }
    }

    public static JsCallJava newInstance() {
        return new JsCallJava();
    }

    private void parseMessage(String str) {
        if (str.startsWith(JS_BRIDGE_PROTOCOL_SCHEMA)) {
            char c2 = "#".toCharArray()[0];
            if (str.contains("#")) {
                str = str.replace(c2, (char) 8203);
            }
            Uri uri = Uri.parse(str);
            this.mClassName = uri.getHost();
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                this.mMethodName = "";
            } else {
                this.mMethodName = path.replace("/", "");
            }
            this.mPort = String.valueOf(uri.getPort());
            String query = uri.getQuery();
            if (query == null) {
                UCLogUtil.w(JS_BRIDGE_PROTOCOL_SCHEMA, "uri.getQuery is null");
                return;
            }
            try {
                if (query.contains("\u200b")) {
                    query = query.replace((char) 8203, c2);
                }
                this.mParams = new JSONObject(query);
            } catch (JSONException e2) {
                UCLogUtil.e(e2);
                this.mParams = new JSONObject();
            }
        }
    }

    public void call(WebView webView, Handler handler, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        parseMessage(str);
        invokeNativeMethod(webView, handler);
    }
}
