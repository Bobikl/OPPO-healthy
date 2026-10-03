package com.oplus.pantaconnect.connection;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.oplus.aiunit.vision.p1i;

/* JADX INFO: loaded from: classes8.dex */
public enum SocketState implements ProtocolMessageEnum {
    SOCKET_INVALID(0),
    SOCKET_SPEED_TESTING(1),
    SOCKET_QOS_AVAILABLE(2),
    UNRECOGNIZED(-1);

    public static final int SOCKET_INVALID_VALUE = 0;
    public static final int SOCKET_QOS_AVAILABLE_VALUE = 2;
    public static final int SOCKET_SPEED_TESTING_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<SocketState> internalValueMap = new Internal.EnumLiteMap<SocketState>() { // from class: com.oplus.pantaconnect.connection.SocketState.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SocketState findValueByNumber(int i) {
            return SocketState.forNumber(i);
        }
    };
    private static final SocketState[] VALUES = values();

    SocketState(int i) {
        this.value = i;
    }

    public static SocketState forNumber(int i) {
        if (i == 0) {
            return SOCKET_INVALID;
        }
        if (i == 1) {
            return SOCKET_SPEED_TESTING;
        }
        if (i != 2) {
            return null;
        }
        return SOCKET_QOS_AVAILABLE;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return p1i.a().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<SocketState> internalGetValueMap() {
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
    public static SocketState valueOf(int i) {
        return forNumber(i);
    }

    public static SocketState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
