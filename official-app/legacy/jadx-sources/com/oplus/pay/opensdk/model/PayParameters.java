package com.oplus.pay.opensdk.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class PayParameters extends PreOrderParameters {
    public String extraInfo;
    public String mAcqAddnData;
    public int mAutoRenew;
    public String mCurrencyCode;
    public String mDiscountCode;
    public String mFactor;

    @Deprecated
    public boolean mIsSinglePay;
    public String mOrder;

    @Deprecated
    public boolean mShowCpSmsChannel;
    public String mSign;

    @Deprecated
    public boolean mUseCachedChannel;
    public String paySdkVersion;
    public long sdkStartTime;
    public String signAgreementNotifyUrl;
    public String mNotifyUrl = "";
    public String mProductName = "";
    public String mProductDesc = "";
    public String mAppCode = "";
    public int mGameSdkVersion = 0;
    public String mTagKey = "";
    public float mExchangeRatio = 1.0f;
    public double mAmount = 1.0d;
    public int mRequestCode = 1001;
    public String mPartnerOrder = "";
    public int mType = 1;
    public float mChargeLimit = 0.01f;
    public boolean isAutoRenewToPayCenter = false;
    public String renewalExtra = "";
    public String isAccount = "Y";
    public String creditEnable = "";
    public String mPayPackageName = "";
}
