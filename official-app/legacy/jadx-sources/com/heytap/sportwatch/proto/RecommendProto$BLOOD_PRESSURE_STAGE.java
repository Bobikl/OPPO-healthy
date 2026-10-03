package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$BLOOD_PRESSURE_STAGE implements Internal.EnumLite {
    BLOOD_PRESSURE_NULL(0),
    BLOOD_PRESSURE_KNOWN(1),
    BLOOD_PRESSURE_SUSPECTED(2),
    BLOOD_PRESSURE_NOT_FOUND(3),
    UNRECOGNIZED(-1);

    public static final int BLOOD_PRESSURE_KNOWN_VALUE = 1;
    public static final int BLOOD_PRESSURE_NOT_FOUND_VALUE = 3;
    public static final int BLOOD_PRESSURE_NULL_VALUE = 0;
    public static final int BLOOD_PRESSURE_SUSPECTED_VALUE = 2;
    private static final Internal.EnumLiteMap<RecommendProto$BLOOD_PRESSURE_STAGE> internalValueMap = new Internal.EnumLiteMap<RecommendProto$BLOOD_PRESSURE_STAGE>() { // from class: com.heytap.sportwatch.proto.RecommendProto$BLOOD_PRESSURE_STAGE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$BLOOD_PRESSURE_STAGE findValueByNumber(int i) {
            return RecommendProto$BLOOD_PRESSURE_STAGE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$BLOOD_PRESSURE_STAGE.forNumber(i) != null;
        }
    }

    RecommendProto$BLOOD_PRESSURE_STAGE(int i) {
        this.value = i;
    }

    public static RecommendProto$BLOOD_PRESSURE_STAGE forNumber(int i) {
        if (i == 0) {
            return BLOOD_PRESSURE_NULL;
        }
        if (i == 1) {
            return BLOOD_PRESSURE_KNOWN;
        }
        if (i == 2) {
            return BLOOD_PRESSURE_SUSPECTED;
        }
        if (i != 3) {
            return null;
        }
        return BLOOD_PRESSURE_NOT_FOUND;
    }

    public static Internal.EnumLiteMap<RecommendProto$BLOOD_PRESSURE_STAGE> internalGetValueMap() {
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
    public static RecommendProto$BLOOD_PRESSURE_STAGE valueOf(int i) {
        return forNumber(i);
    }
}
