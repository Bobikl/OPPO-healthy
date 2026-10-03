package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/gh9;", "Lcom/oplus/aiunit/vision/if0;", "", "q1", "hrv_release"}, k = 1, mv = {1, 8, 0})
public interface gh9 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHrvStateAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrvStateAbility.kt\ncom/heytap/health/hrv/ability/HrvStateAbility$Info$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,55:1\n37#2,5:56\n*S KotlinDebug\n*F\n+ 1 HrvStateAbility.kt\ncom/heytap/health/hrv/ability/HrvStateAbility$Info$DefaultImpls\n*L\n42#1:56,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull gh9 gh9Var) {
            if (gh9Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) gh9Var;
                if (deviceInfo.ja()) {
                    return deviceInfo.Sa(240);
                }
                if (deviceInfo.ka()) {
                    return deviceInfo.Sa(180);
                }
                return deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.c.INSTANCE);
            }
            throw new RuntimeException(gh9Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean q1();
}
