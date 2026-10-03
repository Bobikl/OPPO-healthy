package com.heytap.health.wallet.jsbridge;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.t6b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class JsCallJava {
    private static final String JS_BRIDGE_PROTOCOL_SCHEMA = "rainbow";
    private static final String TAG = "JsCallJava";
    private static final List<String> domainList;
    private static final HashMap<String, Boolean> domainMemoryMap;
    private String className;
    private String methodName;
    private JSONObject params;
    private String port;

    static {
        ArrayList arrayList = new ArrayList();
        domainList = arrayList;
        arrayList.add(".keke.cn");
        arrayList.add(".nearme.com.cn");
        arrayList.add(".oppopay.com");
        arrayList.add(".oppoer.me");
        arrayList.add(".oppomobile.com");
        arrayList.add(".opposhop.cn");
        arrayList.add(".alipay.com");
        arrayList.add(".tenpay.com");
        arrayList.add(".wanyol.com");
        arrayList.add(".oppo.com");
        arrayList.add(".phone580.com");
        arrayList.add(".finzfin.com");
        arrayList.add(".bydauto.com.cn");
        domainMemoryMap = new HashMap<>();
    }

    private JsCallJava() {
    }

    private void invokeNativeMethod(WebView webView) {
        Method methodFindMethod = NativeMethodInjectHelper.getInstance().findMethod(this.className, this.methodName);
        JsCallback jsCallbackNewInstance = JsCallback.newInstance(webView, this.port);
        if (methodFindMethod == null) {
            JsCallback.invokeJsCallback(jsCallbackNewInstance, false, null, "Method (" + this.methodName + ") in this class (" + this.className + ") not found!");
            return;
        }
        try {
            methodFindMethod.invoke(null, this.params, jsCallbackNewInstance);
        } catch (IllegalAccessException e2) {
            t6b.d(TAG, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        } catch (InvocationTargetException e3) {
            t6b.d(TAG, Thread.currentThread().getStackTrace()[1].getMethodName() + e3.getMessage());
        }
    }

    public static boolean isAllowed(String str) {
        if (domainMemoryMap.containsKey(str)) {
            return true;
        }
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        String scheme = uri.getScheme();
        if (scheme != null && host != null && (scheme.startsWith("http") || scheme.startsWith(Const.Scheme.SCHEME_HTTPS))) {
            Iterator<String> it = domainList.iterator();
            while (it.hasNext()) {
                if (host.endsWith(it.next())) {
                    domainMemoryMap.put(str, Boolean.TRUE);
                    return true;
                }
            }
        }
        return false;
    }

    public static JsCallJava newInstance() {
        return new JsCallJava();
    }

    private void parseMessage(String str) {
        if (str.startsWith(JS_BRIDGE_PROTOCOL_SCHEMA)) {
            Uri uri = Uri.parse(str);
            this.className = uri.getHost();
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                this.methodName = "";
            } else {
                this.methodName = path.replace("/", "");
            }
            this.port = String.valueOf(uri.getPort());
            try {
                this.params = new JSONObject(uri.getQuery());
            } catch (JSONException e2) {
                t6b.d(TAG, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
                this.params = new JSONObject();
            }
        }
    }

    public void call(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str) || !isAllowed(webView.getUrl())) {
            return;
        }
        parseMessage(str);
        invokeNativeMethod(webView);
    }
}
