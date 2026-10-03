package com.heytap.health.protocol.file;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes17.dex */
public enum LogKitProto$LogKitCmdId implements Internal.EnumLite {
    LogKit_PLACE_HOLDER(0),
    CMD_LOG_SYNC(1),
    CMD_LOG_LIST(2),
    UNRECOGNIZED(-1);

    public static final int CMD_LOG_LIST_VALUE = 2;
    public static final int CMD_LOG_SYNC_VALUE = 1;
    public static final int LogKit_PLACE_HOLDER_VALUE = 0;
    private static final Internal.EnumLiteMap<LogKitProto$LogKitCmdId> internalValueMap = new Internal.EnumLiteMap<LogKitProto$LogKitCmdId>() { // from class: com.heytap.health.protocol.file.LogKitProto$LogKitCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LogKitProto$LogKitCmdId findValueByNumber(int i) {
            return LogKitProto$LogKitCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LogKitProto$LogKitCmdId.forNumber(i) != null;
        }
    }

    LogKitProto$LogKitCmdId(int i) {
        this.value = i;
    }

    public static LogKitProto$LogKitCmdId forNumber(int i) {
        if (i == 0) {
            return LogKit_PLACE_HOLDER;
        }
        if (i == 1) {
            return CMD_LOG_SYNC;
        }
        if (i != 2) {
            return null;
        }
        return CMD_LOG_LIST;
    }

    public static Internal.EnumLiteMap<LogKitProto$LogKitCmdId> internalGetValueMap() {
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
    public static LogKitProto$LogKitCmdId valueOf(int i) {
        return forNumber(i);
    }
}
