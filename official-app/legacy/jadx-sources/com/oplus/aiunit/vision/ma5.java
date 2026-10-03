package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/ma5;", "Lcom/oplus/aiunit/vision/if0;", "", "", "appIds", "", "J4", "s5", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface ma5 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceAppUninstallAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceAppUninstallAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/DeviceAppUninstallAbility$Info$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,49:1\n37#2,5:50\n37#2,5:55\n*S KotlinDebug\n*F\n+ 1 DeviceAppUninstallAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/DeviceAppUninstallAbility$Info$DefaultImpls\n*L\n29#1:50,5\n40#1:55,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull ma5 ma5Var, @NotNull int... appIds) {
            Intrinsics.checkNotNullParameter(appIds, "appIds");
            if (!(ma5Var instanceof DeviceInfo)) {
                throw new RuntimeException(ma5Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) ma5Var;
            if (!ma5Var.s5()) {
                return true;
            }
            ka5 ka5VarFindDeviceAppStatusByMacAndAppIds = gl4.businessApi.findDeviceAppStatusByMacAndAppIds(deviceInfo.Ma(), Arrays.copyOf(appIds, appIds.length));
            if (ka5VarFindDeviceAppStatusByMacAndAppIds != null) {
                return ka5VarFindDeviceAppStatusByMacAndAppIds.b();
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull ma5 ma5Var) {
            if (!(ma5Var instanceof DeviceInfo)) {
                throw new RuntimeException(ma5Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) ma5Var;
            if (!deviceInfo.K9() || deviceInfo.M9() || deviceInfo.O9() || deviceInfo.T9()) {
                if (!(deviceInfo.ea() ? deviceInfo.Sa(170) : deviceInfo.pa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE))) {
                    return false;
                }
            }
            return true;
        }
    }

    boolean J4(@NotNull int... appIds);

    boolean s5();
}
