package com.heytap.store.sdk;

import android.app.Application;

/* JADX INFO: loaded from: classes7.dex */
public class SDKConfig {
    public String imei;
    public SDKInitListener initSuccessListener;
    public boolean isCloseDarkMode;
    public boolean isNeedChangeThemeFromUikit;
    public boolean isNeedSensorSDKReport;
    public boolean isOpenPermissionTips;
    public Application mContext;
    public boolean mIsCtaCheckPass;
    public String mReportUrl;
    public SDKOBusConfig oBusConfig;
    public String sAppChannel;
    public String sAppId;
    public String sAppKey;

    public static class Builder {
        private String imei;
        private Application mContext;
        private String mReportUrl;
        private String sAppChannel;
        private String sAppId;
        private String sAppKey;
        private boolean mIsCtaCheckPass = true;
        public boolean isNeedChangeThemeFromUikit = false;
        private boolean isNeedSensorSDKReport = true;
        private boolean isOpenPermissionTips = false;
        private boolean isCloseDarkMode = false;
        private SDKInitListener initSuccessListener = null;
        private SDKOBusConfig mOBusConfig = null;

        public SDKConfig builder() {
            return new SDKConfig(this);
        }

        public Builder isCloseDarkMode(boolean z) {
            this.isCloseDarkMode = z;
            return this;
        }

        public Builder isNeedSensorSDKReport(boolean z) {
            this.isNeedSensorSDKReport = z;
            return this;
        }

        public Builder isOpenPermissionTips(boolean z) {
            this.isOpenPermissionTips = z;
            return this;
        }

        public Builder setContext(Application application) {
            this.mContext = application;
            return this;
        }

        public Builder setCtaCheckPass(boolean z) {
            this.mIsCtaCheckPass = z;
            return this;
        }

        public Builder setImei(String str) {
            this.imei = str;
            return this;
        }

        public Builder setInitListener(SDKInitListener sDKInitListener) {
            this.initSuccessListener = sDKInitListener;
            return this;
        }

        public Builder setNeedChangeThemeFromUikit(boolean z) {
            this.isNeedChangeThemeFromUikit = z;
            return this;
        }

        public Builder setReportUrl(String str) {
            this.mReportUrl = str;
            return this;
        }

        public Builder setSDKOBusConfig(SDKOBusConfig sDKOBusConfig) {
            this.mOBusConfig = sDKOBusConfig;
            return this;
        }

        public Builder setsAppChannel(String str) {
            this.sAppChannel = str;
            return this;
        }

        public Builder setsAppId(String str) {
            this.sAppId = str;
            return this;
        }

        public Builder setsAppKey(String str) {
            this.sAppKey = str;
            return this;
        }
    }

    public SDKConfig(Builder builder) {
        this.isNeedChangeThemeFromUikit = false;
        this.mIsCtaCheckPass = true;
        this.isNeedSensorSDKReport = true;
        this.isOpenPermissionTips = false;
        this.isCloseDarkMode = false;
        this.initSuccessListener = null;
        this.oBusConfig = null;
        this.mContext = builder.mContext;
        this.sAppId = builder.sAppId;
        this.sAppKey = builder.sAppKey;
        this.sAppChannel = builder.sAppChannel;
        this.imei = builder.imei;
        this.mIsCtaCheckPass = builder.mIsCtaCheckPass;
        this.isNeedChangeThemeFromUikit = builder.isNeedChangeThemeFromUikit;
        this.mReportUrl = builder.mReportUrl;
        this.isNeedSensorSDKReport = builder.isNeedSensorSDKReport;
        this.isOpenPermissionTips = builder.isOpenPermissionTips;
        this.isCloseDarkMode = builder.isCloseDarkMode;
        this.initSuccessListener = builder.initSuccessListener;
        this.oBusConfig = builder.mOBusConfig;
    }
}
