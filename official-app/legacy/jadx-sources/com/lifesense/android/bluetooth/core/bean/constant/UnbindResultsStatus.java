package com.lifesense.android.bluetooth.core.bean.constant;

/* JADX INFO: loaded from: classes4.dex */
public class UnbindResultsStatus {
    public static final int DEVICE_UNSUPPORTED = 9;
    public static final int UNBIND_DEFAULT = -2;
    public static final int UNBIND_FAILED = -1;
    public static final int UNBIND_FAILED_BLUETOOTH_CLOSE = 5;
    public static final int UNBIND_FAILED_DEVICE_SEND_DATA = 3;
    public static final int UNBIND_FAILED_PARAMETER_ERR = 7;
    public static final int UNBIND_FAILED_TIMEOUT = 8;
    public static final int UNBIND_FAILED_USER_CANCEL = 4;
    public static final int UNBIND_FAILED_WORK_STATUS_ERR = 6;
    public static final int UNBIND_SUCCESSFULLY = 0;

    public static String getValue(int i) {
        if (i == -2) {
            return "unbind default";
        }
        if (i == -1) {
            return "unbind failed";
        }
        if (i == 0) {
            return "unbind success";
        }
        switch (i) {
            case 3:
                return "unbind failed device send data";
            case 4:
                return "unbind failed user cancel";
            case 5:
                return "unbind failed bluetooth close";
            case 6:
                return "unbind failed work status err";
            case 7:
                return "unbind failed parameter err";
            case 8:
                return "unbind failed timeout";
            default:
                return "";
        }
    }
}
