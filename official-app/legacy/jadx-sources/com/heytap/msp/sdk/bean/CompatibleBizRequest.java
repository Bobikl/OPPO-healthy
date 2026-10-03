package com.heytap.msp.sdk.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.heytap.msp.sdk.base.common.util.SensitiveInfoUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;

/* JADX INFO: loaded from: classes19.dex */
public class CompatibleBizRequest extends CompatibleInfo {
    private static final long serialVersionUID = -7565790176479182010L;

    @JSONField(name = SpeechConstant.KEY_APP_VERSION)
    String bizAppVersion;
    String bizNo;
    String bizSdkVersion;

    public CompatibleBizRequest() {
    }

    public CompatibleBizRequest(CompatibleInfo compatibleInfo) {
        this.androidVersion = compatibleInfo.androidVersion;
        this.brand = compatibleInfo.brand;
        this.osVersion = compatibleInfo.osVersion;
        this.romVersion = compatibleInfo.romVersion;
        this.sdkVersion = compatibleInfo.sdkVersion;
        this.mspVersion = compatibleInfo.mspVersion;
        this.timestamp = compatibleInfo.timestamp;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public String getAndroidVersion() {
        return this.androidVersion;
    }

    public String getBizAppVersion() {
        return this.bizAppVersion;
    }

    public String getBizNo() {
        return this.bizNo;
    }

    public String getBizSdkVersion() {
        return this.bizSdkVersion;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public String getBrand() {
        return this.brand;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public String getOsVersion() {
        return this.osVersion;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public String getRomVersion() {
        return this.romVersion;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public void setAndroidVersion(String str) {
        this.androidVersion = str;
    }

    public void setBizAppVersion(String str) {
        this.bizAppVersion = str;
    }

    public void setBizNo(String str) {
        this.bizNo = str;
    }

    public void setBizSdkVersion(String str) {
        this.bizSdkVersion = str;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public void setBrand(String str) {
        this.brand = str;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public void setRomVersion(String str) {
        this.romVersion = str;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    @Override // com.heytap.msp.sdk.bean.CompatibleInfo
    public void setTimestamp(Long l2) {
        this.timestamp = l2;
    }

    public String toString() {
        return "CompatibleBizRequest{androidVersion='" + this.androidVersion + "', bizAppVersion='" + this.bizAppVersion + "', bizSdkVersion='" + this.bizSdkVersion + "', bizNo='" + this.bizNo + "', brand='" + this.brand + "', osVersion='" + this.osVersion + "', romVersion='" + this.romVersion + "', sdkVersion='" + SensitiveInfoUtils.getNewSdkVersion(this.sdkVersion) + "', mspVersion='" + this.mspVersion + "', timestamp=" + this.timestamp + '}';
    }

    public CompatibleBizRequest(CompatibleInfo compatibleInfo, CompatibleBizInfo compatibleBizInfo) {
        this.androidVersion = compatibleInfo.androidVersion;
        this.brand = compatibleInfo.brand;
        this.osVersion = compatibleInfo.osVersion;
        this.romVersion = compatibleInfo.romVersion;
        this.sdkVersion = compatibleInfo.sdkVersion;
        this.mspVersion = compatibleInfo.mspVersion;
        this.timestamp = compatibleInfo.timestamp;
        this.bizNo = compatibleBizInfo.getBizNo();
        this.bizAppVersion = compatibleBizInfo.getBizAppVersion();
        this.bizSdkVersion = compatibleBizInfo.getBizSdkVersion();
        this.model = compatibleInfo.model;
        this.appPackage = compatibleInfo.appPackage;
    }
}
