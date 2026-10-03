package com.heytap.webpro.executor;

import androidx.annotation.Keep;
import androidx.lifecycle.Observer;
import com.heytap.webpro.core.WebProFragment;
import com.heytap.webpro.jsapi.BaseJsApiExecutor;
import com.oplus.aiunit.vision.cqg;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.pr9;
import com.oplus.aiunit.vision.q7b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@cqg(score = 90)
@Keep
@dja(method = "getCacheData", product = "vip")
public class GetPreloadInfoExecutor extends BaseJsApiExecutor {
    private static final String TAG = "GetPreloadInfoExecutor";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleJsApi$0(kr9 kr9Var, JSONObject jSONObject) {
        q7b.j(TAG, "getCacheData success：%s", jSONObject);
        if (jSONObject != null) {
            invokeSuccess(kr9Var, jSONObject);
        } else {
            q7b.i(TAG, "getCacheData failed, data is null");
            invokeBusiness(kr9Var, 5020, "data is null");
        }
    }

    @Override // com.heytap.webpro.jsapi.BaseJsApiExecutor
    public void handleJsApi(pr9 pr9Var, jja jjaVar, final kr9 kr9Var) throws Throwable {
        if (pr9Var instanceof WebProFragment) {
            ((WebProFragment) pr9Var).getCacheData().observe(pr9Var.getActivity(), new Observer() { // from class: com.oplus.aiunit.vision.u58
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.i.lambda$handleJsApi$0(kr9Var, (JSONObject) obj);
                }
            });
        } else {
            invokeBusiness(kr9Var, 4021, "fragment is not instance com.heytap.webpro.core.PreloadWebProFragment");
        }
    }

    public void invokeBusiness(kr9 kr9Var, int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("msg", str);
            invokeSuccess(kr9Var, jSONObject);
        } catch (JSONException e2) {
            q7b.g(TAG, e2);
            invokeFailed(kr9Var, e2.getMessage());
        }
    }
}
