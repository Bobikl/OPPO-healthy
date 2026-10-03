package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/kvc;", "Lcom/oplus/aiunit/vision/if0;", "", "w4", "", "l1", "s2", "r0", "Z5", "Z4", "W3", "isAboveOS14", "isPhoneFlashbackSupport", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
public interface kvc extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNotificationBaseAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationBaseAbility.kt\ncom/heytap/health/watch/notification/NotificationBaseAbility$Info$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,150:1\n37#2,5:151\n37#2,5:156\n37#2,5:161\n37#2,5:166\n37#2,5:171\n37#2,5:176\n37#2,5:181\n*S KotlinDebug\n*F\n+ 1 NotificationBaseAbility.kt\ncom/heytap/health/watch/notification/NotificationBaseAbility$Info$DefaultImpls\n*L\n34#1:151,5\n69#1:156,5\n82#1:161,5\n93#1:166,5\n104#1:171,5\n109#1:176,5\n126#1:181,5\n*E\n"})
    public static final class a {
        public static boolean a(kvc kvcVar) {
            boolean z = ilj.l() >= 34;
            a7b.f("NTF_Ability", "isAboveOS14: " + z);
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int b(@NotNull kvc kvcVar) {
            int i;
            if (!(kvcVar instanceof DeviceInfo)) {
                throw new RuntimeException(kvcVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) kvcVar;
            if (deviceInfo.ja() || deviceInfo.ba() || deviceInfo.ia() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca()) {
                i = 2;
            } else {
                i = (deviceInfo.k0() || deviceInfo.X9() || deviceInfo.T9() || deviceInfo.O9() || deviceInfo.fa() || deviceInfo.E9()) ? 1 : 0;
            }
            a7b.f("NTF_Ability", "isDeviceSupportFluid: " + i);
            return i;
        }

        public static boolean c(kvc kvcVar) {
            try {
                String RELEASE = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                if (!(Integer.parseInt(RELEASE) > 10)) {
                    return false;
                }
                ApplicationInfo applicationInfo = b78.a().getPackageManager().getApplicationInfo("com.coloros.floatassistant", 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "getAppContext().packageM…ATA\n                    )");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle.getBoolean("health.quick_return.transmission.support", false);
                }
            } catch (Exception e2) {
                a7b.b("NTF_Ability", "[isPhoneSupport] , error=" + e2.getMessage());
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull kvc kvcVar) {
            if (kvcVar instanceof DeviceInfo) {
                return ((DeviceInfo) kvcVar).Ua();
            }
            throw new RuntimeException(kvcVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull kvc kvcVar) {
            if (kvcVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) kvcVar;
                if (!kvcVar.W3() && ilj.x()) {
                    return deviceInfo.ea() || deviceInfo.ia() || deviceInfo.X9() || deviceInfo.T9() || deviceInfo.O9() || deviceInfo.fa() || deviceInfo.E9() || deviceInfo.Xa();
                }
                return false;
            }
            throw new RuntimeException(kvcVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Code duplicated, block: B:21:0x003c  */
        /* JADX WARN: Code duplicated, block: B:23:0x0042  */
        /* JADX WARN: Code duplicated, block: B:25:0x0048  */
        /* JADX WARN: Code duplicated, block: B:26:0x004d  */
        /* JADX WARN: Code duplicated, block: B:29:0x0056  */
        /* JADX WARN: Code duplicated, block: B:31:0x005c  */
        /* JADX WARN: Code duplicated, block: B:33:0x0062  */
        /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull kvc kvcVar) {
            UserDeviceInfo deviceInfo;
            UserDeviceInfo deviceInfo2;
            String firmwareVersion;
            if (!(kvcVar instanceof DeviceInfo)) {
                throw new RuntimeException(kvcVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo3 = (DeviceInfo) kvcVar;
            if (kvcVar.W3()) {
                return false;
            }
            if (!deviceInfo3.ja() && !deviceInfo3.ka() && !deviceInfo3.ca()) {
                if (deviceInfo3.ba()) {
                    UserDeviceInfo deviceInfo4 = deviceInfo3.getDeviceInfo();
                    if (!ugl.e(deviceInfo4 != null ? deviceInfo4.getFirmwareVersion() : null, 60)) {
                        if (!deviceInfo3.ia()) {
                            deviceInfo2 = deviceInfo3.getDeviceInfo();
                            if (deviceInfo2 != null) {
                                firmwareVersion = deviceInfo2.getFirmwareVersion();
                            } else {
                                firmwareVersion = null;
                            }
                            if (!ugl.e(firmwareVersion, 130)) {
                                if (deviceInfo3.X9()) {
                                    return false;
                                }
                                deviceInfo = deviceInfo3.getDeviceInfo();
                                if (ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 210)) {
                                    return false;
                                }
                            }
                        } else {
                            if (deviceInfo3.X9()) {
                                return false;
                            }
                            deviceInfo = deviceInfo3.getDeviceInfo();
                            if (ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 210)) {
                                return false;
                            }
                        }
                    }
                } else if (!deviceInfo3.ia()) {
                    deviceInfo2 = deviceInfo3.getDeviceInfo();
                    if (deviceInfo2 != null) {
                        firmwareVersion = deviceInfo2.getFirmwareVersion();
                    } else {
                        firmwareVersion = null;
                    }
                    if (!ugl.e(firmwareVersion, 130)) {
                        if (deviceInfo3.X9()) {
                            return false;
                        }
                        deviceInfo = deviceInfo3.getDeviceInfo();
                        if (ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 210)) {
                            return false;
                        }
                    }
                } else {
                    if (deviceInfo3.X9()) {
                        return false;
                    }
                    deviceInfo = deviceInfo3.getDeviceInfo();
                    if (ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 210)) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull kvc kvcVar) {
            if (!(kvcVar instanceof DeviceInfo)) {
                throw new RuntimeException(kvcVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) kvcVar;
            if (kvcVar.W3()) {
                return false;
            }
            boolean z = deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.fa() || deviceInfo.E9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            if (!z) {
                a7b.f("NTF_Ability", "[isSupportFlashback] --> deviceSupport=" + z);
                return false;
            }
            boolean zC = c(kvcVar);
            a7b.f("NTF_Ability", "[isSupportFlashback] --> phoneSupport=" + zC);
            return zC;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull kvc kvcVar) {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            if (!(kvcVar instanceof DeviceInfo)) {
                throw new RuntimeException(kvcVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) kvcVar;
            boolean z = false;
            if (a(kvcVar) && !deviceInfo.Ra() && !kvcVar.W3()) {
                Context contextA = b78.a();
                Integer numValueOf = null;
                try {
                    applicationInfo = contextA.getPackageManager().getApplicationInfo("com.oplus.pantanal.ums", 128);
                } catch (Exception e2) {
                    a7b.b("NTF_Ability", "isPhoneSupportFluid: " + e2.getMessage());
                    applicationInfo = null;
                }
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    numValueOf = Integer.valueOf(bundle.getInt("supportWatch", 0));
                }
                if (numValueOf != null && numValueOf.intValue() == 1 && a(kvcVar) && q6e.a(contextA) && kvcVar.l1() > 0) {
                    z = true;
                }
                a7b.f("NTF_Ability", "isPhoneSupportFluid: " + z);
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean i(@NotNull kvc kvcVar) {
            if (kvcVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) kvcVar;
                return deviceInfo.fa() || deviceInfo.E9();
            }
            throw new RuntimeException(kvcVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean W3();

    boolean Z4();

    boolean Z5();

    int l1();

    boolean r0();

    boolean s2();

    boolean w4();
}
