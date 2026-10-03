package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum WatchAppProto$AppChangeType implements Internal.EnumLite {
    APP_DEFAULT(0),
    APP_INSTALLED(1),
    APP_UNINSTALLED(2),
    APP_UPDATED(3),
    UNRECOGNIZED(-1);

    public static final int APP_DEFAULT_VALUE = 0;
    public static final int APP_INSTALLED_VALUE = 1;
    public static final int APP_UNINSTALLED_VALUE = 2;
    public static final int APP_UPDATED_VALUE = 3;
    private static final Internal.EnumLiteMap<WatchAppProto$AppChangeType> internalValueMap = new Internal.EnumLiteMap<WatchAppProto$AppChangeType>() { // from class: com.heytap.health.watch.watchapp.proto.WatchAppProto$AppChangeType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchAppProto$AppChangeType findValueByNumber(int i) {
            return WatchAppProto$AppChangeType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return WatchAppProto$AppChangeType.forNumber(i) != null;
        }
    }

    WatchAppProto$AppChangeType(int i) {
        this.value = i;
    }

    public static WatchAppProto$AppChangeType forNumber(int i) {
        if (i == 0) {
            return APP_DEFAULT;
        }
        if (i == 1) {
            return APP_INSTALLED;
        }
        if (i == 2) {
            return APP_UNINSTALLED;
        }
        if (i != 3) {
            return null;
        }
        return APP_UPDATED;
    }

    public static Internal.EnumLiteMap<WatchAppProto$AppChangeType> internalGetValueMap() {
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
    public static WatchAppProto$AppChangeType valueOf(int i) {
        return forNumber(i);
    }
}
