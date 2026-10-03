package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/cmd;", "Lcom/oplus/aiunit/vision/if0;", "", "Y7", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public interface cmd extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOperationAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperationAbility.kt\ncom/heytap/health/operation/ability/OperationAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,24:1\n37#2,5:25\n*S KotlinDebug\n*F\n+ 1 OperationAbility.kt\ncom/heytap/health/operation/ability/OperationAbility$DefaultImpls\n*L\n23#1:25,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull cmd cmdVar) {
            if (cmdVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) cmdVar;
                return deviceInfo.K9() && !deviceInfo.M9();
            }
            throw new RuntimeException(cmdVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean Y7();
}
