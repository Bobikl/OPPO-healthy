package com.sensorsdata.analytics.android.webview.impl;

import android.content.Context;
import android.webkit.WebView;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import com.sensorsdata.analytics.android.sdk.jsbridge.AppWebViewInterface;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SAWebViewProtocolImpl {
    private static final String TAG = "SA.WebViewProtocolImpl";
    private final String JS_BRIDGE = "SensorsData_APP_JS_Bridge";
    private final Context mContext;

    public SAWebViewProtocolImpl(SAContextManager sAContextManager) {
        this.mContext = sAContextManager.getContext();
    }

    private void showUpWebView(WebView webView, JSONObject jSONObject, boolean z, boolean z2) {
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface(new AppWebViewInterface(this.mContext, jSONObject, z2, webView), "SensorsData_APP_JS_Bridge");
            SAModuleManager.getInstance().invokeModuleFunction(Modules.Visual.MODULE_NAME, Modules.Visual.METHOD_ADD_VISUAL_JAVASCRIPTINTERFACE, webView);
        }
    }

    private void showUpX5WebView(Object obj, JSONObject jSONObject, boolean z, boolean z2) {
        if (obj == null) {
            return;
        }
        try {
            Method method = obj.getClass().getMethod("addJavascriptInterface", Object.class, String.class);
            if (method == null) {
                return;
            }
            method.invoke(obj, new AppWebViewInterface(this.mContext, jSONObject, z2), "SensorsData_APP_JS_Bridge");
            SAModuleManager.getInstance().invokeModuleFunction(Modules.Visual.MODULE_NAME, Modules.Visual.METHOD_ADD_VISUAL_JAVASCRIPTINTERFACE, obj);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public <T> T invokeModuleFunction(String str, Object... objArr) {
        str.hashCode();
        if (str.equals(Modules.WebView.METHOD_SHOWUP_X5WEBVIEW)) {
            showUpX5WebView(objArr[0], (JSONObject) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
            return null;
        }
        if (!str.equals(Modules.WebView.METHOD_SHOWUP_WEBVIEW)) {
            return null;
        }
        showUpWebView((WebView) objArr[0], (JSONObject) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
        return null;
    }
}
