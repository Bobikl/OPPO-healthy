package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/e23;", "Lcom/oplus/aiunit/vision/if0;", "Lcom/oplus/aiunit/vision/ma5;", "", "q3", "s1", ExifInterface.LONGITUDE_EAST, "Q2", "Z3", "s6", "Q", "R4", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public interface e23 extends if0, ma5 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCardiovascularAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardiovascularAbility.kt\ncom/heytap/health/cardiovascular/ability/CardiovascularAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,121:1\n37#2,5:122\n37#2,5:127\n37#2,5:132\n37#2,5:137\n37#2,5:142\n37#2,5:147\n37#2,5:152\n37#2,5:157\n*S KotlinDebug\n*F\n+ 1 CardiovascularAbility.kt\ncom/heytap/health/cardiovascular/ability/CardiovascularAbility$DefaultImpls\n*L\n26#1:122,5\n31#1:127,5\n63#1:132,5\n72#1:137,5\n78#1:142,5\n107#1:147,5\n114#1:152,5\n118#1:157,5\n*E\n"})
    public static final class a {
        public static boolean a(@NotNull e23 e23Var, @NotNull int... appIds) {
            Intrinsics.checkNotNullParameter(appIds, "appIds");
            return ma5.a.a(e23Var, appIds);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull e23 e23Var) {
            if (e23Var instanceof DeviceInfo) {
                return ((DeviceInfo) e23Var).ea();
            }
            throw new RuntimeException(e23Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull e23 e23Var) {
            if (e23Var instanceof DeviceInfo) {
                return e23Var.J4(15);
            }
            throw new RuntimeException(e23Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Code duplicated, block: B:39:0x008d  */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull e23 e23Var) {
            int iC;
            boolean z;
            if (!(e23Var instanceof DeviceInfo)) {
                throw new RuntimeException(e23Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) e23Var;
            if (e23Var.E()) {
                return true;
            }
            if (!deviceInfo.Y9()) {
                return false;
            }
            UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
            String str = "";
            if (deviceInfo2 != null) {
                String firmwareVersion = deviceInfo2.getFirmwareVersion();
                Intrinsics.checkNotNullExpressionValue(firmwareVersion, "it.firmwareVersion");
                str = StringsKt__StringsKt.contains$default((CharSequence) firmwareVersion, (CharSequence) "_A.", false, 2, (Object) null) ? "A" : "";
                String firmwareVersion2 = deviceInfo2.getFirmwareVersion();
                Intrinsics.checkNotNullExpressionValue(firmwareVersion2, "it.firmwareVersion");
                if (StringsKt__StringsKt.contains$default((CharSequence) firmwareVersion2, (CharSequence) "_C.", false, 2, (Object) null)) {
                    str = "C";
                }
                String firmwareVersion3 = deviceInfo2.getFirmwareVersion();
                Intrinsics.checkNotNullExpressionValue(firmwareVersion3, "it.firmwareVersion");
                if (StringsKt__StringsKt.contains$default((CharSequence) firmwareVersion3, (CharSequence) "_D.", false, 2, (Object) null)) {
                    str = "D";
                }
                iC = ugl.c(deviceInfo2.getFirmwareVersion());
            } else {
                iC = 0;
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 65) {
                if (iHashCode == 67) {
                    if (45 <= iC) {
                        z = false;
                    } else {
                        z = false;
                    }
                    return !z ? true : true;
                }
                if (45 <= iC || iC >= 50) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z || iC >= 66) {
                }
            } else if (str.equals("A")) {
                if ((48 <= iC && iC < 50) || iC > 66) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull e23 e23Var) {
            if (e23Var instanceof DeviceInfo) {
                return ((DeviceInfo) e23Var).ka();
            }
            throw new RuntimeException(e23Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull e23 e23Var) {
            int iC;
            if (!(e23Var instanceof DeviceInfo)) {
                throw new RuntimeException(e23Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) e23Var;
            if (e23Var.E()) {
                return true;
            }
            if (!e23Var.s1()) {
                return false;
            }
            UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
            String str = "";
            if (deviceInfo2 != null) {
                String firmwareVersion = deviceInfo2.getFirmwareVersion();
                Intrinsics.checkNotNullExpressionValue(firmwareVersion, "it.firmwareVersion");
                str = StringsKt__StringsKt.contains$default((CharSequence) firmwareVersion, (CharSequence) "_A.", false, 2, (Object) null) ? "A" : "";
                String firmwareVersion2 = deviceInfo2.getFirmwareVersion();
                Intrinsics.checkNotNullExpressionValue(firmwareVersion2, "it.firmwareVersion");
                if (StringsKt__StringsKt.contains$default((CharSequence) firmwareVersion2, (CharSequence) "_C.", false, 2, (Object) null)) {
                    str = "C";
                }
                iC = ugl.c(deviceInfo2.getFirmwareVersion());
            } else {
                iC = 0;
            }
            if (Intrinsics.areEqual(str, "A")) {
                if (iC >= 126) {
                    return true;
                }
            } else if (Intrinsics.areEqual(str, "C") && iC >= 126) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull e23 e23Var) {
            if (e23Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) e23Var;
                return (deviceInfo.ja() && !deviceInfo.aa()) || deviceInfo.ea() || deviceInfo.ka();
            }
            throw new RuntimeException(e23Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean h(@NotNull e23 e23Var) {
            return ma5.a.b(e23Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean i(@NotNull e23 e23Var) {
            if (e23Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) e23Var;
                return deviceInfo.U9() || (deviceInfo.Y9() && !e23Var.s1());
            }
            throw new RuntimeException(e23Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean j(@NotNull e23 e23Var) {
            if (e23Var instanceof DeviceInfo) {
                return e23Var.E() && !((DeviceInfo) e23Var).ea();
            }
            throw new RuntimeException(e23Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean E();

    boolean Q();

    boolean Q2();

    boolean R4();

    boolean Z3();

    boolean q3();

    boolean s1();

    boolean s6();
}
