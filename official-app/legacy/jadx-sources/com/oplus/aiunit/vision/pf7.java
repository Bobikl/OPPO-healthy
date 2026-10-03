package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/pf7;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/of7;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public final class pf7 extends DeviceInfo implements of7 {
    public pf7(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.of7
    public int A0() {
        return of7.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.of7
    public int H6() {
        return of7.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.of7
    public boolean Q8() {
        return of7.a.a(this);
    }

    @Override // com.oplus.aiunit.vision.of7
    public boolean h5() {
        return of7.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.of7
    public int l0() {
        return of7.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.of7
    public int t0() {
        return of7.a.f(this);
    }

    @Override // com.oplus.aiunit.vision.of7
    public int x8() {
        return of7.a.d(this);
    }
}
