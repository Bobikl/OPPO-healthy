package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$GUIDE_SPORTS_PURPOSE implements Internal.EnumLite {
    NOT_SET(0),
    KEEP_HEALTH(1),
    FAT_LOSS(2),
    IMPROVE_SLEEP(3),
    ENHANCE_FITNESS(4),
    UNRECOGNIZED(-1);

    public static final int ENHANCE_FITNESS_VALUE = 4;
    public static final int FAT_LOSS_VALUE = 2;
    public static final int IMPROVE_SLEEP_VALUE = 3;
    public static final int KEEP_HEALTH_VALUE = 1;
    public static final int NOT_SET_VALUE = 0;
    private static final Internal.EnumLiteMap<RecommendProto$GUIDE_SPORTS_PURPOSE> internalValueMap = new Internal.EnumLiteMap<RecommendProto$GUIDE_SPORTS_PURPOSE>() { // from class: com.heytap.sportwatch.proto.RecommendProto$GUIDE_SPORTS_PURPOSE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$GUIDE_SPORTS_PURPOSE findValueByNumber(int i) {
            return RecommendProto$GUIDE_SPORTS_PURPOSE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$GUIDE_SPORTS_PURPOSE.forNumber(i) != null;
        }
    }

    RecommendProto$GUIDE_SPORTS_PURPOSE(int i) {
        this.value = i;
    }

    public static RecommendProto$GUIDE_SPORTS_PURPOSE forNumber(int i) {
        if (i == 0) {
            return NOT_SET;
        }
        if (i == 1) {
            return KEEP_HEALTH;
        }
        if (i == 2) {
            return FAT_LOSS;
        }
        if (i == 3) {
            return IMPROVE_SLEEP;
        }
        if (i != 4) {
            return null;
        }
        return ENHANCE_FITNESS;
    }

    public static Internal.EnumLiteMap<RecommendProto$GUIDE_SPORTS_PURPOSE> internalGetValueMap() {
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
    public static RecommendProto$GUIDE_SPORTS_PURPOSE valueOf(int i) {
        return forNumber(i);
    }
}
