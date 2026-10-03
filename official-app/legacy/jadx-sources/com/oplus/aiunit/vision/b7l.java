package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/b7l;", "Lcom/oplus/aiunit/vision/if0;", "", "y1", "j6", "F7", "", "c3", "j8", "commonlib_release"}, k = 1, mv = {1, 8, 0})
public interface b7l extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWalletLibAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletLibAbility.kt\ncom/heytap/health/wallet/ability/WalletLibAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,77:1\n37#2,5:78\n37#2,5:83\n37#2,5:88\n37#2,5:93\n37#2,5:98\n*S KotlinDebug\n*F\n+ 1 WalletLibAbility.kt\ncom/heytap/health/wallet/ability/WalletLibAbility$DefaultImpls\n*L\n23#1:78,5\n30#1:83,5\n37#1:88,5\n43#1:93,5\n60#1:98,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String a(@NotNull b7l b7lVar) {
            if (!(b7lVar instanceof DeviceInfo)) {
                throw new RuntimeException(b7lVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) b7lVar;
            if (deviceInfo.B9()) {
                return "band";
            }
            if (deviceInfo.F9()) {
                return "rswatch";
            }
            if (b7lVar.F7()) {
                return "watchStar";
            }
            return deviceInfo.X9() ? "watch4" : DeviceInfoCompat.DeviceType.WATCH;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String b(@NotNull b7l b7lVar) {
            if (!(b7lVar instanceof DeviceInfo)) {
                throw new RuntimeException(b7lVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) b7lVar;
            if (deviceInfo.B9()) {
                return "band";
            }
            if (deviceInfo.F9()) {
                return "rswatch";
            }
            if (deviceInfo.ia()) {
                return "watchStar";
            }
            if (deviceInfo.X9()) {
                return "watch4";
            }
            return (deviceInfo.M9() || deviceInfo.O9() || deviceInfo.T9()) ? DeviceInfoCompat.DeviceType.WATCH : "watchStarRiver";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull b7l b7lVar) {
            if (b7lVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) b7lVar;
                return deviceInfo.ba() && !deviceInfo.ga();
            }
            throw new RuntimeException(b7lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull b7l b7lVar) {
            if (!(b7lVar instanceof DeviceInfo)) {
                throw new RuntimeException(b7lVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) b7lVar;
            if (!deviceInfo.M9() && !deviceInfo.O9() && !deviceInfo.T9() && !deviceInfo.A9() && !deviceInfo.fa() && !deviceInfo.E9() && !deviceInfo.F9() && !deviceInfo.G9() && !deviceInfo.X9()) {
                String strM = aec.m();
                Intrinsics.checkNotNullExpressionValue(strM, "getWatchApkVersion()");
                if (Integer.parseInt(strM) >= 10133) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull b7l b7lVar) {
            if (b7lVar instanceof DeviceInfo) {
                return ((DeviceInfo) b7lVar).E9();
            }
            throw new RuntimeException(b7lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean F7();

    @NotNull
    String c3();

    boolean j6();

    @NotNull
    String j8();

    boolean y1();
}
