package com.platform.account.webview.executor.base;

import android.webkit.WebView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alipay.sdk.m.u.h;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.jsapi.IJsApiExecutor;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.JsApi;
import com.heytap.webview.extension.jsapi.JsApiObject;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.aiunit.vision.bn;
import com.oplus.aiunit.vision.ts9;
import com.oplus.aiunit.vision.z80;
import com.platform.account.webview.api.IJsApiInterceptor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class BaseJsApiExecutor implements IJsApiExecutor {
    private static final String TAG = "BaseJsApiExecutor";

    @NonNull
    private static String getNonNullMsg(String str) {
        return str == null ? AcBaseTraceHelper.VAL_FAIL : str;
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiExecutor
    public void execute(IJsApiFragmentInterface iJsApiFragmentInterface, JsApiObject jsApiObject, IJsApiCallback iJsApiCallback) {
        StringBuilder sb;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                if (interceptJsApi(iJsApiFragmentInterface.getWebView(WebView.class).getUrl(), iJsApiFragmentInterface, jsApiObject, iJsApiCallback)) {
                    bn.c(TAG, "jsapi intercepted");
                    throw new Exception("jsapi intercepted");
                }
                if (((JsApi) getClass().getAnnotation(JsApi.class)) == null) {
                    throw new IllegalArgumentException("this class is not a class for js api!");
                }
                handleJsApi(iJsApiFragmentInterface, jsApiObject, iJsApiCallback);
                sb = new StringBuilder();
                sb.append("JsApiExecutor deltaTime=");
                sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                bn.c(TAG, sb.toString());
            } catch (Exception e2) {
                invokeFailed(iJsApiCallback, e2);
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            bn.c(TAG, "JsApiExecutor deltaTime=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            throw th;
        }
    }

    public void handleJsApi(IJsApiFragmentInterface iJsApiFragmentInterface, JsApiObject jsApiObject, IJsApiCallback iJsApiCallback) {
        invokeFailed(iJsApiCallback, 5000, "has no suitable interceptor to handle this js api!");
    }

    public boolean interceptJsApi(String str, IJsApiFragmentInterface iJsApiFragmentInterface, JsApiObject jsApiObject, IJsApiCallback iJsApiCallback) {
        if (!(iJsApiFragmentInterface instanceof ts9)) {
            bn.c(TAG, "fragment is not instance of IModule, do not intercept");
            return false;
        }
        String businessModule = ((ts9) iJsApiFragmentInterface).getBusinessModule();
        if (z80.a(businessModule) == null) {
            bn.c(TAG, "appConfig is null, do not intercept");
            return false;
        }
        IJsApiInterceptor jsApiInterceptor = z80.a(businessModule).getJsApiInterceptor();
        if (jsApiInterceptor != null) {
            return jsApiInterceptor.intercept(str, iJsApiFragmentInterface, jsApiObject, iJsApiCallback);
        }
        bn.c(TAG, "jsApiInterceptor is null, do not intercept");
        return false;
    }

    public void invokeFailed(IJsApiCallback iJsApiCallback) {
        iJsApiCallback.fail(3, AcBaseTraceHelper.VAL_FAIL);
    }

    public void invokeSuccess(IJsApiCallback iJsApiCallback) {
        iJsApiCallback.success(new JSONObject());
    }

    public void onFailed(IJsApiCallback iJsApiCallback) {
        iJsApiCallback.fail(5999, h.i);
    }

    public void onSuccess(IJsApiCallback iJsApiCallback) {
        iJsApiCallback.success(new JSONObject());
    }

    public void invokeFailed(IJsApiCallback iJsApiCallback, String str) {
        iJsApiCallback.fail(3, getNonNullMsg(str));
    }

    public void invokeSuccess(IJsApiCallback iJsApiCallback, @NonNull JSONObject jSONObject) {
        iJsApiCallback.success(jSONObject);
    }

    public void onFailed(IJsApiCallback iJsApiCallback, Throwable th) {
        iJsApiCallback.fail(3, getNonNullMsg(th.getMessage()));
    }

    public void onSuccess(IJsApiCallback iJsApiCallback, @NonNull JSONObject jSONObject) {
        iJsApiCallback.success(jSONObject);
    }

    public void invokeFailed(IJsApiCallback iJsApiCallback, int i, String str) {
        iJsApiCallback.fail(Integer.valueOf(i), getNonNullMsg(str));
    }

    public void onFailed(IJsApiCallback iJsApiCallback, String str) {
        iJsApiCallback.fail(5999, getNonNullMsg(str));
    }

    public void invokeFailed(IJsApiCallback iJsApiCallback, Throwable th) {
        iJsApiCallback.fail(3, getNonNullMsg(th.getMessage()));
    }

    public void onFailed(IJsApiCallback iJsApiCallback, int i, String str) {
        iJsApiCallback.fail(Integer.valueOf(i), getNonNullMsg(str));
    }
}
