package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.oplus.pay.opensdk.chain.a;
import com.oplus.pay.opensdk.chain.g;
import com.oplus.pay.opensdk.eum.PaySdkEnum;
import com.oplus.pay.opensdk.model.PayParameters;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.oplus.pay.opensdk.utils.Resource;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class da3 implements g {
    @Override // com.oplus.pay.opensdk.chain.g
    public void a(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2) {
        pce.b("CheckParams");
        wce.c(context, preOrderParameters, da3.class);
        fri.INSTANCE.i(rde.b(context, ua4.c(preOrderParameters)));
        d(context, preOrderParameters, resource, aVar, aVar2);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    public final Pair<Boolean, String> b(PayParameters payParameters) {
        String str;
        Matcher matcher = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$").matcher(new BigDecimal(Double.toString(payParameters.mAmount)).toPlainString());
        boolean z = false;
        if (TextUtils.isEmpty(payParameters.mCountryCode)) {
            str = "mCountryCode is null";
        } else if (TextUtils.isEmpty(payParameters.mCurrencyCode)) {
            str = "mCurrencyCode is null";
        } else if (!matcher.matches()) {
            if (2 == payParameters.mAutoRenew && gqe.DEFAULT_LANGUAGE.equalsIgnoreCase(payParameters.mCountryCode)) {
                z = true;
            }
            str = "mAmount should >= 0.01";
        } else if (TextUtils.isEmpty(payParameters.mPartnerId)) {
            str = "mPartnerId is null";
        } else if (TextUtils.isEmpty(payParameters.mNotifyUrl)) {
            str = "mNotifyUrl is null";
        } else if (TextUtils.isEmpty(payParameters.mPackageName)) {
            str = "mPackageName is null";
        } else if (TextUtils.isEmpty(payParameters.mAppVersion)) {
            str = "mAppVersion is null";
        } else if (TextUtils.isEmpty(payParameters.mCurrencyName)) {
            str = "mCurrencyName is null";
        } else if (TextUtils.isEmpty(payParameters.mSource)) {
            str = "mSource is null";
        } else if (TextUtils.isEmpty(payParameters.mProductName)) {
            str = "mProductName is null";
        } else if (TextUtils.isEmpty(payParameters.mProductName) || payParameters.mProductName.length() > 40) {
            str = "mProductName is too long";
        } else if (TextUtils.isEmpty(payParameters.mProductDesc) || payParameters.mProductDesc.length() > 120) {
            str = "mProductDesc is too long";
        } else {
            int i = payParameters.mType;
            if (i != 0 && i != 1 && i != 2) {
                str = "mType can only be 0、1、2";
            } else if (i != 1) {
                str = "";
                z = true;
            } else if (TextUtils.isEmpty(payParameters.mPartnerOrder)) {
                str = "if mType is 1，you should set mPartnerOrder";
            } else if (TextUtils.isEmpty(payParameters.mSign)) {
                str = "if mType is 1，you should set mSign";
            } else {
                str = "";
                z = true;
            }
        }
        return Pair.create(Boolean.valueOf(z), str);
    }

    public final Pair<Boolean, String> c(PreOrderParameters preOrderParameters) {
        String str;
        boolean z = false;
        if (TextUtils.isEmpty(preOrderParameters.mCountryCode)) {
            str = "mCountryCode is null";
        } else if (TextUtils.isEmpty(preOrderParameters.mPackageName)) {
            str = "mPackageName is null";
        } else if (TextUtils.isEmpty(preOrderParameters.mCurrencyName)) {
            str = "mCurrencyName is null";
        } else if (TextUtils.isEmpty(preOrderParameters.mAppVersion)) {
            str = "mAppVersion is null";
        } else if (TextUtils.isEmpty(preOrderParameters.mSource)) {
            str = "mSource is null";
        } else if (TextUtils.isEmpty(preOrderParameters.prePayToken)) {
            str = "prePayToken is null";
        } else {
            z = true;
            str = "";
        }
        return Pair.create(Boolean.valueOf(z), str);
    }

    public final void d(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2) {
        Pair<Boolean, String> pairB = preOrderParameters instanceof PayParameters ? b((PayParameters) preOrderParameters) : c(preOrderParameters);
        boolean zBooleanValue = ((Boolean) pairB.first).booleanValue();
        String str = (String) pairB.second;
        pce.b("isValid=" + zBooleanValue + ",tipString=" + str);
        if (!zBooleanValue) {
            String str2 = preOrderParameters.inputParameters;
            String value = BizNode.START_PAY.getValue();
            String statusCode = TransactionProcessStatusCodes.CODE_00_000_0005.getStatusCode();
            String value2 = BizResult.ERROR.getValue();
            StringBuilder sb = new StringBuilder();
            PaySdkEnum paySdkEnum = PaySdkEnum.CheckParams;
            sb.append(paySdkEnum.getCode());
            sb.append(str);
            sde.d(str2, value, statusCode, value2, sb.toString(), "", "", "");
            resource.updateStatus(paySdkEnum.getCode(), str);
        }
        aVar.a(context, preOrderParameters, resource, aVar, aVar2);
    }
}
