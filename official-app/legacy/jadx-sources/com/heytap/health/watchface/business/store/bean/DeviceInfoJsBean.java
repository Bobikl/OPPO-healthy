package com.heytap.health.watchface.business.store.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class DeviceInfoJsBean {
    private int deviceAppVersion;
    private String deviceId;
    private String deviceModel;
    private String firmwareId;
    private String firmwareVersion;
    private String healthVersion;
    private int osVersion;
    private String screen;
    private String shape;
    private String skuCode;
    private String skuIdUrl;
    private int statusBarHeight;
    private int os = 1;
    private String deviceType = "4";
    private String region = "CN";
    private String ch = "OPPO";
    private String lang = "zh_CN";
    private int source = 1;

    public String getCh() {
        return this.ch;
    }

    public int getDeviceAppVersion() {
        return this.deviceAppVersion;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getFirmwareId() {
        return this.firmwareId;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getHealthVersion() {
        return this.healthVersion;
    }

    public String getLang() {
        return this.lang;
    }

    public int getOs() {
        return this.os;
    }

    public int getOsVersion() {
        return this.osVersion;
    }

    public String getRegion() {
        return this.region;
    }

    public String getScreen() {
        return this.screen;
    }

    public String getShape() {
        return this.shape;
    }

    public String getSkuCode() {
        return this.skuCode;
    }

    public String getSkuIdUrl() {
        return this.skuIdUrl;
    }

    public int getSource() {
        return this.source;
    }

    public int getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public void setCh(String str) {
        this.ch = str;
    }

    public void setDeviceAppVersion(int i) {
        this.deviceAppVersion = i;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setFirmwareId(String str) {
        this.firmwareId = str;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setHealthVersion(String str) {
        this.healthVersion = str;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setOs(int i) {
        this.os = i;
    }

    public void setOsVersion(int i) {
        this.osVersion = i;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setScreen(String str) {
        this.screen = str;
    }

    public void setShape(String str) {
        this.shape = str;
    }

    public void setSkuCode(String str) {
        this.skuCode = str;
    }

    public void setSkuIdUrl(String str) {
        this.skuIdUrl = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStatusBarHeight(int i) {
        this.statusBarHeight = i;
    }
}
