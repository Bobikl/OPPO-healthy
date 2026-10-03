package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.oplus.wearable.linkservice.sdk.Node;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/otc;", "Lcom/heytap/health/devicemanager/deviceability/DeviceModel;", "Lcom/oplus/aiunit/vision/ntc;", "", "model", "<init>", "(Ljava/lang/String;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class otc extends DeviceModel implements ntc {
    public otc(@Nullable String str) {
        super(str);
    }

    @Override // com.oplus.aiunit.vision.ntc
    @Nullable
    public Node M3(@Nullable String str, @Nullable String str2) {
        return ntc.a.a(this, str, str2);
    }
}
