package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class m08 {
    public static final int MAX_BUFFER_SIZE = 102400;

    public static ModuleInfo a(String str) {
        DeviceInfo deviceInfoB = kd5.v().b(str);
        if (deviceInfoB != null) {
            return deviceInfoB.getConnectedModuleInfo();
        }
        return null;
    }

    public static int b(int i) {
        return xx3.b(i) ? 1 : 3;
    }

    public static int c(int i) {
        if (xx3.b(i)) {
            return 2048;
        }
        return MAX_BUFFER_SIZE;
    }
}
