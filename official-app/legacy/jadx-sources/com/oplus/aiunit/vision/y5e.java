package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/y5e;", "", "", "model", "Lcom/oplus/aiunit/vision/v5e;", "c", "mac", "Lcom/oplus/aiunit/vision/u5e;", "b", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "a", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class y5e {

    @NotNull
    public static final y5e INSTANCE = new y5e();

    @JvmStatic
    @NotNull
    public static final u5e a(@Nullable UserDeviceInfo deviceInfo) {
        return new w5e(deviceInfo);
    }

    @JvmStatic
    @NotNull
    public static final u5e b(@Nullable String mac) {
        return new w5e(rp5.b(mac));
    }

    @JvmStatic
    @NotNull
    public static final v5e c(@Nullable String model) {
        return new x5e(model);
    }
}
