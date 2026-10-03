package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/fn1;", "Lcom/oplus/aiunit/vision/if0;", "", "f1", "Y0", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
public interface fn1 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBloodPressureAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureAbility.kt\ncom/heytap/health/bloodpressure/ability/BloodPressureAbility$DeviceInfo$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,56:1\n37#2,5:57\n37#2,5:62\n*S KotlinDebug\n*F\n+ 1 BloodPressureAbility.kt\ncom/heytap/health/bloodpressure/ability/BloodPressureAbility$DeviceInfo$DefaultImpls\n*L\n43#1:57,5\n50#1:62,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull fn1 fn1Var) {
            if (fn1Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fn1Var;
                return deviceInfo.Y9() || (deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.f.INSTANCE));
            }
            throw new RuntimeException(fn1Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull fn1 fn1Var) {
            if (fn1Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fn1Var;
                return (deviceInfo.ja() && deviceInfo.Sa(240)) || (deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE));
            }
            throw new RuntimeException(fn1Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean Y0();

    boolean f1();
}
