package com.heytap.device.repository.api.request;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BindDeviceRequest {
    public String appTerminalId;
    public String deviceName;
    public String deviceSn;
    public String deviceUniqueId;
    public String firmwareVersion;
    public String hardwareVersion;
    public String mac;
    public String manufacturer;
    public String model;
    public String sn;
    public int deviceType = 100;
    public int osType = 1;

    public String toString() {
        return "BindDeviceRequest{deviceUniqueId='" + this.deviceUniqueId + "', sn='" + this.sn + "', deviceName='" + this.deviceName + "', deviceType=" + this.deviceType + ", model='" + this.model + "', mac='" + this.mac + "', appTerminalId='" + this.appTerminalId + "', osType=" + this.osType + ", manufacturer='" + this.manufacturer + "', hardwareVersion='" + this.hardwareVersion + "', firmwareVersion='" + this.firmwareVersion + "', deviceSn='" + this.deviceSn + "'}";
    }
}
