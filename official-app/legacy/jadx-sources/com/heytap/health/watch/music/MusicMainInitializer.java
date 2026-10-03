package com.heytap.health.watch.music;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.bm5;
import com.oplus.aiunit.vision.gl4;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class MusicMainInitializer extends a8a {
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
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.messageApi.c(8, "/music/transfer");
        bm5Var.fileApi.c(8, "/music/transfer");
        bm5Var.messageApi.c(1, "/music/storage");
    }
}
