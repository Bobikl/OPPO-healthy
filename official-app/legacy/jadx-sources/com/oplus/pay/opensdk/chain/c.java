package com.oplus.pay.opensdk.chain;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.oplus.aiunit.vision.ebe;
import com.oplus.aiunit.vision.qae;
import com.oplus.aiunit.vision.tbe;
import com.oplus.aiunit.vision.wbe;
import com.oplus.pay.opensdk.eum.PaySdkEnum;
import com.oplus.pay.opensdk.model.CashierHost;
import com.oplus.pay.opensdk.model.CashierType;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.oplus.pay.opensdk.utils.Resource;
import com.platform.usercenter.account.newcommon.router.LinkInfo;

/* JADX INFO: loaded from: classes8.dex */
public class c implements g {
    @Override // com.oplus.pay.opensdk.chain.g
    public void a(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2) {
        qae.b("CheckIntent");
        if (!b(context, preOrderParameters)) {
            String str = preOrderParameters.inputParameters;
            String value = BizNode.START_PAY.getValue();
            String statusCode = TransactionProcessStatusCodes.CODE_00_000_0006.getStatusCode();
            String value2 = BizResult.WARN.getValue();
            StringBuilder sb = new StringBuilder();
            PaySdkEnum paySdkEnum = PaySdkEnum.CheckInstall;
            sb.append(paySdkEnum.getCode());
            sb.append(paySdkEnum.getMsg());
            tbe.d(str, value, statusCode, value2, sb.toString(), "", "", "");
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
            tbe.d(str2, value3, statusCode2, value4, sb2.toString(), "", "", "");
            resource.updateStatus(paySdkEnum2);
        }
        aVar.a(context, preOrderParameters, resource, aVar, aVar2);
    }

    public final boolean b(Context context, PreOrderParameters preOrderParameters) {
        return wbe.k(context, wbe.m(preOrderParameters.inputParameters, ebe.TARGET_PACKAGE_NAME));
    }

    public final boolean c(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource) {
        String strM = wbe.m(preOrderParameters.inputParameters, ebe.TARGET_ACTION);
        String strM2 = wbe.m(preOrderParameters.inputParameters, ebe.TARGET_PACKAGE_NAME);
        Intent intent = new Intent(strM);
        if (!TextUtils.isEmpty(strM2)) {
            intent.setPackage(strM2);
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(preOrderParameters.mAutoOrderChannel)) {
            intent.putExtra("single_auto_channel", preOrderParameters.mAutoOrderChannel);
        }
        intent.putExtra("jump_plugin_id", "1001");
        bundle.putString("payParams", preOrderParameters.convert());
        qae.c("CheckIntent::" + preOrderParameters.convert());
        bundle.putFloat("charge_lower_limit", 0.01f);
        bundle.putString("launchModel", preOrderParameters.launchModel);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        resource.setData(intent);
        if (CashierType.H5.getValue().equalsIgnoreCase(wbe.m(preOrderParameters.inputParameters, ebe.TARGET_CASHIER_TYPE))) {
            return true;
        }
        boolean z = intent.resolveActivity(context.getPackageManager()) != null;
        if (!CashierHost.MSP.getHost().equalsIgnoreCase(preOrderParameters.launchModel) || z) {
            return z;
        }
        qae.i("msp low version ignore!");
        String str = preOrderParameters.inputParameters;
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0034;
        tbe.c(str, value, transactionProcessStatusCodes.getStatusCode(), BizResult.WARN.getValue(), transactionProcessStatusCodes.getDesc(), "msp low version ignore!", LinkInfo.CALL_TYPE_SDK, CashierHost.SECURE_APP.getHost());
        return true;
    }
}
