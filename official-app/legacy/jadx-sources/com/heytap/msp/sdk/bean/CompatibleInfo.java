package com.heytap.msp.sdk.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class CompatibleInfo implements Serializable {
    static final long serialVersionUID = -4287076915813376220L;
    String androidVersion;
    String appPackage;
    String brand;
    String model;
    String mspVersion;
    String osVersion;
    String romVersion;
    String sdkVersion;
    Long timestamp;

    public String getAndroidVersion() {
        return this.androidVersion;
    }

    public String getAppPackage() {
        return this.appPackage;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getMspVersion() {
        return this.mspVersion;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getRomVersion() {
        return this.romVersion;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setAndroidVersion(String str) {
        this.androidVersion = str;
    }

    public void setAppPackage(String str) {
        this.appPackage = str;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setMspVersion(String str) {
        this.mspVersion = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setRomVersion(String str) {
        this.romVersion = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setTimestamp(Long l2) {
        this.timestamp = l2;
    }
}
