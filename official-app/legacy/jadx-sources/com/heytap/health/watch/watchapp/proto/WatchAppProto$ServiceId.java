package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum WatchAppProto$ServiceId implements Internal.EnumLite {
    SID_DEFAULT(0),
    SID_APP_STORE(267),
    UNRECOGNIZED(-1);

    public static final int SID_APP_STORE_VALUE = 267;
    public static final int SID_DEFAULT_VALUE = 0;
    private static final Internal.EnumLiteMap<WatchAppProto$ServiceId> internalValueMap = new Internal.EnumLiteMap<WatchAppProto$ServiceId>() { // from class: com.heytap.health.watch.watchapp.proto.WatchAppProto$ServiceId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchAppProto$ServiceId findValueByNumber(int i) {
            return WatchAppProto$ServiceId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WatchAppProto$ServiceId.forNumber(i) != null;
        }
    }

    WatchAppProto$ServiceId(int i) {
        this.value = i;
    }

    public static WatchAppProto$ServiceId forNumber(int i) {
        if (i == 0) {
            return SID_DEFAULT;
        }
        if (i != 267) {
            return null;
        }
        return SID_APP_STORE;
    }

    public static Internal.EnumLiteMap<WatchAppProto$ServiceId> internalGetValueMap() {
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
    public static WatchAppProto$ServiceId valueOf(int i) {
        return forNumber(i);
    }
}
