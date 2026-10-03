package com.lifesense.plugin.ble.device.a.a.a;

import com.lifesense.plugin.ble.OnSettingListener;
import com.lifesense.plugin.ble.data.IDeviceSetting;

/* JADX INFO: loaded from: classes5.dex */
public class j {
    private String a;
    private IDeviceSetting b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnSettingListener f8712c;

    public String a() {
        return this.a;
    }

    public IDeviceSetting b() {
        return this.b;
    }

    public OnSettingListener c() {
        return this.f8712c;
    }

    public String d() {
        IDeviceSetting iDeviceSetting = this.b;
        return iDeviceSetting != null ? String.format("%02X", Integer.valueOf(iDeviceSetting.getCmd())) : "null";
    }

    public String toString() {
        return "IPushSettingCmd{deviceMac='" + this.a + "', setting=" + this.b + ", listener=" + this.f8712c + '}';
    }

    public void a(OnSettingListener onSettingListener) {
        this.f8712c = onSettingListener;
    }

    public void a(IDeviceSetting iDeviceSetting) {
        this.b = iDeviceSetting;
    }

    public void a(String str) {
        this.a = str;
    }
}
