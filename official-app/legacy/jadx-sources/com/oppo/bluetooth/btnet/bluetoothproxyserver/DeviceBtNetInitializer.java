package com.oppo.bluetooth.btnet.bluetoothproxyserver;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.epb;
import com.oplus.aiunit.vision.hpb;
import com.oplus.aiunit.vision.ir0;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class DeviceBtNetInitializer extends a8a {
    private static final String TAG = "DeviceBtNetInitializer";

    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 80;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 2;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        ir0.a();
        hpb.INSTANCE.d();
        epb.INSTANCE.a();
    }
}
