package com.heytap.health.watch.commonsync;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.dp3;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class CommonSyncMainInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        dp3.b(this.mApplication);
    }
}
