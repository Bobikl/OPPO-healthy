package com.heytap.health.base.view.exceptionview;

import com.heytap.health.base.R$drawable;
import com.heytap.health.base.R$string;
import com.oplus.aiunit.vision.du6;

/* JADX INFO: loaded from: classes15.dex */
public enum DevicePageType {
    NORMAL(0),
    LOADING(1),
    NETWORK_ERROR(2),
    SERVER_INTERNAL_ERROR(3),
    DEVICE_CONNECT_ERROR(4),
    ON_STUB_MODULE(5),
    LITTLE_SMART_MODULE(6),
    DEVICE_SYNC_TIMEOUT(7),
    CUSTOM(8),
    DEVICE_LOW_BATTERY(9),
    UI_EMPTY(10);

    private final int mValue;
    private String msg = "";
    private int imgRes = 0;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DevicePageType.values().length];
            a = iArr;
            try {
                iArr[DevicePageType.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DevicePageType.SERVER_INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DevicePageType.DEVICE_CONNECT_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[DevicePageType.ON_STUB_MODULE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[DevicePageType.LITTLE_SMART_MODULE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[DevicePageType.DEVICE_SYNC_TIMEOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[DevicePageType.DEVICE_LOW_BATTERY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[DevicePageType.UI_EMPTY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[DevicePageType.CUSTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    DevicePageType(int i) {
        this.mValue = i;
    }

    public static DevicePageType forNumber(int i) {
        DevicePageType devicePageType = NORMAL;
        for (DevicePageType devicePageType2 : values()) {
            if (devicePageType2.mValue == i) {
                return devicePageType2;
            }
        }
        return devicePageType;
    }

    public static du6 getExceptionPageBean(DevicePageType devicePageType) {
        switch (a.a[devicePageType.ordinal()]) {
            case 1:
                return new du6(R$drawable.lib_base_no_net_connect, R$string.lib_base_network_error, R$string.lib_base_network_error_tips, true);
            case 2:
                return new du6(R$drawable.lib_base_no_net_connect, R$string.lib_base_server_error, R$string.lib_base_server_error_tips, true);
            case 3:
                return new du6(R$drawable.lib_base_device_disconnet, R$string.lib_base_disconnect_error, R$string.lib_base_disconnect_error_tips);
            case 4:
                return new du6(R$drawable.lib_base_device_on_stub_module, R$string.lib_base_disconnect_on_stub_module, R$string.lib_base_disconnect_on_stub_module_tips);
            case 5:
                return new du6(R$drawable.lib_base_device_on_stub_module, R$string.lib_base_on_low_smart_module, R$string.lib_base_disconnect_on_stub_module_tips);
            case 6:
                return new du6(R$drawable.lib_base_device_disconnet, R$string.lib_base_communication_fail_timeout, R$string.lib_base_communication_fail_timeout_retry);
            case 7:
                return new du6(R$drawable.lib_base_device_low_battery_tips, R$string.lib_base_device_low_battery_tips_title, R$string.lib_base_device_low_battery_tips_desc);
            case 8:
                return new du6(R$drawable.lib_base_device_low_battery_tips, R$string.lib_base_device_low_battery_tips_title, R$string.lib_base_device_low_battery_tips_desc);
            default:
                return null;
        }
    }

    public int getImgRes() {
        return this.imgRes;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getValue() {
        return this.mValue;
    }

    public void setImgRes(int i) {
        this.imgRes = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
