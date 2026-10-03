package com.oplus.pay.opensdk.chain;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.oplus.aiunit.vision.dde;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.sde;
import com.oplus.aiunit.vision.wx9;
import com.oplus.pay.opensdk.eum.PaySdkEnum;
import com.oplus.pay.opensdk.model.CashierHost;
import com.oplus.pay.opensdk.model.CashierType;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.model.TargetHostAppInfo;
import com.oplus.pay.opensdk.model.response.RouterConfigResponse;
import com.oplus.pay.opensdk.router.RouterHelper;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.oplus.pay.opensdk.utils.Resource;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class d implements g {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Context context, PreOrderParameters preOrderParameters, Resource resource, a aVar, g.a aVar2, boolean z, String str) {
        f(context, str, preOrderParameters, resource, aVar, aVar2, z, preOrderParameters.mCountryCode, preOrderParameters.userRegisterCountry);
    }

    @Override // com.oplus.pay.opensdk.chain.g
    public void a(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2) {
        pce.b("CheckLaunchModel");
        boolean z = !TextUtils.isEmpty(preOrderParameters.prePayToken);
        CashierHost cashierHost = CashierHost.SECURE_APP;
        if (!cashierHost.getHost().equalsIgnoreCase(preOrderParameters.defaultStrategy)) {
            String str = preOrderParameters.inputParameters;
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0035;
            sde.d(str, value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), "", transactionProcessStatusCodes.getDesc(), "", "");
            e(context, preOrderParameters, resource, aVar, aVar2, z);
            return;
        }
        pce.b("CheckLaunchModel#defaultStrategy");
        c(context, preOrderParameters, resource, aVar, aVar2, z);
        String str2 = preOrderParameters.inputParameters;
        String value2 = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes2 = TransactionProcessStatusCodes.CODE_00_000_0030;
        sde.c(str2, value2, transactionProcessStatusCodes2.getStatusCode(), BizResult.WARN.getValue(), transactionProcessStatusCodes2.getDesc(), transactionProcessStatusCodes2.getStatusCode(), "", cashierHost.getHost());
    }

    public final void c(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2, boolean z) {
        RouterConfigResponse.RouterRule routerRule = new RouterConfigResponse.RouterRule();
        routerRule.cashierHost = CashierHost.SECURE_APP.getHost();
        routerRule.cashierType = CashierType.APP.getValue();
        Pair<TargetHostAppInfo, String> pairK = RouterHelper.k(context, routerRule, z);
        TargetHostAppInfo targetHostAppInfo = (TargetHostAppInfo) pairK.first;
        if (targetHostAppInfo == null) {
            d(context, preOrderParameters, resource, aVar, aVar2, z, PaySdkEnum.CheckDefaultRouterForDownload, (String) pairK.second);
        } else {
            h(preOrderParameters, targetHostAppInfo);
            aVar.a(context, preOrderParameters, resource, aVar, aVar2);
        }
    }

    public final void d(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2, boolean z, PaySdkEnum paySdkEnum, String str) {
        Pair<TargetHostAppInfo, Boolean> pairF = RouterHelper.f(context, z);
        if (!((Boolean) pairF.second).booleanValue()) {
            h(preOrderParameters, (TargetHostAppInfo) pairF.first);
            aVar.a(context, preOrderParameters, resource, aVar, aVar2);
            return;
        }
        pce.b("CheckLaunchModel#" + paySdkEnum.name());
        if (TextUtils.isEmpty(str)) {
            str = paySdkEnum.getMsg();
        }
        resource.updateStatus(paySdkEnum.getCode(), str);
        aVar.a(context, preOrderParameters, resource, aVar, aVar2);
        sde.c(preOrderParameters.inputParameters, BizNode.START_PAY.getValue(), TransactionProcessStatusCodes.CODE_00_000_0030.getStatusCode(), BizResult.ERROR.getValue(), "download secure payment app", "", "", CashierHost.SECURE_APP.getHost());
    }

    public final void e(final Context context, final PreOrderParameters preOrderParameters, final Resource<Intent> resource, final a aVar, final g.a aVar2, final boolean z) {
        RouterHelper.p(context, preOrderParameters, new wx9() { // from class: com.oplus.aiunit.vision.z93
            @Override // com.oplus.aiunit.vision.wx9
            public final void a(String str) {
                this.a.g(context, preOrderParameters, resource, aVar, aVar2, z, str);
            }
        });
    }

    public final void f(Context context, String str, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2, boolean z, String str2, String str3) {
        Pair<RouterConfigResponse.RouterRule, String> pairM = RouterHelper.m(context, str, str2, str3);
        if (pairM.first == null) {
            d(context, preOrderParameters, resource, aVar, aVar2, z, PaySdkEnum.CheckRouterFailForDownLoad, (String) pairM.second);
            String str4 = preOrderParameters.inputParameters;
            String value = BizNode.START_PAY.getValue();
            String statusCode = TransactionProcessStatusCodes.CODE_00_000_0030.getStatusCode();
            String value2 = BizResult.WARN.getValue();
            Object obj = pairM.second;
            sde.c(str4, value, statusCode, value2, (String) obj, (String) obj, "", CashierHost.SECURE_APP.getHost());
            return;
        }
        pce.b("finalRouterInfo:" + ((RouterConfigResponse.RouterRule) pairM.first).cashierHost);
        Pair<TargetHostAppInfo, String> pairK = RouterHelper.k(context, (RouterConfigResponse.RouterRule) pairM.first, z);
        Object obj2 = pairK.first;
        if (obj2 != null) {
            h(preOrderParameters, (TargetHostAppInfo) obj2);
            aVar.a(context, preOrderParameters, resource, aVar, aVar2);
            return;
        }
        d(context, preOrderParameters, resource, aVar, aVar2, z, PaySdkEnum.CheckRouterInfoForDownload, (String) pairK.second);
        String str5 = preOrderParameters.inputParameters;
        String value3 = BizNode.START_PAY.getValue();
        String statusCode2 = TransactionProcessStatusCodes.CODE_00_000_0030.getStatusCode();
        String value4 = BizResult.WARN.getValue();
        Object obj3 = pairK.second;
        sde.c(str5, value3, statusCode2, value4, (String) obj3, (String) obj3, "", CashierHost.SECURE_APP.getHost());
    }

    public final void h(PreOrderParameters preOrderParameters, TargetHostAppInfo targetHostAppInfo) {
        preOrderParameters.launchModel = targetHostAppInfo.getTargetHost();
        i(preOrderParameters, targetHostAppInfo);
        sde.b(preOrderParameters.inputParameters, BizNode.START_PAY.getValue(), TransactionProcessStatusCodes.CODE_00_000_0031.getStatusCode(), BizResult.SUCCESS.getValue(), "", preOrderParameters.launchModel);
    }

    public final void i(PreOrderParameters preOrderParameters, TargetHostAppInfo targetHostAppInfo) {
        try {
            String targetAction = targetHostAppInfo.getTargetAction();
            JSONObject jSONObject = new JSONObject(preOrderParameters.inputParameters);
            jSONObject.put(dde.TARGET_ACTION, targetAction);
            jSONObject.put(dde.NON_PRE_ORDER_ACTION, targetHostAppInfo.getNoPreAction());
            jSONObject.put(dde.PRE_ORDER_ACTION, targetHostAppInfo.getPreAction());
            jSONObject.put(dde.TARGET_PACKAGE_NAME, targetHostAppInfo.getTargetPackageName());
            jSONObject.put(dde.TARGET_CASHIER_TYPE, targetHostAppInfo.getTargetCashierType());
            jSONObject.put(dde.TARGET_CASHIER_LINK_URL, targetHostAppInfo.getTargetCashierLinkUrl());
            preOrderParameters.inputParameters = jSONObject.toString();
        } catch (JSONException e) {
            pce.c("checkLaunchModel updateTargetInfo error" + e);
            sde.m(BizNode.START_PAY.getValue(), TransactionProcessStatusCodes.CODE_00_000_0032.getStatusCode(), BizResult.WARN.getValue(), "checkLaunchModel updateTargetInfo error" + e.getMessage());
        }
    }
}
