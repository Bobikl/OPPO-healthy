package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/f23;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/e23;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class f23 extends DeviceInfo implements e23 {
    public f23(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.e23
    public boolean E() {
        return e23.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.ma5
    public boolean J4(@NotNull int... iArr) {
        return e23.a.a(this, iArr);
    }

    @Override // com.oplus.aiunit.vision.e23
    public boolean Q() {
        return e23.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.e23
    public boolean Q2() {
        return e23.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.e23
    public boolean R4() {
        return e23.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.e23
    public boolean Z3() {
        return e23.a.f(this);
    }

    @Override // com.oplus.aiunit.vision.e23
    public boolean q3() {
        return e23.a.i(this);
    }

    @Override // com.oplus.aiunit.vision.e23
    public boolean s1() {
        return e23.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.ma5
    public boolean s5() {
        return e23.a.h(this);
    }

    @Override // com.oplus.aiunit.vision.e23
    public boolean s6() {
        return e23.a.j(this);
    }
}
