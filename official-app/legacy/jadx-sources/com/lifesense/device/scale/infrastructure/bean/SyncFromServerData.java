package com.lifesense.device.scale.infrastructure.bean;

import com.lifesense.device.scale.infrastructure.entity.Device;
import com.lifesense.device.scale.infrastructure.entity.DeviceSetting;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SyncFromServerData {
    public List<DeviceSetting> deviceSettings;
    public List<Device> devices;
    public long maxTs;

    public List<DeviceSetting> getDeviceSettings() {
        return this.deviceSettings;
    }

    public List<Device> getDevices() {
        return this.devices;
    }

    public long getMaxTs() {
        return this.maxTs;
    }

    public void setDeviceSettings(List<DeviceSetting> list) {
        this.deviceSettings = list;
    }

    public void setDevices(List<Device> list) {
        this.devices = list;
    }

    public void setMaxTs(long j2) {
        this.maxTs = j2;
    }
}
