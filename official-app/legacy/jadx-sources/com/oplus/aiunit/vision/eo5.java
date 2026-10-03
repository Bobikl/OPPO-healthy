package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@cdb
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/eo5;", "Lcom/oplus/aiunit/vision/jf0;", "", "E3", "L7", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface eo5 extends jf0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceSettingsAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSettingsAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/DeviceSettingsAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,33:1\n30#2,5:34\n30#2,5:39\n*S KotlinDebug\n*F\n+ 1 DeviceSettingsAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/DeviceSettingsAbility$DefaultImpls\n*L\n26#1:34,5\n30#1:39,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull eo5 eo5Var) {
            if (eo5Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) eo5Var;
                return deviceModel.ja() || deviceModel.ea() || deviceModel.ka() || deviceModel.ca();
            }
            throw new RuntimeException(eo5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull eo5 eo5Var) {
            if (eo5Var instanceof DeviceModel) {
                return !((DeviceModel) eo5Var).k0();
            }
            throw new RuntimeException(eo5Var + " not is " + DeviceModel.class.getCanonicalName());
        }
    }

    boolean E3();

    boolean L7();
}
