package com.heytap.health.telecom;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.hqj;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class TelecomMainInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        hqj.b(this.mApplication);
    }
}
