package com.heytap.health.protocol.file;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum LogKitProto$LogKitSId implements Internal.EnumLite {
    PLACE_HOLDER(0),
    SID_LOGKIT(28),
    UNRECOGNIZED(-1);

    public static final int PLACE_HOLDER_VALUE = 0;
    public static final int SID_LOGKIT_VALUE = 28;
    private static final Internal.EnumLiteMap<LogKitProto$LogKitSId> internalValueMap = new Internal.EnumLiteMap<LogKitProto$LogKitSId>() { // from class: com.heytap.health.protocol.file.LogKitProto$LogKitSId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LogKitProto$LogKitSId findValueByNumber(int i) {
            return LogKitProto$LogKitSId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LogKitProto$LogKitSId.forNumber(i) != null;
        }
    }

    LogKitProto$LogKitSId(int i) {
        this.value = i;
    }

    public static LogKitProto$LogKitSId forNumber(int i) {
        if (i == 0) {
            return PLACE_HOLDER;
        }
        if (i != 28) {
            return null;
        }
        return SID_LOGKIT;
    }

    public static Internal.EnumLiteMap<LogKitProto$LogKitSId> internalGetValueMap() {
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
    public static LogKitProto$LogKitSId valueOf(int i) {
        return forNumber(i);
    }
}
