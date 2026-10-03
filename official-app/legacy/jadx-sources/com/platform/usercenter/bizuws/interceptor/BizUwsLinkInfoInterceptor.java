package com.platform.usercenter.bizuws.interceptor;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.pr9;
import com.oplus.aiunit.vision.q51;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import com.platform.usercenter.account.newcommon.router.LinkInfoHelp;
import com.platform.usercenter.account.proxy.entity.LinkDataAccount;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class BizUwsLinkInfoInterceptor extends q51 {
    public BizUwsLinkInfoInterceptor() {
        super("vip", AcCommonApiMethod.LAUNCH_ACTIVITY);
    }

    @Override // com.oplus.aiunit.vision.rr9
    public boolean intercept(@NonNull pr9 pr9Var, @NonNull jja jjaVar, @NonNull kr9 kr9Var) throws Throwable {
        launchActivity(pr9Var.getActivity(), jjaVar.getJsonObject().optJSONObject("linkInfo"));
        onSuccess(kr9Var);
        return true;
    }

    public void launchActivity(Context context, JSONObject jSONObject) {
        if (context == null || jSONObject == null || TextUtils.isEmpty(jSONObject.toString())) {
            throw new IllegalArgumentException();
        }
        LinkInfo linkInfoFromAccount = LinkInfoHelp.getLinkInfoFromAccount(context, (LinkDataAccount) new Gson().fromJson(jSONObject.toString(), LinkDataAccount.class));
        if (linkInfoFromAccount != null) {
            linkInfoFromAccount.callType = LinkInfo.CALL_TYPE_H5;
            linkInfoFromAccount.open(context);
        }
    }
}
