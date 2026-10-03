package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/xda;", "Lcom/oplus/aiunit/vision/if0;", "", "W6", "device_interconnection_release"}, k = 1, mv = {1, 8, 0})
public interface xda extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nInterAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterAbility.kt\ncom/heytap/health/interconnection/InterAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,31:1\n37#2,5:32\n*S KotlinDebug\n*F\n+ 1 InterAbility.kt\ncom/heytap/health/interconnection/InterAbility$DefaultImpls\n*L\n12#1:32,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull xda xdaVar) {
            if (!(xdaVar instanceof DeviceInfo)) {
                throw new RuntimeException(xdaVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) xdaVar;
            boolean zK9 = deviceInfo.K9();
            boolean zRa = deviceInfo.Ra();
            boolean zX = ilj.x();
            UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
            boolean zF = ugl.f(deviceInfo2 != null ? deviceInfo2.getFirmwareVersion() : null, "C", 0);
            boolean z = (deviceInfo.ka() && deviceInfo.Sa(100)) || (deviceInfo.ka() && zF);
            boolean z2 = (deviceInfo.ca() && deviceInfo.Sa(130)) || (deviceInfo.ca() && zF);
            boolean z3 = (deviceInfo.ka() && deviceInfo.Sa(com.garmin.fit.i.O2ToxicityFieldNum)) || (deviceInfo.ka() && zF);
            boolean z4 = (deviceInfo.ca() && deviceInfo.Sa(com.garmin.fit.i.O2ToxicityFieldNum)) || (deviceInfo.ca() && zF);
            boolean z5 = (deviceInfo.ja() && deviceInfo.Sa(240)) || (deviceInfo.ja() && zF);
            if (zX) {
                if ((!zK9 || !zRa) && !z && !z2 && !z5) {
                    return false;
                }
            } else if ((!zK9 || !zRa) && !z3 && !z4 && !z5) {
                return false;
            }
            return true;
        }
    }

    boolean W6();
}
