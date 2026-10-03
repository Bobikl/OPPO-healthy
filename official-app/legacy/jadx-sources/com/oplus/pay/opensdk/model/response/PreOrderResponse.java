package com.oplus.pay.opensdk.model.response;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class PreOrderResponse {
    public AllowAssets allowAssets;
    public String attach;
    public String countryCode;
    public String currencyCode;
    public String needsLogin;
    public String notifyUrl;
    public String partnerCode;
    public String partnerOrder;
    public long price;
    public String productDesc;
    public String productName;
    public String renewProductCode;
    public String signNotifyUrl;
    public String signPartnerOrder;
    public String specificVoucher;
    public String subUserId;
    public String subUserName;
    public String thirdPartId;
    public String tradeType;
    public int mType = 0;
    public String mSign = "mSign";

    @Keep
    public static class AllowAssets {
        public String cocoinEnable;
        public String creditEnable;
        public String voucherEnable;
    }
}
