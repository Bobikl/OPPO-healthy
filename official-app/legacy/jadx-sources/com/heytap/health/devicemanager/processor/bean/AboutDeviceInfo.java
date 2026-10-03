package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.gdb;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class AboutDeviceInfo {
    private String androidVersion;
    private String basebandVersion;
    private String bluetoothAddress;
    private String deviceName;
    private String deviceUniqueId;
    private String eid;
    private String imei;
    private String kernelVersion;
    private String model;
    private String operator;
    private String osVersion;
    private String rom;
    private String serialNumber;
    private String versionNumber;
    private String wirelessLanAddress;

    public String getAndroidVersion() {
        return this.androidVersion;
    }

    public String getBasebandVersion() {
        return this.basebandVersion;
    }

    public String getBluetoothAddress() {
        return this.bluetoothAddress;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public String getEid() {
        return this.eid;
    }

    public String getImei() {
        return this.imei;
    }

    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public String getModel() {
        return this.model;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getRom() {
        return this.rom;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getVersionNumber() {
        return this.versionNumber;
    }

    public String getWirelessLanAddress() {
        return this.wirelessLanAddress;
    }

    public void setAndroidVersion(String str) {
        this.androidVersion = str;
    }

    public void setBasebandVersion(String str) {
        this.basebandVersion = str;
    }

    public void setBluetoothAddress(String str) {
        this.bluetoothAddress = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEid(String str) {
        this.eid = str;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setKernelVersion(String str) {
        this.kernelVersion = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setOperator(String str) {
        this.operator = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setRom(String str) {
        this.rom = str;
    }

    public void setSerialNumber(String str) {
        this.serialNumber = str;
    }

    public void setVersionNumber(String str) {
        this.versionNumber = str;
    }

    public void setWirelessLanAddress(String str) {
        this.wirelessLanAddress = str;
    }

    public String toString() {
        return "AboutDeviceInfo{deviceUniqueId='" + gdb.a(this.deviceUniqueId) + "', deviceName='" + this.deviceName + "', model='" + this.model + "', osVersion='" + this.osVersion + "', versionNumber='" + this.versionNumber + "', kernelVersion='" + this.kernelVersion + "', androidVersion='" + this.androidVersion + "', basebandVersion='" + this.basebandVersion + "', rom='" + this.rom + "', operator='" + this.operator + "', imei='" + this.imei + "', eid='" + this.eid + "', serialNumber='" + this.serialNumber + "', wirelessLanAddress='" + this.wirelessLanAddress + "', bluetoothAddress='" + gdb.a(this.bluetoothAddress) + "'}";
    }
}
