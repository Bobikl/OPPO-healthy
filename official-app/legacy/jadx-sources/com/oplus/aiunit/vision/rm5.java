package com.oplus.aiunit.vision;

import com.heytap.health.base.view.exceptionview.DevicePageType;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/rm5;", "Lcom/oplus/aiunit/vision/if0;", "Lcom/heytap/health/base/view/exceptionview/DevicePageType;", c8l.KEY_B1, "", "l2", "V7", "V3", "r", "g2", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public interface rm5 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceSettingAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSettingAbility.kt\ncom/heytap/health/settings/watch/ability/DeviceSettingAbility$Info$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,122:1\n37#2,5:123\n37#2,5:128\n37#2,5:133\n37#2,5:138\n37#2,5:143\n37#2,5:148\n*S KotlinDebug\n*F\n+ 1 DeviceSettingAbility.kt\ncom/heytap/health/settings/watch/ability/DeviceSettingAbility$Info$DefaultImpls\n*L\n73#1:123,5\n86#1:128,5\n95#1:133,5\n102#1:138,5\n109#1:143,5\n116#1:148,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static DevicePageType a(@NotNull rm5 rm5Var) {
            if (rm5Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) rm5Var;
                if (deviceInfo.Na()) {
                    return deviceInfo.Oa() ? deviceInfo.n9() : DevicePageType.NORMAL;
                }
                return DevicePageType.DEVICE_CONNECT_ERROR;
            }
            throw new RuntimeException(rm5Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull rm5 rm5Var) {
            if (rm5Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) rm5Var;
                return (deviceInfo.O9() && deviceInfo.Sa(43)) || deviceInfo.qa(DeviceConstants.BaseDevice.AbstractC0341b.j.INSTANCE);
            }
            throw new RuntimeException(rm5Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull rm5 rm5Var) {
            if (rm5Var instanceof DeviceInfo) {
                return ((DeviceInfo) rm5Var).oa(DeviceConstants.BaseDevice.AbstractC0341b.k.INSTANCE);
            }
            throw new RuntimeException(rm5Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull rm5 rm5Var) {
            if (rm5Var instanceof DeviceInfo) {
                return ((DeviceInfo) rm5Var).oa(DeviceConstants.BaseDevice.AbstractC0341b.k.INSTANCE);
            }
            throw new RuntimeException(rm5Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull rm5 rm5Var) {
            if (rm5Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) rm5Var;
                return (deviceInfo.O9() && deviceInfo.Sa(43)) || deviceInfo.ha() || deviceInfo.qa(DeviceConstants.BaseDevice.AbstractC0341b.j.INSTANCE) || deviceInfo.pa(DeviceConstants.BaseDevice.a.d.INSTANCE);
            }
            throw new RuntimeException(rm5Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull rm5 rm5Var) {
            if (rm5Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) rm5Var;
                return deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.k.INSTANCE) && !deviceInfo.ea();
            }
            throw new RuntimeException(rm5Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    @NotNull
    DevicePageType B1();

    boolean V3();

    boolean V7();

    boolean g2();

    boolean l2();

    boolean r();
}
