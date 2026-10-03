package com.lifesense.android.bluetooth.core.bean;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class WifiInfo implements Serializable {
    public int authMode;
    public byte[] bssid;
    public int rssi;
    public String ssid;
    public int status;

    public boolean canEqual(Object obj) {
        return obj instanceof WifiInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiInfo)) {
            return false;
        }
        WifiInfo wifiInfo = (WifiInfo) obj;
        if (!wifiInfo.canEqual(this)) {
            return false;
        }
        String ssid = getSsid();
        String ssid2 = wifiInfo.getSsid();
        if (ssid != null ? ssid.equals(ssid2) : ssid2 == null) {
            return Arrays.equals(getBssid(), wifiInfo.getBssid()) && getAuthMode() == wifiInfo.getAuthMode() && getRssi() == wifiInfo.getRssi() && getStatus() == wifiInfo.getStatus();
        }
        return false;
    }

    public int getAuthMode() {
        return this.authMode;
    }

    public byte[] getBssid() {
        return this.bssid;
    }

    public int getRssi() {
        return this.rssi;
    }

    public String getSsid() {
        return this.ssid;
    }

    public int getStatus() {
        return this.status;
    }

    public int hashCode() {
        String ssid = getSsid();
        return (((((((((ssid == null ? 43 : ssid.hashCode()) + 59) * 59) + Arrays.hashCode(getBssid())) * 59) + getAuthMode()) * 59) + getRssi()) * 59) + getStatus();
    }

    public void setAuthMode(int i) {
        this.authMode = i;
    }

    public void setBssid(byte[] bArr) {
        this.bssid = bArr;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String toString() {
        return "WifiInfo(ssid=" + getSsid() + ", bssid=" + Arrays.toString(getBssid()) + ", authMode=" + getAuthMode() + ", rssi=" + getRssi() + ", status=" + getStatus() + ")";
    }
}
