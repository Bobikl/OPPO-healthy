package com.heytap.health.watch.music;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.bm5;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.u9c;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class MusicTransportInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 2;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.messageApi.c(8, "/music/control");
        bm5Var.nodeApi.l(u9c.INSTANCE);
    }
}
