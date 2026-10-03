package com.heytap.health.protocol.file;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum LogKitProto$LogState implements Internal.EnumLite {
    LOG_NONE(0),
    LOG_ING(1),
    LOG_PACK_ING(2),
    LOG_PACK_DONE(3),
    LOG_UPLOAD_ING(4),
    LOG_UPLOAD_DONE(5),
    LOG_UPLOAD_ERROR(6),
    LOG_ERROR(7),
    UNRECOGNIZED(-1);

    public static final int LOG_ERROR_VALUE = 7;
    public static final int LOG_ING_VALUE = 1;
    public static final int LOG_NONE_VALUE = 0;
    public static final int LOG_PACK_DONE_VALUE = 3;
    public static final int LOG_PACK_ING_VALUE = 2;
    public static final int LOG_UPLOAD_DONE_VALUE = 5;
    public static final int LOG_UPLOAD_ERROR_VALUE = 6;
    public static final int LOG_UPLOAD_ING_VALUE = 4;
    private static final Internal.EnumLiteMap<LogKitProto$LogState> internalValueMap = new Internal.EnumLiteMap<LogKitProto$LogState>() { // from class: com.heytap.health.protocol.file.LogKitProto$LogState.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LogKitProto$LogState findValueByNumber(int i) {
            return LogKitProto$LogState.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LogKitProto$LogState.forNumber(i) != null;
        }
    }

    LogKitProto$LogState(int i) {
        this.value = i;
    }

    public static LogKitProto$LogState forNumber(int i) {
        switch (i) {
            case 0:
                return LOG_NONE;
            case 1:
                return LOG_ING;
            case 2:
                return LOG_PACK_ING;
            case 3:
                return LOG_PACK_DONE;
            case 4:
                return LOG_UPLOAD_ING;
            case 5:
                return LOG_UPLOAD_DONE;
            case 6:
                return LOG_UPLOAD_ERROR;
            case 7:
                return LOG_ERROR;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<LogKitProto$LogState> internalGetValueMap() {
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
    public static LogKitProto$LogState valueOf(int i) {
        return forNumber(i);
    }
}
