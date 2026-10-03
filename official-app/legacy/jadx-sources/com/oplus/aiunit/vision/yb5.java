package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.oplus.mydevices.sdk.device.DeviceType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/yb5;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/wb5;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "linkage_impl_release"}, k = 1, mv = {1, 8, 0})
public final class yb5 extends DeviceInfo implements wb5 {
    public yb5(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.xb5
    public int D3() {
        return wb5.a.a(this);
    }

    @Override // com.oplus.aiunit.vision.xb5
    public int H5() {
        return wb5.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.wb5
    public boolean M8() {
        return wb5.a.l(this);
    }

    @Override // com.oplus.aiunit.vision.xb5
    public boolean e0() {
        return wb5.a.k(this);
    }

    @Override // com.oplus.aiunit.vision.xb5
    @NotNull
    public DeviceType getDeviceType() {
        return wb5.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.wb5
    public boolean j() {
        return wb5.a.j(this);
    }

    @Override // com.oplus.aiunit.vision.wb5
    public boolean k1() {
        return wb5.a.h(this);
    }

    @Override // com.oplus.aiunit.vision.xb5
    public boolean s3() {
        return wb5.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.xb5
    public int t7() {
        return wb5.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.xb5
    public boolean z3() {
        return wb5.a.i(this);
    }
}
