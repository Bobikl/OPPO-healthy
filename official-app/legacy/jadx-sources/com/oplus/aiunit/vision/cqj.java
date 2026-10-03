package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.autofill.HintConstants;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/cqj;", "Lcom/oplus/aiunit/vision/if0;", "", "X3", "Landroid/content/Context;", "context", "", "state", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, c8l.KEY_A1, "J7", "g6", "i8", "P5", "telecom_impl_release"}, k = 1, mv = {1, 8, 0})
public interface cqj extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTelecomAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelecomAbility.kt\ncom/heytap/health/telecom/TelecomAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,94:1\n37#2,5:95\n37#2,5:100\n37#2,5:105\n37#2,5:110\n37#2,5:115\n37#2,5:120\n*S KotlinDebug\n*F\n+ 1 TelecomAbility.kt\ncom/heytap/health/telecom/TelecomAbility$DefaultImpls\n*L\n30#1:95,5\n46#1:100,5\n55#1:105,5\n59#1:110,5\n64#1:115,5\n72#1:120,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull cqj cqjVar, @NotNull Context context, int i, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (cqjVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) cqjVar;
                return (deviceInfo.Xa() && h4j.c()) || (h4j.d() && !deviceInfo.Xa()) || (h4j.d() && i == 0);
            }
            throw new RuntimeException(cqjVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull cqj cqjVar) {
            if (cqjVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) cqjVar;
                return deviceInfo.Xa() || deviceInfo.F9() || deviceInfo.G9() || deviceInfo.ea();
            }
            throw new RuntimeException(cqjVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull cqj cqjVar) {
            if (cqjVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) cqjVar;
                return deviceInfo.Ya() && deviceInfo.T9();
            }
            throw new RuntimeException(cqjVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull cqj cqjVar) {
            if (cqjVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) cqjVar;
                if (deviceInfo.ka()) {
                    return deviceInfo.Sa(111);
                }
                return deviceInfo.qa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE) || (deviceInfo.ea() && deviceInfo.Sa(190)) || (deviceInfo.ja() && deviceInfo.Sa(240));
            }
            throw new RuntimeException(cqjVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull cqj cqjVar) {
            if (cqjVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) cqjVar;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ea() || (deviceInfo.Ya() && (deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja()));
            }
            throw new RuntimeException(cqjVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull cqj cqjVar) {
            if (PermissionRequestDialog.D(9, "android.permission.READ_CONTACTS")) {
                if (!(cqjVar instanceof DeviceInfo)) {
                    throw new RuntimeException(cqjVar + " not is " + DeviceInfo.class.getCanonicalName());
                }
                if (!((DeviceInfo) cqjVar).Xa()) {
                    return true;
                }
            }
            return false;
        }
    }

    boolean A1(@NotNull Context context, int state, @Nullable String phoneNumber);

    boolean J7();

    boolean P5();

    boolean X3();

    boolean g6();

    boolean i8();
}
