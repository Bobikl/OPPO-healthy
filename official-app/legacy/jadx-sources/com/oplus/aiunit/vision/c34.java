package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/c34;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/b34;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class c34 extends DeviceInfo implements b34 {
    public c34(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.b34
    public boolean D5() {
        return b34.a.l(this);
    }

    @Override // com.oplus.aiunit.vision.b34
    public boolean K1() {
        return b34.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.b34
    public boolean M0() {
        return b34.a.f(this);
    }

    @Override // com.oplus.aiunit.vision.b34
    public int N() {
        return b34.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.b34
    public boolean S3() {
        return b34.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.b34
    public boolean U5() {
        return b34.a.i(this);
    }

    @Override // com.oplus.aiunit.vision.b34
    public boolean V1() {
        return b34.a.m(this);
    }

    @Override // com.oplus.aiunit.vision.b34
    public boolean a() {
        return b34.a.h(this);
    }

    @Override // com.oplus.aiunit.vision.b34
    public boolean f3() {
        return b34.a.k(this);
    }

    @Override // com.oplus.aiunit.vision.b34
    public boolean l8() {
        return b34.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.b34
    @NotNull
    public String n(@Nullable String str) {
        return b34.a.a(this, str);
    }

    @Override // com.oplus.aiunit.vision.b34
    public boolean q() {
        return b34.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.b34
    public boolean x1() {
        return b34.a.j(this);
    }
}
