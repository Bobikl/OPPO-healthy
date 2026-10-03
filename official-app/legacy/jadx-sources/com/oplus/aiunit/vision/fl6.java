package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.wearable.watch.emergency.R$string;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/fl6;", "Lcom/oplus/aiunit/vision/uj6;", "", "y0", "x7", "", "Q3", "D7", "m0", "V4", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
public interface fl6 extends uj6 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEmergencyTextAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyTextAbility.kt\ncom/heytap/wearable/watch/emergency/ability/EmergencyTextAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,60:1\n37#2,5:61\n37#2,5:66\n37#2,5:71\n37#2,5:76\n37#2,5:81\n37#2,5:86\n*S KotlinDebug\n*F\n+ 1 EmergencyTextAbility.kt\ncom/heytap/wearable/watch/emergency/ability/EmergencyTextAbility$DefaultImpls\n*L\n14#1:61,5\n23#1:66,5\n33#1:71,5\n43#1:76,5\n47#1:81,5\n56#1:86,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull fl6 fl6Var) {
            if (fl6Var instanceof DeviceInfo) {
                return ((DeviceInfo) fl6Var).qa(DeviceConstants.BaseDevice.AbstractC0341b.f.INSTANCE);
            }
            throw new RuntimeException(fl6Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int b(@NotNull fl6 fl6Var) {
            if (!(fl6Var instanceof DeviceInfo)) {
                throw new RuntimeException(fl6Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fl6Var;
            if (deviceInfo.ia()) {
                return R$string.watch_emergency_auto_call_tip_3;
            }
            if (deviceInfo.U9() || deviceInfo.X9() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca()) {
                return R$string.watch_emergency_auto_call_tip_1;
            }
            return (deviceInfo.W9() || deviceInfo.ha()) ? R$string.watch_emergency_auto_call_tip_2 : R$string.settings_emergency_auto_call_tip;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int c(@NotNull fl6 fl6Var) {
            if (fl6Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fl6Var;
                return (deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ja()) ? R$string.settings_emergency_esim_number_tip_1 : R$string.settings_emergency_esim_number_tip;
            }
            throw new RuntimeException(fl6Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int d(@NotNull fl6 fl6Var) {
            if (!(fl6Var instanceof DeviceInfo)) {
                throw new RuntimeException(fl6Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fl6Var;
            if (fl6Var.D7()) {
                return R$string.watch_emergency_active_hot_key_tip_4;
            }
            if (deviceInfo.ia()) {
                return R$string.watch_emergency_active_hot_key_tip_3;
            }
            if (deviceInfo.U9() || deviceInfo.X9()) {
                return R$string.watch_emergency_active_hot_key_tip_1;
            }
            return (deviceInfo.W9() || deviceInfo.ha()) ? R$string.watch_emergency_active_hot_key_tip_2 : R$string.watch_emergency_active_hot_key_tip;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull fl6 fl6Var) {
            if (fl6Var instanceof DeviceInfo) {
                return ((DeviceInfo) fl6Var).qa(DeviceConstants.BaseDevice.AbstractC0341b.f.INSTANCE);
            }
            throw new RuntimeException(fl6Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0028  */
        /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull fl6 fl6Var) {
            if (!(fl6Var instanceof DeviceInfo)) {
                throw new RuntimeException(fl6Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fl6Var;
            if (i37.b()) {
                return false;
            }
            if (deviceInfo.ja()) {
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                if (!ugl.e(deviceInfo2 != null ? deviceInfo2.getFirmwareVersion() : null, 120)) {
                    if (deviceInfo.qa(DeviceConstants.BaseDevice.AbstractC0341b.a.INSTANCE)) {
                        return false;
                    }
                }
            } else if (deviceInfo.qa(DeviceConstants.BaseDevice.AbstractC0341b.a.INSTANCE)) {
                return false;
            }
            return true;
        }
    }

    boolean D7();

    boolean Q3();

    boolean V4();

    int m0();

    int x7();

    int y0();
}
