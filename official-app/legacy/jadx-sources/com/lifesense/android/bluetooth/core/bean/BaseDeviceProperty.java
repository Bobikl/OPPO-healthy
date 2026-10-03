package com.lifesense.android.bluetooth.core.bean;

/* JADX INFO: loaded from: classes4.dex */
public class BaseDeviceProperty implements Bytable {
    public String broadcastId;
    public String deviceId;
    public String deviceSn;
    public String macAddress;

    public boolean canEqual(Object obj) {
        return obj instanceof BaseDeviceProperty;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseDeviceProperty)) {
            return false;
        }
        BaseDeviceProperty baseDeviceProperty = (BaseDeviceProperty) obj;
        if (!baseDeviceProperty.canEqual(this)) {
            return false;
        }
        String macAddress = getMacAddress();
        String macAddress2 = baseDeviceProperty.getMacAddress();
        if (macAddress != null ? !macAddress.equals(macAddress2) : macAddress2 != null) {
            return false;
        }
        String deviceId = getDeviceId();
        String deviceId2 = baseDeviceProperty.getDeviceId();
        if (deviceId != null ? !deviceId.equals(deviceId2) : deviceId2 != null) {
            return false;
        }
        String deviceSn = getDeviceSn();
        String deviceSn2 = baseDeviceProperty.getDeviceSn();
        if (deviceSn != null ? !deviceSn.equals(deviceSn2) : deviceSn2 != null) {
            return false;
        }
        String broadcastId = getBroadcastId();
        String broadcastId2 = baseDeviceProperty.getBroadcastId();
        return broadcastId != null ? broadcastId.equals(broadcastId2) : broadcastId2 == null;
    }

    public String getBroadcastId() {
        return this.broadcastId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public int hashCode() {
        String macAddress = getMacAddress();
        int iHashCode = macAddress == null ? 43 : macAddress.hashCode();
        String deviceId = getDeviceId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (deviceId == null ? 43 : deviceId.hashCode());
        String deviceSn = getDeviceSn();
        int i = iHashCode2 * 59;
        int iHashCode3 = deviceSn == null ? 43 : deviceSn.hashCode();
        String broadcastId = getBroadcastId();
        return ((i + iHashCode3) * 59) + (broadcastId != null ? broadcastId.hashCode() : 43);
    }

    public void setBroadcastId(String str) {
        this.broadcastId = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceSn(String str) {
        this.deviceSn = str;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.Bytable
    public byte[] toBytes() {
        return new byte[0];
    }

    public String toString() {
        return "BaseDeviceProperty(macAddress=" + getMacAddress() + ", deviceId=" + getDeviceId() + ", deviceSn=" + getDeviceSn() + ", broadcastId=" + getBroadcastId() + ")";
    }
}
