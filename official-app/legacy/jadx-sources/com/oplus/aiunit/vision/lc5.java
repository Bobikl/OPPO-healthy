package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/lc5;", "", "", "model", "Lcom/oplus/aiunit/vision/mr3;", "d", "mac", "Lcom/oplus/aiunit/vision/lr3;", "c", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "userDeviceInfo", "b", "btName", "a", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceCommonTool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceCommonTool.kt\ncom/heytap/health/devicemanager/deviceability/DeviceCommonTool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class lc5 {

    @NotNull
    public static final lc5 INSTANCE = new lc5();

    @JvmStatic
    @NotNull
    public static final mr3 a(@Nullable String btName) {
        String strH;
        String str = "";
        if (btName != null) {
            Iterator<DeviceConstants.DeviceParams> it = DeviceConstants.INSTANCE.A().iterator();
            while (true) {
                if (!it.hasNext()) {
                    strH = "";
                    break;
                }
                DeviceConstants.DeviceParams next = it.next();
                if (next.a(btName)) {
                    strH = next.getModel();
                    break;
                }
            }
            if (strH != null) {
                str = strH;
            }
        }
        return new mr3(new DeviceModel(str));
    }

    @JvmStatic
    @NotNull
    public static final lr3 b(@Nullable UserDeviceInfo userDeviceInfo) {
        return new lr3(new DeviceInfo(userDeviceInfo));
    }

    @JvmStatic
    @NotNull
    public static final lr3 c(@Nullable String mac) {
        return new lr3(new DeviceInfo(rp5.b(mac)));
    }

    @JvmStatic
    @NotNull
    public static final mr3 d(@Nullable String model) {
        return new mr3(new DeviceModel(model));
    }
}
