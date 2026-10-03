package com.oplus.pantaconnect.sdk;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum ResultCode implements ProtocolMessageEnum {
    UNKNOWN(0),
    SUCCESS(1),
    ERROR(2),
    CANCELLED(3),
    UNRECOGNIZED(-1);

    public static final int CANCELLED_VALUE = 3;
    public static final int ERROR_VALUE = 2;
    public static final int SUCCESS_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<ResultCode> internalValueMap = new Internal.EnumLiteMap<ResultCode>() { // from class: com.oplus.pantaconnect.sdk.ResultCode.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ResultCode findValueByNumber(int i) {
            return ResultCode.forNumber(i);
        }
    };
    private static final ResultCode[] VALUES = values();

    ResultCode(int i) {
        this.value = i;
    }

    public static ResultCode forNumber(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return ERROR;
        }
        if (i != 3) {
            return null;
        }
        return CANCELLED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Results.getDescriptor().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<ResultCode> internalGetValueMap() {
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
    public static ResultCode valueOf(int i) {
        return forNumber(i);
    }

    public static ResultCode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
