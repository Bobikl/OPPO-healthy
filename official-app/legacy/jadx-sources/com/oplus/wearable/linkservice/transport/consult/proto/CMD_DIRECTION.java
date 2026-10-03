package com.oplus.wearable.linkservice.transport.consult.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes5.dex */
public enum CMD_DIRECTION implements Internal.EnumLite {
    CMD_REQUEST(0),
    CMD_RESPONSE(1),
    UNRECOGNIZED(-1);

    public static final int CMD_REQUEST_VALUE = 0;
    public static final int CMD_RESPONSE_VALUE = 1;
    private static final Internal.EnumLiteMap<CMD_DIRECTION> internalValueMap = new Internal.EnumLiteMap<CMD_DIRECTION>() { // from class: com.oplus.wearable.linkservice.transport.consult.proto.CMD_DIRECTION.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public CMD_DIRECTION findValueByNumber(int i) {
            return CMD_DIRECTION.forNumber(i);
        }
    };
    private final int value;

    public static final class CMD_DIRECTIONVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new CMD_DIRECTIONVerifier();

        private CMD_DIRECTIONVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return CMD_DIRECTION.forNumber(i) != null;
        }
    }

    CMD_DIRECTION(int i) {
        this.value = i;
    }

    public static CMD_DIRECTION forNumber(int i) {
        if (i == 0) {
            return CMD_REQUEST;
        }
        if (i != 1) {
            return null;
        }
        return CMD_RESPONSE;
    }

    public static Internal.EnumLiteMap<CMD_DIRECTION> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return CMD_DIRECTIONVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CMD_DIRECTION valueOf(int i) {
        return forNumber(i);
    }
}
