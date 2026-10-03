package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$NORMAL_STATUS implements Internal.EnumLite {
    LEVEL_NONE(0),
    LEVEL_NORMAL(1),
    LEVEL_ABNORMAL(2),
    UNRECOGNIZED(-1);

    public static final int LEVEL_ABNORMAL_VALUE = 2;
    public static final int LEVEL_NONE_VALUE = 0;
    public static final int LEVEL_NORMAL_VALUE = 1;
    private static final Internal.EnumLiteMap<RecommendProto$NORMAL_STATUS> internalValueMap = new Internal.EnumLiteMap<RecommendProto$NORMAL_STATUS>() { // from class: com.heytap.sportwatch.proto.RecommendProto$NORMAL_STATUS.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$NORMAL_STATUS findValueByNumber(int i) {
            return RecommendProto$NORMAL_STATUS.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$NORMAL_STATUS.forNumber(i) != null;
        }
    }

    RecommendProto$NORMAL_STATUS(int i) {
        this.value = i;
    }

    public static RecommendProto$NORMAL_STATUS forNumber(int i) {
        if (i == 0) {
            return LEVEL_NONE;
        }
        if (i == 1) {
            return LEVEL_NORMAL;
        }
        if (i != 2) {
            return null;
        }
        return LEVEL_ABNORMAL;
    }

    public static Internal.EnumLiteMap<RecommendProto$NORMAL_STATUS> internalGetValueMap() {
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
    public static RecommendProto$NORMAL_STATUS valueOf(int i) {
        return forNumber(i);
    }
}
