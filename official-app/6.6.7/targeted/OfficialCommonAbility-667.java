package com.oplus.aiunit.p007vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.watch.notification.NTFCmdId2;
import com.oplus.aiunit.vision.ag0;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.gpj;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.p8e;
import com.oplus.aiunit.vision.skl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\.\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/cxc;", "Lcom/oplus/aiunit/vision/ag0;", "", "v4", "", "m1", "t2", "r0", "Z5", "Y4", "W3", "b1", "isAboveOS14", "isPhoneFlashbackSupport", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
public interface cxc extends ag0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNotificationBaseAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationBaseAbility.kt\ncom/heytap/health/watch/notification/NotificationBaseAbility$Info$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,158:1\n37#2,5:159\n37#2,5:164\n37#2,5:169\n37#2,5:174\n37#2,5:179\n37#2,5:184\n37#2,5:189\n37#2,5:194\n*S KotlinDebug\n*F\n+ 1 NotificationBaseAbility.kt\ncom/heytap/health/watch/notification/NotificationBaseAbility$Info$DefaultImpls\n*L\n35#1:159,5\n70#1:164,5\n83#1:169,5\n94#1:174,5\n105#1:179,5\n110#1:184,5\n127#1:189,5\n154#1:194,5\n*E\n"})
    public static final class a {
        public static boolean a(cxc cxcVar) {
            boolean z = gpj.l() >= 34;
            m8b.f("NTF_Ability", "isAboveOS14: " + z);
            return z;
        }

        public static int b(@NotNull cxc cxcVar) {
            int i;
            if (!(cxcVar instanceof DeviceInfo)) {
                throw new RuntimeException(cxcVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) cxcVar;
            if (deviceInfo.la() || deviceInfo.da() || deviceInfo.ka() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea()) {
                i = 2;
            } else {
                i = (deviceInfo.k0() || deviceInfo.Z9() || deviceInfo.V9() || deviceInfo.Q9() || deviceInfo.ha() || deviceInfo.G9()) ? 1 : 0;
            }
            m8b.f("NTF_Ability", "isDeviceSupportFluid: " + i);
            return i;
        }

        public static boolean c(cxc cxcVar) {
            try {
                String str = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(str, "RELEASE");
                if (!(Integer.parseInt(str) > 10)) {
                    return false;
                }
                ApplicationInfo applicationInfo = e88.a().getPackageManager().getApplicationInfo("com.coloros.floatassistant", 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "getAppContext().packageM…ATA\n                    )");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle.getBoolean("health.quick_return.transmission.support", false);
                }
            } catch (Exception e) {
                m8b.b("NTF_Ability", "[isPhoneSupport] , error=" + e.getMessage());
            }
            return false;
        }

        public static boolean d(@NotNull cxc cxcVar) {
            if (cxcVar instanceof DeviceInfo) {
                return ((DeviceInfo) cxcVar).Wa();
            }
            throw new RuntimeException(cxcVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean e(@NotNull cxc cxcVar) {
            if (cxcVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) cxcVar;
                if (!cxcVar.W3() && gpj.x()) {
                    return deviceInfo.ga() || deviceInfo.ka() || deviceInfo.Z9() || deviceInfo.V9() || deviceInfo.Q9() || deviceInfo.ha() || deviceInfo.G9() || deviceInfo.Za();
                }
                return false;
            }
            throw new RuntimeException(cxcVar + " not is " + DeviceInfo.class.getCanonicalName());
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
        public static boolean f(@NotNull cxc cxcVar) {
            UserDeviceInfo userDeviceInfoMa;
            UserDeviceInfo userDeviceInfoMa2;
            String firmwareVersion;
            if (!(cxcVar instanceof DeviceInfo)) {
                throw new RuntimeException(cxcVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) cxcVar;
            if (cxcVar.W3()) {
                return false;
            }
            if (!deviceInfo.la() && !deviceInfo.ma() && !deviceInfo.ea()) {
                if (deviceInfo.da()) {
                    UserDeviceInfo userDeviceInfoMa3 = deviceInfo.Ma();
                    if (!skl.e(userDeviceInfoMa3 != null ? userDeviceInfoMa3.getFirmwareVersion() : null, 60)) {
                        if (!deviceInfo.ka()) {
                            userDeviceInfoMa2 = deviceInfo.Ma();
                            if (userDeviceInfoMa2 != null) {
                                firmwareVersion = userDeviceInfoMa2.getFirmwareVersion();
                            } else {
                                firmwareVersion = null;
                            }
                            if (!skl.e(firmwareVersion, 130)) {
                                if (deviceInfo.Z9()) {
                                    return false;
                                }
                                userDeviceInfoMa = deviceInfo.Ma();
                                if (skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, NTFCmdId2.CID_MSG_NEGOTIATE_VERIFY_CODE_VALUE)) {
                                    return false;
                                }
                            }
                        } else {
                            if (deviceInfo.Z9()) {
                                return false;
                            }
                            userDeviceInfoMa = deviceInfo.Ma();
                            if (skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, NTFCmdId2.CID_MSG_NEGOTIATE_VERIFY_CODE_VALUE)) {
                                return false;
                            }
                        }
                    }
                } else if (!deviceInfo.ka()) {
                    userDeviceInfoMa2 = deviceInfo.Ma();
                    if (userDeviceInfoMa2 != null) {
                        firmwareVersion = userDeviceInfoMa2.getFirmwareVersion();
                    } else {
                        firmwareVersion = null;
                    }
                    if (!skl.e(firmwareVersion, 130)) {
                        if (deviceInfo.Z9()) {
                            return false;
                        }
                        userDeviceInfoMa = deviceInfo.Ma();
                        if (skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, NTFCmdId2.CID_MSG_NEGOTIATE_VERIFY_CODE_VALUE)) {
                            return false;
                        }
                    }
                } else {
                    if (deviceInfo.Z9()) {
                        return false;
                    }
                    userDeviceInfoMa = deviceInfo.Ma();
                    if (skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, NTFCmdId2.CID_MSG_NEGOTIATE_VERIFY_CODE_VALUE)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean g(@NotNull cxc cxcVar) {
            if (!(cxcVar instanceof DeviceInfo)) {
                throw new RuntimeException(cxcVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) cxcVar;
            if (cxcVar.W3()) {
                return false;
            }
            boolean z = deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ha() || deviceInfo.G9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            if (!z) {
                m8b.f("NTF_Ability", "[isSupportFlashback] --> deviceSupport=" + z);
                return false;
            }
            boolean zC = c(cxcVar);
            m8b.f("NTF_Ability", "[isSupportFlashback] --> phoneSupport=" + zC);
            return zC;
        }

        public static boolean h(@NotNull cxc cxcVar) {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            if (!(cxcVar instanceof DeviceInfo)) {
                throw new RuntimeException(cxcVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) cxcVar;
            boolean z = false;
            if (a(cxcVar) && !deviceInfo.Ta() && !cxcVar.W3()) {
                Context contextA = e88.a();
                Integer numValueOf = null;
                try {
                    applicationInfo = contextA.getPackageManager().getApplicationInfo("com.oplus.pantanal.ums", 128);
                } catch (Exception e) {
                    m8b.b("NTF_Ability", "isPhoneSupportFluid: " + e.getMessage());
                    applicationInfo = null;
                }
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    numValueOf = Integer.valueOf(bundle.getInt("supportWatch", 0));
                }
                if (numValueOf != null && numValueOf.intValue() == 1 && a(cxcVar) && p8e.a(contextA) && cxcVar.m1() > 0) {
                    z = true;
                }
                m8b.f("NTF_Ability", "isPhoneSupportFluid: " + z);
            }
            return z;
        }

        public static boolean i(@NotNull cxc cxcVar) {
            if (cxcVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) cxcVar;
                return deviceInfo.ha() || deviceInfo.G9();
            }
            throw new RuntimeException(cxcVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean j(@NotNull cxc cxcVar) {
            if (cxcVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) cxcVar;
                return deviceInfo.ga() && deviceInfo.Ua(190);
            }
            throw new RuntimeException(cxcVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean W3();

    boolean Y4();

    boolean Z5();

    boolean b1();

    int m1();

    boolean r0();

    boolean t2();

    boolean v4();
}
