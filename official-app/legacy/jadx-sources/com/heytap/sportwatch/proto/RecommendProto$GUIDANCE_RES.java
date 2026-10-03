package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$GUIDANCE_RES implements Internal.EnumLite {
    GUIDE_NULL(0),
    GUIDE_SUCCESS(1),
    GUIDE_BT_OFF(2),
    GUIDE_OUT_TIME(3),
    GUIDE_SYNC_FAIL(4),
    GUIDE_NET_FAIL(5),
    GUIDE_CLOUD_FAIL(6),
    UNRECOGNIZED(-1);

    public static final int GUIDE_BT_OFF_VALUE = 2;
    public static final int GUIDE_CLOUD_FAIL_VALUE = 6;
    public static final int GUIDE_NET_FAIL_VALUE = 5;
    public static final int GUIDE_NULL_VALUE = 0;
    public static final int GUIDE_OUT_TIME_VALUE = 3;
    public static final int GUIDE_SUCCESS_VALUE = 1;
    public static final int GUIDE_SYNC_FAIL_VALUE = 4;
    private static final Internal.EnumLiteMap<RecommendProto$GUIDANCE_RES> internalValueMap = new Internal.EnumLiteMap<RecommendProto$GUIDANCE_RES>() { // from class: com.heytap.sportwatch.proto.RecommendProto$GUIDANCE_RES.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$GUIDANCE_RES findValueByNumber(int i) {
            return RecommendProto$GUIDANCE_RES.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$GUIDANCE_RES.forNumber(i) != null;
        }
    }

    RecommendProto$GUIDANCE_RES(int i) {
        this.value = i;
    }

    public static RecommendProto$GUIDANCE_RES forNumber(int i) {
        switch (i) {
            case 0:
                return GUIDE_NULL;
            case 1:
                return GUIDE_SUCCESS;
            case 2:
                return GUIDE_BT_OFF;
            case 3:
                return GUIDE_OUT_TIME;
            case 4:
                return GUIDE_SYNC_FAIL;
            case 5:
                return GUIDE_NET_FAIL;
            case 6:
                return GUIDE_CLOUD_FAIL;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<RecommendProto$GUIDANCE_RES> internalGetValueMap() {
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
    public static RecommendProto$GUIDANCE_RES valueOf(int i) {
        return forNumber(i);
    }
}
