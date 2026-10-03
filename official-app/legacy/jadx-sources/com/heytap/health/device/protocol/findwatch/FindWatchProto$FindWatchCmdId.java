package com.heytap.health.device.protocol.findwatch;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum FindWatchProto$FindWatchCmdId implements Internal.EnumLite {
    FIND_WATCH_UNDEFINE(0),
    FIND_WATCH_SYNC_STATUS(1),
    UNRECOGNIZED(-1);

    public static final int FIND_WATCH_SYNC_STATUS_VALUE = 1;
    public static final int FIND_WATCH_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<FindWatchProto$FindWatchCmdId> internalValueMap = new Internal.EnumLiteMap<FindWatchProto$FindWatchCmdId>() { // from class: com.heytap.health.device.protocol.findwatch.FindWatchProto$FindWatchCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FindWatchProto$FindWatchCmdId findValueByNumber(int i) {
            return FindWatchProto$FindWatchCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FindWatchProto$FindWatchCmdId.forNumber(i) != null;
        }
    }

    FindWatchProto$FindWatchCmdId(int i) {
        this.value = i;
    }

    public static FindWatchProto$FindWatchCmdId forNumber(int i) {
        if (i == 0) {
            return FIND_WATCH_UNDEFINE;
        }
        if (i != 1) {
            return null;
        }
        return FIND_WATCH_SYNC_STATUS;
    }

    public static Internal.EnumLiteMap<FindWatchProto$FindWatchCmdId> internalGetValueMap() {
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
    public static FindWatchProto$FindWatchCmdId valueOf(int i) {
        return forNumber(i);
    }
}
