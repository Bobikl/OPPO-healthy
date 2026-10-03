package com.heytap.health.protocol.file;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum LogKitProto$LogAction implements Internal.EnumLite {
    ACTION_GET_STATE(0),
    ACTION_START_LOG(1),
    ACTION_STOP_LOG(2),
    ACTION_PACK_LOG(3),
    ACTION_UPLOAD_LOG(4),
    UNRECOGNIZED(-1);

    public static final int ACTION_GET_STATE_VALUE = 0;
    public static final int ACTION_PACK_LOG_VALUE = 3;
    public static final int ACTION_START_LOG_VALUE = 1;
    public static final int ACTION_STOP_LOG_VALUE = 2;
    public static final int ACTION_UPLOAD_LOG_VALUE = 4;
    private static final Internal.EnumLiteMap<LogKitProto$LogAction> internalValueMap = new Internal.EnumLiteMap<LogKitProto$LogAction>() { // from class: com.heytap.health.protocol.file.LogKitProto$LogAction.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LogKitProto$LogAction findValueByNumber(int i) {
            return LogKitProto$LogAction.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LogKitProto$LogAction.forNumber(i) != null;
        }
    }

    LogKitProto$LogAction(int i) {
        this.value = i;
    }

    public static LogKitProto$LogAction forNumber(int i) {
        if (i == 0) {
            return ACTION_GET_STATE;
        }
        if (i == 1) {
            return ACTION_START_LOG;
        }
        if (i == 2) {
            return ACTION_STOP_LOG;
        }
        if (i == 3) {
            return ACTION_PACK_LOG;
        }
        if (i != 4) {
            return null;
        }
        return ACTION_UPLOAD_LOG;
    }

    public static Internal.EnumLiteMap<LogKitProto$LogAction> internalGetValueMap() {
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
    public static LogKitProto$LogAction valueOf(int i) {
        return forNumber(i);
    }
}
