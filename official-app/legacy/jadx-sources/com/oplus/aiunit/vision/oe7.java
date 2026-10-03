package com.oplus.aiunit.vision;

import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/oe7;", "Lcom/oplus/aiunit/vision/if0;", "", "b7", SecureGcmConstants.MESSAGE_KEY, "", "getDeviceImei", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public interface oe7 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFindDeviceAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindDeviceAbility.kt\ncom/heytap/wearable/watch/finddevice/ability/FindDeviceAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,38:1\n37#2,5:39\n37#2,5:44\n37#2,5:49\n*S KotlinDebug\n*F\n+ 1 FindDeviceAbility.kt\ncom/heytap/wearable/watch/finddevice/ability/FindDeviceAbility$DefaultImpls\n*L\n23#1:39,5\n27#1:44,5\n31#1:49,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull oe7 oe7Var) {
            if (oe7Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) oe7Var;
                return deviceInfo.Qa() || deviceInfo.Ya();
            }
            throw new RuntimeException(oe7Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String b(@NotNull oe7 oe7Var) {
            String imei;
            if (!(oe7Var instanceof DeviceInfo)) {
                throw new RuntimeException(oe7Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) oe7Var;
            if (deviceInfo.ya()) {
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                imei = deviceInfo2 != null ? deviceInfo2.getGuid() : null;
                if (imei == null) {
                    return "";
                }
                Intrinsics.checkNotNullExpressionValue(imei, "deviceInfo?.guid ?: \"\"");
            } else {
                UserDeviceInfo deviceInfo3 = deviceInfo.getDeviceInfo();
                imei = deviceInfo3 != null ? deviceInfo3.getImei() : null;
                if (imei == null) {
                    return "";
                }
                Intrinsics.checkNotNullExpressionValue(imei, "deviceInfo?.imei ?: \"\"");
            }
            return imei;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull oe7 oe7Var) {
            if (oe7Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) oe7Var;
                return (!deviceInfo.ha() && deviceInfo.T9()) || (deviceInfo.K9() && deviceInfo.qa(DeviceConstants.BaseDevice.AbstractC0341b.k.INSTANCE));
            }
            throw new RuntimeException(oe7Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean P();

    boolean b7();

    @NotNull
    String getDeviceImei();
}
