package com.heytap.wearable.btnet.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum SocketDataType implements Internal.EnumLite {
    UNKNOWN_SOCKET_DATA_TYPE(0),
    TCP(1),
    UDP(2),
    UNRECOGNIZED(-1);

    public static final int TCP_VALUE = 1;
    public static final int UDP_VALUE = 2;
    public static final int UNKNOWN_SOCKET_DATA_TYPE_VALUE = 0;
    private static final Internal.EnumLiteMap<SocketDataType> internalValueMap = new Internal.EnumLiteMap<SocketDataType>() { // from class: com.heytap.wearable.btnet.proto.SocketDataType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public SocketDataType findValueByNumber(int i) {
            return SocketDataType.forNumber(i);
        }
    };
    private final int value;

    public static final class SocketDataTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SocketDataTypeVerifier();

        private SocketDataTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SocketDataType.forNumber(i) != null;
        }
    }

    SocketDataType(int i) {
        this.value = i;
    }

    public static SocketDataType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_SOCKET_DATA_TYPE;
        }
        if (i == 1) {
            return TCP;
        }
        if (i != 2) {
            return null;
        }
        return UDP;
    }

    public static Internal.EnumLiteMap<SocketDataType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SocketDataTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static SocketDataType valueOf(int i) {
        return forNumber(i);
    }
}
