package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/lsb;", "Lcom/oplus/aiunit/vision/if0;", "", "O1", "M1", "p4", "s", "checkIfDeviceUninstalledMenstrual", "Companion", "a", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public interface lsb extends if0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.lsb$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/lsb$a;", "", "<init>", "()V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMenstrualAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenstrualAbility.kt\ncom/heytap/health/menstrual_period/device/MenstrualAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,57:1\n37#2,5:58\n37#2,5:63\n37#2,5:68\n*S KotlinDebug\n*F\n+ 1 MenstrualAbility.kt\ncom/heytap/health/menstrual_period/device/MenstrualAbility$DefaultImpls\n*L\n21#1:58,5\n46#1:63,5\n53#1:68,5\n*E\n"})
    public static final class b {
        public static boolean a(lsb lsbVar) {
            return !oa5.a(gl4.managerApi.getCurrActiveMac()).J4(24);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0020  */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull lsb lsbVar) {
            if (!(lsbVar instanceof DeviceInfo)) {
                throw new RuntimeException(lsbVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) lsbVar;
            if (deviceInfo.ka()) {
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                if (!ugl.e(deviceInfo2 != null ? deviceInfo2.getFirmwareVersion() : null, 180)) {
                    if (deviceInfo.K9()) {
                    }
                    return false;
                }
            } else if (deviceInfo.K9() || !deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.c.INSTANCE)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull lsb lsbVar) {
            if (lsbVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) lsbVar;
                return deviceInfo.ka() || (deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.c.INSTANCE));
            }
            throw new RuntimeException(lsbVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean d(@NotNull lsb lsbVar) {
            boolean zO1 = lsbVar.O1();
            boolean zA = a(lsbVar);
            a7b.f("MenstrualAbility", "isSupportMenstrualFunc support:" + zO1 + ", uninstalled:" + zA);
            return zO1 && !zA;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0033  */
        /* JADX WARN: Code duplicated, block: B:20:0x0039  */
        /* JADX WARN: Code duplicated, block: B:22:0x003f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0044  */
        /* JADX WARN: Code duplicated, block: B:26:0x004d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0053  */
        /* JADX WARN: Code duplicated, block: B:30:0x0059  */
        /* JADX WARN: Code duplicated, block: B:33:0x0065  */
        /* JADX WARN: Code duplicated, block: B:35:0x006b  */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull lsb lsbVar) {
            UserDeviceInfo deviceInfo;
            UserDeviceInfo deviceInfo2;
            String firmwareVersion;
            if (!(lsbVar instanceof DeviceInfo)) {
                throw new RuntimeException(lsbVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo3 = (DeviceInfo) lsbVar;
            if (!deviceInfo3.ja() && !deviceInfo3.ea() && !deviceInfo3.ka()) {
                if (deviceInfo3.ba()) {
                    UserDeviceInfo deviceInfo4 = deviceInfo3.getDeviceInfo();
                    if (!ugl.e(deviceInfo4 != null ? deviceInfo4.getFirmwareVersion() : null, 90)) {
                        if (!deviceInfo3.ia()) {
                            deviceInfo2 = deviceInfo3.getDeviceInfo();
                            if (deviceInfo2 != null) {
                                firmwareVersion = deviceInfo2.getFirmwareVersion();
                            } else {
                                firmwareVersion = null;
                            }
                            if (!ugl.e(firmwareVersion, 170)) {
                                if (deviceInfo3.ga()) {
                                    if (deviceInfo3.K9()) {
                                    }
                                    return false;
                                }
                                deviceInfo = deviceInfo3.getDeviceInfo();
                                if (!ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 30)) {
                                    if (deviceInfo3.K9()) {
                                    }
                                    return false;
                                }
                            }
                        } else {
                            if (deviceInfo3.ga()) {
                                if (deviceInfo3.K9()) {
                                }
                                return false;
                            }
                            deviceInfo = deviceInfo3.getDeviceInfo();
                            if (!ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 30)) {
                                if (deviceInfo3.K9()) {
                                }
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
                    if (!ugl.e(firmwareVersion, 170)) {
                        if (deviceInfo3.ga()) {
                            if (deviceInfo3.K9()) {
                            }
                            return false;
                        }
                        deviceInfo = deviceInfo3.getDeviceInfo();
                        if (!ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 30)) {
                            if (deviceInfo3.K9()) {
                            }
                            return false;
                        }
                    }
                } else if (deviceInfo3.ga()) {
                    deviceInfo = deviceInfo3.getDeviceInfo();
                    if (!ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 30)) {
                        if (deviceInfo3.K9()) {
                        }
                        return false;
                    }
                } else if (deviceInfo3.K9() || !deviceInfo3.oa(DeviceConstants.BaseDevice.AbstractC0341b.c.INSTANCE)) {
                    return false;
                }
            }
            return true;
        }
    }

    boolean M1();

    boolean O1();

    boolean p4();

    boolean s();
}
