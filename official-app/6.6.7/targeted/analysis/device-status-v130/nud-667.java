package com.oplus.aiunit.model;

import com.heytap.health.device.ota.viewmodel.ConnectionStatusViewModel;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.deviceota.R$string;
import com.heytap.health.vision.deviceability.DeviceInfo;
import com.heytap.health.vision.processor.bean.UserDeviceInfo;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import com.oplus.aiunit.vision.cwg;
import com.oplus.aiunit.vision.m8b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/nud;", "Lcom/oplus/aiunit/vision/ag0;", BuildConfig.VERSION_NAME, "s0", BuildConfig.VERSION_NAME, "A2", "getDeviceUniqueId", BuildConfig.VERSION_NAME, "G1", "X6", "Z1", "s2", "X5", "d", "d5", "u7", "Inner", "b", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
public interface nud extends ag0 {

    /* JADX INFO: renamed from: Inner, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOtaAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtaAbility.kt\ncom/heytap/health/device/ota/ability/OtaAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,131:1\n37#2,5:132\n37#2,5:137\n37#2,5:142\n37#2,5:147\n37#2,5:152\n37#2,5:157\n37#2,5:162\n37#2,5:167\n37#2,5:172\n37#2,5:177\n37#2,5:182\n*S KotlinDebug\n*F\n+ 1 OtaAbility.kt\ncom/heytap/health/device/ota/ability/OtaAbility$DefaultImpls\n*L\n36#1:132,5\n63#1:137,5\n70#1:142,5\n78#1:147,5\n90#1:152,5\n97#1:157,5\n105#1:162,5\n112#1:167,5\n116#1:172,5\n124#1:177,5\n128#1:182,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull nud nudVar) {
            if (nudVar instanceof DeviceInfo) {
                return !((DeviceInfo) nudVar).C9();
            }
            throw new RuntimeException(nudVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int b(@NotNull nud nudVar) {
            if (nudVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) nudVar;
                return (deviceInfo.ka() || deviceInfo.la() || deviceInfo.ma() || deviceInfo.ea() || (deviceInfo.Z9() && deviceInfo.Ua(66))) ? R$string.device_ota_watch_update_description3 : com.heytap.health.device.ota.R$string.device_ota_auto_update_tip;
            }
            throw new RuntimeException(nudVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String c(@NotNull nud nudVar) throws NoWhenBranchMatchedException {
            if (!(nudVar instanceof DeviceInfo)) {
                throw new RuntimeException(nudVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) nudVar;
            if (!deviceInfo.Pa()) {
                return ConnectionStatusViewModel.STATUS_DISCONNECTION_MODE;
            }
            if (deviceInfo.Ka()) {
                if (!deviceInfo.Qa()) {
                    return ConnectionStatusViewModel.STATUS_HIGH_SMART_MODE;
                }
                zqb zqbVarK9 = deviceInfo.k9();
                if (Intrinsics.areEqual(zqbVarK9, zxa.INSTANCE)) {
                    return ConnectionStatusViewModel.STATUS_LOW_SMART_MODE;
                }
                if (!Intrinsics.areEqual(zqbVarK9, hab.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!deviceInfo.Qa()) {
                if (deviceInfo.Ra()) {
                    return ConnectionStatusViewModel.STATUS_NORMAL_MODE;
                }
                m8b.m("OtaAbility", "error status in ble");
                return BuildConfig.VERSION_NAME;
            }
            return ConnectionStatusViewModel.STATUS_STUB_MODE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public static String d(@NotNull nud nudVar) {
            if (!(nudVar instanceof DeviceInfo)) {
                throw new RuntimeException(nudVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) nudVar;
            if (deviceInfo.Aa() && !deviceInfo.ga()) {
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                if (deviceInfo2 != null) {
                    return deviceInfo2.getGuid();
                }
                return null;
            }
            if (deviceInfo.M9()) {
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
        public static int e(@NotNull nud nudVar) {
            if (nudVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) nudVar;
                if (!deviceInfo.Aa() || deviceInfo.ga()) {
                    return deviceInfo.M9() ? 27 : 30;
                }
                return 29;
            }
            throw new RuntimeException(nudVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull nud nudVar) {
            if (nudVar instanceof DeviceInfo) {
                return !cwg.a().c() && ((DeviceInfo) nudVar).ra(DeviceConstants.BaseDevice.a.C0016b.INSTANCE);
            }
            throw new RuntimeException(nudVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull nud nudVar) {
            if (nudVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) nudVar;
                return deviceInfo.H9() || deviceInfo.ha() || deviceInfo.G9();
            }
            throw new RuntimeException(nudVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull nud nudVar) {
            if (nudVar instanceof DeviceInfo) {
                return ((DeviceInfo) nudVar).ra(DeviceConstants.BaseDevice.a.C0016b.INSTANCE);
            }
            throw new RuntimeException(nudVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean i(@NotNull nud nudVar) {
            if (nudVar instanceof DeviceInfo) {
                return ((DeviceInfo) nudVar).M9();
            }
            throw new RuntimeException(nudVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean j(@NotNull nud nudVar) {
            if (nudVar instanceof DeviceInfo) {
                return ((DeviceInfo) nudVar).ra(DeviceConstants.BaseDevice.a.C0016b.INSTANCE);
            }
            throw new RuntimeException(nudVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean k(@NotNull nud nudVar) {
            if (nudVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) nudVar;
                return deviceInfo.ga() && skl.a(deviceInfo.Oa(), 170);
            }
            throw new RuntimeException(nudVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.nud$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/nud$b;", BuildConfig.VERSION_NAME, "<init>", "()V", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
    }

    boolean A2();

    int G1();

    boolean X5();

    boolean X6();

    boolean Z1();

    int d();

    boolean d5();

    @Nullable
    String getDeviceUniqueId();

    @NotNull
    String s0();

    boolean s2();

    boolean u7();
}
