package com.heytap.webpro.jsbridge.executor.jump;

import androidx.annotation.Keep;
import com.heytap.webpro.jsapi.BaseJsApiExecutor;
import com.oplus.aiunit.vision.cqg;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.pr9;
import com.oplus.aiunit.vision.rma;
import com.oplus.pantanal.seedling.constants.TraceConstants;

/* JADX INFO: loaded from: classes3.dex */
@cqg(score = 1)
@Keep
@dja(method = "openApp", product = "vip")
public class OpenAppExecutor extends BaseJsApiExecutor {
    @Override // com.heytap.webpro.jsapi.BaseJsApiExecutor
    public void handleJsApi(pr9 pr9Var, jja jjaVar, kr9 kr9Var) throws Throwable {
        if (rma.a(pr9Var.getActivity(), jjaVar.d(TraceConstants.KEY_PKG_NAME))) {
            invokeSuccess(kr9Var);
        } else {
            invokeFailed(kr9Var, "jump fail");
        }
    }
}
