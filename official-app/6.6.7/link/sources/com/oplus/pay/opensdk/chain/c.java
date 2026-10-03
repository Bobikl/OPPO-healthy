package com.oplus.pay.opensdk.chain;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.oplus.aiunit.vision.dde;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.sde;
import com.oplus.aiunit.vision.vde;
import com.oplus.pay.opensdk.eum.PaySdkEnum;
import com.oplus.pay.opensdk.model.CashierHost;
import com.oplus.pay.opensdk.model.CashierType;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.oplus.pay.opensdk.utils.Resource;
import com.oplus.utrace.utils.DcsCommon;
import com.oplusos.sau.common.utils.SauAarConstants;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class c implements g {
    @Override // com.oplus.pay.opensdk.chain.g
    public void a(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2) {
        pce.b("CheckIntent");
        if (!b(context, preOrderParameters)) {
            String str = preOrderParameters.inputParameters;
            String value = BizNode.START_PAY.getValue();
            String statusCode = TransactionProcessStatusCodes.CODE_00_000_0006.getStatusCode();
            String value2 = BizResult.WARN.getValue();
            StringBuilder sb = new StringBuilder();
            PaySdkEnum paySdkEnum = PaySdkEnum.CheckInstall;
            sb.append(paySdkEnum.getCode());
            sb.append(paySdkEnum.getMsg());
            sde.d(str, value, statusCode, value2, sb.toString(), "", "", "");
            resource.updateStatus(paySdkEnum);
        }
        if (!c(context, preOrderParameters, resource)) {
            String str2 = preOrderParameters.inputParameters;
            String value3 = BizNode.START_PAY.getValue();
            String statusCode2 = TransactionProcessStatusCodes.CODE_00_000_0007.getStatusCode();
            String value4 = BizResult.ERROR.getValue();
            StringBuilder sb2 = new StringBuilder();
            PaySdkEnum paySdkEnum2 = PaySdkEnum.CheckMBA;
            sb2.append(paySdkEnum2.getCode());
            sb2.append(paySdkEnum2.getMsg());
            sde.d(str2, value3, statusCode2, value4, sb2.toString(), "", "", "");
            resource.updateStatus(paySdkEnum2);
        }
        aVar.a(context, preOrderParameters, resource, aVar, aVar2);
    }

    public final boolean b(Context context, PreOrderParameters preOrderParameters) {
        return vde.k(context, vde.m(preOrderParameters.inputParameters, dde.TARGET_PACKAGE_NAME));
    }

    public final boolean c(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource) {
        String strM = vde.m(preOrderParameters.inputParameters, dde.TARGET_ACTION);
        String strM2 = vde.m(preOrderParameters.inputParameters, dde.TARGET_PACKAGE_NAME);
        Intent intent = new Intent(strM);
        if (!TextUtils.isEmpty(strM2)) {
            intent.setPackage(strM2);
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(preOrderParameters.mAutoOrderChannel)) {
            intent.putExtra("single_auto_channel", preOrderParameters.mAutoOrderChannel);
        }
        intent.putExtra("jump_plugin_id", DcsCommon.EVENT_ID_CAUGHT_EXCEPTION);
        bundle.putString(dde.PAY_INPUT_PARAMETERS, preOrderParameters.convert());
        pce.c("CheckIntent::" + preOrderParameters.convert());
        bundle.putFloat("charge_lower_limit", 0.01f);
        bundle.putString("launchModel", preOrderParameters.launchModel);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(SauAarConstants.L);
        }
        resource.setData(intent);
        if (CashierType.H5.getValue().equalsIgnoreCase(vde.m(preOrderParameters.inputParameters, dde.TARGET_CASHIER_TYPE))) {
            return true;
        }
        boolean z = intent.resolveActivity(context.getPackageManager()) != null;
        if (!CashierHost.MSP.getHost().equalsIgnoreCase(preOrderParameters.launchModel) || z) {
            return z;
        }
        pce.i("msp low version ignore!");
        String str = preOrderParameters.inputParameters;
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0034;
        sde.c(str, value, transactionProcessStatusCodes.getStatusCode(), BizResult.WARN.getValue(), transactionProcessStatusCodes.getDesc(), "msp low version ignore!", "SDK", CashierHost.SECURE_APP.getHost());
        return true;
    }
}
