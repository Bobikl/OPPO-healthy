package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$BASE_CELL_ID implements Internal.EnumLite {
    B_NULL(0),
    WRIST_TEMP(1),
    OXYGEN(2),
    MENSTRUAL(3),
    BLOOD_PRESSURE(4),
    UNRECOGNIZED(-1);

    public static final int BLOOD_PRESSURE_VALUE = 4;
    public static final int B_NULL_VALUE = 0;
    public static final int MENSTRUAL_VALUE = 3;
    public static final int OXYGEN_VALUE = 2;
    public static final int WRIST_TEMP_VALUE = 1;
    private static final Internal.EnumLiteMap<RecommendProto$BASE_CELL_ID> internalValueMap = new Internal.EnumLiteMap<RecommendProto$BASE_CELL_ID>() { // from class: com.heytap.sportwatch.proto.RecommendProto$BASE_CELL_ID.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$BASE_CELL_ID findValueByNumber(int i) {
            return RecommendProto$BASE_CELL_ID.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$BASE_CELL_ID.forNumber(i) != null;
        }
    }

    RecommendProto$BASE_CELL_ID(int i) {
        this.value = i;
    }

    public static RecommendProto$BASE_CELL_ID forNumber(int i) {
        if (i == 0) {
            return B_NULL;
        }
        if (i == 1) {
            return WRIST_TEMP;
        }
        if (i == 2) {
            return OXYGEN;
        }
        if (i == 3) {
            return MENSTRUAL;
        }
        if (i != 4) {
            return null;
        }
        return BLOOD_PRESSURE;
    }

    public static Internal.EnumLiteMap<RecommendProto$BASE_CELL_ID> internalGetValueMap() {
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
    public static RecommendProto$BASE_CELL_ID valueOf(int i) {
        return forNumber(i);
    }
}
