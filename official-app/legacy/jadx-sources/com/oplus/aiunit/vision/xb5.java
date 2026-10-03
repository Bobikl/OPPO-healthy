package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.linkage.R$drawable;
import com.oplus.mydevices.sdk.Constants;
import com.oplus.mydevices.sdk.device.DeviceType;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@cdb
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/xb5;", "Lcom/oplus/aiunit/vision/jf0;", "", "z3", "s3", "e0", "", LinkInfo.CALL_TYPE_H5, "t7", "D3", "Lcom/oplus/mydevices/sdk/device/DeviceType;", "getDeviceType", "linkage_impl_release"}, k = 1, mv = {1, 8, 0})
public interface xb5 extends jf0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceCenterAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceCenterAbility.kt\ncom/heytap/health/linkage/ability/DeviceCenterAbility$Model$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,170:1\n30#2,5:171\n30#2,5:176\n30#2,5:181\n30#2,5:186\n30#2,5:191\n30#2,5:196\n30#2,5:201\n*S KotlinDebug\n*F\n+ 1 DeviceCenterAbility.kt\ncom/heytap/health/linkage/ability/DeviceCenterAbility$Model$DefaultImpls\n*L\n39#1:171,5\n52#1:176,5\n60#1:181,5\n64#1:186,5\n76#1:191,5\n92#1:196,5\n100#1:201,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static int a(@NotNull xb5 xb5Var) {
            if (xb5Var instanceof DeviceModel) {
                return fq5.c(Constants.PACKAGE_NAME_MY_DEVICE, Constants.MY_DEVICE_VERSION_CODE_OS12) ? xb5Var.H5() : xb5Var.t7();
            }
            throw new RuntimeException(xb5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static DeviceType b(@NotNull xb5 xb5Var) {
            if (xb5Var instanceof DeviceModel) {
                return ((DeviceModel) xb5Var).A9() ? DeviceType.WRISTBAND : DeviceType.WATCH;
            }
            throw new RuntimeException(xb5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int c(@NotNull xb5 xb5Var) {
            if (xb5Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) xb5Var;
                if (deviceModel.F9()) {
                    return R$drawable.linkage_item_watch_face_ring;
                }
                return deviceModel.A9() ? R$drawable.linkage_item_band_face : R$drawable.linkage_item_watch_face_rect;
            }
            throw new RuntimeException(xb5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int d(@NotNull xb5 xb5Var) {
            if (xb5Var instanceof DeviceModel) {
                return ((DeviceModel) xb5Var).A9() ? R$drawable.linkage_devicedetail_band_default : R$drawable.linkage_devicedetail_watch_default;
            }
            throw new RuntimeException(xb5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull xb5 xb5Var) {
            if (xb5Var instanceof DeviceModel) {
                return xb5Var.e0() && ((DeviceModel) xb5Var).K9();
            }
            throw new RuntimeException(xb5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull xb5 xb5Var) {
            if (!(xb5Var instanceof DeviceModel)) {
                throw new RuntimeException(xb5Var + " not is " + DeviceModel.class.getCanonicalName());
            }
            DeviceModel deviceModel = (DeviceModel) xb5Var;
            boolean z = true;
            boolean z2 = deviceModel.o2() && !deviceModel.G9();
            if (fq5.c(Constants.PACKAGE_NAME_MY_DEVICE, Constants.MY_DEVICE_VERSION_CODE_OS12)) {
                return z2;
            }
            if (!z2 && !deviceModel.G9()) {
                z = false;
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull xb5 xb5Var) {
            if (xb5Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) xb5Var;
                return deviceModel.K9() || (deviceModel.I9() && deviceModel.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
            }
            throw new RuntimeException(xb5Var + " not is " + DeviceModel.class.getCanonicalName());
        }
    }

    int D3();

    int H5();

    boolean e0();

    @NotNull
    DeviceType getDeviceType();

    boolean s3();

    int t7();

    boolean z3();
}
