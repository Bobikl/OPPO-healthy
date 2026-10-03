package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/h3l;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/g3l;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "voiceassistant_release"}, k = 1, mv = {1, 8, 0})
public final class h3l extends DeviceInfo implements g3l {
    public h3l(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.g3l
    @NotNull
    public String D6() {
        return g3l.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.g3l
    public boolean N4() {
        return g3l.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.g3l
    public boolean P2() {
        return g3l.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.g3l
    @NotNull
    public MessageEvent c0(boolean z, boolean z2, boolean z3) {
        return g3l.a.a(this, z, z2, z3);
    }

    @Override // com.oplus.aiunit.vision.g3l
    public boolean r5() {
        return g3l.a.h(this);
    }

    @Override // com.oplus.aiunit.vision.g3l
    public boolean t3() {
        return g3l.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.g3l
    public boolean t8() {
        return g3l.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.g3l
    public boolean y() {
        return g3l.a.f(this);
    }
}
