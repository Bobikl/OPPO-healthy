package com.heytap.msp.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class CommonRequestInfo implements Serializable {
    private static final long serialVersionUID = -8243311878759722616L;
    String androidVersion;
    String appPackage;
    String brand;
    String model;
    String mspVersion;
    String osVersion;
    String sdkVersion;
    long timestamp = System.currentTimeMillis();

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

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public long getTimestamp() {
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

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public String toString() {
        return "GlobalConfigRequest{appPackage='" + this.appPackage + "', sdkVersion='" + this.sdkVersion + "', mspVersion='" + this.mspVersion + "', timestamp=" + this.timestamp + ", brand='" + this.brand + "', model='" + this.model + "', androidVersion='" + this.androidVersion + "', osVersion='" + this.osVersion + "'}";
    }
}
