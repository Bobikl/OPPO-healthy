package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/dqj;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/cqj;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "telecom_impl_release"}, k = 1, mv = {1, 8, 0})
public final class dqj extends DeviceInfo implements cqj {
    public dqj(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.cqj
    public boolean A1(@NotNull Context context, int i, @Nullable String str) {
        return cqj.a.a(this, context, i, str);
    }

    @Override // com.oplus.aiunit.vision.cqj
    public boolean J7() {
        return cqj.a.f(this);
    }

    @Override // com.oplus.aiunit.vision.cqj
    public boolean P5() {
        return cqj.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.cqj
    public boolean X3() {
        return cqj.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.cqj
    public boolean g6() {
        return cqj.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.cqj
    public boolean i8() {
        return cqj.a.e(this);
    }
}
