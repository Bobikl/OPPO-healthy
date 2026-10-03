package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/u5e;", "Lcom/oplus/aiunit/vision/if0;", "Lcom/oplus/aiunit/vision/v5e;", "", "X1", c8l.KEY_B, "S6", "", "i4", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface u5e extends if0, v5e {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPairAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PairAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/PairAbility$Info$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,134:1\n37#2,5:135\n37#2,5:140\n37#2,5:145\n37#2,5:150\n*S KotlinDebug\n*F\n+ 1 PairAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/PairAbility$Info$DefaultImpls\n*L\n88#1:135,5\n96#1:140,5\n114#1:145,5\n122#1:150,5\n*E\n"})
    public static final class a {
        public static boolean a(@NotNull u5e u5eVar) {
            return v5e.a.a(u5eVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String b(@NotNull u5e u5eVar) {
            if (!(u5eVar instanceof DeviceInfo)) {
                throw new RuntimeException(u5eVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) u5eVar;
            StringBuilder sb = new StringBuilder();
            sb.append("&deviceType=");
            UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
            String str = "";
            sb.append(String.valueOf(deviceInfo2 != null ? Integer.valueOf(deviceInfo2.getDeviceType()) : ""));
            sb.append("&model=");
            sb.append(deviceInfo.y4());
            sb.append("&firmwareVersion=");
            UserDeviceInfo deviceInfo3 = deviceInfo.getDeviceInfo();
            sb.append("A" + ugl.c(deviceInfo3 != null ? deviceInfo3.getFirmwareVersion() : null));
            sb.append("&systemVersion=");
            UserDeviceInfo deviceInfo4 = deviceInfo.getDeviceInfo();
            String deviceOsVersion = deviceInfo4 != null ? deviceInfo4.getDeviceOsVersion() : null;
            if (deviceOsVersion != null) {
                Intrinsics.checkNotNullExpressionValue(deviceOsVersion, "deviceInfo?.deviceOsVersion ?: \"\"");
                str = deviceOsVersion;
            }
            sb.append(str);
            sb.append("&langCode=");
            sb.append(kta.b());
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "applyInfo {\n            …    .toString()\n        }");
            return string;
        }

        public static boolean c(@NotNull u5e u5eVar) {
            return v5e.a.b(u5eVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull u5e u5eVar) {
            if (u5eVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u5eVar;
                return (!deviceInfo.K9() || deviceInfo.M9() || deviceInfo.O9()) ? false : true;
            }
            throw new RuntimeException(u5eVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean e(@NotNull u5e u5eVar) {
            return v5e.a.c(u5eVar);
        }

        public static boolean f(@NotNull u5e u5eVar) {
            return v5e.a.d(u5eVar);
        }

        public static boolean g(@NotNull u5e u5eVar) {
            return v5e.a.e(u5eVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull u5e u5eVar) {
            if (u5eVar instanceof DeviceInfo) {
                return ((DeviceInfo) u5eVar).E9() || u5eVar.B();
            }
            throw new RuntimeException(u5eVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean i(@NotNull u5e u5eVar) {
            if (!(u5eVar instanceof DeviceInfo)) {
                throw new RuntimeException(u5eVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) u5eVar;
            if ((!deviceInfo.K9() || !deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.i.INSTANCE)) && (!deviceInfo.I9() || !deviceInfo.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE))) {
                return false;
            }
            if (!deviceInfo.O9() || deviceInfo.ha()) {
                return true;
            }
            return deviceInfo.Sa(63);
        }

        public static boolean j(@NotNull u5e u5eVar) {
            return v5e.a.f(u5eVar);
        }
    }

    boolean B();

    boolean S6();

    boolean X1();

    @NotNull
    String i4();
}
