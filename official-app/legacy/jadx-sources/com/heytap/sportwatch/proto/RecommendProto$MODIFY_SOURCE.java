package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$MODIFY_SOURCE implements Internal.EnumLite {
    NOT_MODIFY(0),
    FROM_APP(1),
    FROM_LIGHT(2),
    FROM_FULL(3),
    UNRECOGNIZED(-1);

    public static final int FROM_APP_VALUE = 1;
    public static final int FROM_FULL_VALUE = 3;
    public static final int FROM_LIGHT_VALUE = 2;
    public static final int NOT_MODIFY_VALUE = 0;
    private static final Internal.EnumLiteMap<RecommendProto$MODIFY_SOURCE> internalValueMap = new Internal.EnumLiteMap<RecommendProto$MODIFY_SOURCE>() { // from class: com.heytap.sportwatch.proto.RecommendProto$MODIFY_SOURCE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$MODIFY_SOURCE findValueByNumber(int i) {
            return RecommendProto$MODIFY_SOURCE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$MODIFY_SOURCE.forNumber(i) != null;
        }
    }

    RecommendProto$MODIFY_SOURCE(int i) {
        this.value = i;
    }

    public static RecommendProto$MODIFY_SOURCE forNumber(int i) {
        if (i == 0) {
            return NOT_MODIFY;
        }
        if (i == 1) {
            return FROM_APP;
        }
        if (i == 2) {
            return FROM_LIGHT;
        }
        if (i != 3) {
            return null;
        }
        return FROM_FULL;
    }

    public static Internal.EnumLiteMap<RecommendProto$MODIFY_SOURCE> internalGetValueMap() {
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
    public static RecommendProto$MODIFY_SOURCE valueOf(int i) {
        return forNumber(i);
    }
}
