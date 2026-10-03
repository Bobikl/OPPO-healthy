package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/zjl;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/oplus/aiunit/vision/yjl;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "<init>", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public final class zjl extends DeviceInfo implements yjl {
    public zjl(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo);
    }

    @Override // com.oplus.aiunit.vision.yjl
    @Nullable
    public String B8(@Nullable String str) {
        return yjl.a.a(this, str);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public boolean J6() {
        return yjl.a.l(this);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public boolean P7() {
        return yjl.a.f(this);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public int R1() {
        return yjl.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public int R6() {
        return yjl.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public boolean V5() {
        return yjl.a.g(this);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public boolean a8() {
        return yjl.a.k(this);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public boolean f5() {
        return yjl.a.n(this);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public boolean l6() {
        return yjl.a.m(this);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public boolean p8() {
        return yjl.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public boolean q() {
        return yjl.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public boolean u() {
        return yjl.a.h(this);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public boolean u1(@Nullable String str) {
        return yjl.a.j(this, str);
    }

    @Override // com.oplus.aiunit.vision.yjl
    public boolean w6() {
        return yjl.a.i(this);
    }
}
