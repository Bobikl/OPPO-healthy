package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$QUESTION_ID implements Internal.EnumLite {
    Q_NULL(0),
    FAVO_SPORTS(1),
    MOTION_DISTANCE(2),
    MOTION_DURATION(3),
    MOTION_STATUS(4),
    UNRECOGNIZED(-1);

    public static final int FAVO_SPORTS_VALUE = 1;
    public static final int MOTION_DISTANCE_VALUE = 2;
    public static final int MOTION_DURATION_VALUE = 3;
    public static final int MOTION_STATUS_VALUE = 4;
    public static final int Q_NULL_VALUE = 0;
    private static final Internal.EnumLiteMap<RecommendProto$QUESTION_ID> internalValueMap = new Internal.EnumLiteMap<RecommendProto$QUESTION_ID>() { // from class: com.heytap.sportwatch.proto.RecommendProto$QUESTION_ID.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$QUESTION_ID findValueByNumber(int i) {
            return RecommendProto$QUESTION_ID.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$QUESTION_ID.forNumber(i) != null;
        }
    }

    RecommendProto$QUESTION_ID(int i) {
        this.value = i;
    }

    public static RecommendProto$QUESTION_ID forNumber(int i) {
        if (i == 0) {
            return Q_NULL;
        }
        if (i == 1) {
            return FAVO_SPORTS;
        }
        if (i == 2) {
            return MOTION_DISTANCE;
        }
        if (i == 3) {
            return MOTION_DURATION;
        }
        if (i != 4) {
            return null;
        }
        return MOTION_STATUS;
    }

    public static Internal.EnumLiteMap<RecommendProto$QUESTION_ID> internalGetValueMap() {
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
    public static RecommendProto$QUESTION_ID valueOf(int i) {
        return forNumber(i);
    }
}
