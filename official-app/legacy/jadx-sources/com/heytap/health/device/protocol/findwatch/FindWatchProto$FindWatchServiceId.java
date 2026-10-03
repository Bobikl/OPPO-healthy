package com.heytap.health.device.protocol.findwatch;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum FindWatchProto$FindWatchServiceId implements Internal.EnumLite {
    SERVICE_ID_FIND_WATCH_UNDEFINE(0),
    SERVICE_ID_FIND_WATCH(268),
    UNRECOGNIZED(-1);

    public static final int SERVICE_ID_FIND_WATCH_UNDEFINE_VALUE = 0;
    public static final int SERVICE_ID_FIND_WATCH_VALUE = 268;
    private static final Internal.EnumLiteMap<FindWatchProto$FindWatchServiceId> internalValueMap = new Internal.EnumLiteMap<FindWatchProto$FindWatchServiceId>() { // from class: com.heytap.health.device.protocol.findwatch.FindWatchProto$FindWatchServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FindWatchProto$FindWatchServiceId findValueByNumber(int i) {
            return FindWatchProto$FindWatchServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return FindWatchProto$FindWatchServiceId.forNumber(i) != null;
        }
    }

    FindWatchProto$FindWatchServiceId(int i) {
        this.value = i;
    }

    public static FindWatchProto$FindWatchServiceId forNumber(int i) {
        if (i == 0) {
            return SERVICE_ID_FIND_WATCH_UNDEFINE;
        }
        if (i != 268) {
            return null;
        }
        return SERVICE_ID_FIND_WATCH;
    }

    public static Internal.EnumLiteMap<FindWatchProto$FindWatchServiceId> internalGetValueMap() {
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
    public static FindWatchProto$FindWatchServiceId valueOf(int i) {
        return forNumber(i);
    }
}
