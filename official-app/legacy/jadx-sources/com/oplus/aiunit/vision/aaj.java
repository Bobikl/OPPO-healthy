package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/aaj;", "Lcom/oplus/aiunit/vision/if0;", "", "j3", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface aaj extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSyncDataWithMcuAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncDataWithMcuAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/SyncDataWithMcuAbility$Info$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,22:1\n37#2,5:23\n*S KotlinDebug\n*F\n+ 1 SyncDataWithMcuAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/SyncDataWithMcuAbility$Info$DefaultImpls\n*L\n15#1:23,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull aaj aajVar) {
            if (aajVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) aajVar;
                if (!deviceInfo.ja() && !deviceInfo.aa()) {
                    return deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE);
                }
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                return ugl.e(deviceInfo2 != null ? deviceInfo2.getFirmwareVersion() : null, 240);
            }
            throw new RuntimeException(aajVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean j3();
}
