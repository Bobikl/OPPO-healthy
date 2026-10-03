package com.heytap.webpro.jsbridge.executor.android_basic;

import android.content.Context;
import androidx.annotation.Keep;
import com.heytap.webpro.jsapi.BaseJsApiExecutor;
import com.oplus.aiunit.vision.cqg;
import com.oplus.aiunit.vision.d94;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.lwj;
import com.oplus.aiunit.vision.pr9;
import com.oplus.aiunit.vision.spc;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@cqg(score = 1)
@Keep
@dja(method = "getNetworkInfo", product = "vip")
public class GetNetworkInfoExecutor extends BaseJsApiExecutor {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleJsApi$0(kr9 kr9Var) {
        try {
            invokeSuccess(kr9Var, getNetworkInfo(d94.b()));
        } catch (Throwable th) {
            invokeFailed(kr9Var, th.getMessage());
        }
    }

    public JSONObject getNetworkInfo(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hasConnect", spc.c(context));
        jSONObject.put("networkType", spc.b(context));
        return jSONObject;
    }

    @Override // com.heytap.webpro.jsapi.BaseJsApiExecutor
    public void handleJsApi(pr9 pr9Var, jja jjaVar, final kr9 kr9Var) throws Throwable {
        lwj.k(new Runnable() { // from class: com.oplus.aiunit.vision.t58
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$handleJsApi$0(kr9Var);
            }
        });
    }
}
