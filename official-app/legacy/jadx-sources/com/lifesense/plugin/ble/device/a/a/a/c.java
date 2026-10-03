package com.lifesense.plugin.ble.device.a.a.a;

import com.lifesense.plugin.ble.OnSettingListener;
import com.lifesense.plugin.ble.data.LSDeviceMessage;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    private LSDeviceMessage a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnSettingListener f8708c;

    public LSDeviceMessage a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public OnSettingListener c() {
        return this.f8708c;
    }

    public String d() {
        LSDeviceMessage lSDeviceMessage = this.a;
        return lSDeviceMessage != null ? lSDeviceMessage.toString() : "null";
    }

    public String toString() {
        return "IPushMessageCmd{msg=" + this.a + ", deviceMac='" + this.b + "', listener=" + this.f8708c + '}';
    }

    public void a(OnSettingListener onSettingListener) {
        this.f8708c = onSettingListener;
    }

    public void a(LSDeviceMessage lSDeviceMessage) {
        this.a = lSDeviceMessage;
    }

    public void a(String str) {
        this.b = str;
    }
}
