package com.heytap.health.watch.netnumber;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a5l;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ra5;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class NetNumberTransportInitializer extends a8a {
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
        gl4.deviceMultiple.messageApi.i(ra5.a.INSTANCE, 16, a5l.PATH);
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void initAfterPrivacyAgreed() {
        super.initAfterPrivacyAgreed();
        a5l.a(this.mApplication);
    }
}
