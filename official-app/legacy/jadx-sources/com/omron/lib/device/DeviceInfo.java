package com.omron.lib.device;

import android.support.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class DeviceInfo {

    @Nullable
    private Integer batteryLevel;

    @Nullable
    private String firmwareVersion;

    @Nullable
    private String hardwareVersion;

    @Nullable
    private String manufacturerName;

    @Nullable
    private String modelName;

    @Nullable
    private String modelNumber;

    @Nullable
    private String serialNumber;

    @Nullable
    private String softwareVersion;

    @Nullable
    private String powerSupplyMode = "220V";

    @Nullable
    private String systemID = "";

    @Nullable
    public Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    @Nullable
    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @Nullable
    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    @Nullable
    public String getManufacturerName() {
        return this.manufacturerName;
    }

    @Nullable
    public String getModelName() {
        return this.modelName;
    }

    @Nullable
    public String getModelNumber() {
        return this.modelNumber;
    }

    @Nullable
    public String getPowerSupplyMode() {
        return this.powerSupplyMode;
    }

    @Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }

    @Nullable
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    @Nullable
    public String getSystemID() {
        return this.systemID;
    }

    public void setBatteryLevel(@Nullable Integer num) {
        this.batteryLevel = num;
    }

    public void setFirmwareVersion(@Nullable String str) {
        this.firmwareVersion = str;
    }

    public void setHardwareVersion(@Nullable String str) {
        this.hardwareVersion = str;
    }

    public void setManufacturerName(@Nullable String str) {
        this.manufacturerName = str;
    }

    public void setModelName(@Nullable String str) {
        this.modelName = str;
    }

    public void setModelNumber(@Nullable String str) {
        this.modelNumber = str;
    }

    public void setPowerSupplyMode(@Nullable String str) {
        this.powerSupplyMode = str;
    }

    public void setSerialNumber(@Nullable String str) {
        this.serialNumber = str;
    }

    public void setSoftwareVersion(@Nullable String str) {
        this.softwareVersion = str;
    }

    public void setSystemID(@Nullable String str) {
        this.systemID = str;
    }

    public String toString() {
        return "DeviceInfo{modelName='" + this.modelName + "', serialNumber='" + this.serialNumber + "', firmwareVersion='" + this.firmwareVersion + "', batteryLevel=" + this.batteryLevel + '}';
    }
}
