package com.oppo.wear.wallet.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes9.dex */
public enum IccoaDkfConstant$ICCOAErrorCode implements Internal.EnumLite {
    ICCOA_ERROR_CODE_SUCCESS(0),
    ICCOA_ERROR_CODE_UNKNOWN_ERROR(-1),
    ICCOA_ERROR_CODE_ILLEGAL_ARGUMENT(20000),
    ICCOA_ERROR_CODE_IN_PROGRESS(20001),
    ICCOA_ERROR_CODE_TIMEOUT(20002),
    ICCOA_ERROR_CODE_DEVICE_UNSUPPORTED(20010),
    ICCOA_ERROR_CODE_VERSION_UNSUPPORTED(20011),
    ICCOA_ERROR_CODE_NETWORK_UNAVAILABLE(20012),
    ICCOA_ERROR_CODE_BLUETOOTH_UNAVAILABLE(20013),
    ICCOA_ERROR_CODE_BLUETOOTH_INTERACTIVE_MESSAGE_RETURNS_ERROR_CODE(20014),
    ICCOA_ERROR_CODE_NOT_AUTHED(20020),
    ICCOA_ERROR_CODE_PERMISSION_DENY(20021),
    ICCOA_ERROR_CODE_NOT_AGREEING_USER_AGREEMENT(20022),
    ICCOA_ERROR_CODE_KEY_NOT_EXIST(20100),
    ICCOA_ERROR_CODE_KEY_UNAVAILABLE(20101),
    ICCOA_ERROR_CODE_KEY_FUNCTION_IS_NOT_ENABLED(20102),
    ICCOA_ERROR_CODE_KEY_FUNCTION_ACTIVATED(20103),
    ICCOA_ERROR_CODE_FRIEND_KEY_HAS_EXPIRED(20104),
    ICCOA_ERROR_CODE_BLUETOOTH_CONNECTION_FAILED(30001),
    ICCOA_ERROR_CODE_BLUETOOTH_CONNECTION_IS_DISCONNECTED(30002),
    ICCOA_ERROR_CODE_APPLET_BUSY(30003),
    UNRECOGNIZED(-1);

