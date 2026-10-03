package com.oplus.web.container.jsbridge.account;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.oplus.aiunit.vision.f78;
import com.oplus.aiunit.vision.mka;
import com.oplus.aiunit.vision.rs9;
import com.oplus.aiunit.vision.ska;
import com.oplus.aiunit.vision.ttg;
import com.oplus.aiunit.vision.uo3;
import com.oplus.aiunit.vision.us9;
import com.oplus.aiunit.vision.ws9;
import com.oplus.aiunit.vision.y8b;
import com.oplus.web.container.comunication.common.exception.NotImplementException;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@mka(method = "isLogin", product = "vip")
@ttg(level = HostSecurityLevel.MEDIUM)
public class IsLoginExecutor extends BaseJsApiExecutor {
    private void getUserEntity(uo3<JSONObject> uo3Var, rs9 rs9Var) {
        try {
            JSONObject jSONObject = uo3Var.b;
            boolean z = (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("secondaryToken"))) ? false : true;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isLogin", Boolean.toString(z));
            invokeSuccess(rs9Var, jSONObject2);
        } catch (JSONException e) {
            y8b.f(IsLoginExecutor.class.getSimpleName(), "check is login failed!", e);
            invokeFailed(rs9Var, 5000, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleJsApi$0(rs9 rs9Var, uo3 uo3Var) {
        if (uo3Var.a) {
            getUserEntity(uo3Var, rs9Var);
        } else {
            invokeFailed(rs9Var);
        }
    }

    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(us9 us9Var, ska skaVar, final rs9 rs9Var) throws Throwable {
        LiveData<uo3<JSONObject>> liveDataI;
        ws9 ws9VarN = us9Var.getWebView().n(us9Var.getProductId(), "vip", "getToken");
        if (!(ws9VarN instanceof f78) || (liveDataI = ((f78) ws9VarN).i(us9Var.getActivity())) == null) {
            throw new NotImplementException("GetTokenInterceptor not impl");
        }
        liveDataI.observe(us9Var.getActivity(), new Observer() { // from class: com.oplus.aiunit.vision.cia
            public final void onChanged(Object obj) {
                this.i.lambda$handleJsApi$0(rs9Var, (uo3) obj);
            }
        });
    }
}
