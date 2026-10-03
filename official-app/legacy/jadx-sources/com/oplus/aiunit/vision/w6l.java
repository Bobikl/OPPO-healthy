package com.oplus.aiunit.vision;

import android.net.Uri;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.wallet.business.autoswitch.SwipeRepositoryKt;
import com.heytap.wallet.business.entrance.router.EntranceOperateService;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/w6l;", "Lcom/oplus/aiunit/vision/if0;", "", "F3", "H2", "x3", "T1", "J5", "k5", "B5", "a", "v", "j1", "entrance_release"}, k = 1, mv = {1, 8, 0})
public interface w6l extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWalletEntranceAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletEntranceAbility.kt\ncom/heytap/health/wallet/entrance/ability/WalletEntranceAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,128:1\n37#2,5:129\n37#2,5:134\n37#2,5:139\n37#2,5:144\n37#2,5:149\n37#2,5:154\n37#2,5:159\n37#2,5:164\n37#2,5:169\n37#2,5:174\n*S KotlinDebug\n*F\n+ 1 WalletEntranceAbility.kt\ncom/heytap/health/wallet/entrance/ability/WalletEntranceAbility$DefaultImpls\n*L\n34#1:129,5\n42#1:134,5\n47#1:139,5\n56#1:144,5\n65#1:149,5\n72#1:154,5\n81#1:159,5\n90#1:164,5\n97#1:169,5\n119#1:174,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull w6l w6lVar) {
            if (w6lVar instanceof DeviceInfo) {
                return ((DeviceInfo) w6lVar).A9();
            }
            throw new RuntimeException(w6lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull w6l w6lVar) {
            if (!(w6lVar instanceof DeviceInfo)) {
                throw new RuntimeException(w6lVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            SwipeConfigs swipeConfigs = SwipeRepositoryKt.y().get(gl4.managerApi.getCurrActiveMac());
            boolean z = swipeConfigs != null && swipeConfigs.getSupportSmartSwitch();
            t6b.f("isDeviceSmartCard", "isDeviceSupport = " + z);
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull w6l w6lVar) {
            if (!(w6lVar instanceof DeviceInfo)) {
                throw new RuntimeException(w6lVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            Object objNavigation = x0.d().a(Uri.parse("heytaphealth://com.heytap.health/entrance/operateService")).navigation();
            Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.wallet.business.entrance.router.EntranceOperateService");
            boolean zE5 = ((EntranceOperateService) objNavigation).e5();
            SwipeConfigs swipeConfigs = SwipeRepositoryKt.y().get(gl4.managerApi.getCurrActiveMac());
            boolean z = swipeConfigs != null && swipeConfigs.getSupportSmartSwitch();
            t6b.f("SmartCardAbility", "isSystemSupport = " + zE5 + " isDeviceSupport = " + z);
            return zE5 && z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull w6l w6lVar) {
            if (w6lVar instanceof DeviceInfo) {
                return ((DeviceInfo) w6lVar).Ya();
            }
            throw new RuntimeException(w6lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull w6l w6lVar) {
            if (!(w6lVar instanceof DeviceInfo)) {
                throw new RuntimeException(w6lVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) w6lVar;
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
        public static boolean f(@NotNull w6l w6lVar) {
            if (w6lVar instanceof DeviceInfo) {
                if (((DeviceInfo) w6lVar).ia()) {
                    String strM = aec.m();
                    Intrinsics.checkNotNullExpressionValue(strM, "getWatchApkVersion()");
                    if (Integer.parseInt(strM) >= 10133) {
                        return true;
                    }
                }
                return false;
            }
            throw new RuntimeException(w6lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull w6l w6lVar) {
            if (w6lVar instanceof DeviceInfo) {
                if (((DeviceInfo) w6lVar).X9()) {
                    String strM = aec.m();
                    Intrinsics.checkNotNullExpressionValue(strM, "getWatchApkVersion()");
                    if (Integer.parseInt(strM) >= 10133) {
                        return true;
                    }
                }
                return false;
            }
            throw new RuntimeException(w6lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull w6l w6lVar) {
            if (w6lVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) w6lVar;
                return deviceInfo.K9() || deviceInfo.ea();
            }
            throw new RuntimeException(w6lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean i(@NotNull w6l w6lVar) {
            if (!(w6lVar instanceof DeviceInfo)) {
                throw new RuntimeException(w6lVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) w6lVar;
            if (!deviceInfo.M9() && !deviceInfo.O9() && !deviceInfo.A9() && !deviceInfo.fa() && !deviceInfo.E9() && !deviceInfo.F9() && !deviceInfo.G9()) {
                String strM = aec.m();
                Intrinsics.checkNotNullExpressionValue(strM, "getWatchApkVersion()");
                if (Integer.parseInt(strM) >= 10133) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean j(@NotNull w6l w6lVar) {
            if (!(w6lVar instanceof DeviceInfo)) {
                throw new RuntimeException(w6lVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) w6lVar;
            if (!deviceInfo.M9() && !deviceInfo.O9() && !deviceInfo.T9() && !deviceInfo.A9() && !deviceInfo.fa() && !deviceInfo.E9() && !deviceInfo.F9() && !deviceInfo.G9() && !deviceInfo.X9() && !deviceInfo.ia()) {
                String strM = aec.m();
                Intrinsics.checkNotNullExpressionValue(strM, "getWatchApkVersion()");
                if (Integer.parseInt(strM) >= 10133) {
                    return true;
                }
            }
            return false;
        }
    }

    boolean B5();

    boolean F3();

    boolean H2();

    boolean J5();

    boolean T1();

    boolean a();

    boolean j1();

    boolean k5();

    boolean v();

    boolean x3();
}
