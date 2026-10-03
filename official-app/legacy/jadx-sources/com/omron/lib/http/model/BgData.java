package com.omron.lib.http.model;

/* JADX INFO: loaded from: classes5.dex */
public class BgData {
    private String bg;
    private String deviceDigitalId;
    private String deviceType;
    private String device_ble_cmn_id;
    private int diningStatus;
    private String measureAt;
    private int measureId;
    private String uuid;

    public BgData(String str, String str2, String str3) {
        this.deviceType = str;
        this.deviceDigitalId = str2;
        this.device_ble_cmn_id = str3;
    }

    public String getBg() {
        return this.bg;
    }

    public String getDeviceBleCmnId() {
        return this.device_ble_cmn_id;
    }

    public String getDeviceDigitalId() {
        return this.deviceDigitalId;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getDevice_ble_cmn_id() {
        return this.device_ble_cmn_id;
    }

    public int getDiningStatus() {
        return this.diningStatus;
    }

    public String getMeasureAt() {
        return this.measureAt;
    }

    public int getMeasureId() {
        return this.measureId;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setBg(String str) {
        this.bg = str;
    }

    public void setDeviceBleCmnId(String str) {
        this.device_ble_cmn_id = str;
    }

    public void setDeviceDigitalId(String str) {
        this.deviceDigitalId = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDevice_ble_cmn_id(String str) {
        this.device_ble_cmn_id = str;
    }

    public void setDiningStatus(int i) {
        this.diningStatus = i;
    }

    public void setMeasureAt(String str) {
        this.measureAt = str;
    }

    public void setMeasureId(int i) {
        this.measureId = i;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }
}
