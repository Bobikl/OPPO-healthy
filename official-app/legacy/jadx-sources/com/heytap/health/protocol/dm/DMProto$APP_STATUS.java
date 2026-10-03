package com.heytap.health.protocol.dm;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum DMProto$APP_STATUS implements Internal.EnumLite {
    STATUS_UNINSTALL(0),
    STATUS_INSTALL(1),
    UNRECOGNIZED(-1);

    public static final int STATUS_INSTALL_VALUE = 1;
    public static final int STATUS_UNINSTALL_VALUE = 0;
    private static final Internal.EnumLiteMap<DMProto$APP_STATUS> internalValueMap = new Internal.EnumLiteMap<DMProto$APP_STATUS>() { // from class: com.heytap.health.protocol.dm.DMProto$APP_STATUS.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DMProto$APP_STATUS findValueByNumber(int i) {
            return DMProto$APP_STATUS.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return DMProto$APP_STATUS.forNumber(i) != null;
        }
    }

    DMProto$APP_STATUS(int i) {
        this.value = i;
    }

    public static DMProto$APP_STATUS forNumber(int i) {
        if (i == 0) {
            return STATUS_UNINSTALL;
        }
        if (i != 1) {
            return null;
        }
        return STATUS_INSTALL;
    }

    public static Internal.EnumLiteMap<DMProto$APP_STATUS> internalGetValueMap() {
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
    public static DMProto$APP_STATUS valueOf(int i) {
        return forNumber(i);
    }
}
