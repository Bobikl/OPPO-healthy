package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceModel;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@cdb
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/sm5;", "Lcom/oplus/aiunit/vision/jf0;", "", "I8", MapSchema.FIELD_NAME_KEY, "c", "L4", "z8", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public interface sm5 extends jf0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceSettingAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSettingAbility.kt\ncom/heytap/health/settings/watch/ability/DeviceSettingAbility$Model$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,122:1\n30#2,5:123\n30#2,5:128\n30#2,5:133\n30#2,5:138\n30#2,5:143\n30#2,5:148\n*S KotlinDebug\n*F\n+ 1 DeviceSettingAbility.kt\ncom/heytap/health/settings/watch/ability/DeviceSettingAbility$Model$DefaultImpls\n*L\n32#1:123,5\n36#1:128,5\n43#1:133,5\n50#1:138,5\n58#1:143,5\n65#1:148,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull sm5 sm5Var) {
            if (sm5Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) sm5Var;
                return deviceModel.ja() || deviceModel.ea() || deviceModel.ka() || deviceModel.ca();
            }
            throw new RuntimeException(sm5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull sm5 sm5Var) {
            if (sm5Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) sm5Var;
                return deviceModel.aa() || deviceModel.ea() || deviceModel.ka() || deviceModel.ca();
            }
            throw new RuntimeException(sm5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull sm5 sm5Var) {
            if (sm5Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) sm5Var;
                return deviceModel.X9() || deviceModel.ia() || deviceModel.ja() || deviceModel.ea() || deviceModel.ka() || deviceModel.ca();
            }
            throw new RuntimeException(sm5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull sm5 sm5Var) {
            if (sm5Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) sm5Var;
                return (deviceModel.aa() && deviceModel.ja()) || deviceModel.ea();
            }
            throw new RuntimeException(sm5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull sm5 sm5Var) {
            if (sm5Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) sm5Var;
                return deviceModel.fa() || deviceModel.E9();
            }
            throw new RuntimeException(sm5Var + " not is " + DeviceModel.class.getCanonicalName());
        }
    }

    boolean I8();

    boolean L4();

    boolean c();

    boolean k();

    boolean z8();
}
