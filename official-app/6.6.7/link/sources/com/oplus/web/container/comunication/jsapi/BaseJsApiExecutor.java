package com.oplus.web.container.comunication.jsapi;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.l2a;
import com.oplus.aiunit.vision.mka;
import com.oplus.aiunit.vision.rs9;
import com.oplus.aiunit.vision.ska;
import com.oplus.aiunit.vision.ss9;
import com.oplus.aiunit.vision.tfg;
import com.oplus.aiunit.vision.ttg;
import com.oplus.aiunit.vision.us9;
import com.oplus.aiunit.vision.ws9;
import com.oplus.aiunit.vision.y8b;
import com.oplus.web.container.comunication.common.exception.NotGrantException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public abstract class BaseJsApiExecutor implements ss9 {
    private static final String TAG = "BaseJsApiExecutor";
    protected String currUrl = "";

    public void checkHostSecurityLevel(String str) throws NotGrantException {
        ttg ttgVar = (ttg) getClass().getAnnotation(ttg.class);
        if (ttgVar == null) {
            y8b.l(TAG, "checkHostSecurityLevel securityExecutor is null!");
        } else if (!tfg.d(str, ttgVar.level().value)) {
            throw new NotGrantException("the domain's security level is not enough, please apply for permission");
        }
    }

    @Override // com.oplus.aiunit.vision.ss9
    public void execute(us9 us9Var, ska skaVar, rs9 rs9Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        l2a webView = us9Var.getWebView();
        if (webView == null) {
            y8b.a(TAG, "JsApiExecutor execute webview is null");
            return;
        }
        String url = webView.getUrl();
        this.currUrl = url;
        try {
            checkHostSecurityLevel(url);
            mka mkaVar = (mka) getClass().getAnnotation(mka.class);
            if (mkaVar == null) {
                throw new IllegalArgumentException("this class is not a class for js api!");
            }
            String productId = us9Var.getProductId();
            ws9 ws9VarN = webView.n(productId, mkaVar.product(), mkaVar.method());
            y8b.c(TAG, "JsApiExecutor productId=%s, product=%s, method=%s, interceptor=%s deltaTime=%s", productId, mkaVar.product(), mkaVar.method(), ws9VarN, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            if (ws9VarN != null && ws9VarN.a(us9Var, skaVar, rs9Var)) {
                y8b.e(TAG, "JsApiExecutor deltaTime=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                handleJsApi(us9Var, skaVar, rs9Var);
                y8b.e(TAG, "JsApiExecutor deltaTime=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            try {
                invokeFailed(rs9Var, th);
            } finally {
                y8b.e(TAG, "JsApiExecutor deltaTime=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        }
    }

    public void handleJsApi(us9 us9Var, ska skaVar, rs9 rs9Var) throws Throwable {
        invokeFailed(rs9Var, 5000, "has no suitable interceptor to handle this js api!");
    }

    public void invokeFailed(rs9 rs9Var) {
        JsApiResponse.invokeFailed(rs9Var);
    }

    public void invokeSuccess(rs9 rs9Var) {
        JsApiResponse.invokeSuccess(rs9Var);
    }

    public void invokeFailed(rs9 rs9Var, String str) {
        JsApiResponse.invokeFailed(rs9Var, str);
    }

    public void invokeSuccess(rs9 rs9Var, @NonNull JSONObject jSONObject) {
        JsApiResponse.invokeSuccess(rs9Var, jSONObject);
    }

    public void invokeFailed(rs9 rs9Var, int i, String str) {
        JsApiResponse.invokeFailed(rs9Var, i, str);
    }

    public void invokeFailed(rs9 rs9Var, Throwable th) {
        JsApiResponse.invokeFailed(rs9Var, th);
    }
}
