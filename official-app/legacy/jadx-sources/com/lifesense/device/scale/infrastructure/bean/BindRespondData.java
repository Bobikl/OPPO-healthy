package com.lifesense.device.scale.infrastructure.bean;

import com.lifesense.device.scale.infrastructure.entity.Device;
import com.lifesense.device.scale.infrastructure.entity.DeviceSetting;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BindRespondData {
    public Device device;
    public List<DeviceSetting> deviceSettings;

    public Device getDevice() {
        return this.device;
    }

    public List<DeviceSetting> getDeviceSettings() {
        return this.deviceSettings;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setDeviceSettings(List<DeviceSetting> list) {
        this.deviceSettings = list;
    }

    public String toString() {
        return "BindRespondData{device=" + this.device + ", deviceSettings=" + this.deviceSettings + '}';
    }
}
