package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/l7l;", "Lcom/oplus/aiunit/vision/if0;", "", "f", "C", "Y6", "walletmain_release"}, k = 1, mv = {1, 8, 0})
public interface l7l extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWalletmainAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletmainAbility.kt\ncom/heytap/health/wallet/ability/WalletmainAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,42:1\n37#2,5:43\n37#2,5:48\n37#2,5:53\n*S KotlinDebug\n*F\n+ 1 WalletmainAbility.kt\ncom/heytap/health/wallet/ability/WalletmainAbility$DefaultImpls\n*L\n23#1:43,5\n30#1:48,5\n38#1:53,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull l7l l7lVar) {
            if (l7lVar instanceof DeviceInfo) {
                return ((DeviceInfo) l7lVar).A9();
            }
            throw new RuntimeException(l7lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull l7l l7lVar) {
            if (l7lVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) l7lVar;
                return (deviceInfo.M9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.A9() || deviceInfo.fa() || deviceInfo.E9() || deviceInfo.F9() || deviceInfo.G9()) ? false : true;
            }
            throw new RuntimeException(l7lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull l7l l7lVar) {
            if (l7lVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) l7lVar;
                return (deviceInfo.M9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.A9() || deviceInfo.fa() || deviceInfo.E9() || deviceInfo.F9() || deviceInfo.G9()) ? false : true;
            }
            throw new RuntimeException(l7lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean C();

    boolean Y6();

    boolean f();
}
