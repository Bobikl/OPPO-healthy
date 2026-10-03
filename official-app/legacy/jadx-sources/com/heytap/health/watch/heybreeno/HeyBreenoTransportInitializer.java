package com.heytap.health.watch.heybreeno;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.gl4;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class HeyBreenoTransportInitializer extends a8a {
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
        gl4.devicePrimary.messageApi.c(19, "/heybreeno/sync");
    }
}
