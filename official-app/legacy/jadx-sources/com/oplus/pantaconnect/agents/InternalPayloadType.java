package com.oplus.pantaconnect.agents;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum InternalPayloadType implements ProtocolMessageEnum {
    BYTES(0),
    STREAM(1),
    FILE(2),
    UNRECOGNIZED(-1);

    public static final int BYTES_VALUE = 0;
    public static final int FILE_VALUE = 2;
    public static final int STREAM_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<InternalPayloadType> internalValueMap = new Internal.EnumLiteMap<InternalPayloadType>() { // from class: com.oplus.pantaconnect.agents.InternalPayloadType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public InternalPayloadType findValueByNumber(int i) {
            return InternalPayloadType.forNumber(i);
        }
    };
    private static final InternalPayloadType[] VALUES = values();

    InternalPayloadType(int i) {
        this.value = i;
    }

    public static InternalPayloadType forNumber(int i) {
        if (i == 0) {
            return BYTES;
        }
        if (i == 1) {
            return STREAM;
        }
        if (i != 2) {
            return null;
        }
        return FILE;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Agents.getDescriptor().getEnumTypes().get(4);
    }

    public static Internal.EnumLiteMap<InternalPayloadType> internalGetValueMap() {
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
    public static InternalPayloadType valueOf(int i) {
        return forNumber(i);
    }

    public static InternalPayloadType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
