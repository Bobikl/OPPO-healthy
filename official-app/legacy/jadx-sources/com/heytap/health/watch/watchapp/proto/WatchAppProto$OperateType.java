package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum WatchAppProto$OperateType implements Internal.EnumLite {
    AGREEMENT_QUERY(0),
    AGREEMENT_AGREE(1),
    AGREEMENT_OPEN(2),
    UNRECOGNIZED(-1);

    public static final int AGREEMENT_AGREE_VALUE = 1;
    public static final int AGREEMENT_OPEN_VALUE = 2;
    public static final int AGREEMENT_QUERY_VALUE = 0;
    private static final Internal.EnumLiteMap<WatchAppProto$OperateType> internalValueMap = new Internal.EnumLiteMap<WatchAppProto$OperateType>() { // from class: com.heytap.health.watch.watchapp.proto.WatchAppProto$OperateType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchAppProto$OperateType findValueByNumber(int i) {
            return WatchAppProto$OperateType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WatchAppProto$OperateType.forNumber(i) != null;
        }
    }

    WatchAppProto$OperateType(int i) {
        this.value = i;
    }

    public static WatchAppProto$OperateType forNumber(int i) {
        if (i == 0) {
            return AGREEMENT_QUERY;
        }
        if (i == 1) {
            return AGREEMENT_AGREE;
        }
        if (i != 2) {
            return null;
        }
        return AGREEMENT_OPEN;
    }

    public static Internal.EnumLiteMap<WatchAppProto$OperateType> internalGetValueMap() {
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
    public static WatchAppProto$OperateType valueOf(int i) {
        return forNumber(i);
    }
}
