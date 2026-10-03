package com.heytap.webpro.jsbridge.executor.android_basic;

import androidx.annotation.Keep;
import com.heytap.webpro.jsapi.BaseJsApiExecutor;
import com.oplus.aiunit.vision.cqg;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.pr9;
import com.oplus.aiunit.vision.rg3;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@cqg(score = 30)
@Keep
@dja(method = AcCommonApiMethod.COPY_CODE, product = "vip")
public class CopyCodeExecutor extends BaseJsApiExecutor {
    @Override // com.heytap.webpro.jsapi.BaseJsApiExecutor
    public void handleJsApi(pr9 pr9Var, jja jjaVar, kr9 kr9Var) throws Throwable {
        String strD = jjaVar.d("code");
        rg3.a(pr9Var.getActivity(), strD);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", strD);
        invokeSuccess(kr9Var, jSONObject);
    }
}
