package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/c7l;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/b7l;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "commonlib_release"}, k = 1, mv = {1, 8, 0})
public final class c7l extends DeviceInfo implements b7l {
    public c7l(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.b7l
    public boolean F7() {
        return b7l.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.b7l
    @NotNull
    public String c3() {
        return b7l.a.a(this);
    }

    @Override // com.oplus.aiunit.vision.b7l
    public boolean j6() {
        return b7l.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.b7l
    @NotNull
    public String j8() {
        return b7l.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.b7l
    public boolean y1() {
        return b7l.a.e(this);
    }
}
