package com.heytap.health.device.ota;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.gl4;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/heytap/health/device/ota/OTATransportInitializer;", "Lcom/oplus/aiunit/vision/a8a;", "", "configProcess", "", "init", "<init>", "()V", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
public final class OTATransportInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 2;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        gl4.devicePrimary.messageApi.c(27, "/ota/msg");
    }
}
