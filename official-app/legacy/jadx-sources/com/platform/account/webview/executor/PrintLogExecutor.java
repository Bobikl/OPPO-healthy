package com.platform.account.webview.executor;

import androidx.annotation.Keep;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.JsApi;
import com.heytap.webview.extension.jsapi.JsApiObject;
import com.oplus.aiunit.vision.bq9;
import com.oplus.aiunit.vision.nue;
import com.platform.account.webview.executor.base.BaseJsApiExecutor;

/* JADX INFO: loaded from: classes9.dex */
@JsApi(method = "printLog", product = "vip")
@Keep
public class PrintLogExecutor extends BaseJsApiExecutor {
    private static final String TAG = "PrintLogExecutor";
    private final bq9 mImpl = new nue();

    @Override // com.platform.account.webview.executor.base.BaseJsApiExecutor
    public void handleJsApi(IJsApiFragmentInterface iJsApiFragmentInterface, JsApiObject jsApiObject, IJsApiCallback iJsApiCallback) {
        this.mImpl.a(iJsApiFragmentInterface, jsApiObject, iJsApiCallback, TAG);
    }
}
