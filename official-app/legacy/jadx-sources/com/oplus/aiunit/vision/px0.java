package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/px0;", "Lcom/oplus/aiunit/vision/if0;", "", "Z7", "bandface_impl_release"}, k = 1, mv = {1, 8, 0})
public interface px0 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBandWfAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BandWfAbility.kt\ncom/heytap/health/bandface/ability/BandWfAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,25:1\n37#2,5:26\n*S KotlinDebug\n*F\n+ 1 BandWfAbility.kt\ncom/heytap/health/bandface/ability/BandWfAbility$DefaultImpls\n*L\n22#1:26,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull px0 px0Var) {
            if (px0Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) px0Var;
                return deviceInfo.A9() && deviceInfo.Na();
            }
            throw new RuntimeException(px0Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean Z7();
}
