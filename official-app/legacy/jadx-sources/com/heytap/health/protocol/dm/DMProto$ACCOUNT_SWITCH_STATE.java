package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$ACCOUNT_SWITCH_STATE implements Internal.EnumLite {
    STATE_CLOSE(0),
    STATE_OPEN(1),
    UNRECOGNIZED(-1);

    public static final int STATE_CLOSE_VALUE = 0;
    public static final int STATE_OPEN_VALUE = 1;
    private static final Internal.EnumLiteMap<DMProto$ACCOUNT_SWITCH_STATE> internalValueMap = new Internal.EnumLiteMap<DMProto$ACCOUNT_SWITCH_STATE>() { // from class: com.heytap.health.protocol.dm.DMProto$ACCOUNT_SWITCH_STATE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$ACCOUNT_SWITCH_STATE findValueByNumber(int i) {
            return DMProto$ACCOUNT_SWITCH_STATE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$ACCOUNT_SWITCH_STATE.forNumber(i) != null;
        }
    }

    DMProto$ACCOUNT_SWITCH_STATE(int i) {
        this.value = i;
    }

    public static DMProto$ACCOUNT_SWITCH_STATE forNumber(int i) {
        if (i == 0) {
            return STATE_CLOSE;
        }
        if (i != 1) {
            return null;
        }
        return STATE_OPEN;
    }

    public static Internal.EnumLiteMap<DMProto$ACCOUNT_SWITCH_STATE> internalGetValueMap() {
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
    public static DMProto$ACCOUNT_SWITCH_STATE valueOf(int i) {
        return forNumber(i);
    }
}
