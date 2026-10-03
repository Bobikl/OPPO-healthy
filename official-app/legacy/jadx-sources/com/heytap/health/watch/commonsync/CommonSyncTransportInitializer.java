package com.heytap.health.watch.commonsync;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.bm5;
import com.oplus.aiunit.vision.dp3;
import com.oplus.aiunit.vision.gl4;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class CommonSyncTransportInitializer extends a8a {
    private static final String TAG = "CommonSyncTransportInitializer";

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 2;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.messageApi.c(30, "/user_event/control");
        bm5Var.messageApi.q(1, -1, "/commonsync/basicSync");
        dp3.d();
    }
}
