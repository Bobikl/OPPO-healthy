package com.heytap.health.wallet;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.gl4;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class WalletMainInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 30;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        gl4.devicePrimary.messageApi.c(12, "/device_wallet/WalletServiceImp");
    }
}
