package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$REQUEST_TYPE implements Internal.EnumLite {
    REQUEST_NULL(0),
    REQUEST_FRONT(1),
    REQUEST_BACK(2),
    REQUEST_SYNC(3),
    UNRECOGNIZED(-1);

    public static final int REQUEST_BACK_VALUE = 2;
    public static final int REQUEST_FRONT_VALUE = 1;
    public static final int REQUEST_NULL_VALUE = 0;
    public static final int REQUEST_SYNC_VALUE = 3;
    private static final Internal.EnumLiteMap<RecommendProto$REQUEST_TYPE> internalValueMap = new Internal.EnumLiteMap<RecommendProto$REQUEST_TYPE>() { // from class: com.heytap.sportwatch.proto.RecommendProto$REQUEST_TYPE.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$REQUEST_TYPE findValueByNumber(int i) {
            return RecommendProto$REQUEST_TYPE.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$REQUEST_TYPE.forNumber(i) != null;
        }
    }

    RecommendProto$REQUEST_TYPE(int i) {
        this.value = i;
    }

    public static RecommendProto$REQUEST_TYPE forNumber(int i) {
        if (i == 0) {
            return REQUEST_NULL;
        }
        if (i == 1) {
            return REQUEST_FRONT;
        }
        if (i == 2) {
            return REQUEST_BACK;
        }
        if (i != 3) {
            return null;
        }
        return REQUEST_SYNC;
    }

    public static Internal.EnumLiteMap<RecommendProto$REQUEST_TYPE> internalGetValueMap() {
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
    public static RecommendProto$REQUEST_TYPE valueOf(int i) {
        return forNumber(i);
    }
}
