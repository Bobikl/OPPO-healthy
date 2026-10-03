package com.platform.sdk.center.webview.js.Executor;

import android.text.TextUtils;
import com.heytap.usercenter.accountsdk.AccountAgent;
import com.heytap.webpro.jsapi.BaseJsApiExecutor;
import com.heytap.webpro.jsapi.JsApiResponse;
import com.oplus.aiunit.vision.cqg;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.pr9;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
@cqg(score = 1)
@Keep
@dja(method = AcCommonApiMethod.SUPPORT_COUNTRY, product = "vip")
public class SupportAccountCountryExecutor extends BaseJsApiExecutor {
    private static final String TAG = "SupportAccountCountryExecutor";

    @Override // com.heytap.webpro.jsapi.BaseJsApiExecutor
    public void handleJsApi(pr9 pr9Var, jja jjaVar, kr9 kr9Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            boolean zIsSupportAccountCountry = AccountAgent.isSupportAccountCountry(BaseApp.mContext);
            if (TextUtils.isEmpty("") || new JSONObject("").optJSONObject("route") == null) {
                zIsSupportAccountCountry = false;
            }
            jSONObject.put("support_route_switch", zIsSupportAccountCountry);
            JsApiResponse.invokeSuccess(kr9Var, jSONObject);
        } catch (JSONException e2) {
            UCLogUtil.e(TAG, e2);
            JsApiResponse.invokeFailed(kr9Var);
        }
    }
}
