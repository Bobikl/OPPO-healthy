package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/wp6;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/vp6;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class wp6 extends DeviceInfo implements vp6 {
    public wp6(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.vp6
    public boolean H4() {
        return vp6.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.vp6
    public boolean c4() {
        return vp6.a.a(this);
    }

    @Override // com.oplus.aiunit.vision.vp6
    public boolean j4() {
        return vp6.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.vp6
    public boolean n5() {
        return vp6.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.vp6
    public boolean u7() {
        return vp6.a.c(this);
    }
}
