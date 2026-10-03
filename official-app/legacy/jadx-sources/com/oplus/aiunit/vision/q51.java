package com.oplus.aiunit.vision;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.heytap.webpro.jsapi.JsApiResponse;
import com.heytap.webpro.score.WebProScoreManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q51 implements rr9 {
    private static final String TAG = "AbsJsApiInterceptor";

    @NonNull
    private final String mJsApiMethod;
    private final String mJsApiProduct;

    public q51(@NonNull String str, @NonNull String str2) {
        this.mJsApiProduct = str;
        this.mJsApiMethod = str2;
    }

    @Override // com.oplus.aiunit.vision.rr9
    @NonNull
    public String getJsApiMethod() {
        return this.mJsApiMethod;
    }

    @Override // com.oplus.aiunit.vision.rr9
    @NonNull
    public String getJsApiProduct() {
        return this.mJsApiProduct;
    }

    public int getScore(pr9 pr9Var, int i) {
        return WebProScoreManager.d().e(pr9Var.getWebView(WebView.class).getUrl(), i);
    }

    public void onFailed(kr9 kr9Var) {
        onFailed(kr9Var, com.alipay.sdk.m.u.h.i);
    }

    public void onSuccess(kr9 kr9Var) {
        onSuccess(kr9Var, new JSONObject());
    }

    public void onFailed(kr9 kr9Var, Throwable th) {
        JsApiResponse.invokeFailed(kr9Var, th);
    }

    public void onSuccess(kr9 kr9Var, @NonNull JSONObject jSONObject) {
        kr9Var.success(jSONObject);
    }

    public void onFailed(kr9 kr9Var, String str) {
        onFailed(kr9Var, 5999, str);
    }

    public void onFailed(kr9 kr9Var, int i, String str) {
        JsApiResponse.invokeFailed(kr9Var, i, str);
    }
}
