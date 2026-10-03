package com.heytap.webpro.executor;

import androidx.annotation.Keep;
import com.heytap.webpro.core.WebProFragment;
import com.heytap.webpro.jsapi.BaseJsApiExecutor;
import com.oplus.aiunit.vision.cqg;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.pr9;

/* JADX INFO: loaded from: classes3.dex */
@cqg(score = 0)
@Keep
@dja(method = "getVisibleInfo", product = "vip")
public class GetVisibleInfoExecutor extends BaseJsApiExecutor {
    @Override // com.heytap.webpro.jsapi.BaseJsApiExecutor
    public void handleJsApi(pr9 pr9Var, jja jjaVar, kr9 kr9Var) throws Throwable {
        if (pr9Var instanceof WebProFragment) {
            invokeSuccess(kr9Var, ((WebProFragment) pr9Var).getVisibleInfo());
        } else {
            super.handleJsApi(pr9Var, jjaVar, kr9Var);
        }
    }
}
