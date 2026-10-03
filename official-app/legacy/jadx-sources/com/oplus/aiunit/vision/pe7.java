package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/pe7;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/oe7;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public final class pe7 extends DeviceInfo implements oe7 {
    public pe7(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.oe7
    public boolean P() {
        return oe7.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.oe7
    public boolean b7() {
        return oe7.a.a(this);
    }

    @Override // com.oplus.aiunit.vision.oe7
    @NotNull
    public String getDeviceImei() {
        return oe7.a.b(this);
    }
}
