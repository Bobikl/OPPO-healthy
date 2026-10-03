package com.oplus.pantaconnect.sdk;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum ErrorCode implements ProtocolMessageEnum {
    ERROR_CODE_UNKNOWN(0),
    ERROR_CODE_FOR_DISCOVERY(1),
    ERROR_CODE_FOR_CONNECTION(2),
    ERROR_CODE_FOR_TRANSPORT(3),
    ERROR_CODE_FOR_DATA_BUS(4),
    ERROR_CODE_FOR_DEVICE_MANAGER(5),
    ERROR_CODE_FOR_NETWORK_MANAGER(6),
    UNRECOGNIZED(-1);

    public static final int ERROR_CODE_FOR_CONNECTION_VALUE = 2;
    public static final int ERROR_CODE_FOR_DATA_BUS_VALUE = 4;
    public static final int ERROR_CODE_FOR_DEVICE_MANAGER_VALUE = 5;
    public static final int ERROR_CODE_FOR_DISCOVERY_VALUE = 1;
    public static final int ERROR_CODE_FOR_NETWORK_MANAGER_VALUE = 6;
    public static final int ERROR_CODE_FOR_TRANSPORT_VALUE = 3;
    public static final int ERROR_CODE_UNKNOWN_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<ErrorCode> internalValueMap = new Internal.EnumLiteMap<ErrorCode>() { // from class: com.oplus.pantaconnect.sdk.ErrorCode.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ErrorCode findValueByNumber(int i) {
            return ErrorCode.forNumber(i);
        }
    };
    private static final ErrorCode[] VALUES = values();

    ErrorCode(int i) {
        this.value = i;
    }

    public static ErrorCode forNumber(int i) {
        switch (i) {
            case 0:
                return ERROR_CODE_UNKNOWN;
            case 1:
                return ERROR_CODE_FOR_DISCOVERY;
            case 2:
                return ERROR_CODE_FOR_CONNECTION;
            case 3:
                return ERROR_CODE_FOR_TRANSPORT;
            case 4:
                return ERROR_CODE_FOR_DATA_BUS;
            case 5:
                return ERROR_CODE_FOR_DEVICE_MANAGER;
            case 6:
                return ERROR_CODE_FOR_NETWORK_MANAGER;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Results.getDescriptor().getEnumTypes().get(1);
    }

    public static Internal.EnumLiteMap<ErrorCode> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static ErrorCode valueOf(int i) {
        return forNumber(i);
    }

    public static ErrorCode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
