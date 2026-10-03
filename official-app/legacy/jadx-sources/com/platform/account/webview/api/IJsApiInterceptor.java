package com.platform.account.webview.api;

import androidx.annotation.Keep;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.JsApiObject;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public interface IJsApiInterceptor {
    boolean intercept(String str, IJsApiFragmentInterface iJsApiFragmentInterface, JsApiObject jsApiObject, IJsApiCallback iJsApiCallback);
}
