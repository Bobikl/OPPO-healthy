package com.lifesense.android.bluetooth.core.bean.constant;

/* JADX INFO: loaded from: classes4.dex */
public enum ErrorCode {
    UNKNOWN_ERROR(-1, "unknown"),
    UNINITIALIZED(-2, "uninitialized"),
    SUCCESS(0, ""),
    PARAMETER_ERROR_CODE(1, "parameter error"),
    FILE_FORMAT_ERROR_CODE(2, "file format error"),
    FILE_UPDATE_MODEL_ERROR_CODE(3, "update model error"),
    FILE_CHECK_MODEL_ERROR_CODE(4, "check model error"),
    BLE_MANAGER_STATE_ERROR_CODE(5, "working status error"),
    BLE_DISCONNECT(6, "ble disconnect"),
    DEVICE_NOT_CONNECTED(7, "device not connected"),
    DEVICE_UNSUPPORTED(8, "device unsupported"),
    DEVICE_RETRUN_FAIL(9, "device return fail"),
    FILE_VERIFY_ERROR_CODE(10, "file verification error"),
    DATA_RECEIVE_ERROR_CODE(11, "failed to receive data"),
    LOW_BATTERY(12, "low battery"),
    CODE_VERSION_NOT_MATCH(13, "code version error"),
    FILE_HEADER_CHECK_FAIL(14, "file header verify error"),
    FLASH_SAVE_FAIL(15, "flash save failed"),
    SCAN_ERROR(16, "scan timeout"),
    CONNECTION_FAILED(17, "connect failed"),
    CONNECTION_ERROR(21, "connect error"),
    BlLUETOOTH_DISABLE(23, "bluetooth disable"),
    ABNORMAL_DISCONNECT(24, "abnormal disconnect"),
    WRITE_CHARACTERISTIC_FAILURE(25, "write characteristic failed"),
    CANCEL_UPGRADE(26, "cancel upgrading by user");

    public static final int BIN_ERROR_CODE = 30;
    public static final int BLOCK_VERIFY_ERROR_CODE = 29;
    public static final int DEVICE_CONFIG_FAILURE = 27;
    public static final int SETTING_TIMEOUT = 28;
    public static final int UPDATE_CRASH = 33;
    public static final int UPDATE_SEND_FILE_FAIL = 32;
    public int code;
    public String msg;

    ErrorCode(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public static ErrorCode fromCode(int i) {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.getCode()) {
                return errorCode;
            }
        }
        return UNKNOWN_ERROR;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
