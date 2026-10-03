package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/lvc;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/kvc;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
public final class lvc extends DeviceInfo implements kvc {
    public lvc(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.kvc
    public boolean W3() {
        return kvc.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.kvc
    public boolean Z4() {
        return kvc.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.kvc
    public boolean Z5() {
        return kvc.a.i(this);
    }

    @Override // com.oplus.aiunit.vision.kvc
    public int l1() {
        return kvc.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.kvc
    public boolean r0() {
        return kvc.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.kvc
    public boolean s2() {
        return kvc.a.f(this);
    }

    @Override // com.oplus.aiunit.vision.kvc
    public boolean w4() {
        return kvc.a.h(this);
    }
}
