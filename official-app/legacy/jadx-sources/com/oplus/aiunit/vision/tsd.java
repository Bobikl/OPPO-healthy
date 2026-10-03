package com.oplus.aiunit.vision;

import com.heytap.health.device.ota.viewmodel.ConnectionStatusViewModel;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.deviceota.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/tsd;", "Lcom/oplus/aiunit/vision/if0;", "", "s0", "", "z2", "getDeviceUniqueId", "", c8l.KEY_F1, "V6", "Y1", "r2", "X5", "d", "e5", "s7", "Inner", "b", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
public interface tsd extends if0 {

    /* JADX INFO: renamed from: Inner, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOtaAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtaAbility.kt\ncom/heytap/health/device/ota/ability/OtaAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,126:1\n37#2,5:127\n37#2,5:132\n37#2,5:137\n37#2,5:142\n37#2,5:147\n37#2,5:152\n37#2,5:157\n37#2,5:162\n37#2,5:167\n37#2,5:172\n37#2,5:177\n*S KotlinDebug\n*F\n+ 1 OtaAbility.kt\ncom/heytap/health/device/ota/ability/OtaAbility$DefaultImpls\n*L\n35#1:127,5\n62#1:132,5\n69#1:137,5\n77#1:142,5\n89#1:147,5\n93#1:152,5\n100#1:157,5\n107#1:162,5\n111#1:167,5\n119#1:172,5\n123#1:177,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull tsd tsdVar) {
            if (tsdVar instanceof DeviceInfo) {
                return !((DeviceInfo) tsdVar).A9();
            }
            throw new RuntimeException(tsdVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int b(@NotNull tsd tsdVar) {
            if (tsdVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) tsdVar;
                return (deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca() || (deviceInfo.X9() && deviceInfo.Sa(66))) ? R$string.device_ota_watch_update_description3 : com.heytap.health.device.ota.R$string.device_ota_auto_update_tip;
            }
            throw new RuntimeException(tsdVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String c(@NotNull tsd tsdVar) {
            if (!(tsdVar instanceof DeviceInfo)) {
                throw new RuntimeException(tsdVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) tsdVar;
            if (!deviceInfo.Na()) {
                return ConnectionStatusViewModel.STATUS_DISCONNECTION_MODE;
            }
            if (deviceInfo.Ia()) {
                if (!deviceInfo.Oa()) {
                    return ConnectionStatusViewModel.STATUS_HIGH_SMART_MODE;
                }
                kpb kpbVarI9 = deviceInfo.i9();
                if (Intrinsics.areEqual(kpbVarI9, owa.INSTANCE)) {
                    return ConnectionStatusViewModel.STATUS_LOW_SMART_MODE;
                }
                if (!Intrinsics.areEqual(kpbVarI9, v8b.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!deviceInfo.Oa()) {
                if (deviceInfo.Pa()) {
                    return ConnectionStatusViewModel.STATUS_NORMAL_MODE;
                }
                a7b.m("OtaAbility", "error status in ble");
                return "";
            }
            return ConnectionStatusViewModel.STATUS_STUB_MODE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public static String d(@NotNull tsd tsdVar) {
            if (!(tsdVar instanceof DeviceInfo)) {
                throw new RuntimeException(tsdVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) tsdVar;
            if (deviceInfo.ya() && !deviceInfo.ea()) {
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                if (deviceInfo2 != null) {
                    return deviceInfo2.getGuid();
                }
                return null;
            }
            if (deviceInfo.K9()) {
                UserDeviceInfo deviceInfo3 = deviceInfo.getDeviceInfo();
                if (deviceInfo3 != null) {
                    return deviceInfo3.getImei();
                }
                return null;
            }
            UserDeviceInfo deviceInfo4 = deviceInfo.getDeviceInfo();
            if (deviceInfo4 != null) {
                return deviceInfo4.getDeviceSn();
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int e(@NotNull tsd tsdVar) {
            if (tsdVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) tsdVar;
                if (!deviceInfo.ya() || deviceInfo.ea()) {
                    return deviceInfo.K9() ? 27 : 30;
                }
                return 29;
            }
            throw new RuntimeException(tsdVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull tsd tsdVar) {
            if (tsdVar instanceof DeviceInfo) {
                return ((DeviceInfo) tsdVar).ea();
            }
            throw new RuntimeException(tsdVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull tsd tsdVar) {
            if (tsdVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) tsdVar;
                return deviceInfo.F9() || deviceInfo.fa() || deviceInfo.E9();
            }
            throw new RuntimeException(tsdVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull tsd tsdVar) {
            if (tsdVar instanceof DeviceInfo) {
                return ((DeviceInfo) tsdVar).ea();
            }
            throw new RuntimeException(tsdVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean i(@NotNull tsd tsdVar) {
            if (tsdVar instanceof DeviceInfo) {
                return ((DeviceInfo) tsdVar).K9();
            }
            throw new RuntimeException(tsdVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean j(@NotNull tsd tsdVar) {
            if (tsdVar instanceof DeviceInfo) {
                return ((DeviceInfo) tsdVar).pa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE);
            }
            throw new RuntimeException(tsdVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean k(@NotNull tsd tsdVar) {
            if (tsdVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) tsdVar;
                return deviceInfo.ea() && ugl.a(deviceInfo.Ma(), 170);
            }
            throw new RuntimeException(tsdVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.tsd$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/tsd$b;", "", "<init>", "()V", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
    }

    int F1();

    boolean V6();

    boolean X5();

    boolean Y1();

    int d();

    boolean e5();

    @Nullable
    String getDeviceUniqueId();

    boolean r2();

    @NotNull
    String s0();

    boolean s7();

    boolean z2();
}
