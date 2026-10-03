package com.heytap.health.hearing;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.jz8;
import com.oplus.aiunit.vision.zw8;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class HearingTransportInitializer extends a8a {
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
        if (zw8.g()) {
            jz8.h();
        }
    }
}
