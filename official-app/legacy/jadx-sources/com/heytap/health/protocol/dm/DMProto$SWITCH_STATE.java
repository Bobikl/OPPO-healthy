package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$SWITCH_STATE implements Internal.EnumLite {
    SWITCH_STATE_CLOSE(0),
    SWITCH_STATE_OPEN(1),
    UNRECOGNIZED(-1);

    public static final int SWITCH_STATE_CLOSE_VALUE = 0;
    public static final int SWITCH_STATE_OPEN_VALUE = 1;
    private static final Internal.EnumLiteMap<DMProto$SWITCH_STATE> internalValueMap = new Internal.EnumLiteMap<DMProto$SWITCH_STATE>() { // from class: com.heytap.health.protocol.dm.DMProto$SWITCH_STATE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$SWITCH_STATE findValueByNumber(int i) {
            return DMProto$SWITCH_STATE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$SWITCH_STATE.forNumber(i) != null;
        }
    }

    DMProto$SWITCH_STATE(int i) {
        this.value = i;
    }

    public static DMProto$SWITCH_STATE forNumber(int i) {
        if (i == 0) {
            return SWITCH_STATE_CLOSE;
        }
        if (i != 1) {
            return null;
        }
        return SWITCH_STATE_OPEN;
    }

    public static Internal.EnumLiteMap<DMProto$SWITCH_STATE> internalGetValueMap() {
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
    public static DMProto$SWITCH_STATE valueOf(int i) {
        return forNumber(i);
    }
}
