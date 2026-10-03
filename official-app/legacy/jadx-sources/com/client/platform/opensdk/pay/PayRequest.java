package com.client.platform.opensdk.pay;

import android.util.Log;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class PayRequest {
    public String expandInfo;
    public String extraInfo;
    public String mAcqAddnData;
    public String mAutoOrderChannel;
    public int mAutoRenew;
    public String mCountryCode;
    public String mCurrencyCode;
    public String mDiscountCode;
    public String mFactor;

    @Deprecated
    public boolean mIsSinglePay;
    public String mOrder;
    public String mPayId;

    @Deprecated
    public boolean mShowCpSmsChannel;
    public String mSign;

    @Deprecated
    public boolean mUseCachedChannel;
    public String paySdkVersion;
    public long sdkStartTime;
    public String signAgreementNotifyUrl;
    public String mPartnerId = "";
    public String mToken = "";
    public String mNotifyUrl = "";
    public String mChannelId = "";
    public String mPackageName = "";
    public String mProductName = "";
    public String mProductDesc = "";
    public String mAppCode = "";
    public String mAppVersion = "";
    public int mGameSdkVersion = 0;
    public String mTagKey = "";
    public String mCurrencyName = "";
    public float mExchangeRatio = 1.0f;
    public double mAmount = 1.0d;
    public int mRequestCode = 1001;
    public String mPartnerOrder = "";
    public String mAttach = "";
    public String mSource = "";
    public int mCount = 1;
    public int mType = 1;
    public float mChargeLimit = 0.01f;
    public boolean isAutoRenewToPayCenter = false;
    public String renewalExtra = "";
    public String isAccount = "Y";
    public String acrossScreen = "";
    public String creditEnable = "";
    public String mPayPackageName = "";
    public String defaultStrategy = "";
    public String schemePackageName = "";

    public String convert() {
        JSONObject jSONObject = new JSONObject();
        for (Field field : getClass().getFields()) {
            field.setAccessible(true);
            try {
                if ("mTagKey".equals(field.getName())) {
                    jSONObject.put(PayXorUtils.payEncrypt("eIxxCmq", 8), field.get(this));
                } else {
                    jSONObject.put(field.getName(), field.get(this));
                }
            } catch (Exception e2) {
                Log.i(PayRequest.class.getSimpleName(), "convert error. exception : " + e2.getMessage());
            }
        }
        return jSONObject.toString();
    }

    public String toString() {
        return convert();
    }
}