    public static final int ICCOA_ERROR_CODE_APPLET_BUSY_VALUE = 30003;
    public static final int ICCOA_ERROR_CODE_BLUETOOTH_CONNECTION_FAILED_VALUE = 30001;
    public static final int ICCOA_ERROR_CODE_BLUETOOTH_CONNECTION_IS_DISCONNECTED_VALUE = 30002;
    public static final int ICCOA_ERROR_CODE_BLUETOOTH_INTERACTIVE_MESSAGE_RETURNS_ERROR_CODE_VALUE = 20014;
    public static final int ICCOA_ERROR_CODE_BLUETOOTH_UNAVAILABLE_VALUE = 20013;
    public static final int ICCOA_ERROR_CODE_DEVICE_UNSUPPORTED_VALUE = 20010;
    public static final int ICCOA_ERROR_CODE_FRIEND_KEY_HAS_EXPIRED_VALUE = 20104;
    public static final int ICCOA_ERROR_CODE_ILLEGAL_ARGUMENT_VALUE = 20000;
    public static final int ICCOA_ERROR_CODE_IN_PROGRESS_VALUE = 20001;
    public static final int ICCOA_ERROR_CODE_KEY_FUNCTION_ACTIVATED_VALUE = 20103;
    public static final int ICCOA_ERROR_CODE_KEY_FUNCTION_IS_NOT_ENABLED_VALUE = 20102;
    public static final int ICCOA_ERROR_CODE_KEY_NOT_EXIST_VALUE = 20100;
    public static final int ICCOA_ERROR_CODE_KEY_UNAVAILABLE_VALUE = 20101;
    public static final int ICCOA_ERROR_CODE_NETWORK_UNAVAILABLE_VALUE = 20012;
    public static final int ICCOA_ERROR_CODE_NOT_AGREEING_USER_AGREEMENT_VALUE = 20022;
    public static final int ICCOA_ERROR_CODE_NOT_AUTHED_VALUE = 20020;
    public static final int ICCOA_ERROR_CODE_PERMISSION_DENY_VALUE = 20021;
    public static final int ICCOA_ERROR_CODE_SUCCESS_VALUE = 0;
    public static final int ICCOA_ERROR_CODE_TIMEOUT_VALUE = 20002;
    public static final int ICCOA_ERROR_CODE_UNKNOWN_ERROR_VALUE = -1;
    public static final int ICCOA_ERROR_CODE_VERSION_UNSUPPORTED_VALUE = 20011;
    private static final Internal.EnumLiteMap<IccoaDkfConstant$ICCOAErrorCode> internalValueMap = new Internal.EnumLiteMap<IccoaDkfConstant$ICCOAErrorCode>() { // from class: com.oppo.wear.wallet.proto.IccoaDkfConstant$ICCOAErrorCode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IccoaDkfConstant$ICCOAErrorCode findValueByNumber(int i) {
            return IccoaDkfConstant$ICCOAErrorCode.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return IccoaDkfConstant$ICCOAErrorCode.forNumber(i) != null;
        }
    }

    IccoaDkfConstant$ICCOAErrorCode(int i) {
        this.value = i;
    }

    public static IccoaDkfConstant$ICCOAErrorCode forNumber(int i) {
        if (i == -1) {
            return ICCOA_ERROR_CODE_UNKNOWN_ERROR;
        }
        if (i == 0) {
            return ICCOA_ERROR_CODE_SUCCESS;
        }
        switch (i) {
            case 20000:
                return ICCOA_ERROR_CODE_ILLEGAL_ARGUMENT;
            case 20001:
                return ICCOA_ERROR_CODE_IN_PROGRESS;
            case 20002:
                return ICCOA_ERROR_CODE_TIMEOUT;
            default:
                switch (i) {
                    case 20010:
                        return ICCOA_ERROR_CODE_DEVICE_UNSUPPORTED;
                    case 20011:
                        return ICCOA_ERROR_CODE_VERSION_UNSUPPORTED;
                    case 20012:
                        return ICCOA_ERROR_CODE_NETWORK_UNAVAILABLE;
                    case 20013:
                        return ICCOA_ERROR_CODE_BLUETOOTH_UNAVAILABLE;
                    case 20014:
                        return ICCOA_ERROR_CODE_BLUETOOTH_INTERACTIVE_MESSAGE_RETURNS_ERROR_CODE;
                    default:
                        switch (i) {
                            case 20020:
                                return ICCOA_ERROR_CODE_NOT_AUTHED;
                            case 20021:
                                return ICCOA_ERROR_CODE_PERMISSION_DENY;
                            case 20022:
                                return ICCOA_ERROR_CODE_NOT_AGREEING_USER_AGREEMENT;
                            default:
                                switch (i) {
                                    case 20100:
                                        return ICCOA_ERROR_CODE_KEY_NOT_EXIST;
                                    case 20101:
                                        return ICCOA_ERROR_CODE_KEY_UNAVAILABLE;
                                    case 20102:
                                        return ICCOA_ERROR_CODE_KEY_FUNCTION_IS_NOT_ENABLED;
                                    case 20103:
                                        return ICCOA_ERROR_CODE_KEY_FUNCTION_ACTIVATED;
                                    case 20104:
                                        return ICCOA_ERROR_CODE_FRIEND_KEY_HAS_EXPIRED;
                                    default:
                                        switch (i) {
                                            case 30001:
                                                return ICCOA_ERROR_CODE_BLUETOOTH_CONNECTION_FAILED;
                                            case 30002:
                                                return ICCOA_ERROR_CODE_BLUETOOTH_CONNECTION_IS_DISCONNECTED;
                                            case 30003:
                                                return ICCOA_ERROR_CODE_APPLET_BUSY;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    public static Internal.EnumLiteMap<IccoaDkfConstant$ICCOAErrorCode> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static IccoaDkfConstant$ICCOAErrorCode valueOf(int i) {
        return forNumber(i);
    }
}
