package com.oplus.aiunit.vision;

import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.Regex;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/b34;", "Lcom/oplus/aiunit/vision/if0;", "", "M0", "S3", "K1", "q", "f3", "", "str", "n", "D5", "", "N", "l8", "a", "x1", "V1", "U5", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public interface b34 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nContactAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactAbility.kt\ncom/heytap/health/watch/contactsync/ability/ContactAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,184:1\n30#2,5:185\n37#2,5:190\n37#2,5:195\n37#2,5:200\n37#2,5:205\n37#2,5:210\n37#2,5:215\n30#2,5:220\n37#2,5:225\n37#2,5:230\n37#2,5:235\n37#2,5:240\n37#2,5:245\n*S KotlinDebug\n*F\n+ 1 ContactAbility.kt\ncom/heytap/health/watch/contactsync/ability/ContactAbility$DefaultImpls\n*L\n35#1:185,5\n41#1:190,5\n47#1:195,5\n53#1:200,5\n60#1:205,5\n67#1:210,5\n96#1:215,5\n106#1:220,5\n118#1:225,5\n122#1:230,5\n134#1:235,5\n151#1:240,5\n169#1:245,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String a(@NotNull b34 b34Var, @Nullable String str) {
            if (!(b34Var instanceof DeviceInfo)) {
                throw new RuntimeException(b34Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) b34Var;
            if (str == null || str.length() == 0) {
                return " ";
            }
            if (deviceInfo.ea()) {
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                if (!ugl.e(deviceInfo2 != null ? deviceInfo2.getFirmwareVersion() : null, 101) && new Regex("[\ud83c-\u10fc00-\udfff]+|[☀-⛿✀-➿]|[😀-🙏]|[🚀-\u1f6ff]|[🌀-🏿]|[🤀-🧿]").containsMatchIn(str)) {
                    u64.d("ContactAbility", "fixColumbusEmoji: matched", new Object[0]);
                    str = str + "\u200b\u200b";
                }
            }
            return str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int b(@NotNull b34 b34Var) {
            if (b34Var instanceof DeviceModel) {
                return ((DeviceModel) b34Var).F9() ? 30 : -1;
            }
            throw new RuntimeException(b34Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull b34 b34Var) {
            if (PermissionRequestDialog.D(9, "android.permission.READ_CONTACTS")) {
                if (!(b34Var instanceof DeviceInfo)) {
                    throw new RuntimeException(b34Var + " not is " + DeviceInfo.class.getCanonicalName());
                }
                if (((DeviceInfo) b34Var).ea()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull b34 b34Var) {
            if (b34Var instanceof DeviceInfo) {
                return ((DeviceInfo) b34Var).Xa();
            }
            throw new RuntimeException(b34Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull b34 b34Var) {
            if (!PermissionRequestDialog.D(9, "android.permission.READ_CALL_LOG")) {
                return false;
            }
            if (b34Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) b34Var;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ea() || deviceInfo.Xa() || deviceInfo.F9() || deviceInfo.G9() || deviceInfo.ea();
            }
            throw new RuntimeException(b34Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull b34 b34Var) {
            if (!PermissionRequestDialog.D(9, "android.permission.READ_CONTACTS")) {
                return false;
            }
            if (b34Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) b34Var;
                return deviceModel.F9() || deviceModel.G9();
            }
            throw new RuntimeException(b34Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull b34 b34Var) {
            if (!PermissionRequestDialog.D(9, "android.permission.READ_CONTACTS")) {
                return false;
            }
            if (b34Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) b34Var;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ea() || deviceInfo.Xa() || deviceInfo.F9() || deviceInfo.G9();
            }
            throw new RuntimeException(b34Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull b34 b34Var) {
            if (b34Var instanceof DeviceInfo) {
                return ((DeviceInfo) b34Var).Ya();
            }
            throw new RuntimeException(b34Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean i(@NotNull b34 b34Var) {
            if (!(b34Var instanceof DeviceInfo)) {
                throw new RuntimeException(b34Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) b34Var;
            UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
            int iC = ugl.c(deviceInfo2 != null ? deviceInfo2.getFirmwareVersion() : null);
            DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
            boolean z = (Intrinsics.areEqual(companion.k0(), deviceInfo.y4()) && iC >= 240) || (Intrinsics.areEqual(companion.T(), deviceInfo.y4()) && iC >= 170) || ((Intrinsics.areEqual(companion.h(), deviceInfo.y4()) && iC >= 90) || ((Intrinsics.areEqual(companion.L(), deviceInfo.y4()) && iC >= 30) || ((Intrinsics.areEqual(companion.Q(), deviceInfo.y4()) && iC >= 200) || ((Intrinsics.areEqual(companion.f(), deviceInfo.y4()) && iC >= 200) || deviceInfo.ka()))));
            u64.d("ContactAbility", "supportActivelySyncContacts=" + z + ",version == " + iC, new Object[0]);
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean j(@NotNull b34 b34Var) {
            if (!(b34Var instanceof DeviceInfo)) {
                throw new RuntimeException(b34Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) b34Var;
            UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
            int iC = ugl.c(deviceInfo2 != null ? deviceInfo2.getFirmwareVersion() : null);
            boolean z = deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ea() || (deviceInfo.T9() && iC >= 101) || ((deviceInfo.X9() && (iC == 101 || iC >= 110)) || deviceInfo.ia() || deviceInfo.ja());
            u64.d("ContactAbility", "supportContactClear=" + z, new Object[0]);
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean k(@NotNull b34 b34Var) {
            if (b34Var instanceof DeviceInfo) {
                return ((DeviceInfo) b34Var).K9();
            }
            throw new RuntimeException(b34Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean l(@NotNull b34 b34Var) {
            if (b34Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) b34Var;
                return (deviceInfo.Xa() || deviceInfo.F9() || deviceInfo.G9()) && !PermissionRequestDialog.D(9, "android.permission.READ_CONTACTS");
            }
            throw new RuntimeException(b34Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean m(@NotNull b34 b34Var) {
            if (!(b34Var instanceof DeviceInfo)) {
                throw new RuntimeException(b34Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) b34Var;
            UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
            int iC = ugl.c(deviceInfo2 != null ? deviceInfo2.getFirmwareVersion() : null);
            boolean z = deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ea() || deviceInfo.ja() || (deviceInfo.ia() && (iC == 2 || iC >= 62));
            u64.d("ContactAbility", "useNewLogic=" + z, new Object[0]);
            return z;
        }
    }

    boolean D5();

    boolean K1();

    boolean M0();

    int N();

    boolean S3();

    boolean U5();

    boolean V1();

    boolean a();

    boolean f3();

    boolean l8();

    @NotNull
    String n(@Nullable String str);

    boolean q();

    boolean x1();
}
