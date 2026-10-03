package com.heytap.health.telecom;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ik5;
import com.oplus.aiunit.vision.iqj;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.tl4;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class TelecomTransportInitializer extends a8a {
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
        ik5 ik5Var = gl4.deviceMultiple;
        tl4 tl4Var = ik5Var.messageApi;
        ra5.a aVar = ra5.a.INSTANCE;
        tl4Var.p(aVar, 7, 3, iqj.PATH_PHONE_SMS);
        ik5Var.messageApi.i(aVar, 6, iqj.PATH_PHONE_TELECOM);
        ik5Var.nodeApi.e(PhoneTelecomManager.INSTANCE);
    }
}
