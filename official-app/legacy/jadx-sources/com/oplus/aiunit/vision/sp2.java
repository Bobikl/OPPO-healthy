package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/sp2;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/rp2;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "calendar_impl_release"}, k = 1, mv = {1, 8, 0})
public final class sp2 extends DeviceInfo implements rp2 {
    public sp2(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.rp2
    public int C4() {
        return rp2.a.j(this);
    }

    @Override // com.oplus.aiunit.vision.rp2
    public boolean F5() {
        return rp2.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.rp2
    public boolean H1() {
        return rp2.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.rp2
    public boolean H8() {
        return rp2.a.k(this);
    }

    @Override // com.oplus.aiunit.vision.ma5
    public boolean J4(@NotNull int... iArr) {
        return rp2.a.a(this, iArr);
    }

    @Override // com.oplus.aiunit.vision.rp2
    public boolean N8() {
        return rp2.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.rp2
    public boolean R0() {
        return rp2.a.f(this);
    }

    @Override // com.oplus.aiunit.vision.rp2
    public boolean V2() {
        return rp2.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.rp2
    public boolean a() {
        return rp2.a.h(this);
    }

    @Override // com.oplus.aiunit.vision.rp2
    public boolean a0() {
        return rp2.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.ma5
    public boolean s5() {
        return rp2.a.i(this);
    }
}
