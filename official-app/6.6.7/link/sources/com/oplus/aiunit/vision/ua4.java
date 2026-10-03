package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.client.platform.opensdk.pay.PayRequest;
import com.google.gson.Gson;
import com.oplus.pay.opensdk.eum.PayTypeEnum;
import com.oplus.pay.opensdk.model.PayParameters;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.model.response.PreOrderResponse;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ua4 {
    public static PayParameters a(PayRequest payRequest) {
        Gson gson = new Gson();
        return (PayParameters) gson.fromJson(gson.toJson(payRequest), PayParameters.class);
    }

    public static PayParameters b(PayParameters payParameters, PreOrderResponse preOrderResponse, PreOrderParameters preOrderParameters) {
        payParameters.mCountryCode = preOrderResponse.countryCode;
        payParameters.mPartnerId = preOrderResponse.partnerCode;
        payParameters.mNotifyUrl = preOrderResponse.notifyUrl;
        payParameters.mPartnerOrder = preOrderResponse.partnerOrder;
        payParameters.mSign = "mSign";
        payParameters.mAmount = BigDecimal.valueOf(preOrderResponse.price).divide(new BigDecimal(100)).doubleValue();
        payParameters.mCurrencyCode = preOrderResponse.currencyCode;
        payParameters.mCurrencyName = "可币";
        payParameters.mProductName = preOrderResponse.productName;
        payParameters.mProductDesc = preOrderResponse.productDesc;
        payParameters.mType = preOrderResponse.mType;
        String str = preOrderResponse.tradeType;
        PayTypeEnum payTypeEnum = PayTypeEnum.SIGNANDPAY;
        if (str.equalsIgnoreCase(payTypeEnum.tradeType)) {
            payParameters.mAutoRenew = payTypeEnum.mAutoRenew;
        } else {
            String str2 = preOrderResponse.tradeType;
            PayTypeEnum payTypeEnum2 = PayTypeEnum.SIGN;
            if (str2.equalsIgnoreCase(payTypeEnum2.tradeType)) {
                payParameters.mAutoRenew = payTypeEnum2.mAutoRenew;
            } else {
                payParameters.mAutoRenew = 0;
            }
        }
        payParameters.signAgreementNotifyUrl = preOrderResponse.signNotifyUrl;
        payParameters.mFactor = preOrderResponse.specificVoucher;
        payParameters.isAccount = preOrderResponse.needsLogin;
        payParameters.creditEnable = preOrderResponse.allowAssets.creditEnable;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("renewProductCode", preOrderResponse.renewProductCode);
            jSONObject.put("signPartnerOrder", preOrderResponse.signPartnerOrder);
            jSONObject.put("thirdPartId", preOrderResponse.thirdPartId);
            jSONObject2.put("autoRenewSubUserId", preOrderResponse.subUserId);
            jSONObject2.put("autoRenewSubUserName", preOrderResponse.subUserName);
            if (!TextUtils.isEmpty(preOrderResponse.attach)) {
                JSONObject jSONObject3 = new JSONObject(preOrderResponse.attach);
                if (jSONObject3.has("msgId")) {
                    jSONObject2.put("speakerID", jSONObject3.get("msgId"));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        payParameters.renewalExtra = jSONObject.toString();
        payParameters.extraInfo = jSONObject2.toString();
        payParameters.mCountryCode = preOrderParameters.mCountryCode;
        payParameters.mToken = preOrderParameters.mToken;
        payParameters.mCurrencyName = preOrderParameters.mCurrencyName;
        payParameters.mChannelId = preOrderParameters.mChannelId;
        payParameters.mAutoOrderChannel = preOrderParameters.mAutoOrderChannel;
        payParameters.acrossScreen = preOrderParameters.acrossScreen;
        payParameters.mCount = preOrderParameters.mCount;
        payParameters.userRegisterCountry = preOrderParameters.userRegisterCountry;
        return payParameters;
    }

    public static PayParameters c(PreOrderParameters preOrderParameters) {
        Gson gson = new Gson();
        return (PayParameters) gson.fromJson(gson.toJson(preOrderParameters), PayParameters.class);
    }
}
