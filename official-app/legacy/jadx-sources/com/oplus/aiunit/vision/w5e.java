package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/w5e;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/u5e;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class w5e extends DeviceInfo implements u5e {
    public w5e(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.u5e
    public boolean B() {
        return u5e.a.i(this);
    }

    @Override // com.oplus.aiunit.vision.v5e
    public boolean I7() {
        return u5e.a.a(this);
    }

    @Override // com.oplus.aiunit.vision.v5e
    public boolean K2() {
        return u5e.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.u5e
    public boolean S6() {
        return u5e.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.u5e
    public boolean X1() {
        return u5e.a.h(this);
    }

    @Override // com.oplus.aiunit.vision.v5e
    public boolean X7() {
        return u5e.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.u5e
    @NotNull
    public String i4() {
        return u5e.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.v5e
    public boolean q0() {
        return u5e.a.j(this);
    }

    @Override // com.oplus.aiunit.vision.v5e
    public boolean w2() {
        return u5e.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.v5e
    public boolean w8() {
        return u5e.a.f(this);
    }
}
