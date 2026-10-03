package com.oplus.aiunit.vision;

import com.heytap.device.game.GameModeStandBy;
import com.heytap.health.device_data_sync.R$drawable;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/o28;", "Lcom/oplus/aiunit/vision/if0;", "", "E7", LogFieldKey.MESSAGE_KEY, "w", "", "x", c8l.KEY_C3, "device_data_sync_release"}, k = 1, mv = {1, 8, 0})
public interface o28 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nGameAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameAbility.kt\ncom/heytap/device/game/GameAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,56:1\n37#2,5:57\n37#2,5:62\n37#2,5:67\n37#2,5:72\n37#2,5:77\n*S KotlinDebug\n*F\n+ 1 GameAbility.kt\ncom/heytap/device/game/GameAbility$DefaultImpls\n*L\n29#1:57,5\n40#1:62,5\n44#1:67,5\n48#1:72,5\n53#1:77,5\n*E\n"})
    public static final class a {
        public static boolean a(@NotNull o28 o28Var) {
            Object objNavigation = x0.d().b("/ic/GameModeUtil").navigation();
            Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.device.game.GameModeStandBy");
            return ((GameModeStandBy) objNavigation).m();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int b(@NotNull o28 o28Var) {
            if (o28Var instanceof DeviceInfo) {
                return ((DeviceInfo) o28Var).B9() ? R$drawable.device_data_sync_game_mode_example_band2 : R$drawable.device_data_sync_game_mode_example;
            }
            throw new RuntimeException(o28Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull o28 o28Var) {
            if (o28Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) o28Var;
                return deviceInfo.K9() && !deviceInfo.M9();
            }
            throw new RuntimeException(o28Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull o28 o28Var) {
            if (o28Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) o28Var;
                return o28Var.m() && ((deviceInfo.K9() && !deviceInfo.M9()) || deviceInfo.fa() || deviceInfo.E9());
            }
            throw new RuntimeException(o28Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull o28 o28Var) {
            if (o28Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) o28Var;
                return deviceInfo.K9() && !deviceInfo.M9();
            }
            throw new RuntimeException(o28Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean C3();

    boolean E7();

    boolean m();

    boolean w();

    int x();
}
