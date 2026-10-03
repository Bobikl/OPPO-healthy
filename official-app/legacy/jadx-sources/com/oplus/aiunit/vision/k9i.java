package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/k9i;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/j9i;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class k9i extends DeviceInfo implements j9i {
    public k9i(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.j9i
    public boolean I0() {
        return j9i.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.ma5
    public boolean J4(@NotNull int... iArr) {
        return j9i.a.a(this, iArr);
    }

    @Override // com.oplus.aiunit.vision.j9i
    public boolean Q1() {
        return j9i.a.f(this);
    }

    @Override // com.oplus.aiunit.vision.j9i
    public boolean Y2() {
        return j9i.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.j9i
    public boolean b1() {
        return j9i.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.j9i
    public boolean m6() {
        return j9i.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.ma5
    public boolean s5() {
        return j9i.a.h(this);
    }

    @Override // com.oplus.aiunit.vision.j9i
    public boolean u4() {
        return j9i.a.g(this);
    }
}
