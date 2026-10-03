package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes8.dex */
public enum DataProto$BatchingMode implements Internal.EnumLite {
    BATCHING_MODE_UNKNOWN(0),
    BATCHING_MODE_30_SECONDS(1),
    BATCHING_MODE_60_SECONDS(2),
    BATCHING_MODE_120_SECONDS(3),
    UNRECOGNIZED(-1);

    public static final int BATCHING_MODE_120_SECONDS_VALUE = 3;
    public static final int BATCHING_MODE_30_SECONDS_VALUE = 1;
    public static final int BATCHING_MODE_60_SECONDS_VALUE = 2;
    public static final int BATCHING_MODE_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<DataProto$BatchingMode> internalValueMap = new Internal.EnumLiteMap<DataProto$BatchingMode>() { // from class: com.oplus.ocs.wearengine.proto.DataProto$BatchingMode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataProto$BatchingMode findValueByNumber(int i) {
            return DataProto$BatchingMode.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DataProto$BatchingMode.forNumber(i) != null;
        }
    }

    DataProto$BatchingMode(int i) {
        this.value = i;
    }

    public static DataProto$BatchingMode forNumber(int i) {
        if (i == 0) {
            return BATCHING_MODE_UNKNOWN;
        }
        if (i == 1) {
            return BATCHING_MODE_30_SECONDS;
        }
        if (i == 2) {
            return BATCHING_MODE_60_SECONDS;
        }
        if (i != 3) {
            return null;
        }
        return BATCHING_MODE_120_SECONDS;
    }

    public static Internal.EnumLiteMap<DataProto$BatchingMode> internalGetValueMap() {
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
    public static DataProto$BatchingMode valueOf(int i) {
        return forNumber(i);
    }
}
