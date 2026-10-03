package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.devicemanager.processor.bean.VirtualAccountData;
import com.oplus.mydevices.sdk.device.DeviceType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/wb5;", "Lcom/oplus/aiunit/vision/xb5;", "Lcom/oplus/aiunit/vision/if0;", "", "k1", "M8", "j", "isFamilyDevice", "", "version", "isOtaAboveByVersion", "linkage_impl_release"}, k = 1, mv = {1, 8, 0})
public interface wb5 extends xb5, if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceCenterAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceCenterAbility.kt\ncom/heytap/health/linkage/ability/DeviceCenterAbility$DeviceInfo$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n37#2,5:171\n37#2,5:176\n30#2,5:181\n37#2,2:186\n40#2,2:189\n37#2,5:191\n37#2,5:196\n1#3:188\n*S KotlinDebug\n*F\n+ 1 DeviceCenterAbility.kt\ncom/heytap/health/linkage/ability/DeviceCenterAbility$DeviceInfo$DefaultImpls\n*L\n115#1:171,5\n123#1:176,5\n130#1:181,5\n140#1:186,2\n140#1:189,2\n146#1:191,5\n163#1:196,5\n*E\n"})
    public static final class a {
        public static int a(@NotNull wb5 wb5Var) {
            return xb5.a.a(wb5Var);
        }

        @NotNull
        public static DeviceType b(@NotNull wb5 wb5Var) {
            return xb5.a.b(wb5Var);
        }

        public static int c(@NotNull wb5 wb5Var) {
            return xb5.a.c(wb5Var);
        }

        public static int d(@NotNull wb5 wb5Var) {
            return xb5.a.d(wb5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(wb5 wb5Var) {
            if (!(wb5Var instanceof DeviceInfo)) {
                throw new RuntimeException(wb5Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            UserDeviceInfo deviceInfo = ((DeviceInfo) wb5Var).getDeviceInfo();
            String str = "";
            if (deviceInfo != null) {
                VirtualAccountData virtualAccountData = deviceInfo.getVirtualAccountData();
                String virtualSsoid = virtualAccountData != null ? virtualAccountData.getVirtualSsoid() : null;
                if (virtualSsoid == null) {
                    ml4.c(wb5.class.getName(), "isFamilyDevice virtualAccountData is null");
                } else {
                    str = virtualSsoid;
                }
            } else {
                ml4.c(wb5.class.getName(), "isFamilyDevice deviceInfo is null");
            }
            return str.length() > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(wb5 wb5Var, int i) {
            if (wb5Var instanceof DeviceInfo) {
                UserDeviceInfo deviceInfo = ((DeviceInfo) wb5Var).getDeviceInfo();
                if (deviceInfo != null) {
                    return ugl.e(deviceInfo.getFirmwareVersion(), i);
                }
                return false;
            }
            throw new RuntimeException(wb5Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean g(@NotNull wb5 wb5Var) {
            return xb5.a.e(wb5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull wb5 wb5Var) {
            if (wb5Var instanceof DeviceInfo) {
                return wb5Var.s3() && ((DeviceInfo) wb5Var).Na();
            }
            throw new RuntimeException(wb5Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean i(@NotNull wb5 wb5Var) {
            return xb5.a.f(wb5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean j(@NotNull wb5 wb5Var) {
            if (wb5Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) wb5Var;
                return !e(wb5Var) && (deviceModel.pa(DeviceConstants.BaseDevice.a.f.INSTANCE) || deviceModel.qa(DeviceConstants.BaseDevice.AbstractC0341b.j.INSTANCE) || (deviceModel.O9() && f(wb5Var, 43)));
            }
            throw new RuntimeException(wb5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        public static boolean k(@NotNull wb5 wb5Var) {
            return xb5.a.g(wb5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean l(@NotNull wb5 wb5Var) {
            if (wb5Var instanceof DeviceInfo) {
                return wb5Var.e0() && ((DeviceInfo) wb5Var).Na();
            }
            throw new RuntimeException(wb5Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean M8();

    boolean j();

    boolean k1();
}
