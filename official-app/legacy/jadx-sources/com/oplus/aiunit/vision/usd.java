package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/usd;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/tsd;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
public final class usd extends DeviceInfo implements tsd {
    public usd(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.tsd
    public int F1() {
        return tsd.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.tsd
    public boolean V6() {
        return tsd.a.i(this);
    }

    @Override // com.oplus.aiunit.vision.tsd
    public boolean X5() {
        return tsd.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.tsd
    public boolean Y1() {
        return tsd.a.f(this);
    }

    @Override // com.oplus.aiunit.vision.tsd
    public int d() {
        return tsd.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.tsd
    public boolean e5() {
        return tsd.a.j(this);
    }

    @Override // com.oplus.aiunit.vision.tsd
    @Nullable
    public String getDeviceUniqueId() {
        return tsd.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.tsd
    public boolean r2() {
        return tsd.a.h(this);
    }

    @Override // com.oplus.aiunit.vision.tsd
    @NotNull
    public String s0() {
        return tsd.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.tsd
    public boolean s7() {
        return tsd.a.k(this);
    }

    @Override // com.oplus.aiunit.vision.tsd
    public boolean z2() {
        return tsd.a.a(this);
    }
}
