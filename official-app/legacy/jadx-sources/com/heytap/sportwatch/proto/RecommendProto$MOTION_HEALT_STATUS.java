package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$MOTION_HEALT_STATUS implements Internal.EnumLite {
    H_NULL(0),
    REAL_POOR(1),
    POOR(2),
    NORMAL(3),
    GOOD(4),
    EXCELLENT(5),
    UNRECOGNIZED(-1);

    public static final int EXCELLENT_VALUE = 5;
    public static final int GOOD_VALUE = 4;
    public static final int H_NULL_VALUE = 0;
    public static final int NORMAL_VALUE = 3;
    public static final int POOR_VALUE = 2;
    public static final int REAL_POOR_VALUE = 1;
    private static final Internal.EnumLiteMap<RecommendProto$MOTION_HEALT_STATUS> internalValueMap = new Internal.EnumLiteMap<RecommendProto$MOTION_HEALT_STATUS>() { // from class: com.heytap.sportwatch.proto.RecommendProto$MOTION_HEALT_STATUS.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$MOTION_HEALT_STATUS findValueByNumber(int i) {
            return RecommendProto$MOTION_HEALT_STATUS.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$MOTION_HEALT_STATUS.forNumber(i) != null;
        }
    }

    RecommendProto$MOTION_HEALT_STATUS(int i) {
        this.value = i;
    }

    public static RecommendProto$MOTION_HEALT_STATUS forNumber(int i) {
        if (i == 0) {
            return H_NULL;
        }
        if (i == 1) {
            return REAL_POOR;
        }
        if (i == 2) {
            return POOR;
        }
        if (i == 3) {
            return NORMAL;
        }
        if (i == 4) {
            return GOOD;
        }
        if (i != 5) {
            return null;
        }
        return EXCELLENT;
    }

    public static Internal.EnumLiteMap<RecommendProto$MOTION_HEALT_STATUS> internalGetValueMap() {
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
    public static RecommendProto$MOTION_HEALT_STATUS valueOf(int i) {
        return forNumber(i);
    }
}
