package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum WatchAppProto$WatchAppStoreProtocolVersion implements Internal.EnumLite {
    PV_OLD_VERSION(0),
    PV_DEFAULT_VERSION(1),
    UNRECOGNIZED(-1);

    public static final int PV_DEFAULT_VERSION_VALUE = 1;
    public static final int PV_OLD_VERSION_VALUE = 0;
    private static final Internal.EnumLiteMap<WatchAppProto$WatchAppStoreProtocolVersion> internalValueMap = new Internal.EnumLiteMap<WatchAppProto$WatchAppStoreProtocolVersion>() { // from class: com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchAppStoreProtocolVersion.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchAppProto$WatchAppStoreProtocolVersion findValueByNumber(int i) {
            return WatchAppProto$WatchAppStoreProtocolVersion.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WatchAppProto$WatchAppStoreProtocolVersion.forNumber(i) != null;
        }
    }

    WatchAppProto$WatchAppStoreProtocolVersion(int i) {
        this.value = i;
    }

    public static WatchAppProto$WatchAppStoreProtocolVersion forNumber(int i) {
        if (i == 0) {
            return PV_OLD_VERSION;
        }
        if (i != 1) {
            return null;
        }
        return PV_DEFAULT_VERSION;
    }

    public static Internal.EnumLiteMap<WatchAppProto$WatchAppStoreProtocolVersion> internalGetValueMap() {
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
    public static WatchAppProto$WatchAppStoreProtocolVersion valueOf(int i) {
        return forNumber(i);
    }
}
