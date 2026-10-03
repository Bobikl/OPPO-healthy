package com.lifesense.plugin.ble.data.other;

import com.lifesense.plugin.ble.data.IBManagerConfig;

/* JADX INFO: loaded from: classes5.dex */
public class DefaultCallConfig extends IBManagerConfig {
    private String phoneNumber;

    public DefaultCallConfig(String str) {
        this.phoneNumber = str;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public String toString() {
        return "DefaultCallConfig [phoneNumber=" + this.phoneNumber + "]";
    }
}
