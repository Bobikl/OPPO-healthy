package com.oplus.pay.opensdk.chain;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.oplus.aiunit.vision.dde;
import com.oplus.aiunit.vision.nde;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.rde;
import com.oplus.aiunit.vision.sck;
import com.oplus.aiunit.vision.sde;
import com.oplus.aiunit.vision.ua4;
import com.oplus.aiunit.vision.vde;
import com.oplus.aiunit.vision.wce;
import com.oplus.pay.opensdk.eum.PaySdkEnum;
import com.oplus.pay.opensdk.model.PayParameters;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.oplus.pay.opensdk.utils.Resource;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class f implements g {
    @Override // com.oplus.pay.opensdk.chain.g
    public void a(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2) {
        pce.b("CheckStart");
        c(preOrderParameters);
        b(context, preOrderParameters);
        d(context, preOrderParameters);
        if (vde.a(preOrderParameters.inputParameters, dde.IS_EU)) {
            String str = preOrderParameters.inputParameters;
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0001;
            String statusCode = transactionProcessStatusCodes.getStatusCode();
            String value2 = BizResult.ERROR.getValue();
            StringBuilder sb = new StringBuilder();
            PaySdkEnum paySdkEnum = PaySdkEnum.CheckEU;
            sb.append(paySdkEnum.getCode());
            sb.append(paySdkEnum.getMsg());
            sde.d(str, value, statusCode, value2, sb.toString(), transactionProcessStatusCodes.getDesc(), "", "");
            resource.updateStatus(paySdkEnum);
        }
        aVar.a(context, preOrderParameters, resource, aVar, aVar2);
    }

    public final void b(Context context, PreOrderParameters preOrderParameters) {
        rde.c(context, ua4.c(preOrderParameters));
        sde.f(preOrderParameters.inputParameters, BizNode.START_PAY.getValue(), TransactionProcessStatusCodes.CODE_00_000_0000.getStatusCode(), BizResult.SUCCESS.getValue());
    }

    public final void c(PreOrderParameters preOrderParameters) {
        boolean z = (TextUtils.isEmpty(vde.m(preOrderParameters.inputParameters, dde.PRE_ORDER_ACTION)) || TextUtils.isEmpty(preOrderParameters.prePayToken)) ? false : true;
        String strA = wce.a(preOrderParameters.expandInfo);
        if (z || !(preOrderParameters instanceof PayParameters)) {
            sck sckVar = sck.INSTANCE;
            sckVar.e(z, null, preOrderParameters.prePayToken, strA);
            String strD = sckVar.d(null, preOrderParameters.prePayToken);
            wce.d(strD, preOrderParameters);
            sckVar.g(strD, wce.b(preOrderParameters.expandInfo));
            return;
        }
        PayParameters payParameters = (PayParameters) preOrderParameters;
        sck sckVar2 = sck.INSTANCE;
        sckVar2.e(false, payParameters.mPartnerOrder, payParameters.prePayToken, strA);
        String strD2 = sckVar2.d(payParameters.mPartnerOrder, payParameters.prePayToken);
        wce.d(strD2, preOrderParameters);
        sckVar2.g(strD2, wce.b(preOrderParameters.expandInfo));
    }

    public final void d(Context context, PreOrderParameters preOrderParameters) {
        if (!(preOrderParameters instanceof PayParameters)) {
            nde.INSTANCE.b(context, ua4.c(preOrderParameters));
        } else {
            nde.INSTANCE.b(context, (PayParameters) preOrderParameters);
        }
    }
}
