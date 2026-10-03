package com.heytap.health.device_app_store.impl.appstore.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class GeneralInfoJsBean {
    private String avater;
    private String channel;
    private String colorOsVersion;
    private String firmwareId;
    private String healthVersion;
    private boolean instantSwClose;
    private int instantVersion;
    private boolean isFamilyMode;
    private String locale;
    private String manufacturer;
    private String model;
    private String name;
    private int osVersion;
    private int statusBarHeight;
    private String token;
    private String ua;
    private String uniqueId;
    private int watchScreenType;
    private int os = 1;
    private int source = 1;

    public String getAvater() {
        return this.avater;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getColorOsVersion() {
        return this.colorOsVersion;
    }

    public String getFirmwareId() {
        return this.firmwareId;
    }

    public String getHealthVersion() {
        return this.healthVersion;
    }

    public int getInstantVersion() {
        return this.instantVersion;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getName() {
        return this.name;
    }

    public int getOs() {
        return this.os;
    }

    public int getOsVersion() {
        return this.osVersion;
    }

    public int getSource() {
        return this.source;
    }

    public int getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public String getToken() {
        return this.token;
    }

    public String getUA() {
        return this.ua;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public int getWatchScreenType() {
        return this.watchScreenType;
    }

    public boolean isFamilyMode() {
        return this.isFamilyMode;
    }

    public boolean isInstantSwClose() {
        return this.instantSwClose;
    }

    public void setAvater(String str) {
        this.avater = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setColorOsVersion(String str) {
        this.colorOsVersion = str;
    }

    public void setFamilyMode(boolean z) {
        this.isFamilyMode = z;
    }

    public void setFirmwareId(String str) {
        this.firmwareId = str;
    }

    public void setHealthVersion(String str) {
        this.healthVersion = str;
    }

    public void setInstantSwClose(boolean z) {
        this.instantSwClose = z;
    }

    public void setInstantVersion(int i) {
        this.instantVersion = i;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOs(int i) {
        this.os = i;
    }

    public void setOsVersion(int i) {
        this.osVersion = i;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStatusBarHeight(int i) {
        this.statusBarHeight = i;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUA(String str) {
        this.ua = str;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setWatchScreenType(int i) {
        this.watchScreenType = i;
    }
}
