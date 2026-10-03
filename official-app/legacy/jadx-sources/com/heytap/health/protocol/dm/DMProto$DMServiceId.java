package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$DMServiceId implements Internal.EnumLite {
    SID_DM_UNDEFINE(0),
    SID_DM(1),
    UNRECOGNIZED(-1);

    public static final int SID_DM_UNDEFINE_VALUE = 0;
    public static final int SID_DM_VALUE = 1;
    private static final Internal.EnumLiteMap<DMProto$DMServiceId> internalValueMap = new Internal.EnumLiteMap<DMProto$DMServiceId>() { // from class: com.heytap.health.protocol.dm.DMProto$DMServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$DMServiceId findValueByNumber(int i) {
            return DMProto$DMServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$DMServiceId.forNumber(i) != null;
        }
    }

    DMProto$DMServiceId(int i) {
        this.value = i;
    }

    public static DMProto$DMServiceId forNumber(int i) {
        if (i == 0) {
            return SID_DM_UNDEFINE;
        }
        if (i != 1) {
            return null;
        }
        return SID_DM;
    }

    public static Internal.EnumLiteMap<DMProto$DMServiceId> internalGetValueMap() {
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
    public static DMProto$DMServiceId valueOf(int i) {
        return forNumber(i);
    }
}
