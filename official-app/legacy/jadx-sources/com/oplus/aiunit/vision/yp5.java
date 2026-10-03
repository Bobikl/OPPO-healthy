package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/yp5;", "Lcom/oplus/aiunit/vision/if0;", "", "m1", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
public interface yp5 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceUserEventAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceUserEventAbility.kt\ncom/heytap/health/watch/commonsync/ability/DeviceUserEventAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,21:1\n37#2,5:22\n*S KotlinDebug\n*F\n+ 1 DeviceUserEventAbility.kt\ncom/heytap/health/watch/commonsync/ability/DeviceUserEventAbility$DefaultImpls\n*L\n10#1:22,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull yp5 yp5Var) {
            if (yp5Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) yp5Var;
                return (deviceInfo.B9() || deviceInfo.L9() || deviceInfo.F9() || deviceInfo.G9() || deviceInfo.M9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ba() || deviceInfo.ja()) ? false : true;
            }
            throw new RuntimeException(yp5Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean m1();
}
