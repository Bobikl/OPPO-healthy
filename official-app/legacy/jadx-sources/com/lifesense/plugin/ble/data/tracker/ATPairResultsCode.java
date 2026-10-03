package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public class ATPairResultsCode {
    public static final int FAIL_CHECK_RANDOM_CODE_ERR = 10;
    public static final int FAIL_DEVICE_DISCONNECT = 14;
    public static final int FAIL_DEVICE_NOT_RANDOM_PAIRING = 11;
    public static final int FAIL_DEVICE_UNRQUEST_RENDOM_CODE = 13;
    public static final int FAIL_REPEAT_INPUT_RANDOM_CODE = 12;
    public static final int PAIR_DEFAULT = -2;
    public static final int PAIR_FAILED = -1;
    public static final int PAIR_FAILED_BLUETOOTH_CLOSE = 5;
    public static final int PAIR_FAILED_CONFIRM = 2;
    public static final int PAIR_FAILED_DEVICE_CANCEL = 15;
    public static final int PAIR_FAILED_DEVICE_SEND_DATA = 3;
    public static final int PAIR_FAILED_PARAMETER_ERR = 7;
    public static final int PAIR_FAILED_RANDOM_CHECK = 1;
    public static final int PAIR_FAILED_READ_DEVICE_ID_TIMEOUT = 8;
    public static final int PAIR_FAILED_REGISTER_FAIL = 9;
    public static final int PAIR_FAILED_TIMEOUT = 9;
    public static final int PAIR_FAILED_USER_CANCEL = 4;
    public static final int PAIR_FAILED_WORK_STATUS_ERR = 6;
    public static final int PAIR_SUCCESSFULLY = 0;
    public static final int SUCCESS = 1;

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
