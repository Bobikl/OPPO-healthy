package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$LINKAGE_PHONE implements Internal.EnumLite {
    UNLINKAGE(0),
    LINKAGE(1),
    UNRECOGNIZED(-1);

    public static final int LINKAGE_VALUE = 1;
    public static final int UNLINKAGE_VALUE = 0;
    private static final Internal.EnumLiteMap<DMProto$LINKAGE_PHONE> internalValueMap = new Internal.EnumLiteMap<DMProto$LINKAGE_PHONE>() { // from class: com.heytap.health.protocol.dm.DMProto$LINKAGE_PHONE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$LINKAGE_PHONE findValueByNumber(int i) {
            return DMProto$LINKAGE_PHONE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$LINKAGE_PHONE.forNumber(i) != null;
        }
    }

    DMProto$LINKAGE_PHONE(int i) {
        this.value = i;
    }

    public static DMProto$LINKAGE_PHONE forNumber(int i) {
        if (i == 0) {
            return UNLINKAGE;
        }
        if (i != 1) {
            return null;
        }
        return LINKAGE;
    }

    public static Internal.EnumLiteMap<DMProto$LINKAGE_PHONE> internalGetValueMap() {
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
    public static DMProto$LINKAGE_PHONE valueOf(int i) {
        return forNumber(i);
    }
}
