package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$HEALTH_STATUS_ID implements Internal.EnumLite {
    S_NULL(0),
    SLEEP_CELL(1),
    PRESS_CELL(2),
    MOTION_CELL(3),
    HRV_CELL(4),
    BASE_CELL(5),
    MENSTRUAL_CELL(6),
    UNRECOGNIZED(-1);

    public static final int BASE_CELL_VALUE = 5;
    public static final int HRV_CELL_VALUE = 4;
    public static final int MENSTRUAL_CELL_VALUE = 6;
    public static final int MOTION_CELL_VALUE = 3;
    public static final int PRESS_CELL_VALUE = 2;
    public static final int SLEEP_CELL_VALUE = 1;
    public static final int S_NULL_VALUE = 0;
    private static final Internal.EnumLiteMap<RecommendProto$HEALTH_STATUS_ID> internalValueMap = new Internal.EnumLiteMap<RecommendProto$HEALTH_STATUS_ID>() { // from class: com.heytap.sportwatch.proto.RecommendProto$HEALTH_STATUS_ID.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$HEALTH_STATUS_ID findValueByNumber(int i) {
            return RecommendProto$HEALTH_STATUS_ID.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$HEALTH_STATUS_ID.forNumber(i) != null;
        }
    }

    RecommendProto$HEALTH_STATUS_ID(int i) {
        this.value = i;
    }

    public static RecommendProto$HEALTH_STATUS_ID forNumber(int i) {
        switch (i) {
            case 0:
                return S_NULL;
            case 1:
                return SLEEP_CELL;
            case 2:
                return PRESS_CELL;
            case 3:
                return MOTION_CELL;
            case 4:
                return HRV_CELL;
            case 5:
                return BASE_CELL;
            case 6:
                return MENSTRUAL_CELL;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<RecommendProto$HEALTH_STATUS_ID> internalGetValueMap() {
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
    public static RecommendProto$HEALTH_STATUS_ID valueOf(int i) {
        return forNumber(i);
    }
}
