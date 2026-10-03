package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.api.R$string;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.util.DeviceUtilsKt;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public interface oo5 extends if0 {
    public static final int ERROR_RES = -1;
    public static final String TAG = "DeviceStateAbility";

    static /* synthetic */ Boolean K3(DeviceInfo deviceInfo) {
        kpb kpbVarI9 = deviceInfo.i9();
        ml4.a(TAG, gdb.a(deviceInfo.Ma()) + "mcuType:" + kpbVarI9);
        return Boolean.valueOf(kpbVarI9 == owa.INSTANCE);
    }

    static /* synthetic */ Integer L8(boolean z, DeviceInfo deviceInfo) {
        int i;
        if (z && !deviceInfo.Na()) {
            ml4.a(TAG, gdb.a(deviceInfo.Ma()) + ":disconnect");
            i = R$string.devicemanager_toast_disconnect;
        } else if (deviceInfo.Oa()) {
            kpb kpbVarI9 = deviceInfo.i9();
            ml4.a(TAG, gdb.a(deviceInfo.Ma()) + "mcuType:" + kpbVarI9.toString());
            i = kpbVarI9 == owa.INSTANCE ? R$string.devicemanager_toast_light_intelligence_new : R$string.devicemanager_toast_long_battery_life_new;
        } else {
            ml4.a(TAG, gdb.a(deviceInfo.Ma()) + ":getDeviceStateToast orther");
            i = -1;
        }
        return Integer.valueOf(i);
    }

    static /* synthetic */ Boolean U6(DeviceInfo deviceInfo) {
        return Boolean.valueOf(deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE) && deviceInfo.Ya());
    }

    default boolean G6() {
        return ((Boolean) DeviceUtilsKt.a(this, new Function1() { // from class: com.oplus.aiunit.vision.mo5
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oo5.U6((DeviceInfo) obj);
            }
        })).booleanValue();
    }

    default int I2() {
        return i7() ? com.heytap.health.base.R$string.lib_base_device_state_smart_mode : com.heytap.health.base.R$string.lib_base_device_state_long_pow;
    }

    default int Y(final boolean z) {
        return ((Integer) DeviceUtilsKt.a(this, new Function1() { // from class: com.oplus.aiunit.vision.no5
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oo5.L8(z, (DeviceInfo) obj);
            }
        })).intValue();
    }

    default boolean i7() {
        return ((Boolean) DeviceUtilsKt.a(this, new Function1() { // from class: com.oplus.aiunit.vision.lo5
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oo5.K3((DeviceInfo) obj);
            }
        })).booleanValue();
    }

    default int x6() {
        return i7() ? com.heytap.health.base.R$string.lib_base_on_low_smart_module : com.heytap.health.base.R$string.lib_base_disconnect_on_stub_module;
    }
}
