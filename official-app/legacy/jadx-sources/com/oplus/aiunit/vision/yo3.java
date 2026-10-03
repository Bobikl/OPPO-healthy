package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bD\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bF\u0010GJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0007R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0007R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0007R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0007R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0007R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0007R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0007R\u0014\u0010-\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0007R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0007R\u0014\u0010/\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0007R\u0014\u00101\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0007R\u0014\u00102\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0007R\u0014\u00103\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0007R\u0014\u00104\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0007R\u0014\u00105\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0007R\u0014\u00106\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0007R\u0014\u00107\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0007R\u0014\u00108\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0007R\u0014\u00109\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0007R\u0014\u0010:\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0007R\u0014\u0010;\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0007R\u0014\u0010<\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0007R\u0014\u0010=\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0007R\u0014\u0010>\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0007R\u0014\u0010?\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0007R\u0014\u0010@\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0007R\u0014\u0010A\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0007R\u0014\u0010B\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u0007R\u0014\u0010C\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u0007R\u0014\u0010D\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\u0007R\u0014\u0010E\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\u0007¨\u0006H"}, d2 = {"Lcom/oplus/aiunit/vision/yo3;", "", "", "code", "", "a", "SUCCESS", "I", "SERVICE_DISABLED", "SERVICE_MISSING", "NODE_NOT_CONNECTED", "INTERNAL_ERROR", "INTERRUPTED", "TIMEOUT", "TARGET_APP_MISSING", "TARGET_ALREADY_INSTALLED", "TARGET_PACKAGE_NAME_FAIL", "TARGET_PACKAGE_NAME_MISSING", "TARGET_SIGNATURE_MISSING", "NODE_NOT_MATCH", "MESSAGE_TOO_LARGE", "SIGNATURE_FAIL", "TARGET_NOT_BIND", "TARGET_NOT_REGISTER", "START_ACTIVITY_NOTIFY", "ACTIVITY_NOT_FOUND_EXCEPTION", "BIND_SERVICE_FAIL", "TO_SIGNATURE_FAIL", "USER_LOCKED", "TO_EXERCISE_LISTENER_MISSING", "UNKNOWN_COMMAND", "FILE_ERROR_REQUEST_NOT_QUEUED", "FILE_ERROR_CHANNEL_IO", "FILE_ERROR_FILE_IO", "FILE_ERROR_COMMAND_DROPPED", "FILE_ERROR_PEER_AGENT_NO_RESPONSE", "FILE_ERROR_CONNECTION_LOST", "FILE_ERROR_PEER_AGENT_BUSY", "FILE_ERROR_PEER_AGENT_REJECTED", "FILE_ERROR_SPACE_NOT_AVAILABLE", "FILE_ERROR_NOT_SUPPORTED", "FILE_ERROR_TRANSACTION_NOT_FOUND", "FILE_ERROR_FATAL", "FILE_SEND_FAIL", "FILE_TRANSFER_NO_INIT", "FILE_CANCEL_FAIL", "AUTH_AUTHENTICATE_SUCCESS", "AUTH_AUTHENTICATE_FAIL", "AUTH_TIME_EXPIRED", "AUTH_AUTHCODE_EXPECTED", "AUTH_VERSION_INCOMPATIBLE", "AUTH_AUTHCODE_RECYCLE", "AUTH_AUTHCODE_INVALID", "AUTH_CAPABILITY_EXCEPTION", "AUTH_STATUS_EXCEPTION", "AUTH_INTERNAL_EXCEPTION", "AUTH_PERMISSION_DENIAL", "BINDER_SERVICE_FAIL", "API_INTERRUPTED", "API_TIMEOUT", "API_DISCONNECTED", "WES_SELF_VERSION_TOO_LOW", "WES_TARGET_VERSION_TOO_LOW", "WEAR_OS_VERSION_TOO_LOW", "PERMISSION_DENIAL", "PERMISSION_MISSING", "WES_INTERRUPTED", "WES_TIMEOUT", "WES_DISCONNECTED", "SDK_NOT_INIT", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class yo3 {
    public static final int ACTIVITY_NOT_FOUND_EXCEPTION = 31;
    public static final int API_DISCONNECTED = 2020;
    public static final int API_INTERRUPTED = 2014;
    public static final int API_TIMEOUT = 2015;
    public static final int AUTH_AUTHCODE_EXPECTED = 1004;
    public static final int AUTH_AUTHCODE_INVALID = 1007;
    public static final int AUTH_AUTHCODE_RECYCLE = 1006;
    public static final int AUTH_AUTHENTICATE_FAIL = 1002;
    public static final int AUTH_AUTHENTICATE_SUCCESS = 1001;
    public static final int AUTH_CAPABILITY_EXCEPTION = 1008;
    public static final int AUTH_INTERNAL_EXCEPTION = 1010;
    public static final int AUTH_PERMISSION_DENIAL = 1011;
    public static final int AUTH_STATUS_EXCEPTION = 1009;
    public static final int AUTH_TIME_EXPIRED = 1003;
    public static final int AUTH_VERSION_INCOMPATIBLE = 1005;
    public static final int BINDER_SERVICE_FAIL = 2001;
    public static final int BIND_SERVICE_FAIL = 32;
    public static final int FILE_CANCEL_FAIL = 233;
    public static final int FILE_ERROR_CHANNEL_IO = 201;
    public static final int FILE_ERROR_COMMAND_DROPPED = 203;
    public static final int FILE_ERROR_CONNECTION_LOST = 205;
    public static final int FILE_ERROR_FATAL = 221;
    public static final int FILE_ERROR_FILE_IO = 202;
    public static final int FILE_ERROR_NOT_SUPPORTED = 212;
    public static final int FILE_ERROR_PEER_AGENT_BUSY = 208;
    public static final int FILE_ERROR_PEER_AGENT_NO_RESPONSE = 204;
    public static final int FILE_ERROR_PEER_AGENT_REJECTED = 209;
    public static final int FILE_ERROR_REQUEST_NOT_QUEUED = 200;
    public static final int FILE_ERROR_SPACE_NOT_AVAILABLE = 211;
    public static final int FILE_ERROR_TRANSACTION_NOT_FOUND = 213;
    public static final int FILE_SEND_FAIL = 231;
    public static final int FILE_TRANSFER_NO_INIT = 232;

    @NotNull
    public static final yo3 INSTANCE = new yo3();
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 14;
    public static final int MESSAGE_TOO_LARGE = 26;
    public static final int NODE_NOT_CONNECTED = 6;
    public static final int NODE_NOT_MATCH = 25;
    public static final int PERMISSION_DENIAL = 2041;
    public static final int PERMISSION_MISSING = 2042;
    public static final int SDK_NOT_INIT = 5000;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_MISSING = 4;
    public static final int SIGNATURE_FAIL = 27;
    public static final int START_ACTIVITY_NOTIFY = 30;
    public static final int SUCCESS = 0;
    public static final int TARGET_ALREADY_INSTALLED = 21;
    public static final int TARGET_APP_MISSING = 20;
    public static final int TARGET_NOT_BIND = 28;
    public static final int TARGET_NOT_REGISTER = 29;
    public static final int TARGET_PACKAGE_NAME_FAIL = 22;
    public static final int TARGET_PACKAGE_NAME_MISSING = 23;
    public static final int TARGET_SIGNATURE_MISSING = 24;
    public static final int TIMEOUT = 15;
    public static final int TO_EXERCISE_LISTENER_MISSING = 35;
    public static final int TO_SIGNATURE_FAIL = 33;
    public static final int UNKNOWN_COMMAND = 100;
    public static final int USER_LOCKED = 34;
    public static final int WEAR_OS_VERSION_TOO_LOW = 2032;
    public static final int WES_DISCONNECTED = 3020;
    public static final int WES_INTERRUPTED = 3014;
    public static final int WES_SELF_VERSION_TOO_LOW = 2030;
    public static final int WES_TARGET_VERSION_TOO_LOW = 2031;
    public static final int WES_TIMEOUT = 3015;

    @JvmStatic
    @NotNull
    public static final String a(int code) {
        if (code == 0) {
            return "SUCCESS";
        }
        if (code != 6) {
            if (code == 3) {
                return "SERVICE_DISABLED: " + code;
            }
            if (code == 4) {
                return "SERVICE_MISSING: " + code;
            }
            if (code == 14) {
                return "INTERRUPTED: " + code;
            }
            if (code == 15) {
                return "TIMEOUT: " + code;
            }
            if (code == 208) {
                return "FILE_ERROR_PEER_AGENT_BUSY: " + code;
            }
            if (code == 209) {
                return "FILE_ERROR_PEER_AGENT_REJECTED: " + code;
            }
            if (code == 2014) {
                return "API_INTERRUPTED: " + code;
            }
            if (code == 2015) {
                return "API_TIMEOUT: " + code;
            }
            switch (code) {
                case 6:
                    break;
                case 8:
                    return "INTERNAL_ERROR: " + code;
                case 20:
                    return "TARGET_APP_MISSING: " + code;
                case 21:
                    return "TARGET_ALREADY_INSTALLED: " + code;
                case 22:
                    return "TARGET_PACKAGE_NAME_FAIL: " + code;
                case 23:
                    return "TARGET_PACKAGE_NAME_MISSING: " + code;
                case 24:
                    return "TARGET_SIGNATURE_MISSING: " + code;
                case 25:
                    return "NODE_NOT_MATCH: " + code;
                case 26:
                    return "MESSAGE_TOO_LARGE: " + code;
                case 27:
                    return "SIGNATURE_FAIL: " + code;
                case 28:
                    return "TARGET_NOT_BIND: " + code;
                case 29:
                    return "TARGET_NOT_REGISTER: " + code;
                case 30:
                    return "START_ACTIVITY_NOTIFY: " + code;
                case 31:
                    return "ACTIVITY_NOT_FOUND_EXCEPTION: " + code;
                case 32:
                    return "BIND_SERVICE_FAIL: " + code;
                case 33:
                    return "TO_SIGNATURE_FAIL: " + code;
                case 100:
                    return "UNKNOWN_COMMAND: " + code;
                case 221:
                    return "FILE_ERROR_FATAL: " + code;
                case 2001:
                    return "BINDER_SERVICE_FAIL: " + code;
                case 2020:
                    return "API_DISCONNECTED: " + code;
                case PERMISSION_DENIAL /* 2041 */:
                    return "PERMISSION_DENIAL: " + code;
                case PERMISSION_MISSING /* 2042 */:
                    return "PERMISSION_MISSING: " + code;
                case 3014:
                    return "WES_INTERRUPTED: " + code;
                case WES_TIMEOUT /* 3015 */:
                    return "WES_TIMEOUT: " + code;
                case WES_DISCONNECTED /* 3020 */:
                    return "WES_DISCONNECTED: " + code;
                case 5000:
                    return "SDK_NOT_INIT: " + code;
                default:
                    switch (code) {
                        case 200:
                            return "FILE_ERROR_REQUEST_NOT_QUEUED: " + code;
                        case 201:
                            return "FILE_ERROR_CHANNEL_IO: " + code;
                        case 202:
                            return "FILE_ERROR_FILE_IO: " + code;
                        case 203:
                            return "FILE_ERROR_COMMAND_DROPPED: " + code;
                        case 204:
                            return "FILE_ERROR_PEER_AGENT_NO_RESPONSE: " + code;
                        case 205:
                            return "FILE_ERROR_CONNECTION_LOST: " + code;
                        default:
                            switch (code) {
                                case 211:
                                    return "FILE_ERROR_SPACE_NOT_AVAILABLE: " + code;
                                case 212:
                                    return "FILE_ERROR_NOT_SUPPORTED: " + code;
                                case 213:
                                    return "FILE_ERROR_TRANSACTION_NOT_FOUND: " + code;
                                default:
                                    switch (code) {
                                        case FILE_SEND_FAIL /* 231 */:
                                            return "FILE_SEND_FAIL: " + code;
                                        case 232:
                                            return "FILE_TRANSFER_NO_INIT: " + code;
                                        case 233:
                                            return "FILE_CANCEL_FAIL: " + code;
                                        default:
                                            switch (code) {
                                                case 1001:
                                                    return "AUTH_AUTHENTICATE_SUCCESS: " + code;
                                                case 1002:
                                                    return "AUTH_AUTHENTICATE_FAIL: " + code;
                                                case 1003:
                                                    return "AUTH_TIME_EXPIRED: " + code;
                                                case 1004:
                                                    return "AUTH_AUTHCODE_EXPECTED: " + code;
                                                case 1005:
                                                    return "AUTH_VERSION_INCOMPATIBLE: " + code;
                                                case 1006:
                                                    return "AUTH_AUTHCODE_RECYCLE: " + code;
                                                case 1007:
                                                    return "AUTH_AUTHCODE_INVALID: " + code;
                                                case 1008:
                                                    return "AUTH_CAPABILITY_EXCEPTION: " + code;
                                                case 1009:
                                                    return "AUTH_STATUS_EXCEPTION: " + code;
                                                case 1010:
                                                    return "AUTH_INTERNAL_EXCEPTION: " + code;
                                                case 1011:
                                                    return "AUTH_PERMISSION_DENIAL: " + code;
                                                default:
                                                    switch (code) {
                                                        case WES_SELF_VERSION_TOO_LOW /* 2030 */:
                                                            return "WES_SELF_VERSION_TOO_LOW: " + code;
                                                        case WES_TARGET_VERSION_TOO_LOW /* 2031 */:
                                                            return "WES_TARGET_VERSION_TOO_LOW: " + code;
                                                        case WEAR_OS_VERSION_TOO_LOW /* 2032 */:
                                                            return "WEAR_OS_VERSION_TOO_LOW: " + code;
                                                        default:
                                                            return "UNKNOWN STATUS CODE: " + code;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return "NODE_NOT_CONNECTED: " + code;
    }
}
