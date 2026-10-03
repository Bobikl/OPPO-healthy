package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/x5e;", "Lcom/heytap/health/devicemanager/deviceability/DeviceModel;", "Lcom/oplus/aiunit/vision/v5e;", "", "model", "<init>", "(Ljava/lang/String;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class x5e extends DeviceModel implements v5e {
    public x5e(@Nullable String str) {
        super(str);
    }

    @Override // com.oplus.aiunit.vision.v5e
    public boolean I7() {
        return v5e.a.a(this);
    }

    @Override // com.oplus.aiunit.vision.v5e
    public boolean K2() {
        return v5e.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.v5e
    public boolean X7() {
        return v5e.a.b(this);
    }

    @Override // com.oplus.aiunit.vision.v5e
    public boolean w2() {
        return v5e.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.v5e
    public boolean w8() {
        return v5e.a.d(this);
    }
}
