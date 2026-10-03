package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum WatchAppProto$WatchScreenType implements Internal.EnumLite {
    SQUARE(0),
    CIRCLE(1),
    UNRECOGNIZED(-1);

    public static final int CIRCLE_VALUE = 1;
    public static final int SQUARE_VALUE = 0;
    private static final Internal.EnumLiteMap<WatchAppProto$WatchScreenType> internalValueMap = new Internal.EnumLiteMap<WatchAppProto$WatchScreenType>() { // from class: com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchScreenType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchAppProto$WatchScreenType findValueByNumber(int i) {
            return WatchAppProto$WatchScreenType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WatchAppProto$WatchScreenType.forNumber(i) != null;
        }
    }

    WatchAppProto$WatchScreenType(int i) {
        this.value = i;
    }

    public static WatchAppProto$WatchScreenType forNumber(int i) {
        if (i == 0) {
            return SQUARE;
        }
        if (i != 1) {
            return null;
        }
        return CIRCLE;
    }

    public static Internal.EnumLiteMap<WatchAppProto$WatchScreenType> internalGetValueMap() {
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
    public static WatchAppProto$WatchScreenType valueOf(int i) {
        return forNumber(i);
    }
}
