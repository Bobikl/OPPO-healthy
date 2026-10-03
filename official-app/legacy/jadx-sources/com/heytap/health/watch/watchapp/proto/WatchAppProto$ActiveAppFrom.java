package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum WatchAppProto$ActiveAppFrom implements Internal.EnumLite {
    FROM_WEAR(0),
    FROM_HEALTH(1),
    UNRECOGNIZED(-1);

    public static final int FROM_HEALTH_VALUE = 1;
    public static final int FROM_WEAR_VALUE = 0;
    private static final Internal.EnumLiteMap<WatchAppProto$ActiveAppFrom> internalValueMap = new Internal.EnumLiteMap<WatchAppProto$ActiveAppFrom>() { // from class: com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppFrom.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchAppProto$ActiveAppFrom findValueByNumber(int i) {
            return WatchAppProto$ActiveAppFrom.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WatchAppProto$ActiveAppFrom.forNumber(i) != null;
        }
    }

    WatchAppProto$ActiveAppFrom(int i) {
        this.value = i;
    }

    public static WatchAppProto$ActiveAppFrom forNumber(int i) {
        if (i == 0) {
            return FROM_WEAR;
        }
        if (i != 1) {
            return null;
        }
        return FROM_HEALTH;
    }

    public static Internal.EnumLiteMap<WatchAppProto$ActiveAppFrom> internalGetValueMap() {
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
    public static WatchAppProto$ActiveAppFrom valueOf(int i) {
        return forNumber(i);
    }
}
