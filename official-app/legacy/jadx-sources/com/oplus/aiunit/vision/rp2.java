package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/rp2;", "Lcom/oplus/aiunit/vision/if0;", "Lcom/oplus/aiunit/vision/ma5;", "", "N8", "F5", "H1", "V2", "H8", "a", "a0", "R0", "", "C4", "calendar_impl_release"}, k = 1, mv = {1, 8, 0})
public interface rp2 extends if0, ma5 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCalendarAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarAbility.kt\ncom/heytap/health/watch/calendar/ability/CalendarAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,58:1\n37#2,5:59\n37#2,5:64\n37#2,5:69\n37#2,5:74\n37#2,5:79\n37#2,5:84\n37#2,5:89\n37#2,5:94\n37#2,5:99\n*S KotlinDebug\n*F\n+ 1 CalendarAbility.kt\ncom/heytap/health/watch/calendar/ability/CalendarAbility$DefaultImpls\n*L\n24#1:59,5\n29#1:64,5\n34#1:69,5\n38#1:74,5\n42#1:79,5\n46#1:84,5\n50#1:89,5\n53#1:94,5\n57#1:99,5\n*E\n"})
    public static final class a {
        public static boolean a(@NotNull rp2 rp2Var, @NotNull int... appIds) {
            Intrinsics.checkNotNullParameter(appIds, "appIds");
            return ma5.a.a(rp2Var, appIds);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull rp2 rp2Var) {
            if (rp2Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) rp2Var;
                return deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(rp2Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull rp2 rp2Var) {
            if (rp2Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) rp2Var;
                return deviceInfo.Xa() || deviceInfo.fa() || deviceInfo.E9();
            }
            throw new RuntimeException(rp2Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull rp2 rp2Var) {
            if (rp2Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) rp2Var;
                return deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(rp2Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull rp2 rp2Var) {
            if (rp2Var instanceof DeviceInfo) {
                return ((DeviceInfo) rp2Var).ea();
            }
            throw new RuntimeException(rp2Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull rp2 rp2Var) {
            if (rp2Var instanceof DeviceInfo) {
                return ((DeviceInfo) rp2Var).ea();
            }
            throw new RuntimeException(rp2Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull rp2 rp2Var) {
            if (rp2Var instanceof DeviceInfo) {
                return rp2Var.J4(5);
            }
            throw new RuntimeException(rp2Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull rp2 rp2Var) {
            if (rp2Var instanceof DeviceInfo) {
                return ((DeviceInfo) rp2Var).Ya();
            }
            throw new RuntimeException(rp2Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean i(@NotNull rp2 rp2Var) {
            return ma5.a.b(rp2Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int j(@NotNull rp2 rp2Var) {
            if (rp2Var instanceof DeviceInfo) {
                return ((DeviceInfo) rp2Var).ea() ? 18432 : 32768;
            }
            throw new RuntimeException(rp2Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean k(@NotNull rp2 rp2Var) {
            if (rp2Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) rp2Var;
                return deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(rp2Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    int C4();

    boolean F5();

    boolean H1();

    boolean H8();

    boolean N8();

    boolean R0();

    boolean V2();

    boolean a();

    boolean a0();
}
