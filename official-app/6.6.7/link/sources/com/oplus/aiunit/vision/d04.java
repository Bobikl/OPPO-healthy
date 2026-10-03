package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class d04 {
    public void a(@NonNull DeviceInfo deviceInfo) {
        uml.a("ConnectionStateListener", "onConnected: MAC:" + veb.a(deviceInfo.getNodeId()));
    }

    public void b(@NonNull DeviceInfo deviceInfo, int i) {
        uml.a("ConnectionStateListener", "onConnectedFail: MAC:" + veb.a(deviceInfo.getNodeId()) + " reason:" + i);
    }

    public void c(@NonNull DeviceInfo deviceInfo) {
        uml.a("ConnectionStateListener", "onConnecting: MAC:" + veb.a(deviceInfo.getNodeId()));
    }

    public void d(@NonNull DeviceInfo deviceInfo, int i) {
        uml.a("ConnectionStateListener", "onDisconnected: MAC:" + veb.a(deviceInfo.getNodeId()) + " reason:" + i);
    }
}
