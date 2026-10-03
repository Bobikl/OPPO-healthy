package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device.third.bgp.BpgBean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/i32;", "Lcom/oplus/aiunit/vision/p11;", "Lcom/heytap/health/device/third/bgp/BpgBean;", "data", "<init>", "(Lcom/heytap/health/device/third/bgp/BpgBean;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class i32 extends p11<BpgBean> {
    public static final int $stable = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public i32(@NotNull BpgBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String deviceMac = data.getDeviceMac();
        Intrinsics.checkNotNullExpressionValue(deviceMac, "data.deviceMac");
        super(data, deviceMac, null);
        String deviceMac2 = data.getDeviceMac();
        Intrinsics.checkNotNullExpressionValue(deviceMac2, "data.deviceMac");
        i(deviceMac2);
    }
}
