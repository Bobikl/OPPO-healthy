package com.heytap.webpro.jsapi;

import android.webkit.WebView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.webpro.common.exception.NotGrantException;
import com.heytap.webpro.score.WebProScoreManager;
import com.oplus.aiunit.vision.cqg;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.nr9;
import com.oplus.aiunit.vision.oja;
import com.oplus.aiunit.vision.pr9;
import com.oplus.aiunit.vision.q7b;
import com.oplus.aiunit.vision.rr9;
import com.oplus.aiunit.vision.zmk;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public abstract class BaseJsApiExecutor implements nr9 {
    private static final String TAG = "BaseJsApiExecutor";
    protected oja serviceManager = null;
    protected String currUrl = "";

    public void checkScorePass(String str) throws NotGrantException {
        cqg cqgVar = (cqg) getClass().getAnnotation(cqg.class);
        if (cqgVar == null) {
            q7b.n(TAG, "checkScorePass securityExecutor is null!");
            return;
        }
        int iScore = cqgVar.score();
        int score = getScore(str, cqgVar.permissionType());
        if (score >= iScore) {
            return;
        }
        q7b.c(TAG, "checkScorePass host=%s, urlScore=%s, minScore=%s", zmk.a(str), Integer.valueOf(score), Integer.valueOf(iScore));
        throw new NotGrantException("the domain's security score is not enough, please apply for permission");
    }

    @Override // com.oplus.aiunit.vision.nr9
    public void execute(pr9 pr9Var, jja jjaVar, kr9 kr9Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.serviceManager = oja.c();
        String url = pr9Var.getWebView(WebView.class).getUrl();
        this.currUrl = url;
        try {
            checkScorePass(url);
            dja djaVar = (dja) getClass().getAnnotation(dja.class);
            if (djaVar == null) {
                throw new IllegalArgumentException("this class is not a class for js api!");
            }
            String productId = pr9Var.getProductId();
            rr9 rr9VarD = this.serviceManager.d(productId, djaVar.product(), djaVar.method());
            q7b.c(TAG, "JsApiExecutor productId=%s, product=%s, method=%s, interceptor=%s deltaTime=%s", productId, djaVar.product(), djaVar.method(), rr9VarD, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            if (rr9VarD != null && rr9VarD.intercept(pr9Var, jjaVar, kr9Var)) {
                q7b.e(TAG, "JsApiExecutor deltaTime=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                handleJsApi(pr9Var, jjaVar, kr9Var);
                q7b.e(TAG, "JsApiExecutor deltaTime=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Throwable th) {
            try {
                invokeFailed(kr9Var, th);
            } finally {
                q7b.e(TAG, "JsApiExecutor deltaTime=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        }
    }

    public int getScore(String str, int i) {
        return WebProScoreManager.d().e(str, i);
    }

    public void handleJsApi(pr9 pr9Var, jja jjaVar, kr9 kr9Var) throws Throwable {
        invokeFailed(kr9Var, 5000, "has no suitable interceptor to handle this js api!");
    }

    public void invokeFailed(kr9 kr9Var) {
        JsApiResponse.invokeFailed(kr9Var);
    }

    public void invokeSuccess(kr9 kr9Var) {
        JsApiResponse.invokeSuccess(kr9Var);
    }

    public void invokeFailed(kr9 kr9Var, String str) {
        JsApiResponse.invokeFailed(kr9Var, str);
    }

    public void invokeSuccess(kr9 kr9Var, @NonNull JSONObject jSONObject) {
        JsApiResponse.invokeSuccess(kr9Var, jSONObject);
    }

    public void invokeFailed(kr9 kr9Var, int i, String str) {
        JsApiResponse.invokeFailed(kr9Var, i, str);
    }

    public void invokeFailed(kr9 kr9Var, Throwable th) {
        JsApiResponse.invokeFailed(kr9Var, th);
    }
}
