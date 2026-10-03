package com.lifesense.android.bluetooth.core.bean.constant;

/* JADX INFO: loaded from: classes4.dex */
public class PairedResultsCode {
    public static final int PAIR_DEFAULT = -2;
    public static final int PAIR_FAILED = -1;
    public static final int PAIR_FAILED_BLUETOOTH_CLOSE = 5;
    public static final int PAIR_FAILED_CONFIRM = 2;
    public static final int PAIR_FAILED_DEVICE_SEND_DATA = 3;
    public static final int PAIR_FAILED_PARAMETER_ERR = 7;
    public static final int PAIR_FAILED_RANDOM_CHECK = 1;
    public static final int PAIR_FAILED_READ_DEVICE_ID_TIMEOUT = 8;
    public static final int PAIR_FAILED_REGISTER_FAIL = 9;
    public static final int PAIR_FAILED_SYSTEM_FAIL = 10;
    public static final int PAIR_FAILED_TIMEOUT = 9;
    public static final int PAIR_FAILED_USER_CANCEL = 4;
    public static final int PAIR_FAILED_WORK_STATUS_ERR = 6;
    public static final int PAIR_SUCCESSFULLY = 0;

    public static String getValue(int i) {
        switch (i) {
            case -2:
                return "pair default";
            case -1:
                return "pair failed";
            case 0:
                return "pair success";
            case 1:
                return "pair failed random check";
            case 2:
                return "pair failed confirm";
            case 3:
                return "pair failed device send data";
            case 4:
                return "pair failed user cancel";
            case 5:
                return "pair failed bluetooth close";
            case 6:
                return "pair failed work status err";
            case 7:
                return "pair failed parameter err";
            case 8:
            default:
                return "";
            case 9:
                return "pair failed timeout";
        }
    }
}
