package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/ug3;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/tg3;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ug3 extends DeviceInfo implements tg3 {
    public ug3(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.tg3
    public int G3() {
        return tg3.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.ma5
    public boolean J4(@NotNull int... iArr) {
        return tg3.a.d(this, iArr);
    }

    @Override // com.oplus.aiunit.vision.tg3
    public boolean R() {
        return tg3.a.f(this);
    }

    @Override // com.oplus.aiunit.vision.tg3
    public boolean b0() {
        return tg3.a.h(this);
    }

    @Override // com.oplus.aiunit.vision.tg3
    public int m3() {
        return tg3.a.a(this);
    }

    @Override // com.oplus.aiunit.vision.tg3
    public boolean r3() {
        return tg3.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.tg3
    public boolean r8() {
        return tg3.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.ma5
    public boolean s5() {
        return tg3.a.i(this);
    }

    @Override // com.oplus.aiunit.vision.tg3
    public boolean w7() {
        return tg3.a.c(this);
    }
}
