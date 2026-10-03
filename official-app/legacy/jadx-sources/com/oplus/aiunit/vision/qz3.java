package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;

/* JADX INFO: loaded from: classes5.dex */
public class qz3 {
    public void a(@NonNull DeviceInfo deviceInfo) {
        wil.a("ConnectionStateListener", "onConnected: MAC:" + gdb.a(deviceInfo.getNodeId()));
    }

    public void b(@NonNull DeviceInfo deviceInfo, int i) {
        wil.a("ConnectionStateListener", "onConnectedFail: MAC:" + gdb.a(deviceInfo.getNodeId()) + " reason:" + i);
    }

    public void c(@NonNull DeviceInfo deviceInfo) {
        wil.a("ConnectionStateListener", "onConnecting: MAC:" + gdb.a(deviceInfo.getNodeId()));
    }

    public void d(@NonNull DeviceInfo deviceInfo, int i) {
        wil.a("ConnectionStateListener", "onDisconnected: MAC:" + gdb.a(deviceInfo.getNodeId()) + " reason:" + i);
    }
}
