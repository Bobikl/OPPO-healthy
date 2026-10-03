package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$KEEP_ALIVE_TYPE implements Internal.EnumLite {
    NONE_KEEP_ALIVE(0),
    KEEP_ALIVE(1),
    UNRECOGNIZED(-1);

    public static final int KEEP_ALIVE_VALUE = 1;
    public static final int NONE_KEEP_ALIVE_VALUE = 0;
    private static final Internal.EnumLiteMap<DMProto$KEEP_ALIVE_TYPE> internalValueMap = new Internal.EnumLiteMap<DMProto$KEEP_ALIVE_TYPE>() { // from class: com.heytap.health.protocol.dm.DMProto$KEEP_ALIVE_TYPE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$KEEP_ALIVE_TYPE findValueByNumber(int i) {
            return DMProto$KEEP_ALIVE_TYPE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$KEEP_ALIVE_TYPE.forNumber(i) != null;
        }
    }

    DMProto$KEEP_ALIVE_TYPE(int i) {
        this.value = i;
    }

    public static DMProto$KEEP_ALIVE_TYPE forNumber(int i) {
        if (i == 0) {
            return NONE_KEEP_ALIVE;
        }
        if (i != 1) {
            return null;
        }
        return KEEP_ALIVE;
    }

    public static Internal.EnumLiteMap<DMProto$KEEP_ALIVE_TYPE> internalGetValueMap() {
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
    public static DMProto$KEEP_ALIVE_TYPE valueOf(int i) {
        return forNumber(i);
    }
}
