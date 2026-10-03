package com.heytap.webpro.executor;

import androidx.annotation.Keep;
import com.heytap.webpro.core.WebProFragment;
import com.heytap.webpro.jsapi.BaseJsApiExecutor;
import com.oplus.aiunit.vision.cqg;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.pr9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@cqg(score = 50)
@Keep
@dja(method = "getStartTime", product = "vip")
public class GetStartTimeExecutor extends BaseJsApiExecutor {
    @Override // com.heytap.webpro.jsapi.BaseJsApiExecutor
    public void handleJsApi(pr9 pr9Var, jja jjaVar, kr9 kr9Var) throws Throwable {
        if (!(pr9Var instanceof WebProFragment)) {
            super.handleJsApi(pr9Var, jjaVar, kr9Var);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("getStartTime", ((WebProFragment) pr9Var).getStartTime());
        kr9Var.success(jSONObject);
    }
}
