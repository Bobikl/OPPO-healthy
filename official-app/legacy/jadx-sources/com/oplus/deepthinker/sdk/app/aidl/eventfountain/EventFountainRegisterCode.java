package com.oplus.deepthinker.sdk.app.aidl.eventfountain;

/* JADX INFO: loaded from: classes5.dex */
public class EventFountainRegisterCode {
    public static final int BINDER_TRANSACTION_ERROR = 128;
    public static final int EVENT_NOT_AVAILABLE = 2;
    public static final int INVALID_PARAMETERS = 16;
    public static final int NOT_IMPLEMENTED = 0;
    public static final int OS_VERSION_NOT_SUPPORT = 8;
    public static final int PERMISSION_NOT_GRANT = 256;
    public static final int PID_REGISTER_LIMITED = 4;
    public static final int REGISTER_SUCCESS = 1;
    public static final int SERVER_INTERVAL_ERROR = 32;
    public static final int UNSUPPORTED_PARAMETER = 64;

    public static String resultCodeToString(int i) {
        if (i == 0) {
            return "NOT_IMPLEMENTED";
        }
        if (i == 1) {
            return "REGISTER_SUCCESS";
        }
        if (i == 2) {
            return "EVENT_NOT_AVAILABLE";
        }
        if (i == 4) {
            return "PID_REGISTER_LIMITED";
        }
        if (i == 8) {
            return "OS_VERSION_NOT_SUPPORT";
        }
        if (i == 16) {
            return "INVALID_PARAMETERS";
        }
        if (i == 32) {
            return "SERVER_INTERVAL_ERROR";
        }
        if (i == 64) {
            return "UNSUPPORTED_PARAMETER";
        }
        if (i != 128) {
            return i != 256 ? "UNKNOWN_RESULT_CODE" : "PERMISSION_NOT_GRANT";
        }
        return "BINDER_TRANSACTION_ERROR";
    }
}
