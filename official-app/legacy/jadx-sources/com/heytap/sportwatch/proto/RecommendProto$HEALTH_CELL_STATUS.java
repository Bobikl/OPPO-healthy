package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$HEALTH_CELL_STATUS implements Internal.EnumLite {
    HEALTH_NULL(0),
    HEALTH_POOR(1),
    HEALTH_NORMAL(2),
    HEALTH_GOOD(3),
    HEALTH_EXCELLENT(4),
    HEALTH_OVER(5),
    UNRECOGNIZED(-1);

    public static final int HEALTH_EXCELLENT_VALUE = 4;
    public static final int HEALTH_GOOD_VALUE = 3;
    public static final int HEALTH_NORMAL_VALUE = 2;
    public static final int HEALTH_NULL_VALUE = 0;
    public static final int HEALTH_OVER_VALUE = 5;
    public static final int HEALTH_POOR_VALUE = 1;
    private static final Internal.EnumLiteMap<RecommendProto$HEALTH_CELL_STATUS> internalValueMap = new Internal.EnumLiteMap<RecommendProto$HEALTH_CELL_STATUS>() { // from class: com.heytap.sportwatch.proto.RecommendProto$HEALTH_CELL_STATUS.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$HEALTH_CELL_STATUS findValueByNumber(int i) {
            return RecommendProto$HEALTH_CELL_STATUS.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$HEALTH_CELL_STATUS.forNumber(i) != null;
        }
    }

    RecommendProto$HEALTH_CELL_STATUS(int i) {
        this.value = i;
    }

    public static RecommendProto$HEALTH_CELL_STATUS forNumber(int i) {
        if (i == 0) {
            return HEALTH_NULL;
        }
        if (i == 1) {
            return HEALTH_POOR;
        }
        if (i == 2) {
            return HEALTH_NORMAL;
        }
        if (i == 3) {
            return HEALTH_GOOD;
        }
        if (i == 4) {
            return HEALTH_EXCELLENT;
        }
        if (i != 5) {
            return null;
        }
        return HEALTH_OVER;
    }

    public static Internal.EnumLiteMap<RecommendProto$HEALTH_CELL_STATUS> internalGetValueMap() {
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
    public static RecommendProto$HEALTH_CELL_STATUS valueOf(int i) {
        return forNumber(i);
    }
}
