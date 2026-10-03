package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$RESET_TYPE implements Internal.EnumLite {
    TYPE_NORMAL(0),
    TYPE_CLEAR(1),
    TYPE_NOT_CLEAR(2),
    UNRECOGNIZED(-1);

    public static final int TYPE_CLEAR_VALUE = 1;
    public static final int TYPE_NORMAL_VALUE = 0;
    public static final int TYPE_NOT_CLEAR_VALUE = 2;
    private static final Internal.EnumLiteMap<DMProto$RESET_TYPE> internalValueMap = new Internal.EnumLiteMap<DMProto$RESET_TYPE>() { // from class: com.heytap.health.protocol.dm.DMProto$RESET_TYPE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$RESET_TYPE findValueByNumber(int i) {
            return DMProto$RESET_TYPE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$RESET_TYPE.forNumber(i) != null;
        }
    }

    DMProto$RESET_TYPE(int i) {
        this.value = i;
    }

    public static DMProto$RESET_TYPE forNumber(int i) {
        if (i == 0) {
            return TYPE_NORMAL;
        }
        if (i == 1) {
            return TYPE_CLEAR;
        }
        if (i != 2) {
            return null;
        }
        return TYPE_NOT_CLEAR;
    }

    public static Internal.EnumLiteMap<DMProto$RESET_TYPE> internalGetValueMap() {
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
    public static DMProto$RESET_TYPE valueOf(int i) {
        return forNumber(i);
    }
}
