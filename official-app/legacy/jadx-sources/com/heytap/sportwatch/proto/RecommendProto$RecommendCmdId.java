package com.heytap.sportwatch.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum RecommendProto$RecommendCmdId implements Internal.EnumLite {
    RECOMMEND_CMD_PLACE_HOLDER(0),
    CMD_SEND_QUESTION(56),
    CMD_RECEIVE_QUESTION(57),
    CMD_RECEIVE_HEALTH_INFO(58),
    CMD_DEVICE_REQUEST_SPORT_RECOMMEND(59),
    CMD_PHONE_SPORT_RECOMMEND_TO_DEVICE(60),
    UNRECOGNIZED(-1);

    public static final int CMD_DEVICE_REQUEST_SPORT_RECOMMEND_VALUE = 59;
    public static final int CMD_PHONE_SPORT_RECOMMEND_TO_DEVICE_VALUE = 60;
    public static final int CMD_RECEIVE_HEALTH_INFO_VALUE = 58;
    public static final int CMD_RECEIVE_QUESTION_VALUE = 57;
    public static final int CMD_SEND_QUESTION_VALUE = 56;
    public static final int RECOMMEND_CMD_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<RecommendProto$RecommendCmdId> internalValueMap = new Internal.EnumLiteMap<RecommendProto$RecommendCmdId>() { // from class: com.heytap.sportwatch.proto.RecommendProto$RecommendCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendProto$RecommendCmdId findValueByNumber(int i) {
            return RecommendProto$RecommendCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return RecommendProto$RecommendCmdId.forNumber(i) != null;
        }
    }

    RecommendProto$RecommendCmdId(int i) {
        this.value = i;
    }

    public static RecommendProto$RecommendCmdId forNumber(int i) {
        if (i == 0) {
            return RECOMMEND_CMD_PLACE_HOLDER;
        }
        switch (i) {
            case 56:
                return CMD_SEND_QUESTION;
            case 57:
                return CMD_RECEIVE_QUESTION;
            case 58:
                return CMD_RECEIVE_HEALTH_INFO;
            case 59:
                return CMD_DEVICE_REQUEST_SPORT_RECOMMEND;
            case 60:
                return CMD_PHONE_SPORT_RECOMMEND_TO_DEVICE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<RecommendProto$RecommendCmdId> internalGetValueMap() {
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
    public static RecommendProto$RecommendCmdId valueOf(int i) {
        return forNumber(i);
    }
}
