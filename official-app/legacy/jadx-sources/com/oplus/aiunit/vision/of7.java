package com.oplus.aiunit.vision;

import com.heytap.health.device_settings.R$string;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.wearable.watch.R$drawable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/of7;", "Lcom/oplus/aiunit/vision/if0;", "", "H6", "l0", "", "Q8", c8l.KEY_A0, "t0", "x8", "h5", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public interface of7 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFindWatchAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindWatchAbility.kt\ncom/heytap/wearable/watch/findwatch/FindWatchAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,84:1\n37#2,5:85\n37#2,5:90\n37#2,5:95\n37#2,5:100\n37#2,5:105\n37#2,5:110\n37#2,5:115\n*S KotlinDebug\n*F\n+ 1 FindWatchAbility.kt\ncom/heytap/wearable/watch/findwatch/FindWatchAbility$DefaultImpls\n*L\n26#1:85,5\n36#1:90,5\n44#1:95,5\n48#1:100,5\n53#1:105,5\n58#1:110,5\n75#1:115,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull of7 of7Var) {
            if (of7Var instanceof DeviceInfo) {
                return ((DeviceInfo) of7Var).K9();
            }
            throw new RuntimeException(of7Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int b(@NotNull of7 of7Var) {
            if (of7Var instanceof DeviceInfo) {
                return of7Var.Q8() ? R$string.settings_find_watch_bell_tip_3 : R$string.settings_find_watch_vibrate_tip_3;
            }
            throw new RuntimeException(of7Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int c(@NotNull of7 of7Var) {
            if (of7Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) of7Var;
                if (deviceInfo.B9()) {
                    return R$drawable.settings_device_bell_band2;
                }
                return (deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea()) ? R$drawable.settings_device_bell_round : R$drawable.settings_device_bell;
            }
            throw new RuntimeException(of7Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int d(@NotNull of7 of7Var) {
            if (of7Var instanceof DeviceInfo) {
                return of7Var.Q8() ? com.heytap.wearable.watch.R$string.settings_watch_disconnect_tip_2 : com.heytap.wearable.watch.R$string.settings_watch_disconnect_tip_2_band_2;
            }
            throw new RuntimeException(of7Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int e(@NotNull of7 of7Var) {
            if (of7Var instanceof DeviceInfo) {
                return ((DeviceInfo) of7Var).B9() ? com.heytap.health.interconnection.R$string.settings_find_band : com.heytap.health.interconnection.R$string.settings_find_watch;
            }
            throw new RuntimeException(of7Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int f(@NotNull of7 of7Var) {
            if (of7Var instanceof DeviceInfo) {
                return of7Var.Q8() ? R$string.settings_find_watch_not_bell_tip_3 : R$string.settings_find_watch_not_vibrate_tip_3;
            }
            throw new RuntimeException(of7Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull of7 of7Var) {
            if (of7Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) of7Var;
                return !deviceInfo.K9() || deviceInfo.ra() || !(deviceInfo.ra() || gl4.managerApi.isStubModule()) || (((deviceInfo.ja() || deviceInfo.aa()) && deviceInfo.Sa(240)) || ((deviceInfo.ia() && deviceInfo.Sa(200)) || ((deviceInfo.ba() && deviceInfo.Sa(120)) || ((deviceInfo.ga() && deviceInfo.Sa(60)) || (deviceInfo.Y9() && deviceInfo.Sa(270))))));
            }
            throw new RuntimeException(of7Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    int A0();

    int H6();

    boolean Q8();

    boolean h5();

    int l0();

    int t0();

    int x8();
}
