package com.heytap.health.watch.thirdparty;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.ro;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ThirdPartyMainInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        ro.b(this.mApplication);
    }
}
