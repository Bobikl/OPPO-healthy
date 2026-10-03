package com.oplus.web.container.comunication.jsapi;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.dqg;
import com.oplus.aiunit.vision.e1a;
import com.oplus.aiunit.vision.eja;
import com.oplus.aiunit.vision.icg;
import com.oplus.aiunit.vision.kja;
import com.oplus.aiunit.vision.lr9;
import com.oplus.aiunit.vision.m7b;
import com.oplus.aiunit.vision.mr9;
import com.oplus.aiunit.vision.or9;
import com.oplus.aiunit.vision.qr9;
import com.oplus.web.container.comunication.common.exception.NotGrantException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class BaseJsApiExecutor implements mr9 {
    private static final String TAG = "BaseJsApiExecutor";
    protected String currUrl = "";

    public void checkHostSecurityLevel(String str) throws NotGrantException {
        dqg dqgVar = (dqg) getClass().getAnnotation(dqg.class);
        if (dqgVar == null) {
            m7b.l(TAG, "checkHostSecurityLevel securityExecutor is null!");
        } else if (!icg.d(str, dqgVar.level().value)) {
            throw new NotGrantException("the domain's security level is not enough, please apply for permission");
        }
    }

    @Override // com.oplus.aiunit.vision.mr9
    public void execute(or9 or9Var, kja kjaVar, lr9 lr9Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e1a webView = or9Var.getWebView();
        if (webView == null) {
            m7b.a(TAG, "JsApiExecutor execute webview is null");
            return;
        }
        String url = webView.getUrl();
        this.currUrl = url;
        try {
            checkHostSecurityLevel(url);
            eja ejaVar = (eja) getClass().getAnnotation(eja.class);
            if (ejaVar == null) {
                throw new IllegalArgumentException("this class is not a class for js api!");
            }
            String productId = or9Var.getProductId();
            qr9 qr9VarN = webView.n(productId, ejaVar.product(), ejaVar.method());
            m7b.c(TAG, "JsApiExecutor productId=%s, product=%s, method=%s, interceptor=%s deltaTime=%s", productId, ejaVar.product(), ejaVar.method(), qr9VarN, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            if (qr9VarN != null && qr9VarN.a(or9Var, kjaVar, lr9Var)) {
                m7b.e(TAG, "JsApiExecutor deltaTime=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                handleJsApi(or9Var, kjaVar, lr9Var);
                m7b.e(TAG, "JsApiExecutor deltaTime=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            try {
                invokeFailed(lr9Var, th);
            } finally {
                m7b.e(TAG, "JsApiExecutor deltaTime=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        }
    }

    public void handleJsApi(or9 or9Var, kja kjaVar, lr9 lr9Var) throws Throwable {
        invokeFailed(lr9Var, 5000, "has no suitable interceptor to handle this js api!");
    }

    public void invokeFailed(lr9 lr9Var) {
        JsApiResponse.invokeFailed(lr9Var);
    }

    public void invokeSuccess(lr9 lr9Var) {
        JsApiResponse.invokeSuccess(lr9Var);
    }

    public void invokeFailed(lr9 lr9Var, String str) {
        JsApiResponse.invokeFailed(lr9Var, str);
    }

    public void invokeSuccess(lr9 lr9Var, @NonNull JSONObject jSONObject) {
        JsApiResponse.invokeSuccess(lr9Var, jSONObject);
    }

    public void invokeFailed(lr9 lr9Var, int i, String str) {
        JsApiResponse.invokeFailed(lr9Var, i, str);
    }

    public void invokeFailed(lr9 lr9Var, Throwable th) {
        JsApiResponse.invokeFailed(lr9Var, th);
    }
}
