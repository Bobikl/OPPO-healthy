package com.heytap.webview.extension.jsapi;

import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes4.dex */
public interface IJsApiExecutor {
    @UiThread
    void execute(IJsApiFragmentInterface iJsApiFragmentInterface, JsApiObject jsApiObject, IJsApiCallback iJsApiCallback);
}
