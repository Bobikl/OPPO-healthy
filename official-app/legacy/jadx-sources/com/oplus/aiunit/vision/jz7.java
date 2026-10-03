package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;

/* JADX INFO: loaded from: classes5.dex */
public class jz7 {
    public static final int MAX_BUFFER_SIZE = 102400;

    public static ModuleInfo a(String str) {
        DeviceInfo deviceInfoB = pc5.v().b(str);
        if (deviceInfoB != null) {
            return deviceInfoB.getConnectedModuleInfo();
        }
        return null;
    }

    public static int b(int i) {
        return jx3.b(i) ? 1 : 3;
    }

    public static int c(int i) {
        return jx3.b(i) ? 2048 : 102400;
    }
}
