package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$AppChangeEventType implements Internal.EnumLite {
    DEFAULT_EVENT(0),
    APP_UNINSTALL(1),
    APP_INSTALL(2),
    APP_UPDATE(3),
    UNRECOGNIZED(-1);

    public static final int APP_INSTALL_VALUE = 2;
    public static final int APP_UNINSTALL_VALUE = 1;
    public static final int APP_UPDATE_VALUE = 3;
    public static final int DEFAULT_EVENT_VALUE = 0;
    private static final Internal.EnumLiteMap<Proto$AppChangeEventType> internalValueMap = new Internal.EnumLiteMap<Proto$AppChangeEventType>() { // from class: com.heytap.health.watch.watchface.proto.Proto$AppChangeEventType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$AppChangeEventType findValueByNumber(int i) {
            return Proto$AppChangeEventType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$AppChangeEventType.forNumber(i) != null;
        }
    }

    Proto$AppChangeEventType(int i) {
        this.value = i;
    }

    public static Proto$AppChangeEventType forNumber(int i) {
        if (i == 0) {
            return DEFAULT_EVENT;
        }
        if (i == 1) {
            return APP_UNINSTALL;
        }
        if (i == 2) {
            return APP_INSTALL;
        }
        if (i != 3) {
            return null;
        }
        return APP_UPDATE;
    }

    public static Internal.EnumLiteMap<Proto$AppChangeEventType> internalGetValueMap() {
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
    public static Proto$AppChangeEventType valueOf(int i) {
        return forNumber(i);
    }
}
