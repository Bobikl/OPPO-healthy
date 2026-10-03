package com.lifesense.plugin.ble.data;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class IDeviceProtocol {
    private LSDeviceType deviceType;
    private LSProtocolType protocol;
    private UUID service;

    public LSDeviceType getDeviceType() {
        return this.deviceType;
    }

    public LSProtocolType getProtocol() {
        return this.protocol;
    }

    public UUID getService() {
        return this.service;
    }

    public void setDeviceType(LSDeviceType lSDeviceType) {
        this.deviceType = lSDeviceType;
    }

    public void setProtocol(LSProtocolType lSProtocolType) {
        this.protocol = lSProtocolType;
    }

    public void setService(UUID uuid) {
        this.service = uuid;
    }

    public String toString() {
        return "IDeviceProtocol{service=" + this.service + ", protocol=" + this.protocol + ", deviceType=" + this.deviceType + '}';
    }
}
