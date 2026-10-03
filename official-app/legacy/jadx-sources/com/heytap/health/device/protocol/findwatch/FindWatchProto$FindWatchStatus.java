package com.heytap.health.device.protocol.findwatch;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum FindWatchProto$FindWatchStatus implements Internal.EnumLite {
    FIND_WATCH_CLOSE(0),
    FIND_WATCH_OPEN(1),
    UNRECOGNIZED(-1);

    public static final int FIND_WATCH_CLOSE_VALUE = 0;
    public static final int FIND_WATCH_OPEN_VALUE = 1;
    private static final Internal.EnumLiteMap<FindWatchProto$FindWatchStatus> internalValueMap = new Internal.EnumLiteMap<FindWatchProto$FindWatchStatus>() { // from class: com.heytap.health.device.protocol.findwatch.FindWatchProto$FindWatchStatus.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FindWatchProto$FindWatchStatus findValueByNumber(int i) {
            return FindWatchProto$FindWatchStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FindWatchProto$FindWatchStatus.forNumber(i) != null;
        }
    }

    FindWatchProto$FindWatchStatus(int i) {
        this.value = i;
    }

    public static FindWatchProto$FindWatchStatus forNumber(int i) {
        if (i == 0) {
            return FIND_WATCH_CLOSE;
        }
        if (i != 1) {
            return null;
        }
        return FIND_WATCH_OPEN;
    }

    public static Internal.EnumLiteMap<FindWatchProto$FindWatchStatus> internalGetValueMap() {
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
    public static FindWatchProto$FindWatchStatus valueOf(int i) {
        return forNumber(i);
    }
}
