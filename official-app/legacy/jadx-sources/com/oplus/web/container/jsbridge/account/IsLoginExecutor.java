package com.oplus.web.container.jsbridge.account;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.oplus.aiunit.vision.c68;
import com.oplus.aiunit.vision.dqg;
import com.oplus.aiunit.vision.eja;
import com.oplus.aiunit.vision.go3;
import com.oplus.aiunit.vision.kja;
import com.oplus.aiunit.vision.lr9;
import com.oplus.aiunit.vision.m7b;
import com.oplus.aiunit.vision.or9;
import com.oplus.aiunit.vision.qr9;
import com.oplus.web.container.comunication.common.exception.NotImplementException;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@eja(method = "isLogin", product = "vip")
@Keep
@dqg(level = HostSecurityLevel.MEDIUM)
public class IsLoginExecutor extends BaseJsApiExecutor {
    private void getUserEntity(go3<JSONObject> go3Var, lr9 lr9Var) {
        try {
            JSONObject jSONObject = go3Var.b;
            boolean z = (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("secondaryToken"))) ? false : true;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isLogin", Boolean.toString(z));
            invokeSuccess(lr9Var, jSONObject2);
        } catch (JSONException e2) {
            m7b.f(IsLoginExecutor.class.getSimpleName(), "check is login failed!", e2);
            invokeFailed(lr9Var, 5000, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleJsApi$0(lr9 lr9Var, go3 go3Var) {
        if (go3Var.a) {
            getUserEntity(go3Var, lr9Var);
        } else {
            invokeFailed(lr9Var);
        }
    }

    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(or9 or9Var, kja kjaVar, final lr9 lr9Var) throws Throwable {
        LiveData<go3<JSONObject>> liveDataI;
        qr9 qr9VarN = or9Var.getWebView().n(or9Var.getProductId(), "vip", AcCommonApiMethod.GET_TOKEN);
        if (!(qr9VarN instanceof c68) || (liveDataI = ((c68) qr9VarN).i(or9Var.getActivity())) == null) {
            throw new NotImplementException("GetTokenInterceptor not impl");
        }
        liveDataI.observe(or9Var.getActivity(), new Observer() { // from class: com.oplus.aiunit.vision.uga
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$handleJsApi$0(lr9Var, (go3) obj);
            }
        });
    }
}
