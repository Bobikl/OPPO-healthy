package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$MOTION_POST_SPORTS_STATUS implements Internal.EnumLite {
    P_NULL(0),
    SHORT_LOW(1),
    MIDDLE_LOW(2),
    LONG_LOW(3),
    MIDDLE(4),
    HIGHT(5),
    ANAEROBIC(6),
    UNRECOGNIZED(-1);

    public static final int ANAEROBIC_VALUE = 6;
    public static final int HIGHT_VALUE = 5;
    public static final int LONG_LOW_VALUE = 3;
    public static final int MIDDLE_LOW_VALUE = 2;
    public static final int MIDDLE_VALUE = 4;
    public static final int P_NULL_VALUE = 0;
    public static final int SHORT_LOW_VALUE = 1;
    private static final Internal.EnumLiteMap<RecommendProto$MOTION_POST_SPORTS_STATUS> internalValueMap = new Internal.EnumLiteMap<RecommendProto$MOTION_POST_SPORTS_STATUS>() { // from class: com.heytap.sportwatch.proto.RecommendProto$MOTION_POST_SPORTS_STATUS.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$MOTION_POST_SPORTS_STATUS findValueByNumber(int i) {
            return RecommendProto$MOTION_POST_SPORTS_STATUS.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$MOTION_POST_SPORTS_STATUS.forNumber(i) != null;
        }
    }

    RecommendProto$MOTION_POST_SPORTS_STATUS(int i) {
        this.value = i;
    }

    public static RecommendProto$MOTION_POST_SPORTS_STATUS forNumber(int i) {
        switch (i) {
            case 0:
                return P_NULL;
            case 1:
                return SHORT_LOW;
            case 2:
                return MIDDLE_LOW;
            case 3:
                return LONG_LOW;
            case 4:
                return MIDDLE;
            case 5:
                return HIGHT;
            case 6:
                return ANAEROBIC;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<RecommendProto$MOTION_POST_SPORTS_STATUS> internalGetValueMap() {
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
    public static RecommendProto$MOTION_POST_SPORTS_STATUS valueOf(int i) {
        return forNumber(i);
    }
}
