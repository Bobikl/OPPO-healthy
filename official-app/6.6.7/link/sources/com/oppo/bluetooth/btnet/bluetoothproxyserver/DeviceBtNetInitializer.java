package com.oppo.bluetooth.btnet.bluetoothproxyserver;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.i9a;
import com.oplus.aiunit.vision.tqb;
import com.oplus.aiunit.vision.wqb;
import com.oplus.aiunit.vision.zr0;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class DeviceBtNetInitializer extends i9a {
    private static final String TAG = "DeviceBtNetInitializer";

    public int configPriority() {
        return 80;
    }

    public int configProcess() {
        return 2;
    }

    public void init() {
        zr0.a();
        wqb.INSTANCE.d();
        tqb.INSTANCE.a();
    }
}
