package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/i92;", "Lcom/oplus/aiunit/vision/if0;", "", "Q4", "l3", "isConnected", "z1", "a", "bus_release"}, k = 1, mv = {1, 8, 0})
public interface i92 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBusAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BusAbility.kt\ncom/heytap/health/wallet/bus/ui/ability/BusAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,46:1\n37#2,5:47\n37#2,5:52\n37#2,5:57\n37#2,5:62\n*S KotlinDebug\n*F\n+ 1 BusAbility.kt\ncom/heytap/health/wallet/bus/ui/ability/BusAbility$DefaultImpls\n*L\n26#1:47,5\n31#1:52,5\n36#1:57,5\n43#1:62,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull i92 i92Var) {
            if (i92Var instanceof DeviceInfo) {
                return ((DeviceInfo) i92Var).Ya();
            }
            throw new RuntimeException(i92Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull i92 i92Var, boolean z) {
            if (i92Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) i92Var;
                return z && deviceInfo.Ya() && (deviceInfo.M9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia());
            }
            throw new RuntimeException(i92Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull i92 i92Var) {
            if (i92Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) i92Var;
                return (deviceInfo.M9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.A9() || deviceInfo.fa() || deviceInfo.E9() || deviceInfo.F9() || deviceInfo.G9() || deviceInfo.X9()) ? false : true;
            }
            throw new RuntimeException(i92Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull i92 i92Var) {
            if (i92Var instanceof DeviceInfo) {
                return ((DeviceInfo) i92Var).A9();
            }
            throw new RuntimeException(i92Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean Q4();

    boolean a();

    boolean l3();

    boolean z1(boolean isConnected);
}
